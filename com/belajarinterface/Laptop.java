// Nama  : Yasir Mubarok
// Kelas    : TI21E
// Nim      : 20210040069
package sesi6.com.belajarinterface;

public interface Laptop {
     int MAX_VOL = 100;
    int MIN_VOL = 0;
    
    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
}