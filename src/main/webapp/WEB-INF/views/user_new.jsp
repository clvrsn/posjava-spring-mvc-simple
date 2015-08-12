<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
</head>

<body>
${msg}
	<form:form action="create" modelAttribute="user" method="post" class="form-signin">
		<label>Name</label>
		<br />
		<form:input path="name" type="text" id="name" />
		<br />
		<br />
		<label>Email</label>
		<br />
		<form:input path="email" id="email" />
		<br />
		<br />
		<label>Password</label>
		<br />
		<form:password path="password" id="password" />
		<br />
		<br />
		<button type="submit">Salvar</button>

	</form:form>

</body>
</html>