package br.com.joaocarloslima;

public class Celeiro {
    private int capacidade = 100;
    private int qtdeBatatas = 5;
    private int qtdeCenouras = 3;
    private int qtdeMorangos = 1;

    public void armazenarBatata() {
        if (getEspacoDisponivel() < 2) {
            throw new RuntimeException("Celeiro está cheio!");
        }
        qtdeBatatas += 2;
    }

    public void armazenarCenoura() {
        if (getEspacoDisponivel() < 2) {
            throw new RuntimeException("Celeiro está cheio!");
        }
        qtdeCenouras += 2;
    }

    public void armazenarMorango() {
        if (getEspacoDisponivel() < 2) {
            throw new RuntimeException("Celeiro está cheio!");
        }
        qtdeMorangos += 2;
    }

    public void consumirBatata() {
        if (qtdeBatatas <= 0) {
            throw new RuntimeException("Não há batatas no celeiro!");
        }
        qtdeBatatas--;
    }

    public void consumirCenoura() {
        if (qtdeCenouras <= 0) {
            throw new RuntimeException("Não há cenouras no celeiro!");
        }
        qtdeCenouras--;
    }

    public void consumirMorango() {
        if (qtdeMorangos <= 0) {
            throw new RuntimeException("Não há morangos no celeiro!");
        }
        qtdeMorangos--;
    }

    public int getEspacoDisponivel() {
        return capacidade - (qtdeBatatas + qtdeCenouras + qtdeMorangos);
    }

    public double getOcupacao() {
        return (double) (qtdeBatatas + qtdeCenouras + qtdeMorangos) / capacidade;
    }

    public boolean celeiroCheio() {
        return getEspacoDisponivel() == 0;
    }

    public int getQtdeBatatas() { return qtdeBatatas; }
    public int getQtdeCenouras() { return qtdeCenouras; }
    public int getQtdeMorangos() { return qtdeMorangos; }
    public int getCapacidade() { return capacidade; }
}