<%@ page isELIgnored="false" import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h1>Model Attributes data </h1>
<%-- <b>Fav colors are::<%=Arrays.toString(((String[])request.getAttribute("favColors")))%>></b><br>
<b>Nick names are::${nickNames}</b><br>
<b>Phone Numbers are::${phoneNumbers}</b><br>
<b>Id_Details are::${idDetails}</b> --%><!-- <br> -->
<h3>Fav colors are::</h3>
<c:forEach var="color" items="${favColors}">
${color},
</c:forEach>
<h3>Nick names are::</h3>
<c:forEach var="names" items="${nickNames}">
${names},
</c:forEach>