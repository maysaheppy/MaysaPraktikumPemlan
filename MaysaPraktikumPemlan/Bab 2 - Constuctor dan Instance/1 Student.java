public class Bab2_Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private boolean lulus;
    private static int JumlahObjek = 0;

    public Bab2_Student(){
        name = "";
        address = "";
        age = 0;
        JumlahObjek++;
    }

    public Bab2_Student(String n, String a, int ag){
        name = n;
        address = a;
        age = ag;
        JumlahObjek++;
    }

    public Bab2_Student(double mGrade, double eGrade, double sGrade){
        mathGrade = mGrade;
        englishGrade = eGrade;
        scienceGrade = sGrade;
        JumlahObjek++;
    }

    public void setName(String n){
        name = n;
    }

    public void setAddress(String a){
        address = a;
    }

    public void setAge(int ag){
        age = ag;
    }

    public void setMath(int math){
        mathGrade = math;
    }

    public void setEnglish(int english){
        englishGrade = english;
    }

    public void setScience(int science){
        scienceGrade = science;
    }

    private double getAverage(){
        average = (mathGrade+scienceGrade+englishGrade)/3;
        return average;
    }

    private boolean statusAkhir(){
        lulus = false;
        getAverage();
        if(average>=60){
            lulus = true;
        }
        return lulus;
    }


    public void jumlahObjek(){
        System.out.println("Jumlah data yang tersimpan adalah " + JumlahObjek);
    }

    public void displayMessage(){
        System.out.println("Siswa dengan nama "+name);
        System.out.println("beramalat di "+address);
        System.out.println("berumur "+age);
        System.out.println("Nilai Matematika = " + mathGrade);
        System.out.println("Nilai Ipa = " + scienceGrade);
        System.out.println("Nilai Bahasa Inggris = " + englishGrade);
        System.out.println("mempunyai nilai rata rata "+getAverage());
        statusAkhir();
        if(lulus == true){
            System.out.println("Status Akhir = Lulus ");
        }else{
            System.out.println("Status Akhir = Remidi");
        }
    }
}
