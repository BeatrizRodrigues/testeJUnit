package com.teste.testejunit;

public class Palindrome {
    public static boolean valid_char ( char c ) {

        if ((( c >= 'A') && ( c <= 'Z') ) || (( c >= 'a') && ( c <= 'z') ) ){
            return true;
        } else {
            return false ;
        }
    }

    public static boolean palindrome ( String str ) {

        int i , j , in;
        int n = str.length ();

        for ( i = 0; i < n ; i ++)
            if (! valid_char ( str . charAt ( i ) ) ){
                return false ;
            }

        str = str . toLowerCase () ;

        for ( i = 0 , j = n - 1; i <= j ; i ++ , j--)
            if( str . charAt ( i ) != str . charAt ( j ) )
                return false ;
            return true ;
    }
}
