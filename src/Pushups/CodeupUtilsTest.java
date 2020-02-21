package Pushups;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CodeupUtilsTest {
    private ArrayList<Integer> intList;

    @Before
    public void setup() {
        intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
    }

    @Test
    public void testFindAddends () {
        ArrayList<IndexPair> resultLists;
        resultList = Pushups.findAddends(intList, 5);
        IndexPair ip = new IndexPair(0, 3);
        AssertTrue(resultList.contains(ip));
    }
}
