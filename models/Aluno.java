package models;

/**
 *
 * @author erik
 */

public class Aluno {

    private int id;
    private String nome;
    private String cidade;
    private char genero;
    private String raca;

    public Aluno(int id, String nome, String cidade, char genero, String raca) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
        this.genero = genero;
        this.raca = raca;
    }

    public Aluno(String nome, String cidade, char genero, String raca) {
        this.nome = nome;
        this.cidade = cidade;
        this.genero = genero;
        this.raca = raca;
    }

    public Aluno() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void imprimirAtributos() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Cidade: " + cidade);
        System.out.println("Genero: " + genero);
        System.out.println("Raca: " + raca);
    }
}
