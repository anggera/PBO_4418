/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package departemen;

import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class Pembeli extends Departemen{
    ArrayList<String> pembeliIndividu = new ArrayList<>();
    ArrayList<String> pembeliBorongan = new ArrayList<>();

    public Pembeli() {
    }
    
    public Pembeli(String alamatPembeli, String noTeleponPembeli){
        alamat = alamatPembeli;
        noTelepon = noTeleponPembeli;
    }
    
    public void addPembeliIndividu(String nama){
        pembeliIndividu.add(nama);
    }
    
    public void getAllPembeliIndividu(){
        System.out.println("Daftar pembeli individu : " +pembeliIndividu);
    }
    
    public void addPembeliBorongan(String nama){
        pembeliBorongan.add(nama);
    }
    
    public void getAllPembeliBorongan(){
        System.out.println("Daftar pembeli borongan : " +pembeliBorongan);
    }
    
    @Override
    public void alamat(String alamatPembeli){
        alamat = alamatPembeli;
        System.out.println("Alamat Pembeli          : " +alamatPembeli);
    }
    
    @Override
    public void noTelepon(String noTeleponPembeli){
        noTelepon = noTeleponPembeli;
        System.out.println("No. Telp Pembeli        : " +noTeleponPembeli);
    }
}
