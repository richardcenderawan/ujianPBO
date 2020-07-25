//Soal nomor 2. Abstract class baru
package uas;

import java.util.*;

public abstract class AbsPelanggan {
    int total_harga;
    ArrayList<Food> orderanMakanan;
    ArrayList<OrderedDrink> orderanMinuman;

    public AbsPelanggan(){
        total_harga=0;
        this.orderanMakanan = new ArrayList<Food>();
        this.orderanMinuman = new ArrayList<OrderedDrink>();
    }

    public int getTotalHarga() {
        return this.total_harga;
    }

    public abstract void getOrderan();
    public abstract String toString(); // Metode abstrak yang harus diimplementasikan dalam subclass
}