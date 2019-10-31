package es.unileon.prg1.pdate;

public class PDatePrincipal {

	public static void main(String[] args) {

		Date myFecha= new Date();
		Date myFecha2=new Date(3,5,6);
		
		if (myFecha.isSameYear(myFecha2)) {
			System.out.println("Es la misma fecha");
		}
		else {
			System.out.println("son fechas distintas");
			
		}
		
		System.out.println(myFecha);
		
		 
	}
	
	
	}

