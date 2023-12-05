package com.company;

import javax.swing.*;

public class FoodInADish<T> extends DrawableObj implements Comparable<FoodInADish>{
    private T food;
    String dishColor;

    public FoodInADish() {
        this.food= (T) new Object();
        dishColor=
    }

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
    public JPanel draw() {
         ImageIcon foodIcon= new ImageIcon("/resources"+ ((Food)food).getName()+".png");
         ImageIcon dishIcon= new ImageIcon("/resources"+ dishColor +".png");
         JPanel p=new JPanel();
         JLabel fl= new JLabel(foodIcon);
         fl.setBounds(0, 0, foodIcon.getIconWidth(), foodIcon.getIconHeight());

         p.add(fl);

         JLabel dl=new JLabel(dishIcon);
         dl.setBounds(0, 0, dishIcon.getIconWidth(), dishIcon.getIconHeight());
         p.add(dl);
         p.setBounds(getxCoord(), getyCoord(), Math.max(foodIcon.getIconWidth(), dishIcon.getIconWidth()), foodIcon.getIconHeight()+3+dishIcon.getIconHeight());
         return p;
    }

    public T getFood() {
        return food;
    }

    public FoodInADish(T food, String dishColor) {
        this.food = food;
        this.dishColor = dishColor;
    }

    public void setFood(T food) {
        this.food = food;
    }

    public void setDishColor(String dishColor) {
        this.dishColor = dishColor;
    }

    public String getDishColor() {
        return dishColor;
    }
}
