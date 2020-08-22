package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import exception.AdultException;
import exception.PenultimateNumberEXception;
import ui.Main;

public class MiniMarket {
	Client c = new Client(  0,"");
	
	Date fechas= new Date();
	
	
	private List<Client> clients;
	private String num;

	public MiniMarket() {
		
		clients = new ArrayList<>();
		
	}
	
	
	public List<Client> getClients(){
		return clients;
		
	}
	
	
	public void addClient(int typeDocument, String documentNumber){
		Client cli=new Client(typeDocument,documentNumber);
		clients.add(cli);
	}
	
	   public  char penultimateNumber(String line)  {		   
		    
		    char[] penultimo = line.toCharArray();	    
		   
		   char resul=penultimo[(penultimo.length)-2];
		   
		 
		 return resul;		
	
	}
	   public void enterStore(String idCliente)throws PenultimateNumberEXception,AdultException {
		   
		   int penultimo=Character.getNumericValue(penultimateNumber(idCliente));
		   
		   
		   if(penultimo%2==0 && fechas.getDay()%2==0) {
			   throw new PenultimateNumberEXception(idCliente);
			 
		   }else if(penultimo%2!=0 && fechas.getDay()%2==0) {
			   System.out.println("Cliente agregado correctamente");
			   clients.add(c);			   
		   }
		  
			
	  
	  }
	   
	   
public void mayorEdad(int types)throws AdultException {
		   
		   if(types==Client.TI) {
			   throw new AdultException(types);   
			   
		   }		
	  
	  }
			   
		   
}	   
	   

