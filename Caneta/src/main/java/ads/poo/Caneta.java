package ads.poo;

class Caneta {

    private String cor;
    private double nivelTinta;
    private boolean aberta;
    private int definirDesenho;

    public void definirCor (String nomeCor) {
        cor = nomeCor;
    }

    public String obterCor () {
        return cor;
    }

    public void definirNivelTinta (double numNivel) {
        nivelTinta = ((numNivel >= 0) && (numNivel <= 100) ? numNivel : -1);
    }

    public double obterNivelTinta () {
        return nivelTinta;
    }

    public void abrirFechar() {
        aberta = !aberta;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void tamanhoDesenho (int numTamanho) {
        definirDesenho = numTamanho;
    }

    public int numTamDesenho () {
        return definirDesenho;
    }

    public String obterDesenho () {
        String linha;
        String erro = "Não foi possivel desenhar";
        int cont = 0;

        if (isAberta() && nivelTinta >= 10 && definirDesenho >= 10) {
            if (nivelTinta >= definirDesenho) {
                while (definirDesenho >= 10) {
                    cont++;
                    definirDesenho = (definirDesenho - 10);
                }
            } else {
                while (nivelTinta >= 10) {
                    cont++;
                    nivelTinta = (nivelTinta - 10);
                }
            }
            linha = "-".repeat(cont);
        } else {
            return erro;
        }
        return linha;
    }
}
