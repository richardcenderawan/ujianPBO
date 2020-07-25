// Soal nomor 1 subclass dari abstract class Meal
package uas;


public class Food extends Meal{
    String keteranganTambahan;
   
    public Food(){
        this("", "", 0);
    }
    
    public Food(String mealCode, String mealName, int mealPrice){
        super(mealCode, mealName, mealPrice);
    }

    public String toString(){
        // Mengembalikan informasi pesanan minuman
        return String.format("%-10s%-25s%-45s", getMealCode(), getMealName(), getMealPrice()) + "\n";
    }

    //Soal nomor 4. overloading metode
    public String toString(String keteranganTambahan){
        // Mengembalikan informasi pesanan minuman
        return String.format("%-10s%-25s%-30s%-35s", getMealCode(), getMealName(), getMealPrice(), keteranganTambahan) + "\n";
    }

}