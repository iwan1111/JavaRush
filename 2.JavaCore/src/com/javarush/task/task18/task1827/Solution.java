package com.javarush.task.task18.task1827;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        if (args.length == 0) return;
        if(args[0].equals("-c")){

            BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
            FileWriter fileWriter = new FileWriter(fileName);
            String string = new String();


            List<Product> nf = new ArrayList<Product>();

            while (fileReader.ready()){
                nf.add(getProduct(fileReader.readLine()));
            }
            int maxid = 0;
            for (Product product : nf) {
                if (product.id > maxid) maxid = product.id;
            }
            maxid++;

            String name = "";
            for (int i = 1; i < args.length - 2; i++) {
                name += args[i] + " ";
            }
            if (name.length() > 30) {
                name = name.substring(0, 30);
            }



            String price = args[args.length - 2];
            if (price.length() > 8) {
                price = price.substring(0, 8);
            }

            String qstr = args[args.length - 1];
            if (qstr.length() > 4) {
                qstr = qstr.substring(0, 4);
            }

            Product pr = new Product(maxid,name,price,qstr);

            fileWriter.write("\n");
            fileWriter.write(pr.toString());

            fileReader.close();
            fileWriter.close();
        }
        else return;


    }
    public static class Product{
        int id;
        String productName;
        String price;
        String quantity;
        public Product(int id, String productName, String price, String quantity){
            this.id = id;
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }
        public String toString(Product product){
            return String.format("%-8d%-30s%-8s%-4s", id,productName, price, quantity);
        }
    }

    public static Product getProduct(String s){
        int id = Integer.parseInt(s.substring(0,8).trim());
        String productName = s.substring(8,38).trim();
        String price = s.substring(38, 46).trim();
        String quantity = s.substring(46, 50).trim();
        return new Product(id, productName,price,quantity);
    }
}
