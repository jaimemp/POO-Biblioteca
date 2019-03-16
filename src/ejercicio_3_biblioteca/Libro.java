package ejercicio_3_biblioteca;

public class Libro {

    private long isbn;
    private String titulo;
    private Persona autor;
    private int paginas;

    public Libro() {
        this.isbn = 0;
        this.titulo = "";
        this.autor = new Persona();
        this.paginas = 0;
    }

    public Libro(long isbn, String titulo, Persona autor, int paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public boolean equals(Libro l) {

        return (this.isbn == l.isbn && this.titulo.equals(l.titulo)
                && this.autor.equals(l.autor) && this.paginas == l.paginas);
    }

    public String toString() {
        String cad = "Isbn: " + this.isbn + "\nTítulo: " + this.titulo + "\nAutor: " + this.autor
                + "\nNúmero de páginas:" + this.paginas;
        return cad;
    }

}
