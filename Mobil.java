/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author redo-hunter
 */
public abstract class Mobil implements Kendaraan {
    
    protected String jenis;
    protected String merk;
   
	
    
    
    protected String getjenis() {
        return this.jenis;
        
    }
    
    protected String getmerk () {
        return this.merk;
        
    }
    public void setjenis(String jenis) {
      this.jenis= jenis;  
        
    }
    
    public void sethabitat(String merk) {
        this.merk= merk;
    }
 
    
    protected abstract void Tmpljenis();
    protected abstract void Tmplmerk();
    
	
}