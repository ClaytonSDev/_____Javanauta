package etapaConstrucao;

public class Casa {
    public static void main(String[] args) {
        // criando o objeto casa
        PlantaCasa casa = new PlantaCasa();


        //Inicializando os atributos (variaveis) (caracteristicas) casa
        casa.numeroBaheiros = 2;
        casa.numeroQaurtos = 3;
        casa.metragem = 70;
        casa.vagasDeGaragem = 2;
        casa.material = "Tijolos";
        casa.cor = "Cinza";


        //Chamada da função (metódo) da ordem;
        casa.construir();

        casa.pintar();

        casa.mudarCorParede("branco");

        casa.alterarCaracteristicas(100, 2, 2, "madeira");

        int resultado = casa.somarMetragem();
        System.out.println(resultado + " Metros quadrados de construção");

        PlantaCasa casaVizinho = new PlantaCasa();
        casaVizinho.metragem = 200;
        casaVizinho.material = "Alvenaria";
        casaVizinho.numeroBaheiros = 1;
        casaVizinho.numeroQaurtos = 1;
        casaVizinho.cor = "Amarela";

        casaVizinho.construir();
        casaVizinho.pintar();

    }
}
