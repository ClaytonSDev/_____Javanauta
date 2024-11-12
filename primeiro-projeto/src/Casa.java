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

    }
}
