<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SearchResult</title>
</head>
<body>

	<table>
  <c:forEach items="${results}" var="product">
    <tr >
      <td><c:out value="${product.origin}" /></td>
      <td><c:out value="${product.destination}" /></td>
      <td><c:out value="${product.message}" /></td>
      <td><c:out value="${product.id}" /></td>
      <td><a href = "detail?id=${product.id}">select</a></td>
    </tr>
  </c:forEach>
  
 
</table>

</body>
</html>