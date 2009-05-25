/**
 * 
 */
package ar.com.futbolprode.commons.hibernate.interceptor;

import java.io.Serializable;

import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author acabrera
 *
 */
public class AuditInterceptor extends EmptyInterceptor implements InitializingBean{

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean onSave(Object entity, Serializable id, Object[] state,
			String[] propertyNames, Type[] types) {
		System.out.println("pacha por aca");
		return true;
	}
	@Override
	public boolean onFlushDirty(Object entity, Serializable id,
			Object[] currentState, Object[] previousState,
			String[] propertyNames, Type[] types) {
		System.out.println("pacha por aca");
		return true;
	}

}
