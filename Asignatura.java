public class Asignatura {
    private Alumno[] lista;
    private int contador;

    public Asignatura(int capacidad) {
        lista = new Alumno[capacidad];
        contador = 0;
    }

    public void altaAlumno(Alumno alumno) {
        if (contador < lista.length) {
            lista[contador++] = alumno;
        } else {
            throw new IllegalStateException("No se pueden añadir más alumnos.");
        }
    }

    public void mostrarAlumnos() {
        for (int i = 0; i < contador; i++) {
            System.out.println("Nombre: " + lista[i].getNombre() +
                               ", Nota1: " + lista[i].getNota1() +
                               ", Nota2: " + lista[i].getNota2() +
                               ", Nota3: " + lista[i].getNota3() +
                               ", Promedio: " + lista[i].promedio());
        }
    }

    public double notaMedia() {
        if (contador == 0) return 0;
        double suma = 0;
        for (int i = 0; i < contador; i++) {
            suma += lista[i].promedio();
        }
        return suma / contador;
    }
}