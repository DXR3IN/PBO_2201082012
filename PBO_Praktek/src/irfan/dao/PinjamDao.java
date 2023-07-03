/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irfan.dao;
import irfan.model.*;
import java.util.*;
/**
 *
 * @author mhdir
 */
public interface PinjamDao {
    void insert(Pinjam peminjaman);
    void update(int index, Pinjam peminjaman);
    void delete(int index);
    Pinjam getPinjam(int index);
    List<Pinjam> getAll();
}
