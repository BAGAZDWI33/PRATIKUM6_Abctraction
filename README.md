# PRATIKUM6_Abctraction
Class abstrak adalah class yang masih dalam bentuk abstrak. Karena bentuknya masih abstrak, dia tidak bisa dibuat langsung menjadi objek.
Sebuah class agar dapat disebut class abstrak setidaknya memiliki satu atau lebih method abstrak.
Method abstrak adalah method yang tidak memiliki implementasi atau tidak ada bentuk konkritnya.
Method abstrak itu adalah method yang tidak memiliki isi.
Cuma ada nama saja.dan class yang menggunakan method ini, secara otomatis akan menjadi class abstrak.


public abstract class BangunDatar{
    String warna;

    public String getWarna() {
        return this.warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public abstract void gambar();
    public abstract float getluas();

}



## Apa Bedanya Class Abstrak dengan Interface?
Class abstrak dan interface sama-sama digunakan untuk membuat abstraksi.
Keduanya hampir memiliki sifat yang sama. Tapi ada bedanya.
Apa itu?

1. di class abstrak kita bisa baut properti atau variabel sedangkan di interface kita cuma bisa buat konstanta saja
2. di class abstrak kita bisa implementasikan kode method seperti class biasa, sedangkan di interface harus menggunakan default
3. di class abstrak dapat memiliki member private dan protected sedangkan interface harus publik semua
4. Class abstrak diimpelentasikan dengan pewarisan (extends) sedangkan interaface menggunakan implements

class abstrak induk 

public abstract class BangunDatar{
    String warna;

    public String getWarna() {
        return this.warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public abstract void gambar();
    public abstract float getluas();

}

Disana terdapat menthod abstact class dengan nama bangun datar 
menggunakan getter yang memanggil String Warna
dengan cara pemanggilan menggunakan public abstract void gambar();
dan public abstract fload getluas();


class abstrak turunana(inheritent)

pertama class segitiga


public class Segitiga extends BangunDatar{
    private int alas;
    private int tinggi;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public void gambar() {
        System.out.println("gambar segitiga");
    }

    @Override
    public float getluas() {
        return (float) (0.5 * alas * tinggi);

    }
}


kedua class persegi

public class persegi extends BangunDatar{
    private float panjang;
    private float lebar;

    public persegi(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public void gambar() {
        System.out.println("gambar persegi");
    }

    @Override
    public float getluas() {
        return this.lebar * this.panjang;
    }
}


ketiga class lingkaran

import java.lang.Math;
public class lingkaran extends BangunDatar {
    private float radius;

    public lingkaran(float radius) {
        this.radius = radius;
    }

    @Override
    public void gambar() {
        System.out.println("gambar lingkaran");
    }

    @Override
    public float getluas() {
        return (float) (Math.PI * radius * radius);
    }
}

dengan pemanggilan menggunakan class main

 public class Main {
    public static void main(String[] args) {
        // membuat objek bangundatar dari class persegi
        BangunDatar rect = new persegi(100, 200);

        // membuat objek bangundatar dari class lingkaran
        BangunDatar circ = new lingkaran(50);
        
        // membuat objek bangundatar dari class segitiga
        BangunDatar Seg = new Segitiga(70, 80);


        /* memanggil method draw */
        rect.gambar();
        circ.gambar();
        Seg.gambar();

        System.out.println("Luas Lingkaran: " + circ.getluas());
        System.out.println("Luas Persegi: " + rect.getluas());
        System.out.println("Luas Segitiga: " + Seg.getluas());
    }
}

code diatas menggunakan method draw untuk memanggil abstract class agar terbaca sebagai nama saja dari objek tidak memiliki isi yang konkritnya.

by.BAGAS DWI PRASETYO (312110053)




