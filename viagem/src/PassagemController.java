import java.util.ArrayList;
import java.util.List;

public class PassagemController {
    private List<Passagem> passagens;

    public PassagemController() {
        passagens = new ArrayList<>();
        listarPassagens();
    }

    public void adicionarPassagem(Passagem passagem) {
        passagens.add(passagem);
    }

    public void listarPassagens() {
        for (Passagem p : passagens) {
            System.out.println("Passageiro: " + p.getPassageiro().getNome());
            System.out.println("CPF: " + p.getPassageiro().getCpf());
            System.out.println("Origem: " + p.getOrigem());
            System.out.println("Destino: " + p.getDestino());
            System.out.println("Data: " + p.getData());
            System.out.println("Valor: " + p.getValor());
            System.out.println("Número do Assento: " + p.getNumeroAssento());
            System.out.println("Data Ida: " + p.getDataIda());
            System.out.println("Horário Ida: " + p.getHorarioIda());
            System.out.println("Passagem adicionada com sucesso!");
            System.out.println("--------------------------------");
        }
    }
}

