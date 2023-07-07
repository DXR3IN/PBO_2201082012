/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irfan.model;

import java.text.*;
import java.util.*;

/**
 *
 * @author mhdir
 */
public class Pinjam  {
    private String tglPinjam;
    private String tglKembali;
    private String kodeBuku;
    private String kodeAnggota;

    public Pinjam(String kodeBuku, String kodeAnggota, String tglKembali, String tglPinjam) {
        this.kodeBuku = kodeBuku;
        this.kodeAnggota = kodeAnggota;
        this.tglPinjam = tglPinjam;
        this.tglKembali = tglKembali;
        
    }

    public Pinjam() {
    }

    public String getTglPinjam() {
        return tglPinjam;
    }

    public void setTglPinjam(String tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    public String getTglKembali() {
        return tglKembali;
    }

    public void setTglKembali(String tglKembali) {
        this.tglKembali = tglKembali;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public String getKodeAnggota() {
        return kodeAnggota;
    }

    public void setKodeAnggota(String kodeAnggota) {
        this.kodeAnggota = kodeAnggota;
    }
    
    public long getSelisih() throws ParseException{
       SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
       Date d1 = format.parse(tglPinjam);
       Date d2 = format.parse(tglKembali);
       long diff = d2.getTime() - d1.getTime();
       long diffDays = diff / (24*60*60*1000);
       return diffDays;
    }
    
    
    
}
