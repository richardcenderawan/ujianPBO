package uas;

import java.util.*;

public abstract class Meal {
    String mealName;
    String mealCode;
    int mealPrice;

    public Meal(){
        this("", "", 0);
    }

    public Meal(String mealCode, String mealName, int mealPrice){
        this.mealName = mealName;
        this.mealCode = mealCode;
        this.mealPrice = mealPrice;
    }

    public String getMealName(){
        return mealName;
    }

    public String getMealCode(){
        return mealCode;
    }

    public int getMealPrice(){
        return mealPrice;
    }

    public abstract String toString(); // Metode abstrak yang harus diimplementasikan dalam subclass
}