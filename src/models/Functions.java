/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.text.Normalizer;

/**
 *
 * @author james
 */
public class Functions {
    
     public static void Repa(String valor, String letra){
        
        String cadenaNormalize = Normalizer.normalize(valor, Normalizer.Form.NFD);   
        String valor2 = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
        //System.out.println("Resultado: " + valor2);
       //String[] chararray = valor2.split("");
       //String[] valorarray = valor2.split(" ");
       String s= valor2.toLowerCase();
      // System.out.println("Resultado: " + s);
       
       
       int times =0;
       for (int i = 0; i < s.length(); i++){
           if (s.substring(i).startsWith(letra)){
               times++;
           }
       }
      // System.out.print(times);
       frm_start.lbl_rep_A.setText(Integer.toString(times));
       
   }
      public static void Repe(String valor, String letra){
        
        String cadenaNormalize = Normalizer.normalize(valor, Normalizer.Form.NFD);   
        String valor2 = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
      //  System.out.println("Resultado: " + valor2);
       //String[] chararray = valor2.split("");
       //String[] valorarray = valor2.split(" ");
       String s= valor2.toLowerCase();
   //    System.out.println("Resultado: " + s);
       
       
       int times =0;
       for (int i = 0; i < s.length(); i++){
           if (s.substring(i).startsWith(letra)){
               times++;
           }
       }
     //  System.out.print(times);
       frm_start.lbl_rep_E.setText(Integer.toString(times));
       
   }
      
       public static void Repi(String valor, String letra){
        
        String cadenaNormalize = Normalizer.normalize(valor, Normalizer.Form.NFD);   
        String valor2 = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
     //   System.out.println("Resultado: " + valor2);
       //String[] chararray = valor2.split("");
       //String[] valorarray = valor2.split(" ");
       String s= valor2.toLowerCase();
     //  System.out.println("Resultado: " + s);
       
       
       int times =0;
       for (int i = 0; i < s.length(); i++){
           if (s.substring(i).startsWith(letra)){
               times++;
           }
       }
     //  System.out.print(times);
       frm_start.lbl_rep_I.setText(Integer.toString(times));
       
   }
       
        public static void Repo(String valor, String letra){
        
        String cadenaNormalize = Normalizer.normalize(valor, Normalizer.Form.NFD);   
        String valor2 = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
     //   System.out.println("Resultado: " + valor2);
       //String[] chararray = valor2.split("");
       //String[] valorarray = valor2.split(" ");
       String s= valor2.toLowerCase();
     //  System.out.println("Resultado: " + s);
       
       
       int times =0;
       for (int i = 0; i < s.length(); i++){
           if (s.substring(i).startsWith(letra)){
               times++;
           }
       }
     //  System.out.print(times);
       frm_start.lbl_rep_O.setText(Integer.toString(times));
       
   }
        
         public static void Repu(String valor, String letra){
        
        String cadenaNormalize = Normalizer.normalize(valor, Normalizer.Form.NFD);   
        String valor2 = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
      //  System.out.println("Resultado: " + valor2);
       //String[] chararray = valor2.split("");
       //String[] valorarray = valor2.split(" ");
       String s= valor2.toLowerCase();
      // System.out.println("Resultado: " + s);
       
       
       int times =0;
       for (int i = 0; i < s.length(); i++){
           if (s.substring(i).startsWith(letra)){
               times++;
           }
       }
     //  System.out.print(times);
       frm_start.lbl_rep_U.setText(Integer.toString(times));
       
   }
         
         public static void PAR(String valor){
             String[] valorarray = valor.split(" ");
             int sumPar=0;
             int sumImp=0;
             
             
             for (int i = 0; i < valorarray.length; i++){
            String palabra = valorarray[i];
            // System.out.println(palabra);
            int cont = palabra.length();
            //System.out.println(cont);
            
            if (cont % 2 == 0 ){
                sumPar = sumPar + 1;
                
            }else {
                sumImp = sumImp + 1;
            }
            
        }
            
             frm_start.lbl_cantidad_par.setText(Integer.toString(sumPar));
             frm_start.lbl_cantidad_impar.setText(Integer.toString(sumImp));
         }
         
         
    
}
