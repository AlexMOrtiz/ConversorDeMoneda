package conversorMoneda;

import javax.swing.JOptionPane;

public class ConvertirMoneda {
	
	public void ConvertirPesosADolares(double valor) {
		double monedaDolar = valor / 16.83;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Dolares");
	}
	
	public void ConvertirPesosAEuros(double valor) {
		double monedaEuro = valor / 18.61;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Euros");
	}
	
	public void ConvertirPesosALibras(double valor) {
		double monedaLibra = valor / 21.57;
		monedaLibra = (double) Math.round(monedaLibra *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Libras Esterlinas");
	}
	
	public void ConvertirPesosAYen(double valor) {
		double monedaYen = valor / 0.1189;
		monedaYen = (double) Math.round(monedaYen *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Yenes");
	}
	
	public void ConvertirPesosAWuones(double valor) {
		double monedaWon = valor / 0.0131;
		monedaWon = (double) Math.round(monedaWon * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Wones");
	}
	
	public void ConvertirPesosAYuanes(double valor) {
		double monedaYuan = valor / 2.3423;
		monedaYuan = (double) Math.round(monedaYuan * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYuan+ " Yuanes Sur-Coreanos");
	}
	
	public void ConvertirPMexicanoAPColombiano(double valor) {
		double monedaColombia = valor / 0.0042;
		monedaColombia = (double) Math.round(monedaColombia *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaColombia+ " Pesos Colombianos");
	}

}
