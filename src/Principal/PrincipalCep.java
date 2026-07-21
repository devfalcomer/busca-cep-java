package Principal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ClassRecord.Cep;
import Json.JsonCep;
import conexaoApiCep.ApiCep;

public class PrincipalCep {
    public static void main(String[] args) throws IOException {
        Scanner leitura = new Scanner(System.in);
        String buscaCep = "";

        List<Cep> ceps = new ArrayList<>();
        ApiCep apiCep = new ApiCep();

        System.out.println("Digite um Cep para busca: ");
        buscaCep = leitura.nextLine();

        try {
            Cep cep = apiCep.cep(buscaCep);
            System.out.println(cep);

            ceps.add(cep);

            JsonCep geradorJson = new JsonCep();
            geradorJson.salvaJsonCep(ceps);

            System.out.println("Arquivo 'ceps.json' gerado com sucesso!");
        } catch (IllegalArgumentException e) {
            System.out.println("O cep informado é invalido: " + e.getMessage());
        }
    }
}
