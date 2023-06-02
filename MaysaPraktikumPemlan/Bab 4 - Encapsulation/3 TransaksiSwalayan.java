public class TransaksiSwalayan {
    private double saldo;
    private double pembelian;
    private double cashback;
    private String nomorPelanggan;
    private String nama;
    private String pin;
    private int valid;
    private boolean autentifikasi = false;

    public TransaksiSwalayan(){

    }

    public void setName(String s){
        this.nama = s;
    }

    public void setPin(String s){
        this.pin = s;
    }
    
    public void setSaldo(double d){
        this.saldo = d;
    }

    public void setnomorPelanggan(String s){
        this.nomorPelanggan = s;
    }

    public void informasiAkun(){
        System.out.println("Nama: " + nama);
        System.out.println("Nomor Pelanggan: " + nomorPelanggan);
    }

    public void setPembelian(double d){
        if(valid == 3){
            System.out.println("Maaf, akun Anda telah diblokir. Silahkan menghubungi customer service untuk membuat akun baru.");
        }else if(autentifikasi == false){

        }else {
            this.pembelian = d;
            hitungPembelian(this.pembelian);
        }
    }

    public void autentifikasi(String newNomorPelanggan, String newPin){
            if(valid==3){
                System.out.println("Anda sudah melampaui batas autentifikasi. Selanjutnya, akun akan diblokir.");
                setnomorPelanggan(null);
                setPin(null);
            }else{
                if(newNomorPelanggan.equals(nomorPelanggan)){
                    if(newPin.equals(pin)){
                        System.out.println("Autentifikasi berhasil. Silahkan melanjutkan transaksi.");
                        autentifikasi = true;
                    }else{
                        System.out.println("Maaf, password yang Anda masukkan tidak sesuai, silahkan masukkan ulang password.");
                    }
                }else{
                    System.out.println("Maaf, nama yang Anda masukkan tidak terdeteksi.");
                }

                valid++;
            }
        }

    public void topUp(double d){
        if(valid == 3){
            System.out.println("Maaf, akun Anda telah diblokir. Silahkan menghubungi customer service untuk membuat akun baru.");
        }else if(autentifikasi == false){

        }else {
            saldo = saldo + d;
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("Top up berhasil. Saldo Anda: " + saldo);
            System.out.println("-------------------------------------------------------------------------");
        }
    }

    private double hitungCashback(double d){
        pembelian = d;
            String jenis = nomorPelanggan.substring(0,2);
            pembelian = d;
            
            switch(jenis){
                case "38":
                cashback = pembelian * 0.05;
                saldo = saldo + cashback;
                System.out.println("Transaksi berhasil.");
                System.out.println("Cashback yang Anda dapatkan: " + cashback);
                System.out.println("Saldo Anda sekarang: " + saldo);
                break;

                case "56":
                if(pembelian  >1000000){
                    cashback = pembelian * 0.07;
                    saldo = saldo + cashback;
                    System.out.println("Transaksi berhasil.");
                    System.out.println("Cashback yang Anda dapatkan: " + cashback);
                    System.out.println("Saldo Anda sekarang: " + saldo);
                }else{
                    cashback = pembelian * 0.02;
                    saldo = saldo + cashback;
                    System.out.println("Transaksi berhasil.");
                    System.out.println("Cashback yang Anda dapatkan: " + cashback);
                    System.out.println("Saldo Anda sekarang: " + saldo);
                }
                break;

                case "74":
                if(pembelian  >1000000){
                    cashback = pembelian * 0.10;
                    saldo = saldo + cashback;
                    System.out.println("Transaksi berhasil.");
                    System.out.println("Cashback yang Anda dapatkan: " + cashback);
                    System.out.println("Saldo Anda sekarang: " + saldo);
                }else{
                    cashback = pembelian * 0.05;
                    saldo = saldo + cashback;
                    System.out.println("Transaksi berhasil.");
                    System.out.println("Cashback yang Anda dapatkan: " + cashback);
                    System.out.println("Saldo Anda sekarang: " + saldo);
                }
                break;
            }
        return cashback;
    }

    private void hitungPembelian(double pembelian){
            double sisa = saldo - pembelian;
            if(sisa<10000){
                System.out.println("Maaf, batas minimal saldo terlampaui.");
                System.out.println("Saldo Anda setelah transaksi: " + sisa);
                System.out.println("Isi saldo untuk melanjutkan transaksi.");
            } else{
                saldo = sisa;
                hitungCashback(this.pembelian);
            }
    }
}
