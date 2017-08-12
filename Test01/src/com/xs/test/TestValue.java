package com.xs.test;

public class TestValue {
	private void test1(int a){
		//做点事情
		a=7;
		System.out.println("test1方法中的a="+a);  

		}
		public static void main(String[] args) {
		TestValue t = new TestValue();
		int a = 3;
		t.test1(a);//这里传递的参数a就是按值传递
		System.out.println("main方法中的a="+a);  
		}

}
