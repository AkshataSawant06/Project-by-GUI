package com.MathOperationUniml;

public class Impl implements Operation{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int a=10,b=20;
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Impl i = new Impl();
		i.add();
	}

}
