package com.sphoorthi;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(50,false);
        System.out.println("Initial pages printed are: "+printer.getNumberOfPagesPrinted());
        int numberOfPagesPrinted = printer.printPages(3);
        System.out.println("Pages printed was "+ numberOfPagesPrinted +
                " new total print count for printer = "+printer.getNumberOfPagesPrinted());
        numberOfPagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was "+ numberOfPagesPrinted +
                " new total print count for printer = "+printer.getNumberOfPagesPrinted());
    }
}
