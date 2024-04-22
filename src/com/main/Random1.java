package com.main;

import java.util.Random;

public class Random1 {
public static void main(String[] args) {
	while(true)
	{
	 Random random = new Random();
     int randomNumber = random.nextInt(5); // Generates a random number between 0 and 9
     System.out.println("Random number: " + randomNumber);
}}
}
