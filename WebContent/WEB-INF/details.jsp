<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form commandName="person">
<table>
    <tr>
        <td>Id:</td>
        <td><form:input path="id" /></td>
    </tr>
    <tr>
        <td>Name:</td>
        <td><form:input path="name" /></td>
    </tr>
    <tr>
        <td>Surname:</td>
        <td><form:input path="surname" /></td>
    </tr>
    <tr>
        <td colspan="2"><input type="submit" value="Save Changes" /></td>
    </tr>
</table>
</form:form>
</body>
</html>