package com.xworkz.tarun.internal;

public class PDFDocument extends Document {
    @Override
    public void open() {
        System.out.println("Opening PDF in Acrobat Reader...");
    }
    public void sign() {
        System.out.println("Digitally signing the PDF document...");
    }
}