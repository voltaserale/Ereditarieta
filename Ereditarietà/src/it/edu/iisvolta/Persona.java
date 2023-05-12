package it.edu.iisvolta;

public class Persona {
	//protected: gli attributi saranno visibili alle sottoclassi (che quindi li potranno ereditare), ma non saranno visibili da classi esterne (ad es. la Main)
	protected String nome;		//non è visibile da altre classi che non siano "sottoclassi" di Persona
	protected String cognome;
	protected int età;
	
	public void Compleanno() {
		età++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEtà() {
		return età;
	}

	public void setEtà(int età) {
		if (età>0)
			this.età = età;
		else
			System.out.println("Età non valida!");
	}
	
	
}
