package principal;


import javax.swing.*;

import convertidorMonedas.SelectorFuncionalidad;
import convertidorTemperatura.SelectorFuncionalidadTemp;

public class Ejecucion {
	
	public static void main(String[] args) {
		
		while(true) {
			
			String seleccion = JOptionPane.showInputDialog(
					null,
					"Seleccione una opcion",
					"Selector Convertor",
					JOptionPane.QUESTION_MESSAGE,
					null,
					new Object[] {"Convertidor Moneda", "Convertidor Temperatura"},"Seleccion").toString();
			
			double entrada = Double.parseDouble( JOptionPane.showInputDialog(
					null,
					"Valor A Convertir",
					JOptionPane.QUESTION_MESSAGE));
			
			switch(seleccion) {
			case "Convertidor Moneda":
				SelectorFuncionalidad funcionalidad = new SelectorFuncionalidad();
				funcionalidad.ConvertirMonedas(entrada);
				break;
			case "Convertidor Temperatura":
				SelectorFuncionalidadTemp funcionalidadTemp = new SelectorFuncionalidadTemp();
				funcionalidadTemp.ConvertirTemperatura(entrada);
				
				break;
			}
			break;
		}
		
		
	}
}
