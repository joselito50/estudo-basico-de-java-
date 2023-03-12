package edu.basico.tipo_variaveis;

public class operador_ternairo {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        String res = "";
/* 
        if(a < b)
            res ="Verdadeiro";
        else
            res = "falso";
        
            System.out.println(res);
        */
        res =(a < b)? "verdadeiro":"false";
        System.out.println(res);
    }
}
