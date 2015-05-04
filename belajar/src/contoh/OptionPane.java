package contoh;

import javax.swing.JOptionPane;

public class OptionPane {
	public static void main(String args[ ]){
	       //string pertama
	       String nama="";
	       nama=JOptionPane.showInputDialog("Masukkan Nama Anda :");
	       //string kdedua
	       String agama="";
	       agama=JOptionPane.showInputDialog("Masukkan Agama Anda :");
	       //string ketiga
	       String jk="";
	       jk=JOptionPane.showInputDialog("Masukkan Jenis Kelamin Anda :");
	       //hasil outputnya
	       JOptionPane.showMessageDialog(null,"Nama Anda "+nama+"\nAgama Anda "+agama+"\nJenis                  Kelamin Anda "+jk);
	   }

}
