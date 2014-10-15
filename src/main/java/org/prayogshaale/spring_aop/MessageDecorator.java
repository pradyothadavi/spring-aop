/**
 * 
 */
package org.prayogshaale.spring_aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author pradyot.ha
 */
public class MessageDecorator implements MethodInterceptor
{

	public Object invoke(MethodInvocation invocation) throws Throwable
	{
		System.out.print("Hello ");
		Object retVal = invocation.proceed();
		System.out.println(" !");
		return retVal;
	}
}
