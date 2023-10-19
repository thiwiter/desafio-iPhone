package model;

import model.imports.aparelhoTelefonico;
import model.imports.navegadorInternet;
import model.imports.reprodutorMusical;

public class iPhone implements aparelhoTelefonico, navegadorInternet, reprodutorMusical {

    public iPhone() {
        System.out.println("iniciar iphone...");
    }

    @Override
    public void ligar() {
        System.out.println("ligar");
    }

    @Override
    public void atender() {
        System.out.println("atender");
    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("iniciar correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("exibir página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("adicionar nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizar página");
    }

    @Override
    public void tocar() {
        System.out.println("tocar");
    }

    @Override
    public void pausar() {
        System.out.println("pausar");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("selecionar música");
    }
}
