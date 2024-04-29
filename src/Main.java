public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.setMusica("Throne");
        iphone.atender();
        iphone.atualizarPagina();
        iphone.tocar(iphone.getMusica());
    }
}
