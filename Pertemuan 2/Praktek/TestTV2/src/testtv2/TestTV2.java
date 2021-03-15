/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtv2;

/**
 *
 * @author ACER
 */
public class TestTV2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RemoteControl tv1 = new RemoteControl();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);
        
        RemoteControl tv2 = new RemoteControl();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();
        
        System.out.println("tv1's channel is " + tv1.channel 
          + " and volume level is " + tv1.volumeLevel);
        System.out.println("tv2's channel is " + tv2.channel 
          + " and volume level is " + tv2.volumeLevel);
        
        Manusia man1 = new Manusia("Erik");
        System.out.println(man1.namaSaya());
        RemoteControl tvku = new RemoteControl();
        man1.beliTV(tvku);
        System.out.println(man1.cekTV());
        man1.jualSemuaTV();
        System.out.println(man1.cekTV());

    }
    
}

class RemoteControl {
    int channel = 1;
    int volumeLevel = 1;
    boolean on;
    
    RemoteControl() {
    }
    
    public void turnOn() {
        on = true;
    }
    
    public void turnOff() {
        on = false;
    }
    
    public void setChannel(int newChannel) {
        channel = newChannel;
    }
    
    public void setVolume(int newVolumeLevel) {
        volumeLevel = newVolumeLevel;
    }
    
    public void channelUp() {
        channel = channel + 1;
    }
    
    public void channelDown() {
        channel = channel - 1;
    }
    
    public void volumeUp() {
        volumeLevel = volumeLevel + 1;
    }
    
    public void volumeDown() {
        volumeLevel = volumeLevel - 1;
    }
}

class Manusia {
    private String nama;
    private boolean punyaTV;
    
    Manusia(){
        nama = "noname";
        punyaTV = false;
    }
    
    Manusia(String newNama) {
        nama = newNama;
    }
    
    public String namaSaya() {
        return nama;
    }
    
    public void beliTV(RemoteControl tiviku) {
        punyaTV = true;
    }
    
    public void jualSemuaTV() {
        punyaTV = false;
    }
    
    public boolean cekTV() {
        return punyaTV;
    }
    
}