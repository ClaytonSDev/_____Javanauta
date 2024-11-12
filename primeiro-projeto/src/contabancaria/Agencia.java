package contabancaria;

public class Agencia {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria("Clayton", 1800.00);
        System.out.println("O saldo anterior é : " + minhaConta.getSaldo());
        System.out.println("O titular da conta é : " + minhaConta.getTitular());

        minhaConta.setTitular("Clayton Sales");
        minhaConta.setSaldo(minhaConta.getSaldo() + 500);

        String titularConta = minhaConta.getTitular();
        double saldoFinal = minhaConta.getSaldo();

        System.out.println("O saldo final da conta é : " + saldoFinal);
        System.out.println("O titular da conta é : " + titularConta);

        ContaBancaria contaMinhamae = new ContaBancaria("Clotilde");

        contaMinhamae.setTitular("Clotilde Sales");
        contaMinhamae.setSaldo(contaMinhamae.getSaldo() + 500);

        String titularContamae = contaMinhamae.getTitular();
        double saldoFinalmae = contaMinhamae.getSaldo();

        System.out.println("O titular da conta é : " + titularContamae);
        System.out.println("O saldo da conta é : " + saldoFinalmae);


    }
}
