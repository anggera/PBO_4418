/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Controller;

import mvc.DAO.DAOUser;
import mvc.DAOInterface.IUser;
import mvc.Model.*;
import mvc.View.FormPendaftaran;
import mvc.View.FormAdmin;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class ControllerAdmin {
    FormAdmin adminFrame;
    FormPendaftaran userFrame;
    IUser implUser;
    List<User> lu;
    
    public ControllerAdmin(FormAdmin adminFrame) {
        this.adminFrame = adminFrame;
        implUser = new DAOUser();
        lu = implUser.getAll();
    }
    
    public void isiTabel() {
        lu = implUser.getAll();
        TabelModelUser tmu = new TabelModelUser(lu);
        adminFrame.getTabelData().setModel(tmu);
    }
    
    public void isiField(int row) {
        adminFrame.getTxtNik().setText(lu.get(row).getNik());
        adminFrame.getTxtNama().setText(lu.get(row).getNama());
        adminFrame.getTxtJk().setSelectedItem(lu.get(row).getJenis_kelamin());
        adminFrame.getTxtTinggal().setText(lu.get(row).getTempat_tinggal());
        adminFrame.getTxtUsia().setText(lu.get(row).toString());
        adminFrame.getTxtAlasan().setText(lu.get(row).getAlasan());
    }
    
    public void update() {
        if(!adminFrame.getTxtNik().getText().trim().isEmpty()& !adminFrame.getTxtNama().getText().trim().isEmpty()){
            User b = new User();
            b.setNik(adminFrame.getTxtNik().getText());
            b.setNama(adminFrame.getTxtNama().getText());
            b.setJenis_kelamin(adminFrame.getTxtJk().getSelectedItem().toString());
            b.setTempat_tinggal(adminFrame.getTxtTinggal().getText());
            b.setUsia(Integer.parseInt(adminFrame.getTxtUsia().getText()));
            b.setAlasan(adminFrame.getTxtAlasan().getText());
            implUser.update(b);
            JOptionPane.showMessageDialog(null, "Update Data Sukses");
        } else {
            JOptionPane.showMessageDialog(adminFrame, "Pilih data yang akan di ubah");
        }
    }
    
    public void delete() {
        if(!adminFrame.getTxtNik().getText().trim().isEmpty()){
            String id = adminFrame.getTxtNik().getText();
            implUser.delete(id);
            JOptionPane.showMessageDialog(null, "Hapus Data Sukses");
        }else {
            JOptionPane.showMessageDialog(adminFrame, "Pilih Data yang akan di hapus");
        }
    }
    
    public void reset() {
        adminFrame.getTxtNik().setText("");
        adminFrame.getTxtNama().setText("");
        adminFrame.getTxtJk().setSelectedItem("");
        adminFrame.getTxtTinggal().setText("");
        adminFrame.getTxtUsia().setText("");
        adminFrame.getTxtAlasan().setText("");
    }
}
