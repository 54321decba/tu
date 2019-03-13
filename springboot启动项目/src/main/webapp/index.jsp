<html>
<body>
<h2>当前时间：</h2>
<%@ page import="java.util.Date,java.text.SimpleDateFormat" pageEncoding="UTF-8" %>

<%
    SimpleDateFormat df=new SimpleDateFormat("yyyyMMdd HH:mm:ss");
    String s=df.format(new Date());
    out.print(s);
%>
</body>
</html>
