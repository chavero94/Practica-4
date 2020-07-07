import java.util.*;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Arrays;

public class Cola 
{
private int Cima,Inicio,Final;
private String[]Col;
public Cola()
{
    Cima=100;
    Inicio=0;
    Final=0;
    Col=new String[Cima+1];
    
}
public Cola(int MAXI)
{
    this.Cima=MAXI;
    Inicio=0;
    Final=0;
    Col=new String[Cima+1];
}
public void Agregar()
{
    if(this.ColaLlena())
    {
        System.out.println("\n Esta llena");
    }
    else
    {
        String Datos;
        Scanner teclado=new Scanner(System.in);
        System.out.println("\n Escriba un nombre");
        Datos=teclado.nextLine();
        if(Datos.length()>6||Datos.length()<4)
        {
            System.out.println("\n Verifique sus datos");
        }
        else 
        {
            Final++;
            Col[Final]=Datos;
        }
    }
}

public void Eliminar()
{
    if(Inicio==Final)
    {
        System.out.println("\n La cola esta vacia");
    }
    else
    {
        for(int i=Inicio;i<Final-1;i++)
        {
            Col[i]=Col[i];
        }
        Final--;
    }
}
public void Mostrar()
{
    if(ColaVacia())
    {
        System.out.println("\n La cola esta vacia");
    }
    else
    {
        String Mostrar="";
        for(int i=Inicio+1;i<=Final;i++)
        {
            Mostrar=Mostrar+Col[i]+"\n";
        }
        System.out.println("Los nombres son: \n "+Mostrar);
    }
}

public boolean ColaLlena()
{
    if(Final==Cima)
    {
        return true;
    }
    else
    {
        return false;
    }
}

public boolean ColaVacia()
{
    if(Inicio==Final)
    {
        return true;
    }
    else 
    { 
        return false;
    }
}
    public static Cola COLA;
    
    public static void main(String[] args) 
    {
        int tam;
        Scanner teclado=new Scanner(System.in);
       
        System.out.println("\n De que tamaño es la cola");
      
        tam=teclado.nextInt();
        COLA=new Cola(tam);
        
        int opcion;
        do
        {
            
            System.out.println("\n 1.-Ingresa nombres");
            System.out.println("\n 2.-Mostrar nombres");
            System.out.println("\n 3.-Eliminar Nombres");
            System.out.println("\n 4.-Salir");
            System.out.println("\n");
            opcion=teclado.nextInt();
            switch(opcion)
            {
                case 1:
                {
                   
                    COLA.Agregar();
                    System.out.println("\n");
                }
                break;
                case 2:
                {
                   
                    COLA.Mostrar();
                    System.out.println("\n");
                }
                break;
                case 3:
                {
                    
                    COLA.Eliminar();
                    System.out.println("\n");
                }
            }
        }
        while(opcion!=4);
    }
    
}
