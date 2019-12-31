package com.shop;
import java.util.*;
public class Shop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String product;
		System.out.println("enter product");
		product = sc.next();
		int quantity;
		System.out.println("enter quantity");
		quantity = sc.nextInt();
		int price;
		System.out.println("enter product");
		price = sc.nextInt();
		int total=quantity*price;
		System.out.println("product : "+product+"\n quantity : "+quantity+"\n Total ammount to pay :"+total);
	}

}
