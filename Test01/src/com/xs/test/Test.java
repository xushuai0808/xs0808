package com.xs.test;

public class Test {
    public static void change(String s){
        s="zhangsan";
    }
    
    public static void main(String[] args) {
        String s=new String("lisi");
        System.out.println(s);
        change(s);
        System.out.println(s);
    }
}