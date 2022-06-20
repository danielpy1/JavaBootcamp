package com.roshka.bootcamp;

import java.util.Scanner;

public class SmallerNumberSameDigits {

    public static void main(String[] args) {
        Long N=nextSmaller(90707);
        System.out.println("N: "+N);
    }
    public static long nextSmaller(long n)
    {
        StringBuilder numero_auxiliar= new StringBuilder(String.valueOf(n));
        int limit=numero_auxiliar.length();
        boolean b=false;
        Character digito_auxiliar;
        boolean bandera=true;
        while(bandera==true){
            bandera=false;
            for(int i=limit-1;i>0;i--){
                if(i!=1){
                    for(int j=i-1;j>=0;j--){
                        if(Integer.valueOf(numero_auxiliar.charAt(i))<Integer.valueOf(numero_auxiliar.charAt(j))){
                            digito_auxiliar=numero_auxiliar.charAt(j);
                            numero_auxiliar.setCharAt (j, numero_auxiliar.charAt(i));
                            numero_auxiliar.setCharAt (i, digito_auxiliar);
                            b=true;
                            //bandera=true;
                            break;
                        }
                    }
                    if(b){
                        //bandera=true;
                        break;
                    }
                }else{
                    if(Integer.valueOf(String.valueOf(numero_auxiliar.charAt(i)))!=0){
                        if(Integer.valueOf(numero_auxiliar.charAt(i))<Integer.valueOf(numero_auxiliar.charAt(i-1))){
                            digito_auxiliar=numero_auxiliar.charAt(i-1);
                            numero_auxiliar.setCharAt (i-1, numero_auxiliar.charAt(i));
                            numero_auxiliar.setCharAt (i, digito_auxiliar);
                            b=true;
                            //bandera=true;
                            break;
                        }
                    }
                }
            }
        }

        System.out.println(numero_auxiliar);
        if(b==false){
            return -1;
        }else{ return Long.valueOf(numero_auxiliar.toString());}
    }
}
