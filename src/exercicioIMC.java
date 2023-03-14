import javax.swing.JOptionPane;

public class exercicioIMC {

	public static void main(String[] args) {
		float massa;
		float altura;
		float imc;
		
		
		massa = Float.valueOf(JOptionPane.showInputDialog("Digite sua massa:"));
		altura = Float.valueOf(JOptionPane.showInputDialog("Digite sua altura:"));
		
		imc = (massa)/(altura * altura);
		
		
		JOptionPane.showMessageDialog(null, "Seu IMC é: " + imc);
		
		
		
		
	}

}
