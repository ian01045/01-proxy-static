package com.bjpowernode.proxy;

import com.bjpowernode.service.ISomeService;
import com.bjpowernode.service.SomeServiceImpl;
//proxy class
public class SomeServiceProxy implements ISomeService {

	private ISomeService target;

	//before run the proxy class, the relation b/w proxy class and target class already exist, so it called static proxy (靜態代理)
	public SomeServiceProxy() {
		target = new SomeServiceImpl();
	}

	@Override
	public String doFirst() {
		//proxy class invoke target method in target class
		String result = target.doFirst();
		//proxy class enhance origin result from target class
		return result.toUpperCase();
	}

	@Override
	public void doSecond() {
		target.doSecond();
	}
	
	
//	@Override
//	public String doFirst() {
//		//create target class
//		ISomeService target = new SomeServiceImpl();
//		//proxy class invoke target method in target class
//		String result = target.doFirst();
//		//proxy class enhance origin result from target class
//		return result.toUpperCase();
//
//	}
//
//	@Override
//	public void doSecond() {
//		// TODO Auto-generated method stub
//		ISomeService target = new SomeServiceImpl();
//		target.doSecond();
//
//	}

}
