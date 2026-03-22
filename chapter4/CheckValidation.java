package chapter4;

public class CheckValidation {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

public static void main(String[] args){
       int num =6;
        if (isEven(num)) {
            System.out.println("Valid Data");
        }
else{
    System.out.println("Invalid Data");
}
    }

}
