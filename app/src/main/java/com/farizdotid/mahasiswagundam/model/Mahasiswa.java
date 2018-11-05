package com.farizdotid.mahasiswagundam.model;


public class Mahasiswa {

    private int id;
    private String nama;

    public Mahasiswa(String nama) {
       this.nama = nama;
    }

//    public Mahasiswa(String nama) {
//        this.nama = nama;
////        this.tempat_lahir = tempat_lahir;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

//    public String getTempat_lahir() {
//        return tempat_lahir;
//    }
//
//    public void setTempat_lahir(String tempat_lahir) {
//        this.tempat_lahir = tempat_lahir;
//    }
}
