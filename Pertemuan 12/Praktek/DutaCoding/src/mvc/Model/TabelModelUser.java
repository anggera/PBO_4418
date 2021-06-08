/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ACER
 */
public class TabelModelUser extends AbstractTableModel {
    List<User> lu;
    
    public TabelModelUser(List<User> lu) {
        this.lu = lu;
    }
    
    @Override
    public int getRowCount() {
        return lu.size();
    }
    
    @Override
    public int getColumnCount() {
        return 6;
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "NIK";
            case 1:
                return "NAMA";
            case 2:
                return "JENIS KELAMIN";
            case 3:
                return "TEMPAT TINGGAL";
            case 4:
                return "USIA";
            case 5:
                return "ALASAN";
            default:
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return lu.get(row).getNik();
            case 1:
                return lu.get(row).getNama();
            case 2:
                return lu.get(row).getJenis_kelamin();
            case 3:
                return lu.get(row).getTempat_tinggal();
            case 4:
                return lu.get(row).getUsia();
            case 5:
                return lu.get(row).getAlasan();
            default:
                return null;
        } 
    }
}
