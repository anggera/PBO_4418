/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Model;

/**
 *
 * @author ACER
 */
public class User {

    /**
     * @return the nik
     */
    public String getNik() {
        return nik;
    }

    /**
     * @param nik the nik to set
     */
    public void setNik(String nik) {
        this.nik = nik;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the jenis_kelamin
     */
    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    /**
     * @param jenis_kelamin the jenis_kelamin to set
     */
    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    /**
     * @return the tempat_tinggal
     */
    public String getTempat_tinggal() {
        return tempat_tinggal;
    }

    /**
     * @param tempat_tinggal the tempat_tinggal to set
     */
    public void setTempat_tinggal(String tempat_tinggal) {
        this.tempat_tinggal = tempat_tinggal;
    }

    /**
     * @return the usia
     */
    public int getUsia() {
        return usia;
    }

    /**
     * @param usia the usia to set
     */
    public void setUsia(int usia) {
        this.usia = usia;
    }

    /**
     * @return the alasan
     */
    public String getAlasan() {
        return alasan;
    }

    /**
     * @param alasan the alasan to set
     */
    public void setAlasan(String alasan) {
        this.alasan = alasan;
    }
    
    private String nik;
    private String nama;
    private String jenis_kelamin;
    private String tempat_tinggal;
    private int usia;
    private String alasan;
}
