package herança;

public class Principal {
    public static void main(String[] args) {

        Cachorro caramelo = new Cachorro();
        caramelo.latir();
        caramelo.comer("Ração");

        Galinha gertrudez = new Galinha();
        gertrudez.ciscar();
        gertrudez.beberAgua();
        gertrudez.comer("Grão de milho");

    }
}
