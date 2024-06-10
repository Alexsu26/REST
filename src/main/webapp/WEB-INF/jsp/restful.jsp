<%--
  Created by IntelliJ IDEA.
  User: l1818
  Date: 2024/6/6
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Title</title>
  <script type="text/javascript"
          src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
  <script type="text/javascript">
    function put() {
      var id = 3;
      $.ajax({
        url : "./" + id,
          type : 'DELETE',
        success :function (result) {
          if (result == null) {
            alert("后台出现异常");
          } else {
              alert(result.message);
          }
        }
      });
    }
    put();
  </script>
</head>
<body>

</body>
</html>
