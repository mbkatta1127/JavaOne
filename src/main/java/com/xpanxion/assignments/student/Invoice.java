package com.xpanxion.assignments.student;
import java.util.*;
public class Invoice {
    private List<Product> productsList;

    public Invoice(int i){
        productsList = new ArrayList<>(1);
    }

    public void addProduct(Product p){
        productsList.add(p); 
    }

    public double getTotalCost(){
        int totalCost = 0;

        for(Product product: productsList){
            totalCost += product.getCost();
        }

        return totalCost;
    }


}
