// Nama  : Yasir Mubarok
// Kelas    : TI21E
// Nim      : 20210040069
package sesi6.com.belajarabstrak;

public class Lingkaran extends BangunDatar {
    float jari_jari;
    
    public Lingkaran(float jari_jari){
        this.jari_jari = jari_jari;
    }

    @Override
    float getLuas() {
        return (float) Math.PI * jari_jari * jari_jari;
    }
    
}