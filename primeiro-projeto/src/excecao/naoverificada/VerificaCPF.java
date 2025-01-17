package excecao.naoverificada;

import excecao.ConflictException;

import java.util.Scanner;

public class VerificaCPF {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu CPF ");
        String verificaCPF = verificaCPF(scanner.nextLine());
        System.out.println(verificaCPF);
    }

    public static String verificaCPF(String cpf) {
        try {
            if (cpf.equals("21290106878")) {
                throw new ConflictException("CPF já cadastrado" + cpf);
            }
            else {
                return "CPF válido, usuário cadastrado";
            }
        } catch (ConflictException e) {
            throw new ConflictException("CPF já cadastrado " + cpf);
        }
    }
}
