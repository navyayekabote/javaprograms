package com.shristi.quest4;

import java.util.function.Supplier;

public class SupplierAndLambda {

	public static void main(String[] args) {
		
		Supplier<String> supplier=()->"welcome".toUpperCase();
		System.out.println(supplier.get());
	}

}
