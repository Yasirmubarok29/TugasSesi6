// Nama  : Yasir Mubarok
// Kelas    : TI21E
// Nim      : 20210040069
package sesi6.com.belajarabstrak;

public abstract class BangunDatar {
    String warna;
    
    String getWarna(){
        return warna;
    }
    void setWarna(){
        this.warna = warna;
    }
    abstract float getLuas();
    
}