package com.fullstack.controller;

public class ArithmeticApplication {

    public int add(int n1, int n2){
        return n1+n2;
    }

    public int sub(int n1, int n2){
        return n1-n2;
    }

    public static void main(String[] args) {
        ArithmeticApplication arithmeticApplication = new ArithmeticApplication();

        System.out.println("\n Add Result: "+arithmeticApplication.add(4, 5));
        System.out.println("\n Sub Result: "+arithmeticApplication.sub(10, 5));

    }
}
