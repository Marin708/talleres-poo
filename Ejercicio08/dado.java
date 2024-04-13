package Ejercicio08;

import java.util.Random;

public class dado {
    public static void main(String[] args) {
        Random numdado= new Random();
        int die=1 + numdado.nextInt(6);
        int die1=1 + numdado.nextInt(6);
        int sum= die+die1;
        System.out.println(die);
        System.out.println(die1);
        System.out.println(sum);
        switch (sum){
            
        }

    }
}
