package Ejercicio7_8_9;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Eje {
    public void cero(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduci texto a dar vuelta:");
        String texto = scanner.nextLine();
        System.out.println(new StringBuilder(texto).reverse().toString());
    }
    public void one(){
        String [] uni = {"Hola","chau","chaurrrr","que onda"};
        for(int i=0; i<uni.length;i++){
            System.out.println(uni[i]);
        }


    }
    public void two(){
        int [][] bid = {{0,1,2,3,4,5,6,7},{3,2,24,4,5}};
        for(int i=0; i<bid.length;i++){
            for (int j=0; j<bid[i].length;j++){
                System.out.println(bid[i][j]);
        }}


    }
    public void three(){
        Vector<String> vector = new Vector();
        vector.add("Hola");
        vector.add("chau");
        vector.add("chaurrrr");
        vector.add("que paso");
        vector.add("que miras bobo");
        System.out.println(vector);
        vector.remove(1);
        vector.remove(2);
        System.out.println(vector);
        System.out.println("El problema de crear un vector con su tamano por defecto y agregarle 1000 elementos es que este va a generar un proceso costoso para la cpu, y que va copiando los arrays hasta llegar al tamano deseado");

    }
    public void four() {
        ArrayList<String> tres = new ArrayList();
        tres.add("Hola");
        tres.add("chau");
        tres.add("chaurrrr");
        LinkedList<String> trev2 = new LinkedList(tres);
        System.out.println("Array: " + tres);
        System.out.println("List" + trev2);


    }
    public void five () {
        ArrayList<Integer> cinco = new ArrayList();
        for (int i = 0; i < 10; i++) {
            cinco.add(i);
        }
        for (int j = 0; j < cinco.toArray().length; j++) {
            if (cinco.get(j) %2 ==0){
                cinco.remove(j);

            }else {
                System.out.println(cinco.get(j));
            }
        }

    }


    public static void six(int a,int b) throws ArithmeticException {
        try {
            int c = a/b;
        }catch (ArithmeticException e){
        throw new ArithmeticException();
    }}

    public static void seven()throws FileNotFoundException, IOException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre del fichero a ser copiado: ");
        String fileIn = scanner.nextLine();
        System.out.println("Nombre del fichero nuevo: ");
        String fileOut = scanner.nextLine();



        try {
            InputStream fich = new FileInputStream(fileIn);
            byte [] data = fich.readAllBytes();
            fich.close();
            PrintStream fichCopia = new PrintStream(fileOut);
            fichCopia.write(data);
            fichCopia.close();
        } catch (Exception e) {
            System.out.println("Hubo Error: " + e.getMessage());
        }

    }

//    public void archives (File folder) {
//        ArrayList<String> archivesArr = new ArrayList<>();
//        for (File arch : folder.listFiles()){
//            if (!arch.isDirectory()){
//                archivesArr.add(arch.getName());
//            }
//        }
//        System.out.println(archivesArr);
//    }

    public static void main(String[] args) throws FileNotFoundException {
        Eje eje = new Eje();
        eje.cero();
        eje.one();
        eje.two();
        eje.three();
        eje.four();
        eje.five();
        try {
            six(4,0);
        }catch (Exception e){
            System.out.println("Esto no puede hacerse");

            try {
                eje.seven();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

        }
        //eje.archives(new File("/home/IdeaProjects"));





}}
