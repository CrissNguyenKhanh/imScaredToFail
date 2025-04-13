<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/TagLib.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form</title>
<!-- Thêm Bootstrap -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
	
</head>
<body>

	<div class="container">
		<h3 class="text-center mt-4">Đăng Ký Thông Tin</h3>
		<hr class="soft" />
		 <form:form action="tim-kiem" method="get" modelAttribute="student">
          tìm kiếm theo tên : <input type = "text" name = "hoTen"/>
          <input type ="submit" value ="submit"/>
          
          </form:form>
          
          <form:form action="tim-kiem-full-thong-tin" method="get" modelAttribute="student">
          tìm kiếm theo tên và in ra full thông tin : <input type = "text" name = "hoTen"/>
          <input type ="submit" value ="submit"/>
          </form:form>

		<div class="row">
    <form:form action="Add-Student" method="POST" modelAttribute="student">
        <div class="col-md-6">
            <div class="card p-4 shadow">
                <h5 class="text-center">Nhập form của sinh viên</h5>

                <div class="mb-3">
                    <label class="form-label">Số CMND</label>
                    <form:input class="span3 form-control" type="text" path="soCmnd"
                        placeholder="Nhập Số CMND" />
                      <p style = "color :red"><form:errors path = "SoCmnd"></form:errors> </p>  
                </div>

                <div class="mb-3">
                    <label class="form-label">Họ Và Tên</label>
                    <form:input class="span3 form-control" type="text" path="hoTen"
                        placeholder="Mời nhập Họ Và tên" />
                <p style = "color :red"><form:errors path = "HoTen"></form:errors> </p>  
                </div>

                <div class="mb-3">
                    <label class="form-label">Email</label>
                    <form:input class="span3 form-control" type="email" path="email"
                        placeholder="Mời nhập Email" />
                    <p style = "color :red"><form:errors path = "Email"></form:errors> </p>
                </div>

                <div class="mb-3">
                    <label class="form-label">Số điện thoại</label>
                    <form:input class="span3 form-control" type="text" path="soDt"
                        placeholder="Mời nhập Số điện thoại" />
                </div>

                <div class="mb-3">
                    <label class="form-label">Địa chỉ</label>
                    <form:input class="span3 form-control" type="text" path="diaChi"
                        placeholder="Mời nhập địa chỉ" />
                </div>
            </div>
        </div>

        <!-- Form của Sinh viên tốt nghiệp -->
        <div class="col-md-6">
            <div class="card p-4 shadow">
                <h5 class="text-center">Nhập form của Sinh viên tốt nghiệp</h5>

                <div class="mb-3">
                    <label class="form-label">Mã Trường</label>
                    <form:select path="maTruong" class="form-control">
                        <form:option value="">-- Chọn Trường --</form:option>
                        <form:options items="${truong}" itemValue="maTruong"
                            itemLabel="tenTruong" />
                    </form:select>
                </div>

                <div class="mb-3">
                    <label class="form-label">Mã Ngành</label>
                    <form:select path="maNganh" class="form-control">
                        <form:option value="">-- Chọn ngành --</form:option>
                        <form:options items="${nganh}" itemValue="maNganh"
                            itemLabel="tenNganh" />
                    </form:select>
                </div>

                <div class="mb-3">
                    <label class="form-label">Hệ Tốt Nghiệp</label>
                    <form:input class="span3 form-control" type="text" path="heTn"
                        placeholder="Mời nhập Hệ tốt nghiệp" />
                </div>

                <div class="mb-3">
                    <label class="form-label">Ngày Tốt Nghiệp</label>
                    <form:input class="span3 form-control" type="date" path="ngayTN"
                        placeholder="Mời nhập Ngày tốt nghiệp" />
                </div>

                <div class="mb-3">
                    <label class="form-label">Loại Tốt Nghiệp</label>
                    <form:input class="span3 form-control" type="text" path="loaiTn"
                        placeholder="Mời nhập Loại tốt nghiệp" />
                </div>
            </div>
		            <div class="card p-4 shadow">
		    <h5 class="text-center">Thông tin công việc</h5>
		
		    <div class="mb-3">
		        <label class="form-label">Tên Công Việc</label>
		        <form:input class="form-control" path="tenCongViec" placeholder="Nhập tên công việc" />
		    </div>
		
		    <div class="mb-3">
		        <label class="form-label">Tên Công Ty</label>
		        <form:input class="form-control" path="tenCongTy" placeholder="Nhập tên công ty" />
		    </div>
		
		    <div class="mb-3">
		        <label class="form-label">Địa Chỉ Công Ty</label>
		        <form:input class="form-control" path="diaChiCongTy" placeholder="Nhập địa chỉ công ty" />
		    </div>
		
		    <div class="mb-3">
		        <label class="form-label">Thời Gian Làm Việc</label>
		        <form:input class="form-control" path="thoiGianLamViec" placeholder="VD: 3 năm, 5 năm" />
		    </div>
		
		    <div class="mb-3">
		        <label class="form-label">Ngày Vào Công Ty</label>
		        <form:input class="form-control" type="date" path="ngayVaoCongTy" />
		    </div>
		</div>
            
        </div>

        <div class="col-12 text-center mt-4">
            <button type="submit" class="btn btn-primary">Thêm Sinh Viên</button>
            <h1 style = "color : green; font-size: 20.5px;" >${Status}</h1>
        </div>
    </form:form>
     
    
</div>

	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
