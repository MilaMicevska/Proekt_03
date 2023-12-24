package proektt3;

import java.util.Scanner;

public class kruznica {

	public static void main(String[] args) {
		double p, l;
		System.out.println("Programata presmetuva perimetar i plostina na kruznica");
	Scanner tastatura = new Scanner (System.in);
	double r = tastatura.nextDouble();
	System.out.println("radius e"+r+"cm");
	double pi = tastatura.nextDouble();
	System.out.println("pi e"+pi+"cm");
	System.out.println();
	p=r*r*pi;
	System.out.println("Plostina e"+ p);
	l=2*r*pi;
	System.out.println("Perimetarot e"+l);
	
	}

}


