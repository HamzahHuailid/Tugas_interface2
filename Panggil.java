/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author redo-hunter
 */ 
public class Panggil {
        public static void main (String[] args) {
        TurunanMobil mbl = new TurunanMobil();
        
        mbl.Tmpljenis();
        mbl.Tmplmerk();
        mbl.setType("CR-Z CVT Special Edition");
        System.out.println("Type Mobil        = " +mbl.getType());
        mbl.setTransmisi("Automatic");
        System.out.println("Transmisi         = " +mbl.getTransmisi());
        mbl.setMesin("1497 cc");
        System.out.println("Kapasitas Mesin   = " +mbl.getMesin());
        mbl.setKemudi("Electric Power Steering");
        System.out.println("System Kemudi     = " +mbl.getKemudi());
        
        
        
    }

    
}
