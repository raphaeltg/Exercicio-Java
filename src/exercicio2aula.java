import javax.swing.JOptionPane;

public class exercicio2aula {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		double media;
		
		num1 = Integer.valueOf(JOptionPane.showInputDialog("Digite o primeiro numero:"));
		num2 = Integer.valueOf(JOptionPane.showInputDialog("Digite o segundo numero:"));
	    
	    media = (num1+num2)/2.0;
		
		JOptionPane.showMessageDialog(null, "A media dos dois numero é " + media);


	}

}
