package com.example.demo.services;
import java.time.LocalDate;

public class Fredag {
    public static void main(String[] args) {
        Fredag fredag = new Fredag();
        fredag.friday();
    }
    public String friday(){
        LocalDate date = LocalDate.now();
        int q = date.getDayOfMonth();
        int m = date.getMonthValue();
        int j = date.getYear()/100;
        int k = date.getYear()%100;

        int h = (q + (13*(m+1)/5)+k+(k/4)+(j/4)-2*j)%7;
        double v = Math.floor(h);
        double d = ((v+5)%7)+1;

        if(d == 5.0){
            return "Ja, det er fredag";
        }else{
            return "Nej, det er ikke fredag";
        }


    }
}
