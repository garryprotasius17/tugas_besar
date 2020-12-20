/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamodel.kamar;

/**
 *
 * @author garry
 */
public class JuniorwSuiteRoom extends Kamar {
    private  Integer no_kamar;
    private  Double harga;
  
    public JuniorwSuiteRoom(String kategori, Integer no_kamar,Double harga){
       super(kategori,no_kamar,harga);
        this.no_kamar = no_kamar;
        this.harga = harga;
    }

    @Override
    public Integer getNo_kamar() {
        return no_kamar;
    }

    @Override
    public void setNo_kamar(Integer no_kamar) {
        this.no_kamar = no_kamar;
    }

    @Override
    public Double getHarga() {
        return harga;
    }

    @Override
    public void setHarga(Double harga) {
        this.harga = harga;
    }
    
    
}
