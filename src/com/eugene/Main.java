package com.eugene;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double a, b, c;
        System.out.println("Enter coefficients:");
        System.out.print("A: ");
        a=scanner.nextDouble();
        System.out.print("B: ");
        b=scanner.nextDouble();
        System.out.print("C: ");
        c=scanner.nextDouble();

        Point point=roots(a, b, c);

        System.out.println("The roots are: \n X1="+point.x+" \n X2= "+point.y);

    }

    public static Point roots(double a, double b,double c){
        Point point=new Point();
        double roots=(Math.pow(b, 2))-(4*a*c);

        if (roots==0){
            point.x= (int) (-b/(2*a));
            point.y= (int) (-b/(2*a));
        }

        else if (roots>0){
            point.x= (int) ((-b+Math.sqrt(roots))/(2*a));
            point.y= (int) ((-b-Math.sqrt(roots))/(2*a));
        }

        return point;
    }
}
