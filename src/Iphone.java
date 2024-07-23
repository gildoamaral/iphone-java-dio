public class Iphone {
    private boolean tocandoMusica = false;
    private boolean emChamada = false;
    private boolean navegandoInternet = false;

    public void tocarMusica() {
        if (!tocandoMusica) {
            tocandoMusica = true;
            System.out.println("Iphone começou a tocar uma música");
        } else
            System.out.println("Música já está tocando");
    }

    public void pausarMusica() {
        if (tocandoMusica) {
            tocandoMusica = false;
            System.out.println("Musica pausada");
        } else
            System.out.println("Música não está tocando");
    }

    public void selecionarMusica() {
        System.out.println("Você selecionou uma música");

        if (!tocandoMusica)
            tocandoMusica = true;
    }

    public void ligar() {
        System.out.println("Você está ligando para alguém");
        emChamada = true;
        if (tocandoMusica)
            tocandoMusica = false;
    }

    public void atender() {
        if (!emChamada) {
            System.out.println("Você atendeu uma ligação");
            emChamada = true;
        } else {
            System.out.println("Você não pode atender uma ligação enquanto finalizar a outra");
        }
    }

    public void iniciarCorreioVoz() {
        if (emChamada) {
            System.out.println("correio de voz iniciado");
        } else
            System.out.println("você não pode iniciar correio de voz sem estar em ligação");
    }

    public void exibirPagina() {
        if (emChamada)
            System.out.println("impossível navegar enquanto em ligação");
        else {
            System.out.println("exibindo pagina de internet");
            navegandoInternet = true;
        }
    }

    public void adicionarNovaAba() {
        if (navegandoInternet)
            System.out.println("adicionando nova aba ao navegador");
        else {
            System.out.println("comece a navegar antes");
        }
    }

    public void atualizarPagina() {
        if (navegandoInternet)
            System.out.println("atualizando a pagina atual");
        else {
            System.out.println("comece a navegar antes");
        }
    }
}
