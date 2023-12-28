package exceptions;

public class DivisaoZero {
    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Não foi possível realizar a operação: " + e.getMessage());
        }
    }
}
