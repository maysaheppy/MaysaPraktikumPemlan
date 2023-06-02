import java.util.Scanner;

public class Bab2_MainStudent {
    public static void main(String[] args) {
        System.out.print("Masukkan jumlah Siswa yang ingin dimasukkan : ");
        Scanner Input = new Scanner(System.in);
        int jumlahSiswa = Input.nextInt();
        Bab2_Student siswa[] = new Bab2_Student[jumlahSiswa];

        System.out.println("===================");
        for(int i = 0; i<jumlahSiswa; i++){
            siswa[i] = new Bab2_Student();

            System.out.println("Masukkan data siswa ke " + (i +1));
            System.out.print("Nama : ");
            Input.nextLine();
            String nama = Input.nextLine();
            siswa[i].setName(nama);
            System.out.print("Alamat : ");
            String alamat = Input.nextLine();
            siswa[i].setAddress(alamat);
            System.out.print("Umur : ");
            int umur = Input.nextInt();
            siswa[i].setAge(umur);

            System.out.print("Nilai Matematika : ");
            int math = Input.nextInt();
            siswa[i].setMath(math);
            System.out.print("Nilai Ipa : ");
            int ipa = Input.nextInt();
            siswa[i].setScience(ipa);
            System.out.print("Nilai Bahasa Inggris : ");
            int Eng = Input.nextInt();
            siswa[i].setEnglish(Eng);
            System.out.println("===================");
        }
        Input.close();

        for(int i = 0; i<=jumlahSiswa-1; i++){
            System.out.println("===================");
            siswa[i].displayMessage();

            if(i == jumlahSiswa-1){
                System.out.println("===================");
                siswa[i].jumlahObjek();
            }
        }
        System.out.println("===================");

        // Bab2_Student anna = new Bab2_Student();
        // anna.setName("Anna");
        // anna.setAddress("Malang");
        // anna.setAge(20);
        // anna.setMath(100);
        // anna.setScience(89);
        // anna.setEnglish(80);
        // anna.displayMessage();
        // anna.jumlahObjek();
        
        // //menggunakan constructor lain
        // System.out.println("===================");
        // Bab2_Student chris = new Bab2_Student("Chris", "Kediri", 21);
        // chris.setMath(70);
        // chris.setScience(60);
        // chris.setEnglish(90);
        // chris.displayMessage();

        // //siswa dengan nama anna dirubah informasi alamat dan umurnya melalui constructor
        // // System.out.println("===================");
        // // anna = new Bab2_Student("anna", "Batu", 18);
        // // anna.displayMessage();

        // //siswa denagan nama chris dirubah informasi alamat dan umurnya melalui method
        // System.out.println("===================");
        // chris.setAddress("Surabaya");
        // chris.setAge(22);
        // chris.displayMessage();
        // chris.jumlahObjek();

        // //menampilkan objek baru sesuai soal nomor 2
        // System.out.println("===================");
        // Bab2_Student Sastra = new Bab2_Student(80, 95, 88);
        // Sastra.setName("Sastra");
        // Sastra.setAddress("Surakarta");
        // Sastra.setAge(20);
        // Sastra.displayMessage();
        // Sastra.jumlahObjek();
    }
}
