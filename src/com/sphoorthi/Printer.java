package com.sphoorthi;

public class Printer {
    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if(tonerLevel>0 && tonerLevel<=100){
            this.tonerLevel = tonerLevel;
        }
        else
            this.tonerLevel = -1;
        //this.tonerLevel = tonerLevel;
        this.numberOfPagesPrinted = 0;
        this.duplexPrinter = duplexPrinter;
    }

    public int addToner(int tonerAmount) {
        if(tonerAmount>0 && tonerAmount<=100){
            if(this.tonerLevel + tonerAmount > 100){
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }
        else
            return -1;
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if(duplexPrinter){
            System.out.println("Printing in duplex mode");
            if(pages % 2 == 0){
                pagesToPrint = pages/2;
            }
        }
        this.numberOfPagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

}
