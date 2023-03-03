package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate data;

    public Mentoria() {
        
    }
    public Mentoria(String titulo, String descricao, LocalDate data){
        setTitulo(titulo);
        setDescricao(descricao);
        this.data = data;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXP(){
        return XP_PADRAO + 20;
    }

    @Override
    public String toString() {
        return "\nTítulo: " + getTitulo()
             + "\nDescrição: " + getDescricao()
             + "\nData: " + data;
    }

}
