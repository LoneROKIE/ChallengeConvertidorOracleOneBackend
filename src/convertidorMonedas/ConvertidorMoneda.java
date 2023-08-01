package convertidorMonedas;

import javax.swing.JOptionPane;

public class ConvertidorMoneda {

	public void convertirColonesADolares(double valorAConvertir) {
		double monedaDolar = valorAConvertir / 540.32;
		monedaDolar = (double) Math.round(monedaDolar * 100d)/100;
		
		JOptionPane.showMessageDialog(null, "Tienes: "+monedaDolar+" Dolares");
	}
	
	public void convertirColonesAEuros(double valorAConvertir) {
		double monedaEuros = valorAConvertir / 594.82;
		monedaEuros = (double) Math.round(monedaEuros * 100d)/100;
		
		JOptionPane.showMessageDialog(null, "Tienes: "+monedaEuros+" Euros");
	}
	
	
	public void convertirColonesLibrasEsterlinas(double valorAConvertir) {
		double monedaLibrasEsterlinas = valorAConvertir / 694.90;
		monedaLibrasEsterlinas = (double) Math.round(monedaLibrasEsterlinas * 100d)/100;
		
		JOptionPane.showMessageDialog(null, "Tienes: "+monedaLibrasEsterlinas+" Libras Esterlinas");
	}
	
	
	public void convertirColonesAWonSurCoreano(double valorAConvertir) {
		double monedaWonSurcoreano = valorAConvertir / 540.32;
		monedaWonSurcoreano = (double) Math.round(monedaWonSurcoreano * 100d)/100;
		
		JOptionPane.showMessageDialog(null, "Tienes: "+monedaWonSurcoreano+" Wons Sur coreano");
	}
	
	
}
