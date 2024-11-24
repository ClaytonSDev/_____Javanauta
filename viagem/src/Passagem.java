import java.time.LocalDate;
import java.time.LocalTime;

public class Passagem {
    private Passageiro passageiro;
    private String origem;
    private String destino;
    private LocalDate data;
    private double valor;
    private String numeroAssento;
    private LocalDate dataIda;
    private LocalTime horarioIda;

    public Passagem(Passageiro passageiro, String origem, String destino, LocalDate data, double valor,
                    String numeroAssento, LocalDate dataIda, LocalTime horarioIda) {
        this.passageiro = passageiro;
        this.origem = origem;
        this.destino = destino;
        this.data = data;
        this.valor = valor;
        this.numeroAssento = numeroAssento;
        this.dataIda = dataIda;
        this.horarioIda = horarioIda;
    }

    // Getters and setters
    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNumeroAssento() {
        return numeroAssento;
    }

    public void setNumeroAssento(String numeroAssento) {
        this.numeroAssento = numeroAssento;
    }

    public LocalDate getDataIda() {
        return dataIda;
    }

    public void setDataIda(LocalDate dataIda) {
        this.dataIda = dataIda;
    }

    public LocalTime getHorarioIda() {
        return horarioIda;
    }

    public void setHorarioIda(LocalTime horarioIda) {
        this.horarioIda = horarioIda;
    }
}
