<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>List Of Users</title>

<link rel="stylesheet"
       href='<c:url value="/web-resources/css/font-awesome-4.0.3/css/font-awesome.css"/>'>
<link rel="stylesheet"
       href='<c:url value="/web-resources/css/jquery-ui-1.10.4.custom.css"/>'>
<style type="text/css">
  th {
       text-align: left
  }

</style>
</head>

<body>
   <div style="width: 95%; margin: 0 auto;">

        <div id="userDialog" style="display: none;">
            <%@ include file="userForm.jsp"%>
        </div>

        <h1>List Of Users</h1>

        <button  onclick="addUser()">
            <i></i> Add User
         </button>
         <br>
         <table>
            <thead>
               <tr>
                  <th width="5%">NN</th>
                  <th width="40%">Name</th>
                  <th width="20%">Age</th>
                  <th width="5%">Is Admin</th>
                  <th width="20%">Created Date</th>

                  <th width="10%"></th>
                </tr>
            </thead>
            <tbody>
               <c:forEach items="${userList}" var="userItem" varStatus="LoopCounter">
               <tr>
                   <td><c:out value="${loopCounter.count}" /></td>
                   <td><c:out value="${userItem.name}" /></td>
                   <td><c:out value="${userItem.age}" /></td>
                   <td><c:out value="${userItem.isAdmin}" /></td>
                   <td><c:out value="${userItem.createdDate}" /></td>
                   <td>
                     <nobr>
                        <button onclick="editUser(${user.id});">
                           <i>Edit</i>
                        </button>

                        <a href="delete/${user.id}"
                   onclick="return confirm('Are you sure you want to delete this user?');">
                             <i></i>Delete
                        </a>
                      </nobr>
                   </td>
                </tr>
                </c:forEach>
            </tbody>
         </table>
     </div>

     <!--  It is advised to put the <script> tags at the end of the document body so that they dont block rendering of the page -->

    <script type="text/javascript"
       src='<c:url value="/web-resources/js/lib/jquery-1.10.2.js"/>'></script>
    <script type="text/javascript"
       src='<c:url value="/web-resources/js/lib/jquery-ui-1.10.4.custom.js"/>'></script>
    <script type="text/javascript"
       src='<c:url value="/web-resources/js/lib/jquery.ui.datepicker.js"/>'></script>
    <script type="text/javascript"
       src='<c:url value="/web-resources/js/js-for-listUsers.js"/>'></script>
</body>
</html>