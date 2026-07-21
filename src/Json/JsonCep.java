package Json;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import ClassRecord.Cep;

public class JsonCep {
    public void salvaJsonCep(List<Cep> ceps) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter("cep.json")) {
            writer.write(gson.toJson(ceps));
        }
    }

}
