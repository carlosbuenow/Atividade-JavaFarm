package br.com.joaocarloslima;

public class Cenoura {
    private int tamanho = 1;
    private int tempoDeVida = 1;
    private int tempoDeCrescimento = 2;

    public void crescer() {
        tempoDeVida++;
        if (tempoDeVida % tempoDeCrescimento == 0 && tamanho < 4) {
            tamanho++;
        }
    }

    public boolean podeColher() {
        return tamanho == 4;
    }

    public String getImagem() {
        return "images/cenoura" + tamanho + ".png";
    }

    public int getTamanho() { return tamanho; }
    public int getTempoDeVida() { return tempoDeVida; }
    public int getTempoDeCrescimento() { return tempoDeCrescimento; }
}