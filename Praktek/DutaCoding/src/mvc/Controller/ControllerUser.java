/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Controller;

import mvc.DAO.DAOUser;
import mvc.DAOInterface.IUser;
import mvc.Model.User;
import mvc.View.FormPendaftaran;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class ControllerUser {
    FormPendaftaran userFrame;
    IUser implUser;
    List<User> lu;
    
    public ControllerUser(FormPendaftaran userFrame){
        this.userFrame = userFrame;
        implUser = new DAOUser();
        lu = implUser.getAll();
    }

    public void insert() {
        if (!userFrame.getTxtNik().getText().trim().isEmpty() & !userFrame.getTxtNama().getText().trim().isEmpty()) {
            User b = new User();
            b.setNik(userFrame.getTxtNik().getText());
            b.setNama(userFrame.getTxtNama().getText());
            b.setJenis_kelamin(userFrame.getTxtJk().getSelectedItem().toString());
            b.setTempat_tinggal(userFrame.getTxtTinggal().getText());
            b.setUsia(Integer.parseInt(userFrame.getTxtUsia().getText()));
            b.setAlasan(userFrame.getTxtAlasan().getText());
            implUser.insert(b);
            JOptionPane.showMessageDialog(null, "Simpan Data Sukses");
        } else {
            JOptionPane.showMessageDialog(userFrame, "Data Tidak Boleh Kosong");
        }
    }
    
    public void reset() {
        userFrame.getTxtNik().setText("");
        userFrame.getTxtNama().setText("");
        userFrame.getTxtJk().setSelectedItem("");
        userFrame.getTxtTinggal().setText("");
        userFrame.getTxtUsia().setText("");
        userFrame.getTxtAlasan().setText("");
    }
}
