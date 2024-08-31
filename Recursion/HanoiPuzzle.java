package Recursion;

class HanoiPuzzle {
    
    public void hanoi(int n, char source, char destination, char aux){
        if(n == 1){
            System.out.println(source + " -> " + destination);
            return;
        }

        hanoi(n-1, source, aux, destination);
        System.out.println(source + " -> " + destination);
        hanoi(n-1, aux, destination, source); 
    }
}

class HanoiApplication{
    public static void main(String[] args) {
        HanoiPuzzle h1 = new HanoiPuzzle();
        h1.hanoi(3, 'A', 'C', 'B');
    }
}
