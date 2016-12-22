<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<jsp:directive.page import="mio.principale.Lista" />
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<link href="css/prova.css" rel="stylesheet" type="text/css">
	<head>
		<title>Prova caricamento DB</title>
	</head>
	<body>
	<jsp:scriptlet>
		request.setAttribute( "fromDB",new Lista().getLs() );
	</jsp:scriptlet>
	
	
	<display:table name="fromDB" id="p">
  		<display:column property="id" title="ID" sortable="true"/>
  		<display:column property="nome_nazione" title="Nome" sortable="true"/>
  		<display:column property="siglanum" title="Sigla Numerica" sortable="true"/>
  		<display:column property="sigla3" title="Sigla ISO3" sortable="true"/>
  		<display:column property="sigla2" title="Sigla ISO2" sortable="true"/>
	</display:table>
		<!--  prova <s:property value="rs"></s:property>-->
	</body>
</html>