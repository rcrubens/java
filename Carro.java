package conceitos;

import java.util.Scanner;

public class Carro {

    private Boolean chave = true;

    public Carro() {
        setChave(true);
    }

    public Carro(Boolean chave) {
        setChave(chave);
    }

    private void setChave(Boolean status) {
        this.chave = status;
    }

    private Boolean getChave() {
        return this.chave;
    }

    public void ligar() {
        setChave(true);
        System.out.println("###Ligado###");
    }

    public void desligar() {
        setChave(false);
        System.out.println("###Desligado###");
    }

    protected void finalize() {
        chave = null;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Carro novoCarro = new Carro();

        System.out.println("Digite 1 para ligar \n 2 para desligar");
        int opcao = scn.nextInt();

        switch (opcao) {
            case 1:
                novoCarro.ligar();
                break;
            case 2:
                novoCarro.desligar();
                break;
        }
    }
}
    
