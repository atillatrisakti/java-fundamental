package com.juaracoding.learnjava.ujian2;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HRTest {

    Karyawan manager;
    Karyawan staff;
    Karyawan intern;
    Divisi divisiIT;

    @BeforeMethod
    public void setUp() {
        manager = new Karyawan("Andi", "Manager", 10000000);
        staff = new Karyawan("Budi", "Staff", 5000000);
        intern = new Karyawan("Citra", "Intern", 3000000);
        
        divisiIT = new Divisi("Engineering");
    }

    @Test
    public void testHitungGajiTotalManager() {
        Assert.assertEquals(manager.hitungGajiTotal(), 15000000.0, "Perhitungan gaji Manager gagal.");
    }

    @Test
    public void testHitungGajiTotalStaff() {
        Assert.assertEquals(staff.hitungGajiTotal(), 7000000.0, "Perhitungan gaji Staff gagal.");
    }

    @Test
    public void testHitungGajiTotalLainnya() {
        Assert.assertEquals(intern.hitungGajiTotal(), 3000000.0, "Perhitungan gaji jabatan Lainnya gagal.");
    }

    @Test
    public void testUpdateGaji() {
        staff.updateGaji(10);
        Assert.assertEquals(staff.getGajiPokok(), 5500000.0, "Pembaruan persentase gaji gagal.");
    }

    @Test
    public void testTambahDanJumlahKaryawan() {
        divisiIT.tambahKaryawan(manager);
        divisiIT.tambahKaryawan(staff);

        Assert.assertEquals(divisiIT.getJumlahKaryawan(), 2, "Penambahan karyawan ke divisi gagal divalidasi.");
    }
}