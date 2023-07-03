/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irfan.dao;
import irfan.model.Pinjam;
import java.util.*;
/**
 *
 * @author mhdir
 */
public class PinjamDaoImpl implements PinjamDao {
    private List<Pinjam> data = new ArrayList<>();

    public PinjamDaoImpl() {
    }
    
    public void insert(Pinjam pinjam){
        data.add(pinjam);
    }
    
    public void update(int index,Pinjam pinjam){
        data.set(index,pinjam);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Pinjam getPinjam(int index){
        return data.get(index);
    }
    
    public List<Pinjam> getAll(){
        return data;
    }
    
    
}
