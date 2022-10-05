import java.util.Scanner;

public class Calc {
    static final Scanner inputScanner = new Scanner (System.in);
   
    private static String getString(String prompt) {
      
        System.out.println(prompt);
        return inputScanner.nextLine();


    }
    
    private static double getDouble(String prompt) {
        System.out.println(prompt);
        return inputScanner.nextDouble();
    }
    public static void main(String[] args) {
    String response= getString( "pick a number corosponding to the following operations: \n 1: add \n 2: subtract \n 3: multiply \n 4: divide \n 5: exit" );
     while (response != "5"){      
          
     
     
        double num1= getDouble("pick a number");
        double num2= getDouble("pick another number");
     //System.out.println(String.format("you want to add %.2f and %.2f", num1,num2  ));
        Calculator calculator = new Calculator();
        double addAnswer =calculator.add(num1,num2);
        double subAnswer =calculator.subtract(num1,num2);
        double multAnswer =calculator.multiply(num1,num2);
        double divAnswer =calculator.divide(num1,num2);
        
        

        if (response==1){
            System.out.println(addAnswer);
        }  
        if (response=="2"){
            System.out.println(subAnswer);
        }   
        if (response=="3"){   
            System.out.println(multAnswer);
        }   
        if (response=="4"){   
            System.out.println(divAnswer);
        }    
     }
    }
    
}