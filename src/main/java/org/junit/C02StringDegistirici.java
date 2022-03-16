package org.junit;

/*
    Verilen bir kelimedeki ilk 2 harf icinde A ise bunlari silen method
    AABC=>BC, ABC=>BC
 */
public class C02StringDegistirici {

    public String deleteA(String str){
        if(str.length()<=2){
            return str.replaceAll("A","");
        }
        String initialChars= str.substring(0,2);
        String restofChars = str.substring((2));
        return initialChars.replaceAll("A","") + restofChars;
    }
}
