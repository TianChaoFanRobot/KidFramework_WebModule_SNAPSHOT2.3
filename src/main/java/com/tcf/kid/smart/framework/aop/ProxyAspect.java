package com.tcf.kid.smart.framework.aop;

/***
 * TODO TCF AOP切面基类，实现AOP切面接口，定义代理方法和各类增强处理方法，在代理方法中实现各类增强处理方法的动态织入
 * @author 71485
 *
 */
public class ProxyAspect implements Proxy{

	@Override
	public Object doProxy(ProxyChain proxyChain) 
	{
		Object invokeResult=null;
		
		try
		{
			//TODO TCF 三层汉堡动态织入
			before();
			
			invokeResult=proxyChain.doProxyChain();
			
			afterReturning();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return invokeResult;
	}
	
	//TODO TCF ...自定义各类增强处理方法
	//TODO TCF 前置增强
	public void before()
	{
		System.out.println("====切面基类的前置增强处理方法执行====");
	}
	
	//TODO TCF 后置增强
	public void afterReturning()
	{
		System.out.println("====切面基类的后置增强处理方法执行====");
	}
}
