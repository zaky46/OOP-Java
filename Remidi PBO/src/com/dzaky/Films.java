package com.dzaky;
public class Films {
    private int id;
    private String judul;
    private String sinopsis;
    private String sutradara;
    private String pemain;
    private int tahun;

    public Films(int id, String judul, String sinopsis, String sutradara, String pemain, int tahun) {
        super();
        this.id = id;
        this.judul = judul;
        this.sinopsis = sinopsis;
        this.sutradara = sutradara;
        this.pemain = pemain;
        this.tahun = tahun;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getSutradara() {
        return sutradara;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }

    public String getPemain() {
        return pemain;
    }

    public void setPemain(String pemain) { this.pemain = pemain; }

    public int getTahun() { return tahun; }

    public void setTahun(int tahun) { this.tahun = tahun; }
}
