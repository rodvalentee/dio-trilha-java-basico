public class Iphone implements Navegador, AppTelefone, ReprodutorMusica{
    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Telefone atendido.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atualizada.");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Musica selecionada.");
    }

    @Override
    public void pausar() {
        System.out.println("Pause...");
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.exibirPagina();
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();

        System.out.println("");

        iphone.atender();
        iphone.ligar();
        iphone.iniciarCorreioVoz();

        System.out.println("");

        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();

    }
}
