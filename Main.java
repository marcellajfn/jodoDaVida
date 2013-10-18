import javax.swing.JOptionPane;


public class Main {
	
	
	public void main(String[] args){
		int MAX = 3;
		Life jogoDaVida=new Life();
		int i,j;
		
		for (i =1; i< MAX; i++)
			for (j =1; j< MAX-1; j++)
				jogoDaVida.matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("0 = Morta, 1 = Viva"));
		
		jogoDaVida.simulaVida(5);
	}
}
