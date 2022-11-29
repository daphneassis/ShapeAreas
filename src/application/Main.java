package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List <Shape> list = new ArrayList<>();
		
		System.out.println("Enter the number of shapes");
		int n = sc.nextInt();
		 for(int i =0; i<n;i++) {
			 System.out.printf("Shape #%d data\n", i+1);
			 System.out.println("Rectangle or Circle?(r/c)");
			 char ch = sc.next().charAt(0);
			 if(ch =='r') {
				 System.out.println("Color(BLACK, BLUE or RED):");
				 Color colorRect = Color.valueOf(sc.next());
				 System.out.println("Width:");
				 double widthRect =sc.nextDouble();
				 System.out.println("Height:");
				 double heightRect = sc.nextDouble();
				 list.add(new Rectangle(colorRect, widthRect, heightRect));
			 }
			 if(ch=='c') {
				 System.out.println("Color(BLACK, BLUE or RED):");
				 Color colorCircle = Color.valueOf(sc.next());
				 System.out.println("Radius:");
				 double radiusCircle = sc.nextDouble();
				 list.add(new Circle(colorCircle, radiusCircle));
			}
		 }
			System.out.println("SHAPE AREAS");
			for (Shape c : list) {
				System.out.printf(String.format("%.2f\n", c.area()));
			}
	}

}
