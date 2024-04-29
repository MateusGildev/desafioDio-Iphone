import repositories.Internet;
import repositories.ReprodutorMusical;
import repositories.Telefone;

import java.util.Scanner;

public class Iphone implements ReprodutorMusical, Telefone, Internet {
    Scanner ler = new Scanner(System.in);
    private String musica;
    private ReprodutorMusical reprodutorMusical;
    private Telefone telefone;
    private Internet internet;

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    @Override
    public void tocar(String musica) {
        System.out.println("Tocando: " + musica);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Digite o nome da musica: ");
        setMusica(ler.nextLine());
        System.out.println("Musica: " + getMusica() + " selecionada!");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("atendendo....");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina...");
    }

    @Override
    public void addNewPage() {
        System.out.println("Adicionando pagina...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina...");
    }
}
