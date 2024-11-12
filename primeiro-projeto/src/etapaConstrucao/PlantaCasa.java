package etapaConstrucao;

public class PlantaCasa implements Construcao {
        //Atributos

        public int metragem;
        public int numeroQaurtos;
        public int numeroBaheiros;
        public int vagasDeGaragem;
        public String cor;
        public String material;

        public void construir(){
            System.out.println("A casa foi construída, as caracteristicas são: ");
            System.out.println("Metragem " + metragem);
            System.out.println("Números de quartos " + numeroQaurtos);
            System.out.println("Números de banheiros " + numeroBaheiros);
            System.out.println("Quantidade vagas de garagem: " + vagasDeGaragem);
            System.out.println("Material " + material);
        }

        //Anotação

    @Override
    public void pintar(String cor) {
            System.out.println("Pintando a casa com a cor " + cor);

    }

    @Override
    public int calcularCustoConstrucao(int custoPorMetro) {
        return metragem + custoPorMetro;
    }

    public void pintar(){
            System.out.println("A casa foi pintada de " + cor);

        }

        public void mudarCorParede(String novaCor){
            cor=novaCor;
            pintar();
            System.out.println("As paredes da casa foi pintada de " + novaCor);
        }

        public int somarMetragem(){
            return metragem * numeroBaheiros + numeroQaurtos;
        }

        public void alterarCaracteristicas(int metros, int quartos, int banheiros, String mat){
            metragem = metros;
            numeroQaurtos = quartos;
            numeroBaheiros = banheiros;
            material = mat;
            construir();
        }
}
