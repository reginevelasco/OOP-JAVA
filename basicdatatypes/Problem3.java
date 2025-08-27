
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Problem3 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Input the number of minutes:");
        long minutes = input.nextLong();
        
        long minutesInYear = 60 * 24 * 365;
        long years = minutes/ minutesInYear;
        long days = (minutes% minutesInYear) / ( 60* 24);
        
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days ");
    }
}

