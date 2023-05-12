<%@ page pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8"/>
	<title>Spring MVC</title>
	<base href="${pageContext.servletContext.contextPath}/">
	<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	
	<form action="register.htm" method="post" style="width: 40%;margin: auto;">
	<h2>Register</h2>
		<div class="form-group">
			<label for="exampleInputPassword1">Username</label> <input
				type="text" class="form-control" id="exampleInputPassword1"
				placeholder="Username" name="id">
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">Password</label> <input
				type="password" class="form-control" id="exampleInputPassword1"
				placeholder="Password" name="password">
		</div>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>
</body>
</html>
