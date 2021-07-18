/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;


/**
 *
 * @author SE130032
 */
public class Book {
    private String bName; // Book name
    private String cName; // Company name
    private String sku;
    private String pName; // Publishing company
    private double price;
    
    public Book(String iBName,String iCName, String iSku,String iPName,
               double iPrice){
        this.bName = iBName;
        this.cName = iCName;
        this.pName = iPName;
        this.sku   = iSku;
        this.price = iPrice;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }
    
    public void printInfo(){
        System.out.println("===============================");
        System.out.println("Book Name: "+bName);
        System.out.println("Price: "+price);
        System.out.println("Issuing company: "+cName);
        System.out.println("SKU: "+sku);
        System.out.println("Publishing Comany: "+pName);
    }
}
