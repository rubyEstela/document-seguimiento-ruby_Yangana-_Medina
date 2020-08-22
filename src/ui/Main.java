package ui;

import java.util.Date;
import java.util.Scanner;

import model.Client;
import model.MiniMarket;



public class Main {
	private static MiniMarket minimarket;
	
	public static  void menu() {
		
		Scanner sc = new Scanner(System.in);
		Client cl = new Client( 0,"");
		Date date=new Date();
		System.out.println(" \n              \n       ***********BIENVENIDOS********* *    \n ");
		System.out.println("--  MI BARRIO TE QUIERE --");
		System.out.println("INGRESE  EL NUMERO QUE CORRESPONDA A SU TIPO DE DOCUMENTO  \n 1)TI  \n 2)CC \n 3)PP \n 4 CE"+cl.typeDocuments());
		int types= sc.nextInt();
		System.out.println("por favor digite su numero de documento de identidad");
		int num=sc.nextInt();
		
		
		
		
	}
	 
	
		  
		
	
		
		
		
	


	
public static void main(String[] args) {
	minimarket = new MiniMarket();
	menu();

}
}
