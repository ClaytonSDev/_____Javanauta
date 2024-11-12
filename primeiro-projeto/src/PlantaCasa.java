public class PlantaCasa {
        //Atributos

        int metragem;
        int numeroQaurtos;
        int numeroBaheiros;
        int vagasDeGaragem;
        String cor;
        String material;

        public void construir(){
            System.out.println("A casa foi construída, as caracteristicas são: ");
            System.out.println("Metragem " + metragem);
            System.out.println("Números de quartos " + numeroQaurtos);
            System.out.println("Números de banheiros " + numeroBaheiros);
            System.out.println("Quantidade vagas de garagem: " + vagasDeGaragem);
            System.out.println("Material " + material);

        }

    public void pintar(){
        System.out.println("A casa foi pintada de " + cor);

    }
}
