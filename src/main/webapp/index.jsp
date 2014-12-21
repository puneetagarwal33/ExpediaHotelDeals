<html>
<head>
<title>Page Redirection</title>
</head>
<body>
<center>
<h1>Expedia Deap App Page Redirection</h1>
</center>
<%

		String reqUrl=request.getContextPath();		

        String redirectURL = reqUrl+"\\ExpediaDeals";

        response.sendRedirect(redirectURL);

    %>

</body>
</html>