package com.lunodzo;
import java.util.Scanner;
public class Review1{
    public static void main(String [] args) {
        String[] breakfast = new String[3];
		try (Scanner input = new Scanner(System.in)) {
            for(int i=0; i<breakfast.length; i++){
            	breakfast[i] = input.nextLine();
            }
        }
		
		System.out.println(breakfast[0]);
    }
}
