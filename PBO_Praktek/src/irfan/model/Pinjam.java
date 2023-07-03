/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irfan.model;

/**
 *
 * @author mhdir
 */
public class Pinjam  {
    private String tglPinjam;
    private String tglKembali;
    private String kodeBuku;
    private String kodeAnggota;

    public Pinjam(String kodeBuku, String kodeAnggota, String tglPinjam, String tglKembali) {
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
    
    
    
    
}
