/*
4. Să se determine cmmdc a două numere naturale, a căror valoare maximă este 30. Numerele
vor fi generate aleatoriu cu ajutorul unui obiect de tip Random și metodei nextInt();
 */

package Exercitiul2;

import java.util.Random;

public class MainApp
{
    public static void main(String[] args)
    {
        Random random = new Random();

        int nr1 = random.nextInt(30) + 1;
        int nr2 = random.nextInt(30) + 1;

        System.out.println("Nr1: " + nr1);
        System.out.println("Nr2: " + nr2);

        int a = nr1;
        int b = nr2;
        while (b != 0)
        {
            int save = b;
            b = a % b;
            a = save;

        }

        System.out.println("CMMDC pentru numarul " + nr1 + " si " + nr2 + " este: " + a);
       /* //calcul CMMDC
        while(nr2!=0)
        {
            int save=nr2;
            nr2=nr1%nr2;
            nr1=save;
        }
        return nr1;*/
    }
}
