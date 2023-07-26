package conversorMoneda;

import javax.swing.JOptionPane;

public class ConvertirMonedasAPesos {
	
	public void ConvertirDolaresAPesos(double valor) {
		double monedaDolar = valor * 16.83;
		monedaDolar = (double) Math.round(monedaDolar * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" +monedaDolar+ " Pesos Mexicanos");
	}
	
	public void ConvertirEruosAPesos(double valor) {
		double monedaEuro = valor * 18.61;
		monedaEuro = (double) Math.round(monedaEuro * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Pesos Mexicanos");
	}
	
	public void ConvertirLibrasAPesos(double valor) {
		double monedaLibra = valor * 21.57;
		monedaLibra = (double) Math.round(monedaLibra * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Pesos Mexicanos");
	}
	
	public void ConvertirYenAPesos(double valor) {
		double monedaYen = valor * 0.1189;
		monedaYen = (double) Math.round(monedaYen * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Pesos Mexicanos");
	}
	
	public void ConvertirWonAPesos(double valor) {
		double monedaWon = valor * 0.0131;
		monedaWon = (double) Math.round(monedaWon * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Pesos Mexicanos");
	}
	
	public void ConvertirYuanAPesos(double valor) {
		double monedaYuan = valor * 2.3423;
		monedaYuan = (double) Math.round(monedaYuan * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYuan+ " Pesos Mexicanos");
	}
	
	public void ConvertirPColmbianoAPMexicano(double valor) {
		double monedaColombia = valor * 0.0042;
		monedaColombia = (double) Math.round(monedaColombia * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaColombia+ " Pesos Mexicanos");
	}

}
