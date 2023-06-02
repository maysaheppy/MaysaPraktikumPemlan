public class Bab2_Rasional {
    private int pembilang, penyebut, x, y;

    public Bab2_Rasional(){
        pembilang=0;
        penyebut=0;
        x = pembilang;
        y = penyebut;
    }

    public Bab2_Rasional(int pbl, int pyb){
        pembilang=pbl;
        penyebut=pyb;
        x = pembilang;
        y = penyebut;
    }

    //mengecek suatu bilangan adalah rasional atau bukan
    public boolean isRasional(){
        return (penyebut!= 0);
    }

    //menyederhanakan bilangan rasional
    public void Sederhana(){
        int temp, A, B;
        if (penyebut ==0){
        return;
         }
        A = (pembilang<penyebut) ? penyebut:pembilang;
        B = (pembilang<penyebut) ? pembilang:penyebut;

        int j;
        for(j = 1; j<=B ; j++){
            temp = A%B;
            if(temp == 0){
                pembilang = pembilang/j;
                penyebut = penyebut/j;
            }
        }
    }

    public double Cast(){
        return (penyebut==0.0) ? 0.0 : (double)pembilang /
        (double)penyebut;
    }

    //oprator >
    public boolean moreThan (Bab2_Rasional A){
        return (pembilang * A.penyebut > penyebut * A.pembilang);
    }

    //operator <
    public boolean lessThan(Bab2_Rasional A){
        return (pembilang * A.penyebut < penyebut * A.pembilang);
    }

    //operator <=
    public boolean leesThanEqualTo(Bab2_Rasional A){
        return(pembilang * penyebut <= penyebut * A.pembilang);
    }

    //operator >=
    public boolean moreThanEqualTo(Bab2_Rasional A){
        return(pembilang * penyebut >= penyebut * A.pembilang);
    }

    //operator Unary- ---> A = -A
    public void negasi(){
        pembilang = x;
        penyebut = y;
        pembilang = - pembilang;
    }

    //operator unary += \
    public void unaryPlus(Bab2_Rasional A){
        pembilang = x;
        penyebut = y;
        pembilang = pembilang * A.penyebut + penyebut *
        A.pembilang;
        penyebut *=A.penyebut;
    }

    //operator unary -=
    public void unaryMinus(Bab2_Rasional A){
        pembilang = x;
        penyebut = y;
        pembilang = pembilang * A.penyebut - penyebut * A.pembilang;
        penyebut *=A.penyebut;
    }

    //operator unary * =
    public void unaryKali(Bab2_Rasional A){
        pembilang = x;
        penyebut = y;
        pembilang = pembilang * A.pembilang;
        penyebut *=A.penyebut;
    }

    //operator unary / =
    public void unaryBagi(Bab2_Rasional A){
        pembilang = x;
        penyebut = y;
        pembilang = (pembilang * A.penyebut);
        penyebut *=A.pembilang;
    }

    public void cetak(){
        System.out.println(pembilang + "/" + penyebut);
    }
}
