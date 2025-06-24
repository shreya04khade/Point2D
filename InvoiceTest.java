package com.app.geometry;


public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("A123", "Ram", 5, 9.99);
        Invoice invoice2 = new Invoice("B456", "Neha", -10, -0.5);

        System.out.println("Invoice 1:");
        System.out.println("Part Number: " + invoice1.getPartNumber());
        System.out.println("Description: " + invoice1.getPartDescription());
        System.out.println("Quantity: " + invoice1.getQuantity());
        System.out.println("Price per item: " + invoice1.getPricePerItem());
        System.out.println("Total: " + invoice1.getInvoiceAmount());

        System.out.println();

        System.out.println("Invoice 2:");
        System.out.println("Part Number: " + invoice2.getPartNumber());
        System.out.println("Description: " + invoice2.getPartDescription());
        System.out.println("Quantity: " + invoice2.getQuantity());
        System.out.println("Price per item: " + invoice2.getPricePerItem());
        System.out.println("Total: " + invoice2.getInvoiceAmount());
    }
}
