/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irfan.controller;

import irfan.model.*;
import java.util.*;
import irfan.view.*;
import irfan.dao.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
/**
 *
 * @author mhdir
 */
public class PinjamController {
    formPinjam view;
    Pinjam pinjam;
    PinjamDao dao;
    anggotaDAO anggotaDao;
    BukuDao bukuDao;

    public PinjamController(formPinjam view) {
        this.view = view;
        dao = new PinjamDaoImpl();
        anggotaDao = new AnggotaDaoImpl();
        bukuDao = new BukuDaoImpl();
    }
    
    public void clearForm(){
        view.getTxtTglPinjam().setText("");
        view.getTxtTglKembali().setText("");
    }
    
    public void isiCombo(){
        view.getCboAnggota().removeAllItems();
        List<anggota> listAnggota = anggotaDao.getAll();
        for(anggota Anggota: listAnggota){
            view.getCboAnggota().addItem(Anggota.getKodeAnggota());
        }
        view.getCboBuku().removeAllItems();
        List<Buku> ListBuku = bukuDao.getAll();
        for(Buku buku: ListBuku){
            view.getCboBuku().addItem(buku.getKodebuku());
        }
    }
    
    public void tampil(){
        DefaultTableModel tabelModel =(DefaultTableModel) view.getTablePinjam().getModel(); 
        tabelModel.setRowCount(0);
        List<Pinjam> list = dao.getAll();
        for(Pinjam a : list){
            Object[] row = {
                a.getKodeBuku(),
                a.getKodeAnggota(),
                a.getTglKembali(),
                a.getTglPinjam(),
                a.getSelisih()
            };
            tabelModel.addRow(row);
        }
        
    }
    
    public void insert(){
        pinjam = new Pinjam();
        pinjam.setKodeBuku(view.getCboBuku().getSelectedItem().toString());
        pinjam.setKodeAnggota(view.getCboAnggota().getSelectedItem().toString());
        pinjam.setTglPinjam(view.getTxtTglPinjam().getText());
        pinjam.setTglKembali(view.getTxtTglKembali().getText());
        dao.insert(pinjam);
        JOptionPane.showMessageDialog(view,"Entry Data Ok"); 
    }
    
    public void update(){
        int index = view.getTablePinjam().getSelectedRow();
        pinjam.setKodeBuku(view.getCboBuku().getSelectedItem().toString());
        pinjam.setKodeAnggota(view.getCboAnggota().getSelectedItem().toString());
        pinjam.setTglPinjam(view.getTxtTglPinjam().getText());
        pinjam.setTglKembali(view.getTxtTglKembali().getText());
        dao.update(index, pinjam);
        JOptionPane.showMessageDialog(view,"Update Data Ok");
    }
    
    public void delete(){
        int index = view.getTablePinjam().getSelectedRow();
        dao.delete(index);
        JOptionPane.showMessageDialog(view,"Delete Data Ok");
    }
    
    public void getPinjam(){
        int index = view.getTablePinjam().getSelectedRow();
        pinjam = dao.getPinjam(index);
        view.getCboBuku().setSelectedItem(pinjam.getKodeBuku());
        view.getCboAnggota().setSelectedItem(pinjam.getKodeAnggota());
        view.getTxtTglPinjam().setText(pinjam.getTglPinjam());
        view.getTxtTglKembali().setText(pinjam.getTglKembali());   
    }

    
    
    
}
