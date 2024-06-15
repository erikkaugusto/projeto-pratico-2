
package models;

import java.util.ArrayList;

/**
 *
 * @author erik
 */
public class Curso {

    private int id;
    private String nome;
    private int qtdeDisciplinas;
    private int duracaoHoras;
    private ArrayList<Aluno> alunos = new ArrayList();

    public Curso(int id, String nome, int qtdeDisciplinas, int duracaoHoras) {
        this.id = id;
        this.nome = nome;
        this.qtdeDisciplinas = qtdeDisciplinas;
        this.duracaoHoras = duracaoHoras;
    }

    public Curso(String nome, int qtdeDisciplinas, int duracaoHoras) {
        this.nome = nome;
        this.qtdeDisciplinas = qtdeDisciplinas;
        this.duracaoHoras = duracaoHoras;
    }

    public Curso() {
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

    public int getQtdeDisciplinas() {
        return qtdeDisciplinas;
    }

    public void setQtdeDisciplinas(int qtdeDisciplinas) {
        this.qtdeDisciplinas = qtdeDisciplinas;
    }

    public int getDuracaoHoras() {
        return duracaoHoras;
    }

    public void setDuracaoHoras(int duracaoHoras) {
        this.duracaoHoras = duracaoHoras;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void addAluno(Aluno a) {
        this.alunos.add(a);
    }
    
    public void removeAluno (Aluno a){
        this.alunos.remove(a);
    }

    public void imprimirAtributos() {
        System.out.println("ID: " + id);
        System.out.println("Nome do curso: " + nome);
        System.out.println("Quantidade de disciplinas: " + qtdeDisciplinas);
        System.out.println("Duração em horas: " + duracaoHoras);
        System.out.println("Alunos atuais: " + alunos.size());
        System.out.println("| Alunos Atuais |");
        for (int i = 0; i < this.alunos.size(); i++) {
            Aluno a = alunos.get(i);
            a.imprimirAtributos();
        }
        System.out.println("");
    }
}
