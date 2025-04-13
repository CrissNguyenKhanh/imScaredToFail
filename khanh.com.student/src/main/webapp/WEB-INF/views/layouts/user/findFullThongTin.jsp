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
            <th>Mã Ngành</th>
            <th>Mã Trường</th>
            <th>Tên Công Ty</th>
            <th>Thời gian làm việc</th>
            
        </tr>
    </thead>
    <tbody>
			<tr>
			    <td>${student.soCMND}</td>
			    <td>${student.hoTen}</td>
			    <td>${student.maNganh}</td>
			    <td>${student.maTruong}</td>
			    <td>${student.tenCongTy}</td>
			    <td>${student.ngayVaoCongTy}</td>
			</tr>

    </tbody>
</table>


</body>
</html>