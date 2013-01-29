<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>form</title>
</head>
<body>
	<sf:form method="POST" modelAttribute="form">
		<sf:label path="name">Name:</sf:label>
		<sf:input path="name" size="15" />
		<sf:errors path="name" cssClass="error" />
		
		<sf:label path="age">Age:</sf:label>
		<sf:input path="age" size="15" />
		<sf:errors path="age" cssClass="error" />
		
		<input type="submit" value ="save" />
	</sf:form>
</body>
</html>