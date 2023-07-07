/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irfan.dao;
import irfan.model.Buku;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LAB-MM
 */
public class BukuDaoImpl implements BukuDao {
    private List<Buku> data1 = new ArrayList<>();

    public BukuDaoImpl() {
        data1.add(new Buku("B001","Pascal","Pascal","Pascal"));
        data1.add(new Buku("B002","One Piece","Oda","Shueisha"));      
    }
    
    
    
    public void insert(Buku buku) {
        data1.add(buku);
    }

    public void update(int index, Buku buku){
        data1.set(index, buku);
    }

    public void delete(int index) {
        data1.remove(index);
    }

    public Buku getBuku(int index) {
        return data1.get(index);
    }

    public List<Buku> getAll() {
        return data1;
    }


    
}
