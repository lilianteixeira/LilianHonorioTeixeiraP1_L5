package hotel;

import java.util.ArrayList;

public class Recepcao {
	
	private ArrayList<Estadia> estadia;
	private int numDeHospedes;
	private double lucroTotal;
	
	public Recepcao() {
	
		estadia = new ArrayList<Estadia>();
		
	}

	public void checkIn(String nome, String tipo, int idade, int dias, double valor){
		
	}
	
	public void checkOut(String nome){
		
	}

	@Override
	public String toString() {
		return "Recepcao [estadia=" + estadia + ", numDeHospedes="
				+ numDeHospedes + ", lucroTotal=" + lucroTotal + "]";
	}
	
	//equals é necesario   ?
	
	
	
	
}
