package com.tcf.kid.smart.framework.aop;

/****
 * TODO TCF AOP代理接口
 * TODO TCF 定义每个AOP代理实例需要调用的代理方法
 * @author 71485
 *
 */
public interface Proxy {

	//TODO TCF 每个AOP动态代理实例都需要调用的代理方法
	public Object doProxy(ProxyChain proxyChain);
	
}
