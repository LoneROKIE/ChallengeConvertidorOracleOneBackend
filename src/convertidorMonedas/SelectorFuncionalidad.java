package convertidorMonedas;

import javax.swing.JOptionPane;

public class SelectorFuncionalidad {

	ConvertidorMoneda moneda = new ConvertidorMoneda();
	ConvertidorAColones colones = new ConvertidorAColones();
	
	public void ConvertirMonedas(double monedasEntrada)
	{
		String opcion = JOptionPane.showInputDialog(null,
				"Elije la moneda a la que deseas convertir",
				"Monedas",
				JOptionPane.PLAIN_MESSAGE,
				null,
				new Object[] {"Colones a Dolares", "Colones a Euros",
						"Colones a Libras Esterlinas",
						"Colones a Won Sur Coreano",
						"Dolares a Colones",
						"Euros a Colones",
						"Libras Esterlinas a Colones",
						"Won Sur Coreano a Colones"}, "Seleccion").toString();

		switch(opcion) 
		{
		case "Colones a Dolares":
				moneda.convertirColonesADolares(monedasEntrada);
				break;
		case "Colones a Euros":
				moneda.convertirColonesAEuros(monedasEntrada);
				break;
		case "Colones a Libras Esterlinas":
				moneda.convertirColonesLibrasEsterlinas(monedasEntrada);
				break;
		case "Colones a Won Sur Coreano":
				moneda.convertirColonesAWonSurCoreano(monedasEntrada);
				break;
		case "Dolares a Colones":
				colones.convertirDolaresAColones(monedasEntrada);
				break;
		case "Euros a Colones":
				colones.convertirEurosAColones(monedasEntrada);
				break;
		case "Libras Esterlinas a Colones":
				colones.convertirLibrasEsterlinasAColones(monedasEntrada);
				break;
		case "Won Sur Coreano a Colones":
				colones.convertirWonesSurCoreanosAColones(monedasEntrada);
				break;
		}
	}
	
	
	
}
