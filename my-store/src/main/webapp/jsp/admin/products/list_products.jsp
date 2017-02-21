<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib uri="http://displaytag.sf.net/el" prefix="display-el" %>

<h2><fmt:message key="products.list.title"/></h2>
<P align="left"><fmt:message key="products.list.msg"/></P>

<P>Method executed: ${KEY_METHOD}</P>

<table width="80%" cellspacing="1" cellpadding="1" border="0" align="center">
<tr>
	<td align="center">
	<display:table name="requestScope.KEY_LIST_ITEMS" pagesize="13" sort="list" export="true" requestURI="/products/listAllProducts.htm" id="row">
		<display:column title="SKU" property="productSku" sortable="true" maxWords="7"/>
		<display:column titleKey="product.productName" property="productName" maxWords="15"/>
		<display:column titleKey="product.availableQuantity" property="availableQuantity"  sortable="true"/>
		<display:column titleKey="product.productUnitPrice" sortable="true" property="productUnitPrice"></display:column>
	</display:table>
	</td>
</tr>
</table>