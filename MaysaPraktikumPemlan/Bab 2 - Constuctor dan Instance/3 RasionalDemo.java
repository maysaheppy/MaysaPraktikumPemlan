public class Bab2_RasionalDemo {
    public static void main(String[] args){
        Bab2_Rasional R1 = new Bab2_Rasional(1, 2);
        Bab2_Rasional R2 = new Bab2_Rasional(1,3);
        
        System.out.println("R1.isRasional: " + R1.isRasional());
        System.out.println("R2.isRasional: " + R1.isRasional());
        System.out.println();
        
        System.out.println("R1 > R2 : " + R1.moreThan(R2));
        System.out.println("R1 < R2 : " + R1.lessThan(R2));
        System.out.println("R1 >= R2 : " + R1.moreThanEqualTo(R2));
        System.out.println("R1 <= R2 : " + R1.leesThanEqualTo(R2));
        System.out.println();
        
        System.out.print("R1 : ");
        R1.cetak();
        System.out.print("R2 : ");
        R2.cetak();
        System.out.println();
        
        R1.Sederhana();
        R2.Sederhana();
        
        System.out.print("R1 : ");
        R1.cetak();
        System.out.print("R2 : ");
        R2.cetak();
        System.out.println();
        
        System.out.println("Setelah dilakukan Cast ke double menjadi : " );
        System.out.println("R1 : " + R1.Cast());
        System.out.println("R2 : " + R2.Cast());
        System.out.println();

        R1.negasi();
        System.out.print("Unary- dari R1 : ");
        R1.cetak();
        System.out.println();

        R1.unaryPlus(R2);
        System.out.print("Nilai dari 'R1 += R2' : ");
        R1.cetak();
        System.out.println();

        R1.unaryMinus(R2);
        System.out.print("Nilai dari 'R1 -= R2' : ");
        R1.cetak();
        System.out.println();

        R1.unaryKali(R2);
        System.out.print("Nilai dari 'R1 *= R2' : ");
        R1.cetak();
        System.out.println();

        R1.unaryBagi(R2);
        System.out.print("Nilai dari 'R1 /= R2' : ");
        R1.cetak();
        System.out.println();
    }
}
