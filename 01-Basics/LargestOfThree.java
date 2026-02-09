package canditionals;

import java.util.Scanner;

public class threeGreatestNestedNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number:");
        //System.out.println("enter first number:");
        int a=sc.nextInt();
        System.out.println("enter 2nd number:");
        int b=sc.nextInt();
        System.out.println("enter the 3rd number:");
        int c=sc.nextInt();

        if(a>b) {
            if (a > c) System.out.println(a + " is largest");
            else //c>a>b
                System.out.println(c + " is largest");
        }
        else {
            if (b > c) System.out.println(b + "is largest");
            else System.out.println(c + "is largest");
        }
    }
}
