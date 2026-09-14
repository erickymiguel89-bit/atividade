package project02;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
	String Numerosparaexibiremlinha="";
	String Numerosparaexibiremlinhaporlinha="";
	int numeros [] = new int [10];
	for (int contador=0; contador < 10; contador ++)
	{
 numeros [contador] = Integer.parseInt (JOptionPane.showInputDialog("informe 10:"));
 
 Numerosparaexibiremlinha = Numerosparaexibiremlinha +" "+ numeros [contador];     
 Numerosparaexibiremlinhaporlinha =  Numerosparaexibiremlinhaporlinha + "\n" + numeros  [contador];     
	
	}
	JOptionPane.showMessageDialog(null, "os numeros informados foram:" +  Numerosparaexibiremlinha);
	JOptionPane.showMessageDialog(null, "os numeros informado linha por linha:" + Numerosparaexibiremlinhaporlinha );
 }
}