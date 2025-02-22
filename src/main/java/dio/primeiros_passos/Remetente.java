package dio.primeiros_passos;

import com.google.gson.Gson;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("remetente")
public class Remetente {
    public String nome, email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
