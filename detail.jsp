<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
    <table class="table">
        <thead class="thead-dark">
          <tr>
          
            <th scope="col">First</th>
            <th scope="col">Last</th>
            <th scope="col">Phone No</th>
         
          
          </tr>
        </thead>
        <tbody>
          <tr>
         
            <td>${user.FirstName } 1</td>
            <td>${user.LastName } 1 </td>
         	<td>${user.Phone} 1</td>
            
         
          </tr>
          
         
        </tbody>
      </table>
      
      <table class="table">
        <thead class="thead-light">
          <tr>
            <th scope="col">Id</th>
            <th scope="col">String date</th>
            <th scope="col">String origin</th>
            <th scope="col">destination</th>
            <th scope="col">fare</th>
           
          </tr>
        </thead>
        <tbody>
          <tr>
          
            <td>${Ride.id } 1</td>
            <td>${Ride.date } 1</td>
            <td>${Ride.destination } 1</td>
             <td>${Ride.fare} 1 </td>
              <td>${Ride.time} 1</td>
          </tr>
         
        </tbody>
      </table>
</body>
</html>
