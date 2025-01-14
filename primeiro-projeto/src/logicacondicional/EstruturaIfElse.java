public class EstruturaIfElse {
    public static void main(String[] args) {

//        int idade = 30;
//
//        if (idade >= 18) {
//            System.out.println("Você é maior de idade");
//        } else {
//            System.out.println("Você é menor de idade");
//        }

//        boolean estaChovendo =true;
//
//        if(!estaChovendo){
//            System.out.println("Vamos sair para passear");
//        }
//        else {
//            System.out.println("Vamos ficar em casa");
//        }

        boolean temDinheiro = false;
        boolean temCartao = true;

//        if(temDinheiro && temCartao) {
//            System.out.println("Pede um ifood e um Zé delivery");
//        }
//        else if (temDinheiro || temCartao) {
//            System.out.println("Pede um ifood");
//        }
//        else {
//            System.out.println("Não pede nada");
//        }
//      expressão ternaria
        // uma maneira de fazer o if else simplificado
        String mensagem = (temDinheiro) ? "Pede um ifood" : "Come o que tem em casa";
        System.out.println(mensagem);

                }

    }

