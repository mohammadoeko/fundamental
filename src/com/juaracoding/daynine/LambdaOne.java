package com.juaracoding.daynine;

public class LambdaOne {

    public static void main(String[] args) {
        // (lambda) ->
        Addable addOne = (a, b) -> (a+b);                 // (a, b) merupakan anonymous
        System.out.println(addOne.add(10, 5));      //Functionadd = addable

        Addable addTwo = (int a, int b) -> {        //(a, b) merupakan function anonymous
            return (a+b);
        };
        System.out.println(addTwo.add(20,10));
    }
}
