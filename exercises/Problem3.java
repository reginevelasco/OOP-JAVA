/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number:");
        int a = sc.nextInt();
        System.out.println("Input second number");
        int b = sc.nextInt();
        System.out.println("Input third number");
        int c = sc.nextInt();

        int greatest = a;
        if (b > greatest) {
            greatest = b;
            {
                if (c > greatest) {
                    greatest = c;
                    {
                        System.out.println("The greatest:" + greatest);
                    }
                }
            }
        }
    }
}
