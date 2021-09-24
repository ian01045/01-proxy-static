package com.bjpowernode.test;

import com.bjpowernode.proxy.SomeServiceProxy;
import com.bjpowernode.service.ISomeService;
import com.bjpowernode.service.SomeServiceImpl;

public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ISomeService service = new SomeServiceImpl();
		ISomeService service = new SomeServiceProxy();
		String result = service.doFirst();
		System.out.println("result= "+result);
		service.doSecond();

	}

}
