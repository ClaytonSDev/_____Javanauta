package polimorfismo;

public class Principal {

    public static void main(String[] args) {

        int sabaoPo = 1;
        int mamao = 2;
        double sabonete = 2.50;
        double arroz = 5.90;
        Integer batata = 6;
        Integer cenoura = 7;
        Integer melancia = 5;

        int total = Calculadora.somar(sabaoPo, mamao);
        System.out.println("Total da compra : R$ " + total);
        double totalDouble = Calculadora.somar(sabonete, arroz);
        System.out.println("Total da compra : R$ " + totalDouble);
        Integer totalInteger = Calculadora.somar(batata, cenoura, melancia);
        System.out.println("Total da compra : R$ " + totalInteger);
        System.out.println("--------------------------");
        System.out.println("Total geral : R$ " + total + totalDouble);

        Carro fusca = new Carro();
        fusca.mover();



    }
}
