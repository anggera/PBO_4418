/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAO;

import mvc.Koneksi.Koneksi;
import mvc.Model.User;
import mvc.DAOInterface.IUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public class DAOUser implements IUser{
    Connection connection;
    final String insert = "INSERT INTO tbl_pendaftaran (nik, nama, jenis_kelamin, tempat_tinggal, usia, alasan) VALUES (?, ?, ?, ?, ?, ?);";
    final String update = "UPDATE tbl_pendaftaran set nik=?, nama=?, jenis_kelamin=?, tempat_tinggal=?, usia=?, alasan=?;";
    final String delete = "DELETE FROM tbl_pendaftaran where nik=?;";
    final String select = "SELECT * FROM tbl_pendaftaran;";

    public DAOUser(){
        connection = Koneksi.connection();
    }
    
    @Override
    public void insert(User b) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert);
            statement.setString(1, b.getNik());
            statement.setString(2, b.getNama());
            statement.setString(3, b.getJenis_kelamin());
            statement.setString(4, b.getTempat_tinggal());
            statement.setInt(5, b.getUsia());
            statement.setString(6, b.getAlasan());
            statement.execute();
//            ResultSet rs = statement.getGeneratedKeys();
//            while (rs.next()) {
//                b.setNik(rs.getInt(1));
//            }
        } catch (SQLException ex) {
            System.out.println("Berhasil Input");
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Gagal Input");
            }
        }
    }

    @Override
    public void update(User b) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(update);
            statement.setString(1, b.getNik());
            statement.setString(2, b.getNama());
            statement.setString(3, b.getJenis_kelamin());
            statement.setString(4, b.getTempat_tinggal());
            statement.setInt(5, b.getUsia());
            statement.setString(6, b.getAlasan());
            statement.executeUpdate();
        } catch (SQLException ex){
            System.out.println("Berhasil Update");
        } finally{
            try {
                statement.close();
            } catch(SQLException ex){
                System.out.println("Gagal Update");
            }
        }
    }

    @Override
    public void delete(String nik) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(delete);
            statement.setString(1, nik);
            statement.executeUpdate();
 
        } catch (SQLException ex){
            System.out.println("Berhasil Delete");
        } finally{
            try {
                statement.close();
            } catch(SQLException ex){
                System.out.println("Gagal Delete");
            }
        }
    }

    @Override
    public List<User> getAll() {
        List<User> lu = null;
        try{
            lu = new ArrayList<User>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()){
                User b = new User();
                b.setNik(rs.getString("nik"));               
                b.setNama(rs.getString("nama"));
                b.setJenis_kelamin(rs.getString("jenis_kelamin"));
                b.setTempat_tinggal(rs.getString("tempat_tinggal"));
                b.setUsia(rs.getInt("usia"));               
                b.setAlasan(rs.getString("alasan"));
                lu.add(b); 
            }
        } catch (SQLException ex){
            Logger.getLogger(DAOUser.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return lu;
    }
}
