/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookMamangement;

import java.util.Scanner;
import data.Book;

/**
 *
 * @author SE130032
 */
public class BookManagement {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bName,cName,pName;
        String sku;     
        double price;
        
        Book Book1 = new Book("Lão Hạc", "Nhà sách Minh Thắng", "7484675314809", "Nhà Xuất Bản Văn Học", 38250);
        
        Book Book2 = new Book("Tuyển Tập Truyện Ngắn Vũ Trọng Phụng", "Nhà sách Minh Thắng", "	2517132802542", 
                              "Nhà Xuất Bản Văn Học", 70000);
        
        Book Book3 = new Book("Tắt Đèn (Tái Bản)", "Trí Việt", "5599990343884", "Null", 36400);
        
        Book Book4 = new Book("Vợ Nhặt (Tái Bản)", "Trí Việt", "8255074428683", "Null", 117900);
        
        Book Book5 = new Book("Làm Đĩ (Tái Bản)", "Trí Việt", "	7341463321596", "Null", 36400);
        
        System.out.print("Enter Book name: ");
        bName = sc.nextLine();
        
        System.out.print("Enter Issuing Company: ");
        cName = sc.nextLine();
        
        
        System.out.print("Enter SKU: ");
        sku = sc.nextLine();
        
        System.out.print("Enter Publishing Comany: ");
        pName = sc.nextLine();
        
        System.out.print("Enter price: ");
        price = sc.nextDouble();
        
        Book Book6 = new Book(bName, cName, sku, pName, price);
        
        Book1.printInfo();
        Book2.printInfo();
        Book3.printInfo();
        Book4.printInfo();
        Book5.printInfo();
        Book6.printInfo();
        
    }
}
