package day02;

public class Mathematics {
    boolean isPrime(int number){
        if (number == 1) return false;
        for(int i = 2; i <= number / 2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Mathematics prim = new Mathematics();
        for (int i = 2; i < 50; i++) {
            System.out.println(i);
            System.out.println(prim.isPrime(i));
        }
    }

}
