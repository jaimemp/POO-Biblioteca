package ejercicio_3_biblioteca;

public class Biblioteca {

    private static final int N = 10;
    private Libro[] libros;
    private int numLibros;

    public Biblioteca() {
        int i;
        libros = new Libro[N];
        for (i = 0; i < libros.length; i++) {
            libros[i] = new Libro();
        }
        numLibros = 0;
    }

    public Biblioteca(Libro[] libros, int cont) {
        this.libros = libros;
        this.numLibros = cont;
    }

    public Libro[] getLibros() {
        return libros;
    }

    public void setLibros(Libro[] libros) {
        this.libros = libros;
    }

    public int getCont() {
        return numLibros;
    }

    public void setCont(int cont) {
        this.numLibros = cont;
    }

    public static int getN() {
        return N;
    }

    public boolean equals(Biblioteca biblioteca) {

        boolean iguales = true;
        int i = 0;

        if (this.numLibros != biblioteca.numLibros) {
            return false;
        }

        while (iguales && i < this.numLibros) {
            if (!this.libros[i].equals(biblioteca.libros[i])) {
                iguales = false;
            } else {
                i++;
            }
        }
        return iguales;
    }

    public String toString() {
        String cad = "";
        int i;
        for (i = 0; i < this.numLibros; i++) {
            cad += libros[i].toString();
        }
        return cad;
    }

    /*Devuelve true si el libro está en la biblioteca
	  Devuelve false si el libro no está en la biblioteca*/
    public boolean buscar(long isbn) {
        int i = 0;
        boolean enc = false;

        //No voy hasta N porque es un "array de tamaño variable"
        while (!enc && i < numLibros) {
            if (isbn == libros[i].getIsbn()) {
                enc = true;
            } else {
                i++;
            }
        }
        return enc;
    }

    private int buscarPos(long isbn) {
        int i = 0;
        boolean enc = false;

        //No voy hasta N porque es un "array de tamaño variable"
        while (!enc && i < numLibros) {
            if (isbn == libros[i].getIsbn()) {
                enc = true;
            } else {
                i++;
            }
        }
        if (i < numLibros) {
            return i;
        } else {
            return -1;
        }
    }

    public boolean insertar(Libro libro) {

        /*Si tengo espacio en la biblioteca y no hay otro libro
		  con ese mismo código isbn*/
        if (numLibros < N && !buscar(libro.getIsbn())) {
            libros[numLibros] = libro;
            numLibros++;
            return true;
        }
        return false;
    }

    public boolean eliminar(long isbn) {

        /*Si existe un libro con ese isbn en la biblioteca lo borro
		  en caso contrario no hago nada*/
        int pos = buscarPos(isbn);
        if (numLibros != 0 && pos != -1) {
            for (int i = pos; i < numLibros - 1; i++) {
                libros[i] = libros[i + 1];
            }
            numLibros--;
            return true;
        }
        return false;
    }

    public long IsbnMasGrande() {
        long isbnMayor = libros[0].getIsbn();

        for (int i = 0; i < libros.length; i++) {
            if (libros[i].getIsbn() > isbnMayor) {
                isbnMayor = libros[i].getIsbn();
            }
        }
        return isbnMayor;
    }

    public String toStringConcreto(long isbn) {
        String cad = "";
        int i;
        for (i = 0; i < this.numLibros; i++) {
            if (isbn == libros[i].getIsbn()) {
                cad += libros[i].toString();
            }
        }
        return cad;
    }

    public void LibrosMasde100() {
        String cad = "";
        for (int i = 0; i < this.numLibros; i++) {
            if (libros[i].getPaginas() > 1000) {
                cad = cad + "Identidicador: " + libros[i].getIsbn() + "\nNúmero de páginas: " + libros[i].getPaginas() + "\n";
            }
        }
        System.out.println(cad);
    }
}
