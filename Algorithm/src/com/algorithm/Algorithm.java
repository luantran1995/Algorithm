package com.algorithm;

import java.util.Scanner;

public class Algorithm {
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);

    System.out.println("Enter number of elements");

    int n=s.nextInt();

    int arr[]=new int[n];


    for(int i=0;i<n;i++){//for reading array
        arr[i]=s.nextInt();

    }

    for(int i: arr){ //for printing array
    	if(i % 3  ==0 ) {
    		System.out.println("Idiot");
    	}
    	if(i+1 ==3 ) {
    		System.out.println("Stupid");
    	}
    	
        

    }


}

}

