package contoh;

import java.util.Scanner;

public class bukutest {
	 public static void main(String[] args) {
	        int banyak;
	        Scanner input2 = new Scanner(System.in);
	        System.out.println("masukan banyak data ??");
	        banyak=input2.nextInt();
	        adminbuku [] buk = new adminbuku[banyak];
	        for (int i=0; i<buk.length ; i++){
	        buk[i] = new adminbuku();
	        buk[i].insertDataBuku();
	        buk[i].cetakDataBuku();
	    }
	}

}
