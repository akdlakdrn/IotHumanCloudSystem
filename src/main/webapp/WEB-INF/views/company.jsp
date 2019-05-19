<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>company</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>Company.CompanyID</td>
			<td>Company.CompanyPassword</td>
			<td>Company.CompanyName</td>
			<td>Company.CompanyEmail</td>
			<td>Company.CompanyAddr</td>
			<td>Company.CompanyPhone</td>
			<td>Company.CompanyCorporate</td>
			<td>Company.CompanycreateDate </td>
			<td>Company.CompanyupdateDate</td>
		</tr>
		<c:forEach var="item" items="${companys}">
			<tr>
				<td><a href="/company/${item.num}">${item.companyID}</td>
				<td>${item.companyPassword}</td>
				<td>${item.companyName}</td>
				<td>${item.companyEmail}</td>
				<td>${item.companyPhone}</td>
				<td>${item.companyAddr}</td>
				<td>${item.companyCorporate}</td>
				<td>${item.companycreateDate}</td>
				<td>${item.companyupdateDate}</td>
			</tr>
		</c:forEach>
		</table>
		<a href="http://localhost:8000/company/update/">수정</a>
		<a href="http://localhost:8000/company/create/">회원가입</a>
</body>
</html>