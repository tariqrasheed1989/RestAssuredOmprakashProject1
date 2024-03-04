package com.rest;

public class MethodChainning {
    public static void main(String[] args) {
        a1().
        a2().
        a3();

    }
    public static MethodChainning a1(){
        System.out.println("This is a1 method.");
        return new MethodChainning();
    }
    public MethodChainning a2(){
        System.out.println("This is a2 method.");
        return this;
    }
    public MethodChainning a3(){
        System.out.println("This is a3 method.");
        return this;
    }
}
