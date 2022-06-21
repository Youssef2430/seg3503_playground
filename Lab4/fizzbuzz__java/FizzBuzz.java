import java.util.ArrayList;

public class FizzBuzz {
    
    public FizzBuzz() {
    }

    public ArrayList<String> fizzbuzz(){
        return fizzbuzz(1,100);
    }

    public ArrayList<String> fizzbuzz(int start, int end){
        ArrayList<String> result =  new ArrayList<String>();
        for(int i = start; i < end+1; i++){
            result.add(fizzbuzz(i));
        }
        return result;

    }

    public String fizzbuzz(int n){
        if(n%3 == 0 && n%5 == 0){
            return "FizzBuzz";
        }
        if(n%3 == 0){
            return "Fizz";
        }
        if(n%5 == 0){
            return "Buzz";
        }
        return String.valueOf(n);

    }
}
