package com.company;

public class FoodInADish<T> extends DrawableObj implements Comparable<FoodInADish>{
    T food;
    String DishColor;

    @Override
    public int compareTo(FoodInADish o)
    {
        if(food instanceof Fruit && o.getFood() instanceof Vegetable){return 1;}
        else if (food instanceof Vegetable && o.getFood() instanceof Fruit){return -1;}
        else if (((int)(((Food)food).getKg())-(int)(((Food)o.getFood()).getKg()))!=0){return ((int)(((Food)food).getKg())-(int)(((Food)o.getFood()).getKg()));}
        else if(food instanceof Fruit )
        {
            if(((Fruit)food).isReadyToEat==true && ((Fruit)o.getFood()).isReadyToEat == false)
            {
                return 1;
            }
            if(((Fruit)food).isReadyToEat==false && ((Fruit)o.getFood()).isReadyToEat == true)
            {
                return -1;
            }

            else{return 0;}

        }
        else
        {
            if(((Vegetable)food).isFresh==true && ((Vegetable)o.getFood()).isFresh == false)
            {
                return 1;
            }
            if(((Vegetable)food).isFresh==false && ((Vegetable)o.getFood()).isFresh == true)
            {
                return -1;
            }

            else{return 0;}

        }

    }

    @Override
    public void draw() {

    }

    public T getFood() {
        return food;
    }

    public String getDishColor() {
        return DishColor;
    }
}
