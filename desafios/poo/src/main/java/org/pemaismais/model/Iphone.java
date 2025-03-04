package org.pemaismais.model;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    @Override
    public void ligar(String numero) {
        System.out.printf("\nIphone está ligando para %s \n", numero);
    }

    @Override
    public void atender() {
        System.out.println("Iphone atendeu a ligação!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iphone iniciou o correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.printf("\nIphone exibindo a pagina %s \n", url);
    }

    @Override
    public void adicionarNovaAba() {
            System.out.println("Iphone adicionou uma nova aba!");
    }

    @Override
    public void AtualizarPagina() {
        System.out.println("Iphone atualizou a pagina!");
    }

    @Override
    public void tocar() {
        System.out.println("Iphone está tocando a musica selecionada!");
    }

    @Override
    public void pausar() {
        System.out.println("Iphone pausou a musica!");

    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.printf("\n Iphone selecionou a musica %s\n", musica);

    }
}
