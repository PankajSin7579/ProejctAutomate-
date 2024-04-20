package com.opencart.errors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoreJavaPractice {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(3);
		list.add(7);
		int count =0;
		for(Integer number: list) {
			if(number%2==0) {
				count++;
			}
		}
		if(count>2) {
			System.out.println("List consist of even number");
		}
		else {
			System.out.println("List consist of odd number");
		}

	}

}
