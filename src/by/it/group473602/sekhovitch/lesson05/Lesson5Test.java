package by.it.group473602.sekhovitch.lesson05;

import by.it.a_khmelev.lesson05.A_QSort;
import by.it.a_khmelev.lesson05.B_CountSort;
import by.it.a_khmelev.lesson05.C_QSortOptimized;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class Lesson5Test {
    @Test
    public void A() throws Exception {
        String root = System.getProperty("user.dir") + "/src/";
        InputStream stream = new FileInputStream(root + "by/it/a_khmelov/lesson05/dataA.txt");
        by.it.a_khmelev.lesson05.A_QSort instance = new A_QSort();
        int[] result=instance.getAccessory(stream);
        boolean ok=Arrays.equals(result,new int[]{1,0,0});
        assertTrue("A failed", ok);
    }


    @Test
    public void B() throws Exception {
        String root = System.getProperty("user.dir") + "/src/";
        InputStream stream = new FileInputStream(root + "by/it/a_khmelov/lesson05/dataB.txt");
        B_CountSort instance = new B_CountSort();
        int[] result=instance.countSort(stream);
        boolean ok=Arrays.equals(result,new int[]{2,2,3,9,9});
        assertTrue("B failed", ok);
    }


    @Test
    public void C() throws Exception {
        String root = System.getProperty("user.dir") + "/src/";
        InputStream stream = new FileInputStream(root + "by/it/a_khmelov/lesson05/dataC.txt");
        C_QSortOptimized instance = new C_QSortOptimized();
        int[] result=instance.getAccessory2(stream);
        boolean ok=Arrays.equals(result,new int[]{1,0,0});
        assertTrue("C failed", ok);
    }

}
