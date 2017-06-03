/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author redo-hunter
 */
public class TurunanMobil extends Mobil  {
 
    private String type ;
    private String transmisi;
    private String mesin;
    private String kemudi;
   
    public void setType(String type){
        this.type= type;
    }
    public void setTransmisi(String transmisi){
        this.transmisi = transmisi;        
    }
    public void setMesin(String mesin){
        this.mesin = mesin;
    }
    public void setKemudi(String kemudi){
        this.kemudi = kemudi;
    }
    
    
    
    public String getType(){
        return this.type;
    }
    public String getTransmisi(){
        return this.transmisi;
    }    
    public String getMesin(){
        return this.mesin;
    }
    public String getKemudi(){
        return this.kemudi;
    }
    
    @Override
    protected void Tmpljenis() {
     super.setjenis("Sport coupe hybrid"); 
     System.out.println("============= KENDARAAN ==============");
     System.out.println("Jenis Mobil       = " +super.getjenis());
    }

    @Override
    protected void Tmplmerk() {
       super.sethabitat("Honda"); 
     System.out.println("Merk Mobil        = " +super.getmerk());
    }
   

    
}

