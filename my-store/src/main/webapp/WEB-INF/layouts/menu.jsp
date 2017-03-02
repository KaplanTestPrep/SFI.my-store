<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%--Set some variables which will be used everywhere --%>
<c:url var="landingPageURL" value="/showLandingPage.do" scope="session"/>

<div id="side-bar">
	<UL>
    <LI><a href="<c:url value="/"/>"><fmt:message key="index.title"/></a> 
	</UL>	     
</div>