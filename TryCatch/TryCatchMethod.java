package TryCatch;

class MyException extends Exception {
    public MyException(String ErrMsg) {
        super(ErrMsg);
    }
}

public class TryCatchMethod {
    public static void main(String[] args) {
        int i = 20;
        int j = 10;
        int[] arr = new int[5];
        try {
            j = j / i;
            if (j == 0) {
                throw new MyException("j is having 0 value");
            }
            System.out.println(arr[6]);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Value of j is " + j);
    }
}
