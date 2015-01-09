/** MyFirstApp is a sample program from p. 8-9 of Head First Java, 2nd edition.
 @author Kathy Sierra and Bert Bates
 @author Alexis Jimenez
 @version 01/08/2015 for lab00, cs56, W15
*/
import java.util.Date;

public class MyFirstApp {
    public static void main (String[] args){
	System.out.print("I Rule!");

  // Instantiate a Date object
       Date date = new Date();
        
       // display time and date using toString()
       System.out.println(date.toString());
    }
}
