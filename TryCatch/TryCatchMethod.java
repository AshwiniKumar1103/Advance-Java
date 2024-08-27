package TryCatch;

public class TryCatchMethod {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        int [] arr = new int [5];
        try {
             j = 4/i;
             if(j==0){
                throw new ArithmeticException("j is having 0 value");
             }
             System.out.println(arr[6]);
        } catch (ArithmeticException e) {
            System.out.println("error is " + e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Value of j is "+j);
    }
}
