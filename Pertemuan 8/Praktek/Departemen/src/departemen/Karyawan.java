/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package departemen;

/**
 *
 * @author ACER
 */
public class Karyawan extends Departemen{
    String kodeKaryawan;
    
    public Karyawan(){
    }
    
    public Karyawan(String namaKaryawan, String alamatKaryawan, String noTeleponKaryawan, String kodeKaryawan){
        nama = namaKaryawan;
        alamat = alamatKaryawan;
        noTelepon = noTeleponKaryawan;
        this.kodeKaryawan = kodeKaryawan;
    }
    
    public void kodeKaryawan(String kodeKaryawan){
        this.kodeKaryawan =  kodeKaryawan;
        System.out.println("Kode Karyawan           : " +kodeKaryawan);
    }
    
    @Override
    public void nama(String namaKaryawan){
        nama = namaKaryawan;
        System.out.println("Nama Karyawan           : " +namaKaryawan);
    }   
    
    @Override
    public void alamat(String alamatKaryawan){
        alamat = alamatKaryawan;
        System.out.println("Alamat Karyawan         : " +alamatKaryawan);
    }
    
    @Override
    public void noTelepon(String noTeleponKaryawan){
        noTelepon = noTeleponKaryawan;
        System.out.println("No. Telp Karyawan       : " +noTeleponKaryawan);
    }
}
