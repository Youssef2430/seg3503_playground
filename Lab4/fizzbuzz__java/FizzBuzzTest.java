import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class FizzBuzzTest {
    
    //Tests 1,2,3,4 are going to pass and tests 5 and 6 are going to fail
    @Test
    public void test(){
        FizzBuzz test = new FizzBuzz();
        assertEquals("Buzz", test.fizzbuzz(5));
    }

    @Test
    public void test2(){
        FizzBuzz test = new FizzBuzz();
        assertEquals("Fizz", test.fizzbuzz(3));
    }

    @Test
    public void test3(){
        FizzBuzz test = new FizzBuzz();
        assertEquals("FizzBuzz", test.fizzbuzz(15));
    }

    @Test
    public void test4(){
        FizzBuzz test = new FizzBuzz();
        ArrayList<String> result =  new ArrayList<String>();
        result.add("2");
        result.add("Fizz");
        result.add("4");
        result.add("Buzz");
        assertEquals(result, test.fizzbuzz(2,5));
    }

    @Test
    public void test5(){
        FizzBuzz test = new FizzBuzz();
        assertEquals("Fizz", test.fizzbuzz(5));
    }

    @Test
    public void test6(){
        FizzBuzz test = new FizzBuzz();
        assertEquals("Buzz", test.fizzbuzz(3));
    }
    
}
