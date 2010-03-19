

function RezPag(){
	
		var oAltoPagina = $('maincont');
		var altoPagina = oAltoPagina.offsetHeight;

		
		var oAltoPagina2 = $('subC');
		var altoPagina2 = oAltoPagina2.offsetHeight;

		
		var altoCont = $('bCont');
		altoCont.style.minHeight = (altoPagina - 114 )+ 'px';
		
		var altoColL = $('colL');
		Alto(altoColL);
		
		var altoColR = $('colR');
		Alto(altoColR);

function Alto(elAlto)
		{
			var elAlto;
			
			if ( altoCont.offsetHeight > altoPagina2 )
			{
				elAlto.style.height = altoPagina2 + 'px';
			}
			else
			{
				elAlto.style.height = altoCont.offsetHeight + 114 + 'px';
			}
			
			return elAlto;
}
		
		
function $(sElemento){
			var o = document.getElementById(sElemento);
			if(o==null) alert("no se encuentra el elemento " + sElemento);
			return o;
		}
}

ddsmoothmenu.init({
	mainmenuid: "smoothmenu1", //menu DIV id
	orientation: 'h', //Horizontal or vertical menu: Set to "h" or "v"
	classname: 'ddsmoothmenu', //class added to menu's outer DIV
	//customtheme: ["#1c5a80", "#18374a"],
	contentsource: "markup" //"markup" or ["container_id", "path_to_menu_file"]
})

ddsmoothmenu.init({
	mainmenuid: "smoothmenu2", //Menu DIV id
	orientation: 'v', //Horizontal or vertical menu: Set to "h" or "v"
	classname: 'ddsmoothmenu-v', //class added to menu's outer DIV
	//customtheme: ["#804000", "#482400"],
	contentsource: "markup" //"markup" or ["container_id", "path_to_menu_file"]
})
