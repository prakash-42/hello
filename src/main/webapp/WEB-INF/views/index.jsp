<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- Static content -->
<link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript" src="/resources/js/app.js"></script>

<title>Welcome visitor!</title>
</head>
<body>
  ${name}
  <form action="/" method="post" onsubmit="return validate()">
    <input id="name" name="name">
    <input type="submit" value="Submit">
  </form>
	<script>
		var shallFocusOnInputBox = ${focusOnInputBox};
		focusOnInputBox();
	</script>
</body>
</html>
