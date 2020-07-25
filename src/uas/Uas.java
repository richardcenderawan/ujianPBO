/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

/**
 *
 * @author Richard Cenderawan 03082170009 17TI1
 */
import java.util.*;

//soal no 5
public class Uas{

    static String[] mealCodeArray = {  "DR1", 
                                    "DR2", 
                                    "DR3", 
                                    "DR4", 
                                    "DR5", 
                                    "F01", 
                                    "F02", 
                                    "F03", 
                                    "F04", 
                                    "F05"};
        
    static String[] mealNameArray = { "Teh Manis", 
                                "Aqua", 
                                "Kopi", 
                                "Lemon Tea", 
                                "Jus", 
                                "Nasi Goreng", 
                                "Indomie Goreng", 
                                "Indomie Goreng Kuah", 
                                "Indomie Becek", 
                                "Nasi Prang",};
        
    static Integer[] mealPriceArray ={ 5000, 
                                4000, 
                                10000, 
                                10000, 
                                12000, 
                                13000, 
                                12000, 
                                12000, 
                                12000, 
                                5000};
    

    public static void main (String[] args){    

        System.out.println("Selamat Datang di restoran");
        Scanner input = new Scanner(System.in);
        int userInput =0;
        Pelanggan pelanggan = new Pelanggan();
        boolean flag = true;
        while (flag) {
            System.out.println("\n\n----------MENU----------");
            System.out.println("1. Order makanan/minuman");
            System.out.println("2. Lihat bill");
            System.out.println("3. Lihat total harga");
            System.out.println("4. Susun bill berdasarkan harga paling murah");
            System.out.println("5. Susun bill berdasarkan harga paling mahal");
            System.out.println("6. Selesai order");

            //soal nomor 6
            try{
                userInput = input.nextInt();
            }catch(InputMismatchException e){
                System.out.println("Tolong masukan saja untuk memilih menu");
                continue;
            }
            
            switch(userInput) {
                case 1:
                    lihat_menu();
                    //soal nomor 6
                    try{
                        Scanner inputAngka = new Scanner(System.in);
                        int angkaMenu = inputAngka.nextInt();
                        pelanggan.masukanOrder(angkaMenu, mealCodeArray, mealNameArray, mealPriceArray);
                    }catch (InputMismatchException e){
                        System.out.println("Tolong masukan saja untuk memilih menu");
                    }
                    break;
                case 2:
                    pelanggan.getOrderan();
                    break;
                case 3:
                    System.out.println("\n----- Total Harga -----");
                    System.out.println("Rp" + pelanggan.getTotalHarga());
                    break;
                case 4:
                    pelanggan.ascending();
                    break;
                case 5:
                    pelanggan.descending();
                    break;
                case 6:
                    flag = false;
                    System.out.println("\nTerima kasih telah memesan. Pesanan anda akan segera diantar");
                    break;
                default:
                    System.out.println("\nInput tidak dikenal, silahkan coba lagi.");
                    break;
            }
        }
    }

    public static void lihat_menu() {
        System.out.println("\n-----Menu-----");
        for (int i = 0; i < mealNameArray.length; i++) {
            System.out.printf("%d. %s %d",i+1, mealNameArray[i], mealPriceArray[i]);
            System.out.println();
        }
    }
}