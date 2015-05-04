package contoh;

import java.util.Scanner;

public class adminbuku {
	

	    buku novel = new buku();
	    buku komik = new buku();
	    buku majalah = new buku();
	    buku filsafat = new buku();
	    buku pelajaran = new buku();
	    
	    String data;
	    
	    public void insertDataBuku(){
	        
	        
	        Scanner input = new Scanner(System.in);
	        System.out.println("Masukkan jenis buku :");
	        data = input.nextLine();
	        
	        switch (data) {
	            case "novel":
	                System.out.println("Masukkan judul buku : ");
	                novel.setJudul(input.nextLine());
	                System.out.println("Masukkan penulis buku : ");
	                novel.setPenulis(input.nextLine());
	                System.out.println("Masukkan jumlah halaman buku : ");
	                novel.setJumlah(input.nextInt());
	                break;
	            case "komik":
	                System.out.println("Masukkan judul buku : ");
	                komik.setJudul(input.nextLine());
	                System.out.println("Masukkan penulis buku : ");
	                komik.setPenulis(input.nextLine());
	                System.out.println("Masukkan jumlah halaman buku : ");
	                komik.setJumlah(input.nextInt());
	                break;
	            case "majalah":
	                System.out.println("Masukkan judul buku : ");
	                majalah.setJudul(input.nextLine());
	                System.out.println("Masukkan penulis buku : ");
	                majalah.setPenulis(input.nextLine());
	                System.out.println("Masukkan jumlah halaman buku : ");
	                majalah.setJumlah(input.nextInt());
	                break;
	            case "filsafat":
	                System.out.println("Masukkan judul buku : ");
	                filsafat.setJudul(input.nextLine());
	                System.out.println("Masukkan penulis buku : ");
	                filsafat.setPenulis(input.nextLine());
	                System.out.println("Masukkan jumlah halaman buku : ");
	                filsafat.setJumlah(input.nextInt());
	                break;
	            case "pelajaran":
	                System.out.println("Masukkan judul buku : ");
	                pelajaran.setJudul(input.nextLine());
	                System.out.println("Masukkan penulis buku : ");
	                pelajaran.setPenulis(input.nextLine());
	                System.out.println("Masukkan jumlah halaman buku : ");
	                pelajaran.setJumlah(input.nextInt());
	                break;
	            default:
	                System.out.println("pilihan anda salah");
	                break;
	        }
	        
	    }
	    public void cetakDataBuku() {
	        switch (data) {
	            case "novel":
	                System.out.println("judul buku : " + novel.getJudul());
	                System.out.println("penulis buku : " + novel.getPenulis());
	                System.out.println("jumlah halaman buku : " + novel.getJumlah());
	                break;
	            case "komik":
	                System.out.println("judul buku : " + komik.getJudul());
	                System.out.println("penulis buku : " + komik.getPenulis());
	                System.out.println("jumlah halaman buku : " + komik.getJumlah());
	                break;
	            case "majalah":
	                System.out.println("judul buku : "+majalah.getJudul());
	                System.out.println("penulis buku : "+majalah.getPenulis());
	                System.out.println("jumlah halaman buku : "+majalah.getJumlah());
	                break;
	            case "filsafat":
	                System.out.println("judul buku : "+filsafat.getJudul());
	                System.out.println("penulis buku : "+filsafat.getPenulis());
	                System.out.println("jumlah halaman buku : "+filsafat.getJumlah());
	                break;
	            case "pelajaran":
	                System.out.println("judul buku : "+pelajaran.getJudul());
	                System.out.println("penulis buku : "+pelajaran.getPenulis());
	                System.out.println("jumlah halaman buku : "+pelajaran.getJumlah());
	                break;
	        }


	        
	    }
	    
	        
	    



}
