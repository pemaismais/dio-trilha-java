package org.pemaismais;

import org.pemaismais.model.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.selecionarMusica("musica boazuda");
        iphone.tocar();
        iphone.pausar();

        iphone.exibirPagina("www.youtube.com");
        iphone.AtualizarPagina();
        iphone.adicionarNovaAba();

        iphone.atender();
        iphone.ligar("303071405");
        iphone.iniciarCorreioVoz();
    }
}