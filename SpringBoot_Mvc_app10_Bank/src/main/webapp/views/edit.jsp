<%@ taglib  prefix="form" uri="http://www.springframework.org/tags/form"%>
	 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	 <html>
<head>



</head>
<body>
<h1>EDIT EMPLOYEE INVOICE DETAILS  :)</h1>
     <form:form method="Post" action="/editu">
     
     <table>
     <tr>
     <td>customer_id:</td>
     <td><form:input path="customer_id" /></td>
     </tr>
     <tr>
     <td>ecustomer_Name:</td>
     <td><form:input path="customer_Name" /></td>
     </tr>
     <tr>
     <td>mobileno:</td>
     <td><form:input path="mobileno" /></td>
     </tr>
     
     <tr>
     <td>product_name:</td>
     <td><form:input path="product_name" /></td>
     </tr>
     
     
     <tr>
     <td>price:</td>
     <td><form:input path="price" /></td>
     </tr>
     
     <tr>
     <td>quantity:</td>
     <td><form:input path="quantity" /></td>
     </tr>
         
     <tr>
     <td></td>
     <td><input type="submit"  value="editsave"/></td>
     </tr>
     
     
     </table>
     
     
     </form:form>

		<a href="/">ADD STUDENT</a>&nbsp;&nbsp;&nbsp;
		<a href="/viewstudent">VIEW ALL STUDENT</a><hr>
</body>










</html>