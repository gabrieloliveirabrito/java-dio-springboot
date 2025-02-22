package dio.primeiros_passos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {
    @Autowired
    private SistemaMensagem sistema;

    @Override
    public void run(String... args) throws Exception {
        sistema.enviarConfirmacaoCadastro();
        sistema.enviarMensagemBoasVindas();
        sistema.enviarConfirmacaoCadastro();
    }
}
