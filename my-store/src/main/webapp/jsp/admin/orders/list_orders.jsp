<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib uri="http://displaytag.sf.net/el" prefix="display-el" %>

<h2><fmt:message key="orders.list.title"/></h2>
<P align="left"><fmt:message key="orders.list.msg"/></P>

<P>Method executed: ${KEY_METHOD}</P>

<table width="80%" cellspacing="1" cellpadding="1" border="0" align="center">
<tr>
	<td align="center">
	<display:table name="requestScope.KEY_LIST_ITEMS" pagesize="13" sort="list" export="true" requestURI="/products/listAllProducts.htm" id="row">
		<display:column title="ID" property="orderID" sortable="true" maxWords="7"/>
		<display:column title="Amount" property="amount" maxWords="15"/>
		<display:column title="Created_date" property="createdDate"  sortable="true"/>
	</display:table>
	</td>
</tr>
</table>