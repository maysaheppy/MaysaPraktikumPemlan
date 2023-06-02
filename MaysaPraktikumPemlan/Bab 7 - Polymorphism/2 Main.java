package Praktikum7.TugasPRaktikum;

public class Main {
    public static void main(String[] Args) {
        Kue[] kue = new Kue[20];
        kue[0] = new KueJadi("Apem", 2500, 5);
        kue[1] = new KueJadi("Bika Ambon", 60000, 2);
        kue[2] = new KuePesanan("Bikang", 100, 300);
        kue[3] = new KueJadi("Bingka", 30000, 4);
        kue[4] = new KuePesanan("Bolu Kukus", 200, 500);
        kue[5] = new KuePesanan("Cucur", 100, 200);
        kue[6] = new KueJadi("kue Cubit", 2500, 5);
        kue[7] = new KuePesanan("Dadar Gulung", 100, 400);
        kue[8] = new KuePesanan("Gemblong", 200, 300);
        kue[9] = new KueJadi("Klapertast", 95000, 1);
        kue[10] = new KueJadi("Kueku", 3000, 8);
        kue[11] = new KuePesanan("Kue Lapis", 250, 500);
        kue[12] = new KueJadi("Kue Lumpur", 2500, 12);
        kue[13] = new KueJadi("Kue Lumpur", 2500, 15);
        kue[14] = new KueJadi("Onde-onde", 1000, 25);
        kue[15] = new KuePesanan("Panada", 100, 250);
        kue[16] = new KuePesanan("Pukis", 150, 400);
        kue[17] = new KueJadi("Kue Pancong", 2500, 10);
        kue[18] = new KueJadi("Putu", 10000, 5);
        kue[19] = new KuePesanan ("Serabi", 200, 500);

        double totalHargaPesanan = 0;
        double totalHargaJadi = 0;
        double totalBerat = 0;
        double jumlahKue = 0;
        double i = 0;
        Kue []kueHargaTerbesar = new Kue[1];
        for(Kue tiapKue : kue) {
            System.out.println(tiapKue.toString());
            
           if(tiapKue instanceof KueJadi) {
            KueJadi kuejadi = (KueJadi) tiapKue;
            jumlahKue = jumlahKue + kuejadi.getJumlahKue();
            totalHargaJadi = totalHargaJadi + kuejadi.getHarga();

            if(tiapKue.getHarga()>i) {
                kueHargaTerbesar[0] = tiapKue;
               }

           } else if(tiapKue instanceof KuePesanan) {
            KuePesanan kuepesanan = (KuePesanan) tiapKue;
            totalBerat = totalBerat + kuepesanan.getBeratKue();
            totalHargaPesanan = totalHargaPesanan + kuepesanan.getHarga();

            if(tiapKue.getHarga()>i) {
                kueHargaTerbesar[0] = tiapKue;
               }
           }
        }

        System.out.println("Total harga semua kue: " + (totalHargaPesanan + totalHargaJadi));
        System.out.println("Total harga Kue Pesanan: " + totalHargaPesanan);
        System.out.println("Total berat Kue Pesanan: " + totalBerat + " gram");
        System.out.println("Total harga Kue Jadi: " + totalHargaJadi);
        System.out.println("Jumlah Kue Pesanan: " + jumlahKue);
        System.out.println("\nKue dengan harga akhir terbesar: \n" + kueHargaTerbesar[0].toString());
    }
}
