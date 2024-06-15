package controllers;

import java.util.ArrayList;
import models.Aluno;


/**
 *
 * @author erik
 */
public class AlunoController {

    ArrayList<Aluno> alunos = new ArrayList();
    int serial = 1;

    public void cadastrar(Aluno a) {
        a.setId(serial);
        alunos.add(a);
        serial += 1;
    }

    public void listar() {
        System.out.println("| LISTA DE ALUNOS |");
        for (int i = 0; i < alunos.size(); i++) {
            alunos.get(i).imprimirAtributos();
            System.out.println("");
        }
        System.out.println("| FIM DA LISTA DE ALUNOS |");
    }

    public Aluno listarUm(int id) {
        for (int i = 0; i < alunos.size(); i++) {
            Aluno a = alunos.get(i);
            if (id == a.getId()) {
                return a;
            }
        }
        return null;
    }

    public void deletar(Aluno a) {
        alunos.remove(a);
    }
}
