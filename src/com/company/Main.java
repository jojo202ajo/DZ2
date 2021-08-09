package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {
	// write your code here

         int NUM = 7;
         if (NUM  < 0)
             System.out.println(" вы сохранили отрицательное число");
             if (NUM > 0)
                 System.out.println("вы сохранили положителное число");
             else
                 System.out.println("вы сохранили ноль");
    }
}
