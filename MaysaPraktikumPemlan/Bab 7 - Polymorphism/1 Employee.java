package Praktikum7;

import java.time.*;
public abstract class Employee {
    private String name;
    private String noKTP;
    private LocalDate Birth;
    private LocalDate today = LocalDate.now();

    public Employee(String name, String noKTP, int tahun, int bulan, int tanggal){
        this.name = name;
        this.noKTP = noKTP;
        Birth = LocalDate.of(tahun, bulan, tanggal);
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setNoKTP(String noKTP) {
        this.noKTP = noKTP;
    }
    public void setBirth(LocalDate birth) {
        Birth = birth;
    }

    public LocalDate getBirth() {
        return Birth;
    }
    public String getName(){
        return name;
    }
    public String getNoKTP(){
        return noKTP;
    }

    public double birthBonus(){
        return 100.00;
    }
    public String toString(){
        if(Birth.getMonth() == today.getMonth()){
            return String.format(" "+getName()+"\nNo. KTP: "+getNoKTP()+ "\nTanggal Lahir: " + getBirth() + "\nBirth Bonus: $" + birthBonus());
        } else {
            return String.format(" "+getName()+"\nNo. KTP: "+getNoKTP()+ "\nTanggal Lahir: " + getBirth());
        }
    }
    public double earnings(){
        if(Birth.getMonth() == today.getMonth()){
            return birthBonus();
        } else {
            return 0;
        }

    }//pendapatan
}