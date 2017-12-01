

/**
 *
 * @author Nic
 */
import java.util.Scanner; 
public class metric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declarations
        double meters = 0;
        double convertMiles =0;
        double convertFt= 0;
        double convertIn= 0;
        String trash = "";
        //Process
        Scanner in = new Scanner(System.in);  
        System.out.print("Please input measurement in meters: ");
        
        if (in.hasNextDouble())
        {
            meters = in.nextDouble();
            convertMiles = meters /1609.344 ;
            convertFt = meters * 3.2808;
            convertIn = meters * 39.370;
            System.out.println(""+meters+" meters is "+convertMiles+" miles");
            System.out.println(""+meters+" meters is "+convertFt+" feet");
            System.out.println(""+meters+" meters is "+convertIn+" inches");
        
            
        }   
        else
        {

            trash=in.nextLine();
            System.out.println("You entered "+trash+" which is not a valid input");   

        }

    }
    
}
