package ui;

import java.util.Date;
import java.util.Scanner;

import exception.AdultException;
import exception.PenultimateNumberEXception;
import model.Client;
import model.MiniMarket;

public class Main {
	private static MiniMarket minimarket;

	public static void menu()  {		
		
		Client cl = new Client(0, "");
		MiniMarket mnk = new MiniMarket();		
		
		Scanner sn = new Scanner(System.in);
	       boolean salir = false;
	       int opcion; //Guardaremos la opcion del usuario
	        
	       while(!salir){
	    	   System.out.println(" \n              \n       ***********BIENVENIDOS********* *    \n ");
	   		System.out.println("--  MI BARRIO TE QUIERE --");
	   		System.out.println("INGRESE  EL NUMERO QUE CORRESPONDA A SU TIPO DE DOCUMENTO  \n 1)TI  \n 2)CC \n 3)PP \n 4 CE"
					+ cl.typeDocuments());           
	           
	            
	           System.out.println("Escribe una de las opciones");
	           opcion = sn.nextInt();    		
	   		
	            
	           switch(opcion){
	               case 1:
	                   System.out.println("Has seleccionado la opcion 1");
	                   try {
	       	   			mnk.mayorEdad(opcion);
	       	   		} catch (AdultException e1) {
	       	   			// TODO Auto-generated catch block
	       	   			e1.printStackTrace();
	       	   			
	       	   		}
	                   salir=true;
	                   break;
	               case 2:
	                   System.out.println("Has seleccionado la opcion 2");
	                   
	                   System.out.println("por favor digite su numero de documento de identidad");
	       	   		
	       	   	    int num = sn.nextInt();
	       	   	    String idCliente=String.valueOf(num);
	       	   	    try {
	       	   			mnk.enterStore(idCliente);
	       	   		} catch (PenultimateNumberEXception | AdultException e) {
	       	   			// TODO Auto-generated catch block
	       	   			e.printStackTrace();
	       	   		}
	                   break;
	                case 3:
	                   System.out.println("Has seleccionado la opcion 3");
	                   break;
	                case 4:
	                   salir=true;
	                   System.out.println("Saliste del sistema");
	                   break;
	                default:
	                   System.out.println("Solo números entre 1 y 4");
	           }
	            
	       }
	   
	}

	public static void main(String[] args) {
		minimarket = new MiniMarket();
		menu();

	}
}
