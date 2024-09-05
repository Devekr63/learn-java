package org.example;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(boolean duplex){
        tonerLevel = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        int calculatedTonerLevel = tonerAmount+tonerAmount;
        if(calculatedTonerLevel > 100 || calculatedTonerLevel < 0){
            return -1;
        }
        return calculatedTonerLevel;
    }

    public int printPages(int pages){
        if(duplex){
            System.out.println("It's a duplex printer.");
            pagesPrinted+=2*pages;
            return 2*pages;
        }
        pagesPrinted+=pages;
        return pages;
    }
}
