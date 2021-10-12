package by.company.homework.task02;

import org.junit.*;
import java.util.Random;
import static org.junit.Assert.*;

public class Task02_2 {
    private int[][] mas;

    public Task02_2() {
        mas = new int[4][4];
    }

    public void setArray() {
        Random random = new Random();
        for (int j = 0; j < mas[0].length; j++) {
            mas[0][j] = random.nextInt(10);
        }
        for (int i = 1; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = (int) Math.pow(mas[0][j], i + 1);
            }
        }
    }

    public void  getPrint() {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("%3d ", mas[i][j]);
            }
            System.out.println();
        }
    }

    @Test
    public void Test() {
        boolean isValid = true;
//        mas[1][1] = -1;  //специально установить ошибку, для проверки
        for (int i = 0; i < mas.length - 1 ; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if  ( mas[i][j] * mas[i][j] != mas[i+1][j])
                {
                    isValid = false;
                }
        }
        }
        assertTrue( this.getClass().getName( ) + " тест провален ", isValid );
    }
}
