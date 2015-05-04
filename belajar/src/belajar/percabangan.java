package belajar;

public class percabangan {
static int x=1;
public static void main(String[]yesung){
	if(x==1){
		System.out.println("nilai X=1");
	}
	else{
		System.out.println("nilai x bukan = 1");
	}
	//contoh string
	//"equals" tidak bisa membaca adanya huruf besar
	String nama="Yesung";
	if(nama.equalsIgnoreCase("yesung")){//untuk membaca adanya huruf besar
		System.out.println("nama="+nama);
	}else{
		System.out.println("nama=bukan yesung");
	}
}
}
