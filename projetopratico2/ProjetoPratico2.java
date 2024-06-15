package projetopratico2;

import controllers.AlunoController;
import controllers.CursoController;
import controllers.UsuariosController;
import models.Aluno;
import models.Curso;
import models.Usuarios;
import resources.Entrada;

/**
 *
 * @author erik
 */
public class ProjetoPratico2 {

    public static void main(String[] args) {

        AlunoController aController = new AlunoController();
        CursoController cController = new CursoController();
        UsuariosController uController = new UsuariosController();

        int opcao = 0;
        while (opcao != 99) {
            opcao = Entrada.leiaInt(""
                    + "[1] Cadastrar aluno\n"
                    + "[2] Listar alunos\n"
                    + "[3] Consultar aluno\n"
                    + "[4] Deletar aluno\n"
                    + "[5] Cadastrar curso\n"
                    + "[6] Listar cursos\n"
                    + "[7] Consultar curso\n"
                    + "[8] Deletar curso\n"
                    + "[9] Cadastrar usuario\n"
                    + "[10] Listar usuários\n"
                    + "[11] Consultar usuários\n"
                    + "[12] Deletar usuário\n"
                    + "[13] Adicionar alunos a um curso\n"
                    + "[14] Remover alunos de um curso\n"
                    + "[99] Sair");

            if (opcao == 1) { // Cadastrar aluno
                Aluno a = new Aluno();
                a.setNome(Entrada.leiaString("Informe o nome do aluno: "));
                a.setCidade(Entrada.leiaString("Informe o nome da cidade: "));
                a.setGenero(Entrada.leiaChar("Informe o genero [M/F]: ")); // BUG DO GENERO
                a.setRaca(Entrada.leiaString("Informe a raca do aluno: "));
                aController.cadastrar(a);

            } else if (opcao == 2) { // Listar alunos
                aController.listar();

            } else if (opcao == 3) { // Consultar aluno
                Aluno a = aController.listarUm(Entrada.leiaInt("Informe o ID do aluno: "));
                if (a != null) {
                    a.imprimirAtributos();
                } else {
                    Entrada.leiaString("Nenhum aluno com esse ID foi encontrado!");
                }
            } else if (opcao == 4) { // Deletar aluno
                Aluno a = aController.listarUm(Entrada.leiaInt("Informe o ID do aluno: "));
                if (a != null) {
                    aController.deletar(a);
                } else {
                    Entrada.leiaString("Nenhum aluno com esse ID foi encontrado!");
                }

            } else if (opcao == 5) { // Cadastrar curso
                Curso c = new Curso();
                c.setNome(Entrada.leiaString("Informe o nome do curso: "));
                c.setQtdeDisciplinas(Entrada.leiaInt("Informe a quant. de disciplinas do curso: "));
                c.setDuracaoHoras(Entrada.leiaInt("Informe a duracao em horas do curso: "));
                cController.cadastrar(c);

            } else if (opcao == 6) { // Listar cursos               
                cController.listar();

            } else if (opcao == 7) { // Consultar curso
                Curso c = cController.listarUm(Entrada.leiaInt("Informe o ID do curso: "));
                if (c != null) {
                    c.imprimirAtributos();
                } else {
                    Entrada.leiaString("Curso com esse ID nao encontrado!");
                }

            } else if (opcao == 8) { // Deletar curso
                Curso c = cController.listarUm(Entrada.leiaInt("Informe o ID do curso: "));
                if (c != null) {
                    cController.deletar(c);
                } else {
                    Entrada.leiaString("Nenhum curso com esse ID foi encontrado!");
                }

            } else if (opcao == 9) { // Cadastrar Usuários 
                Usuarios u = new Usuarios();
                u.setNome(Entrada.leiaString("Informe o nome do usuario: "));
                u.setEmail(Entrada.leiaString("Informe o email do usuario: "));
                u.setSenha(Entrada.leiaString("Informe a senha do usuario: "));
                u.setFuncao(Entrada.leiaString("Informe a funcao do usuario: "));
                uController.cadastrar(u);

            } else if (opcao == 10) { // Listar Usuários 
                uController.listar();

            } else if (opcao == 11) { // Consultar Usuários 
                Usuarios u = uController.listarUm(Entrada.leiaInt("Informe o ID do usuario"));
                if (u != null) {
                    u.imprimirAtributos();
                } else {
                    Entrada.leiaInt("ID do usuario nao encontrado");
                }

            } else if (opcao == 12) { // Deletar Usuário
                Usuarios u = uController.listarUm(Entrada.leiaInt("Informe o ID do usuario"));
                if (u != null) {
                    uController.deletar(u);
                } else {
                    Entrada.leiaString("Nenhum aluno com esse ID foi encontrado!");
                }

            } else if (opcao == 13) { // Atribuir alunos a um curso
                aController.listar();
                cController.listar();
                Curso c = cController.listarUm(Entrada.leiaInt("Digite o codigo do curso que deseja atribuir alunos"));

                if (c != null) {

                    char continuar = 'c';
                    while (continuar == 'c') {

                        cController.listar();
                        Aluno a = aController.listarUm(Entrada.leiaInt("Digite o codigo do aluno que deseja adicionar"));

                        if (a != null) {
                            c.addAluno(a);
                        } else {
                            System.out.println("Aluno nao encontrado");
                        }

                        continuar = Entrada.leiaChar("Deseja adicionar mais um aluno? [s / n]");
                    }
                }
            } else if (opcao == 14) { // Remover alunos de um curso
                aController.listar();
                cController.listar();
                Curso c = cController.listarUm(Entrada.leiaInt("Digite o código do curso que deseja remover alunos"));

                if (c != null) {

                    char continuar = 'c';
                    while (continuar == 'c') {

                        cController.listar();
                        Aluno a = aController.listarUm(Entrada.leiaInt("Digite o código do aluno que deseja remover"));

                        if (a != null) {
                            c.removeAluno(a);
                        } else {
                            System.out.println("Aluno nao encontrado");
                        }

                        continuar = Entrada.leiaChar("Deseja remover mais um aluno? [s / n]");
                    }
                }
            } else if (opcao == 99) {

                System.out.println("Finalizando...");

            } else {
                System.out.println("Atencao, digite um valor valido!");
            }
        }
        System.exit(0);
    }
}
