package it.edu.iisvolta;

import java.util.Date;

public class Dipendente extends Persona {

	//tutte gli attributi e i metodi di Persona li "eredito"
	
	int stipendio;
	Date dataAssunzione;
	
	public void Promozione() {
		stipendio+=500;
	}

	public int getStipendio() {
		return stipendio;
	}

	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}

	public Date getDataAssunzione() {
		return dataAssunzione;
	}

	public void setDataAssunzione(Date dataAssunzione) {
		this.dataAssunzione = dataAssunzione;
	}
	
	
}
