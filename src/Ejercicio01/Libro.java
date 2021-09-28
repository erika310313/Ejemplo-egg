package Ejercicio01;

import java.util.Scanner;


public class Libro {
    
    private Integer isbn;
    private String titulo;
    private String autor;
    private Integer numerosPaginas;

    public Libro(Integer isbn, String titulo, String autor, Integer numerosPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numerosPaginas = numerosPaginas;
    }
    
    public Libro() {
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumerosPaginas() {
        return numerosPaginas;
    }

    public void setNumerosPaginas(Integer numerosPaginas) {
        this.numerosPaginas = numerosPaginas;
    }
    
    
    public void llenarLibro(Libro a){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el código ISBN: ");
        a.setIsbn(leer.nextInt());
        
        System.out.println("Ingrese el título del libro: ");
        a.setTitulo(leer.next());
        
        System.out.println("Ingrese el nombre y apellido del autor del libro: ");
        a.setAutor(leer.next());
        
        System.out.println("Ingrese el número de páginas del libro: ");
        a.setNumerosPaginas(leer.nextInt());
    }

    @Override
    public String toString() {
        return "Libros Cargados: {" + "Código ISBN: " + isbn + ", " + 
                                      "TÍtulo: " + titulo + ", " + 
                                      "Nombre y Apellido del autor: " + autor + ", " +
                                      "Números de Páginas: " + numerosPaginas + '}';
    }
    
    
    
    
    
    /*
    public void mostrarLibro(Libro libro1){
        System.out.println("//*****************\\");
        System.out.println("|| LIBROS CARGADOS ||");
        System.out.println("\\*****************");
        
        System.out.println("Codigo ISBN: " + libro1.getIsbn());
        System.out.println("Título: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Número de páginas: " + libro1.getNumerosPaginas());
    }
    */
         
    
    
    
}


