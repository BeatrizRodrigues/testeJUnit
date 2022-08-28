package com.teste.testejunit;

public class MaxMin {

    public static int maximum (int [] values ) {
        int max = values [0];

        for(int i = 1; i < values . length ; i ++){
            if ( max < values [ i ]){
                max = values [ i ];
            }
        }
        return max ;
    }

    public static int minimum (int [] values ) {
        int min = values [0];
        for (int i = 1; i < values . length ; i ++){
            if ( min > values [ i ]){
                min = values [ i ];
            }
        }

        return min ;
    }

    public static int [] maxmin (int [] values ) throws
            IllegalArgumentException {
        if ( values . length == 0)
            throw new IllegalArgumentException () ;
        else {
            int [] maxmin = new int [2];
            maxmin [0] = maximum ( values ) ;
            maxmin [1] = minimum ( values ) ;
            return maxmin ;
        }
    }
}
