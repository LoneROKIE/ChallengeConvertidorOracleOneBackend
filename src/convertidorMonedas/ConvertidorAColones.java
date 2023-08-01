package convertidorMonedas;

import javax.swing.JOptionPane;

public class ConvertidorAColones {

	public  void convertirDolaresAColones(double valorAConvertir) {
		double monedaColon = (valorAConvertir * 540.32)/1;
		monedaColon = (double) Math.round(monedaColon * 100d)/100;
		
		JOptionPane.showMessageDialog(null, "Tienes: "+monedaColon+" Colones");
	}
	
	public void convertirEurosAColones(double valorAConvertir) {
		double monedaColones = (valorAConvertir * 594.82)/1;
		monedaColones = (double) Math.round(monedaColones * 100d)/100;
		
		JOptionPane.showMessageDialog(null, "Tienes: "+monedaColones+" Colones");
	}
	
	
	public  void convertirLibrasEsterlinasAColones(double valorAConvertir) {
		double monedaColones = (valorAConvertir * 694.90)/1000;
		JOptionPane.showMessageDialog(null, "Tienes: "+monedaColones+" Colones");
	}
	
	
	public  void convertirWonesSurCoreanosAColones(double valorAConvertir) {
		double monedaColones = (valorAConvertir * 423.23)/1000;
		monedaColones = (double) Math.round(monedaColones * 100d)/100;
		
		JOptionPane.showMessageDialog(null, "Tienes: "+monedaColones+" colones");
	}
	/*
	public static void main(String[] args) {
		//convertirWonesSurCoreanosAColones(3000);
		//convertirLibrasEsterlinasAColones(20);
		//convertirEurosAColones(20);
		//convertirDolaresAColones(40);
	}
	
	*/
}
