/*
* Estrutura de Decisão Condicional
* Switch | Case 
* @author Bianca  
*/
import java.util.Scanner;

public class main {
    public static void main (String[] args){
    Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number referring to the days of the week: ");
        int num = sc.nextInt();
        switch (num){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
                break;    
            case 7:
                System.out.println("Sunday");
                break;            
            default:
                 System.out.println("This is not a valid day");    
        } 
    
    } 
}

