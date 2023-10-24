package com.xpanxion.assignments.student;

import java.text.NumberFormat;
import java.util.*;
import java.util.stream.Collectors;

public class JavaTwo {
    public Scanner sc = new Scanner(System.in);
    private List<Person> personList = new ArrayList<Person>();
    private HashMap<Integer, Person> personHashMap = new HashMap<>();
    public JavaTwo(){

    }

    public void ex1(){
        String personInfo = "";
        do{
            System.out.print("Enter person: ");
            personInfo = sc.nextLine();
            if(personInfo.equals("done")) break;

            String[] info = personInfo.split("[, ]");
            personList.add(new Person(Integer.parseInt(info[0]), info[2], info[3]));

        } while (!personInfo.equals("done"));

        for(Person p: personList){
            System.out.println(p.toString());
        }
    }

    public void ex2(){
        personHashMap.put(1,new Person(1,"Peter", "Jones"));
        personHashMap.put(2,new Person(2,"John", "Smith"));
        personHashMap.put(3,new Person(3,"Mary", "Jane"));

        String idRequested = "";
        do{
            System.out.print("Enter Person ID: ");
            idRequested = sc.nextLine();
            if(idRequested.equals("done")) break;

            System.out.println(personHashMap.get(Integer.parseInt(idRequested)));

        } while (!idRequested.equals("done"));

    }

    public void ex3(){
        var invoice = new Invoice(1);
        invoice.addProduct(new Product(111, "Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup",3.00));
        invoice.addProduct(new Product(333,"Franks Hot sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCompactNumberInstance();
        System.out.println("Total cost: $" + formatter.format(invoice.getTotalCost()));
    }

    public void ex4(){
        var invoice = new Invoice(1);
        invoice.addProduct(new Product(111, "Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup",3.00));
        invoice.addProduct(new Product(333,"Franks Hot sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCompactNumberInstance();
        System.out.println("Total cost: $" + formatter.format(invoice.getTotalCost()));
    }

    public void ex5(){
        var repository = new Repository();
        var p = repository.getPerson();
        System.out.println(p);
    }

    public void ex6(){
        String choice = "";
        Calculator calc = new Calculator();
        do {
            System.out.print("Enter first number: ");
            String fn = sc.nextLine();
            if(fn.equals("done")) break;
            int firstNumber = Integer.parseInt(fn);

            System.out.print("Enter second number: ");
            int secondNumber = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter operation (add, sub, mul, div): ");
            choice = sc.nextLine();

            switch (choice) {
                case "add": {
                    calc.addCalculation(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
                    System.out.println("Result: " + (firstNumber + secondNumber));
                    break;
                }
                case "sub": {
                    calc.addCalculation(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
                    System.out.println("Result: " + (firstNumber - secondNumber));
                    break;
                }
                case "mul": {
                    calc.addCalculation(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
                    System.out.println("Result: " + (firstNumber * secondNumber));
                    break;
                }
                case "div": {
                    calc.addCalculation(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
                    System.out.println("Result: " + (firstNumber / secondNumber));
                    break;
                }
            }
        } while(!choice.equals("done"));

        calc.printPastCalculations();
    }

    public void ex7(){
        var personList = Arrays.asList(
                new Person(1, "Peter", "Jones"),
                new Person(2, "John", "Smith"),
                new Person(3, "Sue", "Anderson")
        );

        personList.stream().map(person -> person.setAndGetLastName("xxx")).collect(Collectors.toList());

        for(Person p: personList){
            System.out.println(p);
        }
    }


}
