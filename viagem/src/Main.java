import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Passageiro e Passagem
        Passageiro passageiro1 = new Passageiro(
                "João Silva",
                "123.456.789-00");
        Passagem passagem1 = new Passagem(
                passageiro1,
                "São Paulo",
                "Rio de Janeiro",
                LocalDate.now(),
                300.50,
                "12B",
                LocalDate.now(),
                LocalTime.of(
                        10, 30));

        Passageiro passageiro2 = new Passageiro(
                "Clayton Sales",
                "123.456.789-00");
        Passagem passagem2 = new Passagem(
                passageiro2,
                "São Paulo",
                "Rio de Janeiro",
                LocalDate.now(),
                300.50,
                "11B",
                LocalDate.now(),
                LocalTime.of(
                        10, 30));

        // Adicionando e listando passagens
        PassagemController controller = new PassagemController();
        controller.adicionarPassagem(passagem1);
        controller.adicionarPassagem(passagem2);
        controller.listarPassagens();
    }
}
