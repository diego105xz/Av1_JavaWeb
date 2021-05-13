<%-- 
    Document   : index
    Created on : 12/05/2021, 17:56:29
    Author     : Diego
--%>
<%@page import="Pacote.Times"%>
<%@page import="Pacote.Mes"%>
<%@page import='java.util.List'%>
<%@page import='java.util.ArrayList'%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Atividade Av1 </title>
        <link rel="Stylesheet" href="Style.css"
    </head>
    <body >
        <h1>Atividade AV1: </h1>
        
        <h5>Usando Vetores e Array</h5> 
        
        <h3>Quais meses tem 31 dias? e quais tem 30?</h3>
              
        <img  src="imagens/duvida.jpg" width="200" height="">
        
       <%=new Mes().getMeses()%>
       
        <%
           out.print(new Mes().Meses());
           out.print("---------------------------------------------<br>");
        %>
        <h5>Usando Matriz</h5>
        
        <h2>BINGO</h2>
        
        <%
           out.print(new Mes().Bingo());
           out.print("---------------------------------------------<br>");
        %>
        <h5>Usando ArrayList e Métodos Get e Set getters e setters</h5>
        
        <h2>Melhores Times do Mundos</h2>
        <%
           List<Times> t = new ArrayList<Times>();
           
           t.add(new Times("Real Madrid", 4, 13, 2));
           t.add(new Times("Barcelona", 3, 5, 5));
           t.add(new Times("Bayern de Munique", 2, 5, 1));
           t.add(new Times("Juventus", 2, 2, 3));
           t.add(new Times("Milan", 1, 6, 1));
           
           for(Times valor :t){
                out.print("----------------------<br>");
                out.print("Time = " + valor.getTime() + "<br>");
                out.print("Mundial = " + valor.getMundial()+ "<br>");
                out.print("Liga dos campeões = " + valor.getCampeoes()+ "<br>");
                out.print("Eurocopa = " + valor.getEuro()+ "<br>");
                
            }
           
           out.print("---------------------------------------------<br>");
        %>
        
</html>
