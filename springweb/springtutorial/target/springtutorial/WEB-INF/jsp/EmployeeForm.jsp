<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE HTML>
<html>
<head>
<title>add employee form</title>
<style type = "text/css">@import url("<c:url value="/css/main.css"/>");</style>
</head>

<body>
<div id = "global">
<form:form commandName = "employee" action = "employee_save" method = "post">
<fieldset>
	<legend>add an employee</legend>
	<p>
		<label for = "firstName">firstName: </label>
		<form:input path = "firstName" tabindex = "1"/>
	</p>
	<p>
		<label for = "lastName">LastName: </label>
		<form:input path = "lastName" tabindex = "2"/>
	</p>
	<p>
		<form:errors path = "birthDate" cssClass = "error"/>
	</p>
	<p>
		<label for = "lastName">Date of Birth: </label>
		<form:input path = "birthDate" tabindex = "3"/>
	</p>
	<p id = "buttons">
		<input id = "reset" type = "reset" tabindex = "4">
		<input id = "submit" type = "submit" tabindex = "5" value = "add Employee">
	</p>
</fieldset>
</form:form>
</div>
</body>
</html>