package exceptions.Senha;

public class SenhaInvalidaException extends Exception {
    @Override
    public String getMessage() {
        return "Senha inválida, a senha deve possuir pelo menos 8 caracteres";
    }
}
