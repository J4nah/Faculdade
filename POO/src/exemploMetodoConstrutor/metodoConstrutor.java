package exemploMetodoConstrutor;

import javax.swing.JOptionPane;

public class metodoConstrutor {

	public static void main(String[] args) {
	    Pessoa pessoa1 = new Pessoa("123456789", "Janaina");
	        
	        pessoa1.setCnh("987654321");
	        
	        JOptionPane.showMessageDialog(null, pessoa1.imprimir());
	    }
	    
	}
	

