package altropackage;

import it.edu.iisvolta.Dipendente;
import it.edu.iisvolta.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p=new Persona();
		
		
		p.Compleanno();
		//p.stipendio=2000;  //non si può fare
		//p.Promozione();   //non si può fare
		p.setEtà(20);
		//p.setStipendio(2000); //non si può fare 
		p.Compleanno();
		
		//p.età=20;   //non si può fare perché è "protected"
		System.out.println("Età persona: "+p.getEtà());
		
		
		Dipendente d=new Dipendente();
		
		d.Compleanno();
		d.Promozione();
		d.setEtà(59);
		d.setStipendio(2000);
		System.out.println("Età dipendente: "+d.getEtà());
		
	}

}
