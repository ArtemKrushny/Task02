package by.company.homework.task02;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class Task02 {

    public static void main(String[] args) {

//        Task02_2 arg2 = new Task02_2();
//        arg2.setArray();
//        arg2.getPrint();

        Result result1 = JUnitCore.runClasses( Task02_1.class ) ;
        for (Failure fail : result1.getFailures())
        {
            System.out.println( fail.getMessage() ) ;
        }
        Result result2 = JUnitCore.runClasses( Task02_2.class ) ;
        for (Failure fail : result2.getFailures())
        {
            System.out.println( fail.getMessage() ) ;
        }
    }
}
