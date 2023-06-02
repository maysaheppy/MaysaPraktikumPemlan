
import java.util.*;

class Buah {
    String nama;
    int stok;
    public Buah(String nama, int stok){
        
    }
}

class Manusia {
    String nama;
    int jumlahBeli;
    public Manusia(String nama, int jumlahBeli){
        
    }
}


public class Hackkerrank {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        String nama = Input.nextLine();
        int stok = Input.nextInt();
        int jumlahBeli = Input.nextInt();
        
        Buah beli = new Buah (nama, stok);
        
        int sisa = stok - jumlahBeli;
        
        if(stok <= 0 || jumlahBeli <=0 ){
            System.out.println("NA");
        }else{
            if(sisa>=0){
                System.out.println("Berhasil checkout buah");
                System.out.println("Sisa buah = " + sisa);
            }else{
                System.out.println("Gagal checkout buah");
            }
        }
    }
}