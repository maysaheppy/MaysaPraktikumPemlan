public class TransaksiMain {
    public static void main(String[] Args){
        System.out.println("=========================================================================");
        TransaksiSwalayan t1 = new TransaksiSwalayan();
        System.out.println("                              PELANGGAN T1");
        System.out.println("=========================================================================");
        t1.setName("Maysa");
        t1.setnomorPelanggan("5601010101");
        t1.setPin("MT_1234");
        t1.autentifikasi("5601010101", "MT_1234");
        t1.topUp(200000);
        t1.setPembelian(163000);
        System.out.println("=========================================================================");

        //t2 adalah contoh kasus dimana pelanggan salah memasukkan pasword sebanyak tiga kali
        //permintaan tidak akan diproses sebab akun telah dihapus
        TransaksiSwalayan t2 = new TransaksiSwalayan();
        System.out.println("                              PELANGGAN T2");
        System.out.println("=========================================================================");
        t2.setName("Sastra");
        t2.setnomorPelanggan("2830303030");
        t2.setPin("S4str4");
        t2.autentifikasi("2830303030", "pwsalah");
        t2.autentifikasi("2830303030", "pwsalah");
        t2.autentifikasi("2830303030", "pwsalah");
        t2.setPembelian(200000);
        System.out.println("=========================================================================");

        //t3 adalah contoh kasus dimana saldo minimal tidak terpenuhi, sehingga pelanggan tidak bisa melanjutkan transaksi
        TransaksiSwalayan t3 = new TransaksiSwalayan();
        System.out.println("                              PELANGGAN T3");
        System.out.println("=========================================================================");
        t3.setName("Sabda");
        t3.setnomorPelanggan("7412345678");
        t3.setPin("BundaBersabda");
        t3.autentifikasi("7412345678","BundaBersabda");
        t3.topUp(200000);
        t3.setPembelian(199000);
        t3.topUp(20000);
        t3.setPembelian(199000);
        System.out.println("=========================================================================");

        //t4 adalah contoh kasus dimana autentifikasi tidak berhasil, namun pelanggan tetap ingin melanjutkan
        //maka transaksi tidak akan diproses
        TransaksiSwalayan t4 = new TransaksiSwalayan();
        System.out.println("                              PELANGGAN T4");
        System.out.println("=========================================================================");
        t4.setName("Haekal");
        t4.setnomorPelanggan("7487654321");
        t4.setPin("HAhaEkalKAL");
        t4.autentifikasi("7487654321", "Iyadeh salah");
        t4.setPembelian(40000);
        t4.setPembelian(40000);
        t4.setPembelian(40000);
        t4.setPembelian(40000);
        System.out.println("=========================================================================");

        TransaksiSwalayan t5 = new TransaksiSwalayan();
        System.out.println("                              PELANGGAN T5");
        System.out.println("=========================================================================");
        t5.setName("Haidar");
        t5.setnomorPelanggan("3812345678");
        t5.setPin("pasword");
        t5.autentifikasi("3812345678", "pasword");
        t5.topUp(2000000);
        t5.setPembelian(1500000);
        System.out.println("=========================================================================");

    }
}
