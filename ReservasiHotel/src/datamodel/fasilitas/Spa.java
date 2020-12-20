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
public class Spa extends Fasilitas{
    private Integer durasi;
   
   public Spa(String jenis, Double totalharga, Integer durasi){
       super(jenis,totalharga);
       this.durasi=durasi;
   }

    public Integer getDurasi() {
        return durasi;
    }

    public void setDurasi(Integer durasi) {
        this.durasi = durasi;
    }
   
}
