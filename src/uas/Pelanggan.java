
package uas;


//Soal 3. Implementasi dari abstract class AbsPelanggan
import java.util.*;
public class Pelanggan extends AbsPelanggan{
   
    public Pelanggan(){
        this.total_harga=0;
        this.orderanMakanan = new ArrayList<Food>();
        this.orderanMinuman = new ArrayList<OrderedDrink>();
    }

    public void getOrderan() {
        System.out.println("\n----Isi Orderan-----");
        System.out.println("Makanan:");
        for (Food a : this.orderanMakanan) {
            System.out.println(a.toString(a.keteranganTambahan));
        }
        System.out.println("Minuman:");
        for (OrderedDrink b : this.orderanMinuman) {
            System.out.print(b.toString());
        }
    }

    public void masukanOrder(int index, String[] mealCode ,String[] mealName, Integer[] mealPrice) {
        if (index > 10 ) {
            System.out.println("Silahkan input angka dari 1-10");
        }
        else if(index<6) {
            index -= 1;
            OrderedDrink minuman;
            minuman = new OrderedDrink(mealCode[index], mealName[index], mealPrice[index]);
            this.orderanMinuman.add(minuman);
            this.total_harga += mealPrice[index];
            System.out.printf("%s sukses ditambahkan", mealName[index]);
            System.out.println();
        }
        else{
            index -= 1;
            Food makanan;
            makanan = new Food(mealCode[index], mealName[index], mealPrice[index]);
            System.out.print("masukan keterangan tambahan untuk makanan: ");
            Scanner input = new Scanner(System.in);
            String userInput = input.nextLine();
            makanan.keteranganTambahan = userInput;
            this.orderanMakanan.add(makanan);
            this.total_harga += mealPrice[index];
            System.out.printf("%s sukses ditambahkan", mealName[index]);
            System.out.println();
        }
    }

    //soal nomor 7 untuk BUBBLE SORT
    public void ascending(){
        int n = orderanMakanan.size();
        int m = orderanMinuman.size();
        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-i-1; j++){
                if(orderanMakanan.get(j).getMealPrice() > orderanMakanan.get(j+1).getMealPrice()){
                    Collections.swap(orderanMakanan, j, j+1);
                }
            }
        }
        for (int i=0; i<m-1; i++){
            for (int j=0; j<m-i-1; j++){
                if(orderanMinuman.get(j).getMealPrice() > orderanMinuman.get(j+1).getMealPrice()){
                    Collections.swap(orderanMinuman, j, j+1);
                }
            }
        }
    }

    public void descending(){
        int n = orderanMakanan.size();
        int m = orderanMinuman.size();
        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-i-1; j++){
                if(orderanMakanan.get(j).getMealPrice() < orderanMakanan.get(j+1).getMealPrice()){
                    Collections.swap(orderanMakanan, j, j+1);
                }
            }
        }
        for (int i=0; i<m-1; i++){
            for (int j=0; j<m-i-1; j++){
                if(orderanMinuman.get(j).getMealPrice() < orderanMinuman.get(j+1).getMealPrice()){
                    Collections.swap(orderanMinuman, j, j+1);
                }
            }
        }
    }



    public String toString(){
        return "Pelanggan restoran";
    }

}