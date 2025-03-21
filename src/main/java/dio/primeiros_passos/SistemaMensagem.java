package dio.primeiros_passos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SistemaMensagem {
    @Autowired
    private Remetente noreply;

    @Autowired
    private Remetente techTeam;

    @Value("${teste}")
    private String teste;

    @Value("${valores}")
    private List<Integer> valores;

    public void enviarConfirmacaoCadastro() {
        System.out.println(noreply);
        System.out.println("Seu cadastro foi aprovado");
        System.out.println(teste);
        System.out.println(valores);
    }

    public void enviarMensagemBoasVindas() {
        techTeam.setEmail("tech@dio.com.br");
        System.out.println(techTeam);
        System.out.println("Bem-vindo à Tech Elite");
    }
}
