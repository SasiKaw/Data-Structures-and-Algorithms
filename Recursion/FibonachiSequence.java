package Recursion;

class FibonachiSequence {
    
    public static int fibo(int value){
        if(value == 1){
            return 1;
        }

        return value * fibo(value - 1);
    }

}


class FibpApplication{
    public static void main(String[] args) {
        System.out.println(FibonachiSequence.fibo(5));
    }
}