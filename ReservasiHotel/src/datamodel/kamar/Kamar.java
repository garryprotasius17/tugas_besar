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
public class Kamar {
    private  String kategori;
    private  Integer no_kamar;
    private  Double harga;
    
    public Kamar(String kategori,Integer no_kamar,Double harga){
        this.kategori=kategori;
        this.no_kamar=no_kamar;
        this.harga=harga;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public Integer getNo_kamar() {
        return no_kamar;
    }

    public void setNo_kamar(Integer no_kamar) {
        this.no_kamar = no_kamar;
    }

    public Double getHarga() {
        return harga;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }

    
    
    
    
    
    
    
 
}
