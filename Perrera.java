// Uniersidad del Valle de Guatemala
// Luis Alberto Cordón Salguero
// 221071
// 7 de Agosto del 2022
// Laboratorio 1
import java.util.InputMismatchException;
import java.util.Scanner;
public class Perrera{
    public static void main(String[] args){
        //
        Persona p = new Persona();
        Perro2 uno = new Perro2();
        //Menú
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while (!salir){
            System.out.println("1) Nueva persona");
            System.out.println("2) Nuevo perro");
            System.out.println("3) Sacar galleta");
            System.out.println("4) Interactuar");
            System.out.println("5) Salir");
            try{
                System.out.println("Introduce un número: ");
                opcion = sn.nextInt();
                switch(opcion){
                    case 1:
                        p = new Persona();
                        System.out.println("se ha cambiado la persona");
                        break;
                    case 2:
                        uno = new Perro2();
                        System.out.println("se ha cambiado el perro");
                        break;
                    case 3:
                        if (p.getDarGalleta()==true){
                            System.out.println("*le da una galleta*");
                        }
                        break;
                    case 4:
                        if (uno.getMorder()<uno.getUmbral()){
                            System.out.println("*le muerde*");
                        }   
                        if(uno.getLadrar()>uno.getUmbral() && uno.getLadrar()<0){
                            System.out.println("*ladra*");
                        }
                        if(uno.getMoverLaCola()>0){
                            System.out.println("*mueve la cola*");
                        }
                        break;
                    case 5:
                        salir=true;
                        break;
                    default:
                        System.out.println("las opciones son entre 1 y 5");
                }
            }catch(InputMismatchException e){
                System.out.println("Debes introducir un número");
                sn.next();
            }
        }
        System.out.println("Feliz día :D");
    }
}