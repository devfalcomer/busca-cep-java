package conexaoApiCep;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

import ClassRecord.Cep;

public class ApiCep {
    public Cep cep(String buscaCep) {
        String endereco = "https://viacep.com.br/ws/" + buscaCep + "/json/";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            Gson gson = new Gson();

            return gson.fromJson(json, Cep.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Não foi possível obter o cep a partir desse numero: " + e.getMessage());
        }
    }

}
