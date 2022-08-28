package com.teste.testejunit;

public class Equation {

    public static double [] getRoots ( double a , double b , double c ) {

        double [] roots ;

        if( a == 0){
            throw new IllegalArgumentException () ;
        }

        double delta = ( b * b ) - (4 * a * c ) ;

        if ( delta > 0) {

            roots = new double [2];
            roots [0] = ( - b + Math . sqrt ( delta ) ) / (2 * a ) ;
            roots [1] = ( - b - Math . sqrt ( delta ) ) / (2 * a ) ;

        } else if ( delta == 0) {

            roots = new double [1];
            roots [0] = ( - b / (2 * a ) ) ;

        } else {
            roots = new double [0];
        }

        return roots ;

    }
}
