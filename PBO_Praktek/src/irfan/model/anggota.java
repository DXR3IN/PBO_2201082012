/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irfan.model;

/**
 *
 * @author LAB-MM
 */
public class anggota {
    private String kodeAnggota;
    private String namaAnggota;
    private String alamat;
    private String jeniskelamin;

    public anggota() {
    }
    
    public anggota(String kodeAnggota, String namaAnggota, String alamat, String jeniskelamin){
        this.kodeAnggota = kodeAnggota;
        this.namaAnggota = namaAnggota;
        this.alamat = alamat;
        this.jeniskelamin = jeniskelamin;
    }

    public anggota(String kodeAnggota) {
        this.kodeAnggota = kodeAnggota;
    }

    public String getKodeAnggota() {
        return kodeAnggota;
    }

    public void setKodeAnggota(String kodeAnggota) {
        this.kodeAnggota = kodeAnggota;
    }

    public String getNamaAnggota() {
        return namaAnggota;
    }

    public void setNamaAnggota(String namaAnggota) {
        this.namaAnggota = namaAnggota;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJeniskelamin() {
        return jeniskelamin;
    }

    public void setJeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }
    
    
    
    
}
