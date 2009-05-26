/**
 * 
 */
package ar.com.futbolprode.commons.hibernate.interceptor;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author acabrera
 * 
 */
public class AuditInterceptor extends EmptyInterceptor implements
		InitializingBean {

	private static final String FECHA_CREACION = "fechaCreacion";

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean onSave(Object entity, Serializable id, Object[] state,
			String[] propertyNames, Type[] types) {
		this.auditarObjeto(state, propertyNames, types);		
		return true;
	}

	@Override
	public boolean onFlushDirty(Object entity, Serializable id,
			Object[] currentState, Object[] previousState,
			String[] propertyNames, Type[] types) {
		this.auditarObjeto(currentState, propertyNames, types);		
		return true;
	}

	private void auditarObjeto(Object[] state, String[] propertyNames,
			Type[] types) {
		for (int j = 0; j < propertyNames.length; j++) {
			if (propertyNames[j].equalsIgnoreCase(FECHA_CREACION)) {
				if (state[j] == null) {
					state[j] = new Date();
				}
			}
		}
	}

}
