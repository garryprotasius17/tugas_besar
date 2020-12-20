/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengunjung;

/**
 *
 * @author garry
 */
public class Pengunjung {
    public String nama;
    public String no_identitas;
    public String alamat;
    public String no_telp;
    public String check_in;
    public String check_out;
    public Double total_tagihan;
    
    public Pengunjung(String nama,String no_identitas,String alamat,
            String no_telp,Double total_tagihan){
        this.nama=nama;
        this.no_identitas=no_identitas;
        this.alamat=alamat;
        this.no_telp=no_telp;
        this.total_tagihan = total_tagihan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNo_identitas() {
        return no_identitas;
    }

    public void setNo_identitas(String no_identitas) {
        this.no_identitas = no_identitas;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    public String getCheck_in() {
        return check_in;
    }

    public void setCheck_in(String check_in) {
        this.check_in = check_in;
    }

    public String getCheck_out() {
        return check_out;
    }

    public void setCheck_out(String check_out) {
        this.check_out = check_out;
    }

    public Double getTotal_tagihan() {
        return total_tagihan;
    }

    public void setTotal_tagihan(Double total_tagihan) {
        this.total_tagihan = total_tagihan;
    }
    
}
