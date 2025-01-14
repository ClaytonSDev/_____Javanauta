package excecao.verificada;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeitorDocumentos {
    public static void main(String[] args) {

        //Identação CTRL + ALT + L

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(
                    new FileReader("C:\\Users\\Clayton\\Desktop\\testetexto.txt"));
            //ler linha por linha
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
