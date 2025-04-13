<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="/WEB-INF/views/TagLib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
    <thead>
        <tr>
            <th>Số CMND</th>
            <th>Họ Tên</th>
            <th>Email</th>
            <th>Số Điện Thoại</th>
            <th>Địa Chỉ</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="sinhvien" items="${student}">
         
        
            <tr>
                <td>${sinhvien.soCMND}</td>
                <td>${sinhvien.hoTen}</td>
                <td>${sinhvien.email}</td>
                <td>${sinhvien.soDT}</td>
                <td>${sinhvien.diaChi}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>


</body>
</html>