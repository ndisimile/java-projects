/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nic
 */
import java.util.Scanner;
public class ctofConverter {

    
    public static void main(String[] args) {
        //Declartions
        double tempFahrenheit = 0;    
        double tempInCelsius = 0;
        String trash = "";
        Scanner in = new Scanner(System.in);  
        
        //input
        System.out.print("Enter the temperature in Celsius ");
        //process
        if(in.hasNextDouble())
        { 
            tempInCelsius = in.nextDouble();
            tempFahrenheit = tempInCelsius * 9 /5 + 32;
            System.out.println("You said the temperature was "+tempInCelsius+" degrees Celsius which is "+tempFahrenheit+" degrees in Fahrenheit");
       
        if (tempFahrenheit == 32)//0 degrees celsius
           System.out.println(""+tempFahrenheit+" degrees Fahrenheit is the freezing point of water "); 
        
        if (tempFahrenheit == 212)// 100 degrees celsius
           System.out.println(""+tempFahrenheit+" degrees Fahrenheit is the boiling point of water "); 
        }
        else
        {
            //not an integer
            trash =in.nextLine();
            System.out.println("You said the temperature was "+trash+" degrees celsius");
            System.out.println(""+trash+" is not a valid integer");
        }
    }
          
    
}
