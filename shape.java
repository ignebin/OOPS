
//QUESTION:Area of different shapes using overloaded functions.

import java.util.Scanner;

public class shapes {
    static void area(int r1){
        double Area_val = 3.14*r1*r1;
        System.out.println("\nArea of Circle is Radius "+r1+" = "+Area_val);
    }
    static void area(int a1,int b1){
        int Area_val = a1*b1;
        System.out.println("\nArea of Rectangle is with dimensions "+a1+" X "+b1+" = "+Area_val);
    }
    static void area(int a1,int b1,int c1){
        int Area_val = a1*b1*c1;
        System.out.println("\nArea of Cuboid is with dimensions "+a1+" X "+b1+" X "+c1+" = "+Area_val);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Length");
        int l = sc.nextInt();
        System.out.println("Enter the Breath");
        int b = sc.nextInt();
        System.out.println("Enter the Height");
        int h = sc.nextInt();
        System.out.println("Enter the Radius");
        int r = sc.nextInt();
        area(r);
        area(l,b);
        area(l,b,h);
    }
}
/*
OUTPUT

mlm@mlm-desktop:~/Desktop/Rojin/java/Matrix Addition$ javac shapes.java
mlm@mlm-desktop:~/Desktop/Rojin/java/Matrix Addition$ java shapes

Enter the Length
5
Enter the Breath
6
Enter the Height
8
Enter the Radius
5

Area of Circle is Radius 5 = 78.5

Area of Rectangle is with dimensions 5 X 6 = 30

Area of Cuboid is with dimensions 5 X 6 X 8 = 240

*/
