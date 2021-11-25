package SalarioCalculo;

import java.util.Scanner;

/*
    @author Camilo Andres Garcia Zambrano
    Clase emplementada para pedir y almacenar los datos que provienen del usuario
    @version 20/11/2021
*/
public class Pedir_datos {
    private Double salario_t = 0.0;
    private Docente[] docentes;
    private int cantidad_docentes;
    
    public void entrar_datos(){
        //se crean variables
        Scanner entrada = new Scanner(System.in);
        int opcion;
        //se piden cantidad de docentes
        System.out.println("\nDigite cantidad de docentes a registrar: ");
        cantidad_docentes = entrada.nextInt();
        docentes = new Docente[cantidad_docentes];
        //bucle para registrar docentes
        for(int i=0;i<cantidad_docentes;i++) {
            //Se indica en que docente va
            System.out.println("Docente "+(i+1));
            //bucle para validar tipo de dato
            do {
                    //se pregunta nivel de estudio
                    System.out.println("\nNivel de estudio: 1)Doctorado\t2)Maestria\t3)Espesialisaci�n\t4)Sin postgrado");
                    System.out.println("Opcion: ");
                    opcion = Integer.parseInt(entrada.next());
                    if(opcion>4||opcion<1) {
                            System.out.println("Opcion invalida.");
                    }
            }while(opcion>4||opcion<1);
            //se calcula segun opcion, se crea tipo de docente en especifico y se almacena en array
            switch (opcion) {
            case 1:
                    Docente docente_d = new Doctorado();
                    docentes[i] = docente_d;
                    break;
            case 2:
                    Docente docente_m = new Maestria();
                    docentes[i] = docente_m;
                    break;
            case 3:
                    Docente docente_e = new Espesializacion();
                    docentes[i] = docente_e;
                    break;
            case 4:
                    Docente docente_s_p = new S_Postgrado();
                    docentes[i] = docente_s_p;
                    break;
            }
            //se piden datos
            docentes[i].pedir_datos();
            //se pregunta tip de contratación
            docentes[i].tipo_contratacion();
            salario_t += docentes[i].getSalario();
        }
    }
    void mostrar_datos(){
        System.out.println("\nMostrando informacion de docentes:");
        //se muestran docentes e información
        for(int i=0;i<cantidad_docentes;i++) {
                System.out.println("");
                docentes[i].mostrar_datos();
        }
    }

    public Double getSalario_t() {
        return salario_t;
    }

    public void setSalario_t(Double salario_t) {
        this.salario_t = salario_t;
    }

    public Docente[] getDocentes() {
        return docentes;
    }

    public void setDocentes(Docente[] docentes) {
        this.docentes = docentes;
    }

    public int getCantidad_docentes() {
        return cantidad_docentes;
    }

    public void setCantidad_docentes(int cantidad_docentes) {
        this.cantidad_docentes = cantidad_docentes;
    }
}
