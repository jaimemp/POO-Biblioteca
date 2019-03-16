/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3_biblioteca;

/**
 *
 * @author fede
 */
import java.util.Scanner;

public class GestionBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
 		int opcion;
		Scanner sc = new Scanner(System.in);
		Biblioteca biblioteca = new Biblioteca();
		Libro libro;
		long isbn;
		
		do{
			//MOSTRAR MENÚ
			System.out.println("#### BIBLIOTECA PALOMERAS ####");
			System.out.println("1. Insertar un libro");
			System.out.println("2. Eliminar un libro");
			System.out.println("3. Buscar un libro");
			System.out.println("4. Mostrar todos los libros");
			System.out.println("5. Libro con el isbn más grande");
			System.out.println("6. Mostrar libros con más de 1000 páginas");
			System.out.println("0. Salir de la aplicación");
			
			//LEER OPCIÓN
			System.out.print("Elige opción: ");
			opcion = sc.nextInt();
			sc.nextLine(); //limpiamos el buffer
			
			//PROCESAR OPCIÓN
			switch(opcion){
				
				case 1:
					libro = new Libro();
					System.out.print("Dame el isbn: ");
					libro.setIsbn(sc.nextLong());
					sc.nextLine();
					System.out.print("Dame el título: ");
					libro.setTitulo(sc.nextLine());
					System.out.print("Dame el dni del autor:");
					libro.getAutor().setDni(sc.nextLine());
					System.out.print("Dame el nombre del autor:");
					libro.getAutor().setNombre(sc.nextLine());
					System.out.print("Dame los apellidos del autor:");
					libro.getAutor().setApellidos(sc.nextLine());
					System.out.print("Dame la edad del autor:");
					libro.getAutor().setEdad(sc.nextInt());
					sc.nextLine();
					System.out.print("Dame la nacionalidad del autor:");
					libro.getAutor().setNacionalidad(sc.nextLine());
					System.out.print("Dame el número de páginas del libro:");
					libro.setPaginas(sc.nextInt());
					sc.nextLine();
					if (biblioteca.insertar(libro)){
						System.out.println("Libro insertado correctamente");
					}
					else{
						System.out.println("Biblioteca llena o libro repetido");
					}
					break;
					
				case 2:
					System.out.println("Dame el isbn");
					isbn = sc.nextLong();
					sc.nextLine();
					if (biblioteca.eliminar(isbn)){
						System.out.println("Libro eliminado correctamente");
					}
					else{
						System.out.println("El libro no está en la biblioteca");
					}
					break;
					
				case 3:
					System.out.println("Dame el isbn");
					isbn = sc.nextLong();
					sc.nextLine();
					if (biblioteca.buscar(isbn)){
						System.out.println("El libro está en la biblioteca");
					}
					else{
						System.out.println("El libro no está en la biblioteca");
					}
					break;
				case 4:
					System.out.println(biblioteca.toString());
					break;
                                      
                                case 5:
                                    System.out.println("El isbn más alto es "+biblioteca.IsbnMasGrande());
                                    System.out.println("Que pertenece al libro:\n"+biblioteca.toStringConcreto(biblioteca.IsbnMasGrande()));
                                    break;
                                
                                case 6:
                                    biblioteca.LibrosMasde100();
                                    break;
                                    
				case 0: 
					System.out.println("Gracias por usar mi biblioteca");
				    break;	
				default:
					System.out.println("Opción incorrecta");
			}
		}while(opcion != 0);
    
    }
    
}

