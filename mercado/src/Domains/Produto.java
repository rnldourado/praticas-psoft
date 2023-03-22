package Domains;
public class Produto{
    private int id;
    private String nome;
    private String fabricante;
    private double preco;


    public Produto(int id, String nome, String fabricante, double preco){
        this.id = id;
        this.nome = nome;
        this.fabricante = fabricante;
        this.preco = preco;
    }

    public int getId() {return this.id;}
}