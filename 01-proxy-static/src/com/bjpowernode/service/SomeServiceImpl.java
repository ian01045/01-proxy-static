package com.bjpowernode.service;

//target class
public class SomeServiceImpl implements ISomeService {

	@Override
	public String doFirst() {
		// TODO Auto-generated method stub
		System.out.println("execute doFirst() method");
		return "abcde";
	}

	@Override
	public void doSecond() {
		// TODO Auto-generated method stub
		System.out.println("execute doSecond() method");

	}

}
