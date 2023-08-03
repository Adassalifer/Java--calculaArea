package application;

import java.util.Locale;
import java.util.Scanner;

import util.calculator;

public class Programajava {


	     public static void main(String[] args) {

	     Locale.setDefault(Locale.US);
	     Scanner sc = new Scanner(System.in);
	     calculator calc = new calculator();

	     System.out.print("Enter radius: ");
	     double radius = sc.nextDouble();
	     
	     double c = calc.circumference(radius);

	     double v = calc.volume(radius);

	     System.out.printf("Circumference: %.2f%n", c);
	     System.out.printf("volume: %.2f%n", v);
	     System.out.printf("PI value: %.2f%n", calc.PI);

	     sc.close();

	   }
	    
	}

