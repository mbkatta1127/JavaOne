package com.xpanxion.assignments.student;
import java.util.*;
public class Invoice extends Base{
    private List<Product> productsList;
    private int id; 
    public Invoice(int i){
        super();
        id = i; 
        productsList = new ArrayList<>(); 
        
    }

    public void addProduct(Product p){
        productsList.add(p);
    }

    public double getTotalCost(){
        double totalCost = 0;

        for(Product product: productsList){
            totalCost += product.getCost();
        }

        return totalCost;
    }

}
