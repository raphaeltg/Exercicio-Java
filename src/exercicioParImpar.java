import javax.swing.JOptionPane;

public class exercicioParImpar {

	public static void main(String[] args) {
		
		int num;
		int resto;
		
		num = Integer.valueOf(JOptionPane.showInputDialog("Digite um numero:"));
		
		resto = num % 2;
		
		JOptionPane.showMessageDialog(null,(resto == 0)? "Par":"Impar");
		
		
		
		
		
//		
//		
//		if (num % 2 == 0) {
//			JOptionPane.showMessageDialog(null, "Esse numero e par");
//		} 
//		else {
//			JOptionPane.showMessageDialog(null, "Esse numero e impar");
//		}
//		

	}
	
}
