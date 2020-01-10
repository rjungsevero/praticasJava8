import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Curso {

    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAlunos() {
        return alunos;
    }

    public void setAlunos(int alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", alunos=" + alunos +
                '}';
    }
}

class ExemploCursos {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparingInt(Curso::getAlunos));

        cursos.forEach(System.out::println);
        cursos.forEach(c -> System.out.println(c.getNome()));

        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .map(Curso::getAlunos)
                .forEach(System.out::println);

        int qtd = cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .mapToInt(Curso::getAlunos)
                .sum();
        System.out.println(qtd);

        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .findAny()
                .ifPresent(c -> System.out.println(c.getNome()));

        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .collect(Collectors.toMap(Curso::getNome, Curso::getAlunos))
                .forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos."));

        List<Curso> cursosComCemAlunosOuMais = cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .collect(Collectors.toList());

        OptionalDouble mediaAlunos =  cursos.stream()
                .mapToInt(Curso::getAlunos)
                .average();
        System.out.println(mediaAlunos);

        System.out.println(cursosComCemAlunosOuMais);
    }
}
