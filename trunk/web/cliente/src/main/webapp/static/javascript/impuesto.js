Ext.BLANK_IMAGE_URL = '../resources/images/default/s.gif';

Ext.namespace('Sumat.Impuestos');

Ext.onReady(function(){

  var viewport = new Ext.Viewport({
    layout: 'border',
    renderTo: Ext.getBody(),
    items: [{
      region: 'north',
      xtype: 'panel',
      html: 'North'
      },{
      region: 'west',
      xtype: 'panel',
      split: true,
      width: 200,
      html: 'West'
      },{
      region: 'center',
      xtype: 'panel',
      id: 'pnlCenter',
      html: 'Center'
      },{
      region: 'east',
      xtype: 'panel',
      split: true,
      width: 200,
      html: 'East'
      },{
      region: 'south',
      xtype: 'panel',
      html: 'South'
      }
    ]
  });
  
    Sumat.Impuestos.getClImpuesto = function() {

        Ext.Ajax.request({
            url: 'getClImpuesto.json',
            success: function(responseEnc) {
                var responseDec = Ext.decode(responseEnc.responseText);                
                var clImpuestoData = new Array();
                
                // Note: can't do a foreach loop over arrays because Ext added the "remove" method to Array's prototype.
				// This "remove" method gets added as an argument unless we explictly use numeric indexes.
		        for(var ix = 0; ix < responseDec.response.clImpuesto.length; ix++) {
                	//ver si se puede usar un with
                	clImpuestoData.push([
                	   responseDec.response.clImpuesto[ix].id, responseDec.response.clImpuesto[ix].descripcion,
                	   responseDec.response.clImpuesto[ix].impuestoTipo.descripcion,
             	       responseDec.response.clImpuesto[ix].inscripcionFecha
                	]);
                }
 
				var clImpuestoReader = new Ext.data.ArrayReader({}, [
					{name: 'id'},
					{name: 'descripcion'},
					{name: 'tipoDescripcion'},
					//el formato de fecha es el que corresponde al toString() de Date de java
					{name: 'inscripcionFecha', type: 'date', dateFormat: 'D M d H:i:s T Y'}
				]);
				
				//custom renderers
				var accion_renderer = function(val){
                  return '<a href="editar.json?id=' + val + '">Editar</a>' 
                }
				
				var grid = new Ext.grid.GridPanel({
				    store: new Ext.data.Store({
						data: clImpuestoData,
						reader: clImpuestoReader
					}),
					columns: [
						{header: 'Descripcion', sortable: true, dataIndex: 'descripcion'},
						{header: 'Tipo', sortable: true, dataIndex: 'tipoDescripcion'},
						{header: 'Fecha Inscripcion', sortable: true, 
							renderer: Ext.util.Format.dateRenderer('d/m/Y'), dataIndex: 'inscripcionFecha'},
                        {header: 'Id', sortable: false, dataIndex: 'id', renderer: accion_renderer}
													
					],
					viewConfig: {
						forceFit: true
					},
					//renderTo: 'pnlCenter',
					title: 'Impuestos',
					width: 500,
					autoHeight: true,
					frame: true
				});
                
                Ext.getCmp('pnlCenter').add(grid);
                Ext.getCmp('pnlCenter').doLayout();
            },
            failure: function(response) {

                if(response.status === 403) {
                    Ext.MessageBox.alert("Unauthorized", "You are not authorized to use this service");
                } else {
                    Ext.MessageBox.alert("Service Failed", response.responseText);                    
                }
            }//,
            //params: {text: msg}
        });
    };

	Sumat.Impuestos.getClImpuesto();
    //Ext.get('myButton').on('click', Sumat.Impuestos.getMessage);

});