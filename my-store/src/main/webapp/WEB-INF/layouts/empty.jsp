<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html> 		
	<head>
		<spring:url value="/images/favicon.ico" var="favicon" />
		<link rel="SHORTCUT ICON" href="${favicon}" />
		<title>This is an Empty Template</title>			
		<link href="<c:url value='/css/displaytag.css'/>" rel="stylesheet" type="text/css">
		<link href="<c:url value='/css/standard.css'/>" rel="stylesheet" type="text/css">
	</head>
  	<body class="tundra spring">	
   		<div id="wrapper">
		    <div id="main">
	    		<tiles:insertAttribute name="body"/> 
		    </div>
		</div>
	</body>
</html>