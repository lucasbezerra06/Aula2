import javax.swing.JOptionPane;

/**
 * 
 * 	@author Lucas Bezerra
 *	@version 14/08/2017
 */
public class Principal {
	public static void main(String args[]){
		Lista L1 = new Lista(4);
		int op,n,p;
		
		do{
			op = Integer.parseInt(JOptionPane.showInputDialog("Menu\n\n1 - Adciona Inicio\n2 - Adiciona Final\n3 - Adiciona em posi��o expecifica\n4 - Remove Inicio\n5 - Remove Final\n6 - Remove da Posi��o expecifica\n7 - Mostra o primeiro elemento\n8 - Mostrar o ultimo elemento\n9 - Mostrar todos os elementos\n10 - Sair"));
			switch(op){
				case 1 :
					n = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor a lista: "));
					L1.adicionaInicio(n);
				break;
				case 2:
					n = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor a lista: "));
					L1.adicionaFinal(n);
					break;
				case 3:
					n = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor a lista: "));
					p = Integer.parseInt(JOptionPane.showInputDialog("Insira a posição na qual o valor sera inserida: "));
					L1.adiciona(n, p);
					break;
				case 4:
					System.out.println("número removido = "+L1.removeInicio());
					break;
				
				case 9: JOptionPane.showMessageDialog(null, L1.toString());
				break;
			}
		}while(op!=10);
		
		
	
	}

}
