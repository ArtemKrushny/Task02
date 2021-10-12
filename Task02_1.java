package by.company.homework.task02;

import org.junit.*;
import java.util.Random;
import static org.junit.Assert.*;

public class Task02_1 {
    private int[] array;

    public Task02_1( )
    {

    }

    @Before
    public void Before( )
    {
        array = new int[5];
        setArray();
    }

    private void setArray() {
        Random random = new Random();
        for (int i=0; i<this.array.length; i++){
            this.array[i] = random.nextInt(10);
        }
    }

    public void deleteSecondElement() {
        for (int i = 0; i < this.array.length; i += 1) {
                if ( i % 2 == 1 )
                {
                    this.array[i] = 0;
                }
        }
    }

    public String getPrint() {
        String buff = "";
        for (int i = 0; i < this.array.length; i++) {
            buff += " " + this.array[i] ;
        }
        return buff ;
    }
}
