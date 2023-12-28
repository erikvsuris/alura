package exceptions.Senha;

public class App {
    public static void main(String[] args) {
        try {
            String senha = "1234567";
            if (senha.length() < 8)
                throw new SenhaInvalidaException();
        } catch (SenhaInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}
