package co.edu.sena;

public class Ejercicios {
    public static double trian(double Num1, double Num2) {
        return (Num1 * Num2) /2;
    }

    public static double add(double Num1, double Num2){
        return (Num1 + Num2);
    }

    public static double poten(double Num1, double Num2){
        return Math.pow(Num1, Num2);
    }
    
    public static double conver(double Num1, double Num2) {
		return Num1 * 1.0938 ;
	}

    public static double peri(double Num1) {
        return Num1 + Num1 + Num1 + Num1;
    }

    public static double area(double Num1) {
        return Num1 * Num1;
    }


    public static double cylinvol(double Num1, double Num2) {
        return  2 * 3.14 * Num1 * Math.pow(Num1,2);

    }
    
    public static double are(double Num1) {
        return Math.PI*Math.pow(Num1,2);
    }
    public static double per(double Num1) {
        return 2 * Math.PI * Num1;
    }

    public static double ave(double Num1, double Num2,double Num3 ) {
        return (Num1 + Num2 + Num3) /3; 
    }





    
}
