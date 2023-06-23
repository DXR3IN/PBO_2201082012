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
 * @author LAB-MM
 */
public class AnggotaController {
    formAnggota view;
    anggota Anggota;
    anggotaDAO dao;

    public AnggotaController(formAnggota view) {
        this.view = view;
        dao = new AnggotaDaoImpl();
    }
    
    public void clearForm(){
        view.getTxtKodeAnggota().setText("");
        view.getTxtNamaAnggota().setText("");
        view.getTxtAlamat().setText("");
        view.getCboJenisKelamin().removeAllItems();
        view.getCboJenisKelamin().addItem("L");
        view.getCboJenisKelamin().addItem("P");
        
    }
    
    public void tampil(){
        DefaultTableModel tabelModel =(DefaultTableModel) view.getTabelAnggota().getModel();
        tabelModel.setRowCount(0);
        List<anggota> list = dao.getAll();
        for(anggota a : list){
            Object[] row = {
                a.getKodeAnggota(),
                a.getNamaAnggota(),
                a.getAlamat(),
                a.getJeniskelamin()
            };
            tabelModel.addRow(row);
        }
    }
    
    public void insert(){
        Anggota = new anggota();
        Anggota.setKodeAnggota(view.getTxtKodeAnggota().getText());
        Anggota.setNamaAnggota(view.getTxtNamaAnggota().getText());
        Anggota.setAlamat(view.getTxtAlamat().getText());
        Anggota.setJeniskelamin(view.getCboJenisKelamin().getSelectedItem().toString());
        dao.insert(Anggota);
        JOptionPane.showMessageDialog(view,"Entry Data Ok"); 
    }
    
    public void update(){
        int index = view.getTabelAnggota().getSelectedRow();
        Anggota.setKodeAnggota(view.getTxtKodeAnggota().getText());
        Anggota.setNamaAnggota(view.getTxtNamaAnggota().getText());
        Anggota.setAlamat(view.getTxtAlamat().getText());
        Anggota.setJeniskelamin(view.getCboJenisKelamin().getSelectedItem().toString());
        dao.update(index, Anggota);
        JOptionPane.showMessageDialog(view,"Update Data Ok");
    }
    
    public void delete(){
        int index = view.getTabelAnggota().getSelectedRow();
        dao.delete(index);
        JOptionPane.showMessageDialog(view,"Delete Data Ok");
    }
    
    public void getAnggota(){
        int index = view.getTabelAnggota().getSelectedRow();
        Anggota = dao.getAnggota(index);
        view.getTxtKodeAnggota().setText(Anggota.getKodeAnggota());
        view.getTxtNamaAnggota().setText(Anggota.getNamaAnggota());
        view.getTxtAlamat().setText(Anggota.getAlamat());
        view.getCboJenisKelamin().setSelectedItem(Anggota.getJeniskelamin());
    }
    
}
