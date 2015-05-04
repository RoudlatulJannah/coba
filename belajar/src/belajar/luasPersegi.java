package belajar;

import java.util.Scanner;

public class luasPersegi {

	public static void main(String[] args) {
		int p;
		int l;
		Scanner uud=new Scanner(System.in);
		hitungPersegi roudla=new hitungPersegi();
		System.out.println("Masukkan Panjang : ");
		p=uud.nextInt();
		System.out.println("Masukkan Lebar : ");
		l=uud.nextInt();
		//int luas = p*l;
		System.out.println("hasil = "+roudla.hitung(p, l));
		// TODO Auto-generated method stub
		

		
	}
	
}