package LatihanHero;

public class App {
    public static void main(String[] Args) {
    Fighter PetarungBeruang = new Fighter("BearMan", "wink");
    Witch PelawanMacan = new Witch("Horangi", "Smirk");

    PetarungBeruang.setDirection("depan");
    PetarungBeruang.move();
    PetarungBeruang.move(PetarungBeruang.getDirection());

    PetarungBeruang.toString();

    PelawanMacan.setStep(3);
    PelawanMacan.move();
    PelawanMacan.move(PelawanMacan.getStep());
    
    PelawanMacan.toString();

    }
    

}
