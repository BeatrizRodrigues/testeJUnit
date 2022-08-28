package com.teste.testejunit;

public class Sort {
    public static void swap (int x , int y , int [] values ) {
        int aux = values [ x ];
        values [ x ] = values [ y ];
        values [ y ] = aux ;
    }

    public static void bubblesort (int [] values ) {
        for (int i = 0; i < values . length ; i ++) {
            for (int j = values . length - 1; j > i ; j--) {
                if ( values [ j - 1] > values [ j ]) {
                    swap ( j - 1 , j , values ) ;
                }
            }
        }
    }

    public static void sort (int [] values ) {
        bubblesort ( values ) ;
    }
}
