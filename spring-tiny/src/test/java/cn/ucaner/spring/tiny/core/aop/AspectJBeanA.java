package cn.ucaner.spring.tiny.core.aop;

import java.lang.reflect.Method;

import cn.ucaner.spring.tiny.bean.jiekou;

/**
* @Package：cn.ucaner.spring.tiny.core.aop   
* @ClassName：AspectJBeanA   
* @Description：   <p> AspectJBeanA </p>
* @Author： -    
* @Modify By：   
* @ModifyTime：  2018年4月28日
* @Modify marker：   
* @version    V1.0
 */
public class AspectJBeanA implements jiekou,Aop{

	@Override
	public String aaa() {
		return null;
	}

	@Override
	public void after(Object proxy, Method method, Object[] args) {
		System.out.println("after");
	}

	@Override
	public void before(Object proxy, Method method, Object[] args) {
		System.out.println("before");	
	}

}
