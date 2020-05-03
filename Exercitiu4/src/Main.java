public class Main {

    //Se da un text:
    //Sa se numere toate cuvintele care au lungimea mare decar 2, contin caracterul "i" si caract "i" se afla pe o pozitie para

    //Matei


    public static void main(String[] args){

        String text = "Obiectul istoriei nu se limiteaza doar la evenimentele politice, cum ar fi de exemplu bataliile sau faptele";


        int numarCuvinte = numereCuvinte(text);
        System.out.println("Numarul de cuvinte este " + numarCuvinte);
    }



    public static int numereCuvinte(String text){

        int numarCuvinte=0;
        String[] cuvinte = text.split(" ");
        for(int cursor = 0; cursor < cuvinte.length; cursor++){
            if(cuvinte[cursor].length() >2 && cuvinte[cursor].contains("i") && cuvinte[cursor].indexOf("i") % 2 == 0){
                numarCuvinte++;
            }

        }

        return numarCuvinte;

    }
}
