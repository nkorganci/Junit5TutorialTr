package org.junit;

import java.util.Arrays;

// Check if two arrays contain same elements, order is not problem.
public class C03ArraysEqual {

    public boolean diziKiyasla(Object[] a, Object[] b){
        Arrays.sort(a);
        Arrays.sort(b);

       return Arrays.equals(a,b);    }

}
