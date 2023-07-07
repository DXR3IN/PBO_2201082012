/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irfan.dao;
import java.util.List;
import irfan.model.anggota;
import java.util.ArrayList;
/**
 * @author LAB-MM
 */
public class AnggotaDaoImpl implements anggotaDAO{
    private List<anggota> data2 = new ArrayList<>();
    
    public AnggotaDaoImpl(){
        data2.add(new anggota("A001","IRFAN","PADANG","L"));
        data2.add(new anggota("A002","DION","PAYAKUMBUH","L"));       
    }
    
    public void insert(anggota Anggota){
        data2.add(Anggota);
    }
    
    public void update(int index, anggota Anggota){
        data2.set(index, Anggota);
    }
    
    public void delete(int index){
        data2.remove(index);
    }
    
    public anggota getAnggota(int index){
        return data2.get(index);
    }
    
    public List<anggota>getAll(){
        return data2;
    }
}
