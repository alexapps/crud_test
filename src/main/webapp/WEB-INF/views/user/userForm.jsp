<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<head>
	<title>List of users</title>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>

<c:url var="actionUrl" value="save" />

<form:form id="userForm" commandName="user" method="post" action="${actionUrl}" >
 <fieldset>
          <legend></legend>


          <div>
                <label for="name">Name</label>
                <form:input path="name" placeholder="User Name" />
          </div>
            <div
                  <label for="age">Age</label>
                  <form:input path="age" placeholder="phone" />
            </div>

            <div
                  <label for="isAdmin">Administrator role</label>
                  <form:input path="isAdmin" placeholder="Is User Administrator" />
            </div>
            <div
                  <label for="createdDate">Created Date</label>
                  <form:input path="createdDate"  readonly="true"  placeholder="Created date" />
            </div>
            <form:input path="id" type="hidden" />

 </fieldset>


</form:form>