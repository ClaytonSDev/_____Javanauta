public class OperadoresAritmeticos {

    public static void main(String[] args) {

        double pao = 9.50;
        double queijo = 7.00;
        double acucar = 1.00;
        double desconto = 5.00;
        int totalDiasDoMes = 30;

        double valorTotal = pao + queijo + acucar;
        double valorTotalComDesconto = valorTotal - desconto;
        double valorTotalDividido = valorTotalComDesconto / 2;
        double valorTotalMensal = valorTotalComDesconto * totalDiasDoMes;

        System.out.println("Valor Total: R$ " + valorTotal);
        System.out.println("Total com desconto a pagar: " + valorTotalComDesconto);
        System.out.println("Dividido por dois: " + valorTotalDividido);
        System.out.println(("Total gasto mensal: " + valorTotalMensal));


    }
}
