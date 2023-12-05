package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<FoodInADish<Food>> list = new ArrayList<>();
        FoodInADish<Food> fd = new FoodInADish<Food>();
        Food food=  new Fruit();
        fd.setFood(food);
        fd.setDishColor();
        list.add(fd);
        collections.sort(list);
    }
}
