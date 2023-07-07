package com.javarush.task.task18.task1828;



import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Прайсы 2
*/

public class Solution {
    public static class Product {
        int id;
        String productName, price, quantity;
        public Product(int id, String productName, String price, String quantity)
        {
            this.id = id;
            this.productName=productName;
            this.price=price;
            this.quantity=quantity;
        }

        public String toString(){
            return String.format("%-8d%-30s%-8s%-4s", id, productName, price, quantity);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        List<Product> products = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        Product pre;
        while (bufferedReader.ready()){
            pre = getProduct(bufferedReader.readLine());
            products.add(pre);
        }

        switch (args[0]) {
            case "-u":
            int id=Integer.parseInt(args[1]);

            String productName = args[2];
            if(args.length>5) {
                for (int i = 3; i < args.length - 2; i++) {
                    productName = productName + " " + args[i];
                }
            }
            if(productName.length()>30) productName=productName.substring(0,30);

            String price = args[args.length-2];
            if(price.length()>8) price=price.substring(0,8);

            String quantity = args[args.length-1];
            if(quantity.length()>8) quantity=quantity.substring(0,8);
            Product product1=null;
            for (Product product:products) {
                if(product.id == id){
                     product1 = product;
                }
            }
            if(product1!=null){
            product1.productName=productName;
            product1.quantity=quantity;
            product1.price=price;}
            break;
            case "-d":
                id = Integer.parseInt(args[1]);
                for (Product product : products
                     ) {
                    if(product.id==id) products.remove(product);
                }
                break;

        }
        FileWriter fileWriter = new FileWriter(filename);
        for (Product product : products) {
            fileWriter.write(product.toString());
            fileWriter.write("\n");
        }
        fileWriter.close();
        bufferedReader.close();
    }

    public static Product getProduct(String string) {
        String id = string.substring(0, 8).trim();
        String name = string.substring(8, 38).trim();
        String price = string.substring(38, 46).trim();
        String quantity = string.substring(46, 50).trim();
        return new Product(Integer.parseInt(id), name, price, quantity);
    }
}
