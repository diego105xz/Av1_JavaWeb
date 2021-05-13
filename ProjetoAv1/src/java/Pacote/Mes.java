/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacote;

import static sun.java2d.cmm.ColorTransform.Out;

/**
 *
 * @author Diego
 */
public class Mes {
    
     String html = "";
    
    public String getMeses(){
        Meses();
        return html;
    }
    
    public String Meses(){
    
        String result  = "";
               
        String mes[] = {"Jan","Fev","Mar","Abr","Mai",
                "Jun","Julho","Ago","Set","Out","Nov","Dez"};
        int tot[] = {31, 28, 31, 30 , 31 ,31,30,31,30,31,30,31};
        for(int c=0; c<mes.length; c++){
             result +="<br>O Mês de " + mes[c] + " tem " + 
             tot[c] + " dias ao todo.";
            }
        result += "<br><br>";
        return result;
    }
    
    public String Bingo(){
                String result = "";
                int bingo[][] = {
                    {18, 5, 2, 27, 22},
                    {19, 7, 1, 15, 27},
                    {25, 12, 3, 40, 28},
                    {30, 8, 32, 33,29}, 
                    {4 , 31 , 6, 11 , 40}
                };
                
                for(int i = 0; i < 5 ; i++){
                    result += "<br>";
                    for(int j = 0; j < 5 ; j++){
                        result += bingo[i][j] + "   ";
                        
                    }
                }
                result += "<br><br>";
                return result;
    }            
}
