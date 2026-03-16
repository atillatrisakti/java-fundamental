package com.juaracoding.learnjava.ujian2;

import java.util.ArrayList;
import java.util.List;

public class Divisi {
    private String namaDivisi;
    private List<Karyawan> daftarKaryawan;

    // Constructor
    public Divisi(String namaDivisi) {
        this.namaDivisi = namaDivisi;
        this.daftarKaryawan = new ArrayList<>(); 
    }

    public void tambahKaryawan(Karyawan karyawan) {
        daftarKaryawan.add(karyawan);
    }

    public int getJumlahKaryawan() {
        return daftarKaryawan.size();
    }
}