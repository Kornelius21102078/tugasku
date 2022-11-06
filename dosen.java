package com.mycompany.tugas_opp;

/**
 *
 * @NIM 21102078  NAMA KORNELIUS HIBUR
 */
public class dosen {
    private String IDDOS, NAMA, ALAMAT, MATKUL, HARI;
    
    public void Setiddos(String iddos){
        this.IDDOS = iddos;
    }
    public void Setnama(String nama){
        this.NAMA = nama;
    }
    public void Setalamat(String alamat){
        this.HARI = alamat;
    }
    public void Setmatkul(String matkul){
        this.MATKUL = matkul;
    }
    public void Sethari(String hari){
        this.HARI = hari;
    }
    public String Getiddos(){
        return this.IDDOS;
    }
    public String Getnama(){
        return this.NAMA;
    }
    public String Getalamat(){
        return this.ALAMAT;
    }
    public String Getmatkul(){
        return this.MATKUL;
    }
    public String Gethari(){
        return this.HARI;
    }
}
