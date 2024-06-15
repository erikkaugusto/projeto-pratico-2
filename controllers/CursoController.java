package controllers;

import java.util.ArrayList;
import models.Curso;

/**
 *
 * @author erik
 */
public class CursoController {

    ArrayList<Curso> cursos = new ArrayList();
    int serial = 1;

    public void cadastrar(Curso c) {
        c.setId(serial);
        cursos.add(c);
        serial += 1;
    }

    public void listar() {
        System.out.println("| IMPRIMINDO CURSOS |");
        for (int i = 0; i < cursos.size(); i++) {
            cursos.get(i).imprimirAtributos();
            System.out.println("");
        }
    }

    public Curso listarUm(int id) {
        for (int i = 0; i < cursos.size(); i++) {
            Curso c = cursos.get(i);
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    public void deletar(Curso c) {
        cursos.remove(c);
    }
}
