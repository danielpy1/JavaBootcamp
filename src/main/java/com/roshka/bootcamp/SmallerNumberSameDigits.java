package com.roshka.bootcamp;

public class SmallerNumberSameDigits {
//    public static void main(String[] args) {
//        System.out.println(nextSmaller(21));
//        System.out.println(nextSmaller(907));
//        System.out.println(nextSmaller(531));
//        System.out.println(nextSmaller(1027));
//        System.out.println(nextSmaller(441));
//        System.out.println(nextSmaller(123456798));
//    }
    public static long nextSmaller(long n) {
        String numero_principal=String.valueOf(n);
        StringBuilder principal_copia;
        String numero_auxiliar="";
        int longitud_principal=numero_principal.length();
        int longitud_secundaria;
        boolean controlador=true;
        boolean auxiliar;
        while(controlador){
            if(n<=0){
                controlador=false;
                n=-1;
            }else{
                principal_copia=new StringBuilder(numero_principal);
                n--;
                numero_auxiliar=String.valueOf(n);
                longitud_secundaria=numero_auxiliar.length();
                if(longitud_secundaria==longitud_principal){
                    for(int i=0;i<numero_auxiliar.length();i++){
                        auxiliar=false;
                        for(int j=0;j<numero_principal.length();j++){
                            if(numero_auxiliar.charAt(i)==principal_copia.charAt(j)){
                                principal_copia.setCharAt(j,'*');
                                auxiliar=true;
                                break;
                            }
                        }
                        if(!auxiliar){
                            controlador=false;
                        }
                        if(controlador==false){
                            break;
                        }
                    }
                    if(controlador==true){
                        n=Long.valueOf(numero_auxiliar);
                        controlador=false;
                    }else{
                        controlador=true;
                    }
                }else{
                    controlador=false;
                    n=-1;
                }
            }
        }
        return n;
    }
}
