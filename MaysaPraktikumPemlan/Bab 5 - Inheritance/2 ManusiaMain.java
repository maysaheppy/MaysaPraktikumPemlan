public class ManusiaMain {
    public static void main(String[] Args){
        //MANUSIA
        System.out.println("===========================================================================");
        System.out.println("                                 MANUSIA");
        System.out.println("===========================================================================");
        Manusia M1 = new Manusia("Ros", true, "6474", true, 25);
        System.out.println(M1.toString());

        System.out.println("===========================================================================");
        Manusia M2 = new Manusia("Rania", false, "6474", true, 20);
        System.out.println(M2.toString());

        System.out.println("===========================================================================");
        Manusia M3 = new Manusia("Jovan", true, "6474", false, 15);
        System.out.println(M3.toString());

        System.out.println("===========================================================================");
        Manusia M4 = new Manusia("Sahara", false, "6474", false, 15);
        System.out.println(M4.toString());

        //MAHASISWAFILKOM
        System.out.println("===========================================================================");
        System.out.println("                             MAHASISWAFILKOM");
        System.out.println("===========================================================================");
        MahasiswaFILKOM Filkom1 = new MahasiswaFILKOM("Maysa Heppy Nur Kayaningsih", false, "6474", false, 0, "225150400111009", 2.9);
        System.out.println(Filkom1.toString());

        System.out.println("===========================================================================");
        MahasiswaFILKOM Filkom2 = new MahasiswaFILKOM("Maysa Heppy Nur Kayaningsih", false, "6474", false, 0, "225150400111009", 3.4);
        System.out.println(Filkom2.toString());

        System.out.println("===========================================================================");
        MahasiswaFILKOM Filkom3 = new MahasiswaFILKOM("Maysa Heppy Nur Kayaningsih", false, "6474", false, 0, "225150400111009", 3.9);
        System.out.println(Filkom3.toString());

        System.out.println("===========================================================================");
        System.out.println("                                PEKERJA");
        System.out.println("===========================================================================");
        Pekerja P1 = new Pekerja("Pramoedya", true, "6474", true, 0, 30, 2, 2021, 1, 5);
        System.out.println(P1.toString());

        System.out.println("===========================================================================");
        Pekerja P2 = new Pekerja("Milan", false, "6474", false, 0, 50, 0, 2014, 1, 5);
        System.out.println(P2.toString());

        System.out.println("===========================================================================");
        Pekerja P3 = new Pekerja("Tama", true, "6474", true, 0, 20, 10, 2003, 1, 5);
        System.out.println(P3.toString());

        System.out.println("===========================================================================");
        System.out.println("                                 Manager");
        System.out.println("===========================================================================");
        Manager MN1 = new Manager("Hilmy", true, "6474", false, 0, 7500, 0, 2008, 1, 5, "HRD");
        System.out.println(MN1.toString());
    }
}
