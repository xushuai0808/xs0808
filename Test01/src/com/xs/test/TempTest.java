package com.xs.test;

public class TempTest {
	//测试git文件是否有变动
	//测试git分支dd
	private void test1(A a) {
		a.age = 20;
		System.out.println("test1方法中的age=" + a.age);
	}

	public static void main(String[] args) {
		TempTest t = new TempTest();
		A a = new A();
		a.age = 10;
		t.test1(a);
		System.out.println("main方法中的age=" + a.age);
		
	}
}

class A {
	public int age = 0;
}
