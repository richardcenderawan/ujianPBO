package uas;


public class OrderedDrink extends Meal{
    private boolean isDrinkHot;
   
    public OrderedDrink(){
        this("", "", 0);
    }

    public OrderedDrink(String mealCode, String mealName, int mealPrice){
        super(mealCode, mealName, mealPrice);
    }

    public boolean isDrinkHot() {
        return isDrinkHot;
    }

    public void setIsDrinkHot(boolean isDrinkHot) {
        this.isDrinkHot = isDrinkHot;
    }

    public String drinkHotness(){
        if (isDrinkHot)
            return "Panas";
        else
            return "Dingin";
    } // apakah minuman panas / dingin

    public String toString(){
        // Mengembalikan informasi pesanan minuman
        return String.format("%-10s%-25s%-65s", getMealCode(), getMealName(), getMealPrice()) + "\n";
    }

}