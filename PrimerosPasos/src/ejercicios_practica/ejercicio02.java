package ejercicios_practica;
import java.util.Scanner;

public class ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("INTRODUCE UN NUMERO...");
		int num1 = sc.nextInt();
		
		System.out.println("INTRODUCE OTRO NUMERO...");
		int num2 = sc.nextInt();
		
		
		if(num1>num2) {
			System.out.println("EL NUMERO "+num1+" ES EL MAYOR");
		}else if(num2>num1) {
			System.out.println("EL NUMERO "+num2+" ES EL MAYOR");
		}else {
			System.out.println("SON IGUALES...\n");
		}

	}

}
