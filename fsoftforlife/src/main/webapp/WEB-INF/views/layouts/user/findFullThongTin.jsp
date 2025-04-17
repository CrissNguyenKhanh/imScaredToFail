<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/TagLib.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Danh sách sinh viên full thông tin</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f9f9f9;
    }
    table {
        width: 80%;
        margin: 40px auto;
        border-collapse: collapse;
        box-shadow: 0 0 15px rgba(0,0,0,0.1);
    }
    thead {
        background-color: #343a40;
        color: white;
    }
    th, td {
        padding: 12px 20px;
        text-align: center;
        border: 1px solid #dee2e6;
    }
    tbody tr:nth-child(even) {
        background-color: #f2f2f2;
    }
    tbody tr:hover {
        background-color: #e2e6ea;
    }
</style>

<body>
<div class="container mt-5">
    <h3 class="text-center mb-4">Danh Sách Sinh Viên</h3>
    <table class="table table-striped table-bordered text-center align-middle">
       <thead class="table-dark">
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
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
