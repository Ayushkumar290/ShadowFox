import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        //Uisng scanner class  which implements of Itrable class in java by wich we take user input 
        Scanner sc = new Scanner(System.in); 

        // using while to make it runable untill user wants to stop it.;
        while(true){
            // Giving the choise to user;
            System.out.println("Choose Operator \n 1- Add \n 2- Subtraction \n 3- Multiplication \n 4- Division \n 5- Squere root \n 6- Exponentiation \n 7- Temperature \n 8- Currency \n 9- Exit");
            
            System.out.println("Enter your Choise: ");
            int Operation = sc.nextInt();  // taking input from user;
            
            // break condition by wich function will stop;
            if(Operation == 9){
                System.out.println("Come Agin.... \n Exiting.... ");
                break;
            }

            
            // Using switch control flow statement for simple multiplication;
            if (Operation >= 1 && Operation <= 4){

                //taking numbers to perform operations;
                System.out.println("Enter the First Number: ");
                double n1 = sc.nextDouble();
                System.out.println("Enter the Second Number: ");
                double n2 = sc.nextDouble(); 
                double result;

                switch (Operation) {
                    case 1: 
                        // Add
                        result = n1 + n2;
                        System.out.println("Result = " + result);
                        break;
                    case 2:
                        //Subtract;
                        result = n1 - n2;
                        System.out.println("Result = " + result); 
                        break;
                    case 3:
                        //Multiply;
                        result = n1 * n2;
                        System.out.println("Result = " + result);
                        break; 
                    case 4:
                        //divide;
                        if(n2 == 0 ){ // to avoid  of Arithmetic Exception; 
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                        result = n1 / n2;
                        System.out.println("Result = " + result); 
                        break;
                    default:
                        // in case of wrong choise ;
                        System.out.println("Invalid choice! Please enter a number between 1 and 4.");
                        break;
                }
            } 
            // for finding Square Root ;
            else if(Operation == 5){
                System.out.println("Enter the number: ");
                double num = sc.nextDouble();
                if(num < 0 ){
                    System.out.println("Error: Square root of negetive number is not real");

                }else{
                    // here using Math class of java which contains sqrt METHOD to find SUQRE ROOT  
                    System.out.println("Square Root = " + Math.sqrt(num));
                }
                
            }
            // FOR finding Exponents;
            else if(Operation == 6){
                System.out.println("Enter the Base value: ");
                double base = sc.nextDouble();
                System.out.println("Enter the exponent: ");
                double exponent = sc.nextDouble();

                // using pow method to find exponential value of base ;
                System.out.println("Result = " + Math.pow(base, exponent));
            }
            // temperature converter;
            else if( Operation == 7){
                System.out.println("Choose Conversion:");
                System.out.println("1 - Celsius to Fahrenheit");
                System.out.println("2 - Fahrenheit to Celsius");
                int choicee = sc.nextInt();

                System.out.print("Enter temperature: ");
                double temp = sc.nextDouble();
                if(choicee == 1){
                    System.out.print("Converted: " + ((temp * 9/5) + 32) + " °F");
                }
                else if(choicee == 2){
                    System.out.print("Converted: " + ((temp -32)*5/9) + " °C" );
                }
                else{
                    System.out.println("Invalid choice for temperature conversion.");
                }
            }
            //Currency converter ;
            else if(Operation == 8){
                System.out.println("Choose currency conversion :");
                System.out.println("1 - USD TO INR");
                System.out.println("2 - INR TO USD");
                int choicee = sc.nextInt();

                System.out.print("Enter amount : ");
                double amount = sc.nextDouble();
                double exchangeRate = 83.0;
                if(choicee == 1){
                    // INR TO USD;
                    System.out.println("Converted: " + (amount * exchangeRate) + "INR");
                }
                //USD TO INR; 
                else if(choicee == 2){
                    System.out.println("Converted: " + (amount / exchangeRate) + "USD");
                }
                //FOR INVALID CHOISE;
                else{
                    System.out.println("Invalid choice for currency conversion.");
                }
            }
            else{
                System.out.println("Invalid choice! Please enter a number between 1 and 9.");
            }

        }
        // closing the scanner func to stop taking input;
        sc.close();
    }
    
}