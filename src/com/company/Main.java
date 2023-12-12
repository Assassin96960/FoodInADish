package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<FoodInADish<Food>> list = new ArrayList<>();
        FoodInADish<Food> fd = new FoodInADish<Food>();
        Food food=  new Fruit("blueberry", 20, true);
        fd.setFood(food);
        fd.setDishColor("yellow");
        list.add(fd);
        list.add(new FoodInADish<Food>((Food)new Fruit("banana", 10, true), "red"));
        Collections.sort(list);
        JFrame frame = new JFrame("FoodInADish");
        frame.setSize(new Dimension(400,800));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel containerPanel= new JPanel();
        containerPanel.setLayout(new GridLayout(1, 2));
        int i=0;
        for(FoodInADish<Food> o:list)
        {
            o.setxCoord(i);
            o.setyCoord(i*70);
            JPanel panel = o.draw();
            containerPanel.add(panel);
            i++;
        }
        frame.setVisible(true);
        frame.add(containerPanel);
    }
}
