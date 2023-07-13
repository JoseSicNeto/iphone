class iPhoneAct implements ReprodutorMusical, AparelhoTelefônico, NavegadorInternet {
 
    public void tocar() {
        System.out.println("Tocando música");
    }

    public void pausar() {
        System.out.println("Pausando música");
    }

    public void selecionarMusica(String música) {
        System.out.println("Selecionando música: " + música);
    }

    public void ligar() {
        System.out.println("Realizando chamada");
    }

    public void atender() {
        System.out.println("Atendendo chamada");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página no navegador");
    }
}

interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String música);
}

interface AparelhoTelefônico {
    void ligar();
    void atender();
    void iniciarCorreioVoz();
}

interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}

public class iPhone {
    public static void main(String[] args) {
        iPhoneAct iphone = new iPhoneAct();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Some Song");

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();


        iphone.exibirPagina("www.iphone.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
