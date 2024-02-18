

<%@ taglib  prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<h1>User Details</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr>
   
    <th>customer id</th>
     <th>customer name</th>
     <th>mobile no</th>
      <th>product name</th>
       <th>price</th>
    <th>Quantity</th>
    <th>total</th>
    <th>discount</th>
    <th>gst</th>
    <th>invoice_bill</th>
    
      <th>Delete</th>
      <th>Edit</th>
    </tr>
   <c:forEach var="user" items="${product}">   
   <tr>  
   <td>${user.customer_id}</td>  
   <td>${user.customer_Name}</td>  
   <td>${user.mobileno}</td>
   <td>${user.product_name}</td>
   <td>${user.price}</td>
   <td>${user.quantity}</td>
   <td>${user.total}</td>
   <td>${user.discount}</td>
   <td>${user.gst}</td>
   <td>${user.invoice_bill}</td>
   
    
   
   <td><a href="/delete/${user.customer_id}">Delete</a>  
   <td><a href="/edit/${user.customer_id}">Edit</a>  
  
    </tr>
      
   </c:forEach>  
   </table>  <hr>
   <a href="/adduser">Add User</a>&nbsp;&nbsp;&nbsp;
        <a href="/viewusers">View Users</a>
   <br/>  
   </body>
