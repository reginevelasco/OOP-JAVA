
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author User
 */
public class Problem5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input distance in meters:");
        double distance = input.nextDouble();

        System.out.println("Input hours:");
        int hours = input.nextInt();

        System.out.println("Input minutes:");
        int minutes = input.nextInt();

        System.out.println("Input seconds:");
        int seconds = input.nextInt();

        //Convert time to total seconds
        int totalseconds = (hours * 3600) + (minutes * 60) + seconds;

        //Speed 
        double mps = distance / totalseconds; // meters per second
        double kph = (distance / 1000.0) / (totalseconds / 3600.0);
        double mph = kph / 1.609; //miles/h

        //Output
        System.out.println(" Your speed in meters/second is " + mps);
        System.out.println(" Your speed in km/h is " + kph);
        System.out.println(" Your speed in miles/h is " + mph);
    }
}
