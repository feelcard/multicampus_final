<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@page import="com.sds.finalpj.db.CardPlusDB"%>

<%
CardPlusDB cardplusDB = CardPlusDB.getInstance();
	
   String id = request.getParameter("id");
   
   System.out.println(id);
	
   
	String result= cardplusDB.CardPlussDB(id);
 	System.out.println("---------------------");
 	System.out.println(id);
 	System.out.println(result);
 

// 	if(id.equals("id") && pwd.equals("pwd")) {
 	if(result.equals("YY")) {
 		System.out.println("���ο� ī�������� �߰��մϴ�.");

 		out.println("1") ;
 		
 	}else {
 		System.out.println("���̻� ī�带 �߰��� �� �����ϴ�.");
 		
 		out.println("0");
 	}

   
%>