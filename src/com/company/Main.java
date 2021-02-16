package com.company;

public class Main {

    public static void main(String[] args) {

            int [] array = {10, 20, 30, 40, 50};
            int [] result = {20,30,40,50,10};
            int [] array2 = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                System.out.print(" " + array[i]);
            }
        System.out.println(" ");
        for (int i = 0; i < array.length; i++) {
            if (i!= 0){
                array2[i] = array[i-1];
            }else {
                array2[0] = array[array.length - 1];
            }

        }
            for (int i = 0; i < array2.length; i++) {
                System.out.print(" " + array2[i]);
            }

        System.out.println(" ");

            int buffer = array[0];
            int current = array[0];
            int previuce = array[array.length-1];
        for (int i = 0; i < array.length; i++) {
            array[i] = previuce;  // Заменяем текущий елемент на его предыдущий
            // готовим привиус и карент для следущего цикла!
            previuce = current;     // в следущем цикле тот что был карент станет привиусом

            // в следующем цикле, карентом стпнет следующий елемент і + 1
            // Но не для смаого, для которого (і) ленгс - 1
            if (i < array.length-1){
                current = array[i + 1];
            }
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(" " + array[i]);
        }
    }
}
