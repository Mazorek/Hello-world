/*****
Jeffrey Li
 ******/
public class GitDemo {
    
    private double previousNumber;
    private double reverseNum;
    public GitDemo() {
        previousNumber = 1;
    }
    
    /*****
     * This function should add 'num' to 'previousNumber' and return the sum.
    *****/
    public double addNumber(double num) {
        double newNum = 0;
        newNum = num + previousNumber;
        System.out.print("Add num to previousNumber");
        return newNum;
    }
    
    /*****
     * This function should calculate the factorial of 'num' and return the resulting value.
     * i.e. if num = 4,
     *  the function will return the value of (1 * 2 * 3 * 4)
     *****/
    public double findFactorial(int num) {
        double factorialNumber = 1;
        reverseNum = factorialNumber;
        for(int i = 1; i <= num; ++i){
            factoralNumber = factorialNumber * i;
        }
        
        return factorialNumber;
    }
    
    /*****
     * This function should reverse 'num' and return the resulting value.
     * i.e. if num = 1234
     *  the function will return 4321
     *****/
    public double reverseNumber(int num){
         double newNum = 0;
        
        while( num != 0 ) {
            double temp = num % 10;
            newNum = newNum * 10 + temp;
            num /= 10;
        }
        return newNum;
       
    }
    
}
