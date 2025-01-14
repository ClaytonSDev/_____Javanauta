import java.util.Locale;

public class TrabalhandoComStrings {
    public static void main(String[] args) {

        String nome = "Clayton";
        String sobrenome = " Sales";
        String nomeDois = "Clayton";

        int tamanhoString = nome.length();
        boolean saoIguais = nome.equals(nomeDois);
        String nomeCompleto = nome.concat(sobrenome);

        System.out.println("Olá " + nome.toLowerCase() + " Seja bem vindo");
        System.out.println("Seu nome tem " + tamanhoString + " caracteres");
        System.out.println("Os nomes são iguais: " + saoIguais);
        System.out.println("Nome completo: " + nomeCompleto);
    }
}
