/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamodel.fasilitas;

/**
 *
 * @author garry
 */
public class Fasilitas {
    private String jenis;
    private Double totalharga;
    
    public Fasilitas(String jenis, Double totalharga){
        this.jenis=jenis;
        this.totalharga=totalharga;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public Double getTotalharga() {
        return totalharga;
    }

    public void setTotalharga(Double totalharga) {
        this.totalharga = totalharga;
    }
    
    
}
