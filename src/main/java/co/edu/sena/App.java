package co.edu.sena;

import java.util.Scanner;

public class App 
{
    static Scanner info = new Scanner(System.in);
    static int option,sub0ption;
    static double Num1, Num2, Num3,Num4;
    static double result;

    public static void main( String[] args ){
    do {
        System.out.println( "Welcome to the options menu");
        System.out.println( "1. Operators");
        System.out.println( "2. Conditionals");
        System.out.println( "3. Cycles");
        System.out.println( "99. Exit");
        System.out.println( "Please type an option");
        
        option = info.nextInt();
     switch (option) {
        case 1:
            Operators();
            break;

            case 2:
            Conditionals();
            break;

            case 99:
            System.out.println( "Leaving the program");
            break;
     
            default:
            System.out.println( "Invalid option");
            break;
     }


    } while (option != 99);
       
    }

    static void Operators(){
        do {
            System.out.println( "Welcome to the operators submenu");
            System.out.println( "1. Calculate the area of ​​a triangle");
            System.out.println( "2. Add two numbers");
            System.out.println( "3. Number squared");
            System.out.println( "4. Conversion from euros to dollars");
            System.out.println( "5. Find perimeter and area of ​​a square");
            System.out.println( "6. Calculate area and volume of a cylinder");
            System.out.println( "7. Calculate the length of a circle and its area");
            System.out.println( "8. Calculate average of three numbers");
            System.out.println( "99. Exit...");
            System.out.println( "Please type an option");
            sub0ption = info.nextInt();
            switch (sub0ption) {
                case 1:
                    calculateareat();
                    break;
                    
                case 2:
                    addnums();
                    break;
                
                case 3:
                    calculatesquare();
                    break;
                    
                case 4:
                    convertion();
                    break;

                case 5:
                    periandareasquare();
                    break;
            
                case 6:
                    areaandvolumencylin();
                    break;

                case 7:
                    calculatecirc();
                    break;

                case 8:
                    average();
                    break;

                default:
                System.out.println( "Invalid option,please try again");
                    break;
            }
            

        }while (sub0ption != 99);


    }
    
    static void calculateareat(){
        System.out.println( "Calculate the area of ​​a triangle");
        System.out.println( "Enter the base of the triangle: ");
        Num1 = info.nextDouble();
        System.out.println( "Enter the height of the triangle: ");
        Num2 = info.nextDouble();
        result = Ejercicios.trian(Num1, Num2 );
        System.out.println("The result is: " + result);
    }

    static void addnums(){
        System.out.println("Add two numbers");
        System.out.println("Enter a number: ");
        Num1 = info.nextDouble();
        System.out.println("Enter other number: ");
        Num2 = info.nextDouble();
        result = Ejercicios.add(Num1, Num2 );
        System.out.println("The result is: " + result);
    }

    static void calculatesquare(){
        System.out.println("Number squared");
        System.out.println("Enter a base: ");
        Num1 = info.nextDouble();
        System.out.println("Enter a exponent: ");
        Num2 = info.nextDouble();
        result = Ejercicios.poten(Num1, Num2);
        System.out.println("The result is: " + result);
    }
    
    static void convertion(){
        System.out.println("Conversion from euros to dollars");
        System.out.println("Enter an amount of euros: ");
        Num1 = info.nextDouble();
        System.out.println("Enter the type of currency: ");
        Num2 = info.nextDouble();
        result = Ejercicios.conver(Num1, Num2);
        System.out.println("The result is: " + result);

    }

    static void periandareasquare(){
        System.out.println("Find perimeter and area of ​​a square");
        System.out.println("Enter a value of one side: ");
        Num1 =  info.nextDouble(); 
        Num2 = Ejercicios.peri(Num1);
        System.out.println("The perimeter value is: " +Num2);
        result = Ejercicios.area(Num1);
        System.out.println("The area value is: " +result);

    }

    static void areaandvolumencylin() {
        System.out.println("Calculate area and volume of a cylinder");
        System.out.println("Enter a value of base: ");
        Num1 = info.nextDouble(); 
        System.out.println( "Enter the height of the cylinder: ");
        Num2 = info.nextDouble();
        result = Ejercicios.cylinvol(Num1, Num2 );
        System.out.println("The result is: " + result);
    } 

    static void calculatecirc(){
        System.out.println("Calculate the length of a circle and its area");
        System.out.println("Enter the length of the circle"); 
        Num1 = info.nextDouble();
        System.out.println("Enter the area of the circle"); 
        Num2 = Ejercicios.per(Num1);
        System.out.println("The perimeter value is: " +Num2);
        result = Ejercicios.are(Num1);
        System.out.println("The area value is: " +result);

    }

    static void average(){
        System.out.println(" Calculate average of three numbers");
        System.out.println("Enter the first value"); 
        Num1 = info.nextDouble();
        System.out.println("Enter the second value"); 
        Num2 = info.nextDouble();
        System.out.println("Enter the third value");
        Num3= info.nextDouble();
        result = Ejercicios.ave(Num1,Num2,Num3);
        System.out.println("The result is: "+ result); 

    }
    

    static void Conditionals(){
        do {
            System.out.println( "Welcome to the Conditionals submenu");
            System.out.println( "1. Write an algorithm to find out if the number entered by keyboard is positive or negative.");
            System.out.println( "2. Write an algorithm that receives two numbers per keyboard and says which is the largest and which is the minor");
            System.out.println( "3. Write a program that reads three positive integers and calculates and prints screen the smallest and the largest of them.");
            System.out.println( "4. Given two numbers A and B, add them if A is less than B or subtract them.");
            System.out.println( "5. Given two numbers A and B, add them if at least one of them is negative, otherwise multiply them.");
            System.out.println( "6. Calculate the length of a circle and its area");
            System.out.println( "7. Write an algorithm that determines whether a year is a leap year or not.");
            System.out.println( "99. Exit...");
            System.out.println( "Please type an option");
            sub0ption = info.nextInt();
            switch (sub0ption) {
                case 1:
                    positiveornegative();
                    break;
                    
                case 2:
                    majorandminor();
                    break;
                
                case 3:
                    majorandminorint();
                    break;
                    
                case 4:
                    addorsub();
                    break;

                case 5:
                    division();
                    break;
            
                case 6:
                    multiplication();
                    break;

                case 7:
                    year();
                    break;


                default:
                System.out.println( "Invalid option,please try again");
                    break;
            }
            

        }while (sub0ption != 99);


    }

    static void positiveornegative(){
        System.out.println("Know if a number is positive or negative");
        System.out.println("Enter a number: ");
        Num1 = info.nextDouble();
        if (Num1 < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is positive");
        }
    }

    static void majorandminor(){
        System.out.println("Write two numbers on the keyboard and say which is the largest and which is the minor.");  
        System.out.println("Enter a first number: ");
        Num1 = info.nextDouble();
        System.out.println("Enter a second number: ");
        Num2 = info.nextDouble();
            
        if (Num1 > 0) {
            System.out.println("The number is major");
        } else {
            System.out.println("The number is minor");
        }

    }
     
    static void majorandminorint(){
        System.out.println("Read three positive integers and calculate and print in screen the smallest and the largest of them.");
        System.out.println("Enter a first number");
        Num1 = info.nextDouble();
        System.out.println("Enter a second number");
        Num2 = info.nextDouble();
        System.out.println("Enter a third number");
        Num3 = info.nextDouble();

            if (Num1 < Num2 & Num2 > Num3) {
                System.out.println("El menor es: " +   Num1 +"y el mayor" + Num3 + "\n" );                                             
            
            }else if (Num1 < Num2 & Num2 > Num3) {
            System.out.println("El menor es: " +   Num3 +"y el mayor" + Num1 + "\n" );
        

        } else if (Num1 < Num2 & Num2 > Num3) {
            System.out.println("el mayor es: " + Num3);
            System.out.println("El menor es: " +   Num3 +"y el mayor" + Num2 + "\n" );
        } else {
            System.out.println("el mayor es: " + Num2 + "y el menor"+ Num3 + "\n");
        }
    }  
    
    
    static void  addorsub(){
        System.out.println("Given two numbers A and B, add them if A is less than B or subtract them.");
        System.out.println("Give a number A: ");
        Num1 = info.nextDouble();
        System.out.println("Give a number B: ");
        Num2 = info.nextDouble();

        if (Num1 > Num2){

            result = Num2 + Num1;
            System.out.println("The result of add is: " + result + "\n");

            
        } else { 
            result = Num2 - Num2; 
            System.out.println("The result of sub is: " + result + "\n");
        }
       
    }

    static void  division(){
        System.out.println("Find the quotient between A and B.");
        System.out.println("Give a number A: ");
        Num1 = info.nextDouble();
        System.out.println("Give a number B: ");
        Num2 = info.nextDouble();
        result =Num1 / Num2;

        if (Num2==0) {
            System.out.println("The division is not possible");
        }
        else {
            System.out.println("The result is: " + result + "\n");
        }          
    }
    
    static void multiplication(){
        System.out.println("Add or multiplicate");
        System.out.println("Give a number A: ");
        Num1 = info.nextDouble();
        System.out.println("Give a number B: ");
        Num2 = info.nextDouble();

        if (Num1 < 0 & Num2 < 0 ) {
            result =Num1 + Num2;
            System.out.println("The result of add is: " + result + "\n");


        }else {
            result = Num2 * Num1;
            System.out.println("The result of multip. is: " + result+ "\n");
        }
    }
    
    static void year(){
        System.out.println("Write an algorithm that determines whether a year is a leap year or not.");
        System.out.println("Enter the actual year: ");
        Num1 = info.nextDouble();

        if (Num1 %4 ==0){
            System.out.println("The year is leap");
        }
        
        else{ 
            System.out.println("The year is not leap");
        }

    }
    }



