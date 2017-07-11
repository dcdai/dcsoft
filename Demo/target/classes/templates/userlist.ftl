<html> 
<body> 
    welcome  to freemarker!
    <h4>人员信息列表：</h4>
       <#list runners as item>
       id：${item.id} , 姓名：${item.name} , 地址${item.address}
           <br>
           <#list item.orderdetail as onedetail>
	       id：${item.id} , 姓名：${onedetail.name} , 地址${onedetail.address}
	           <br>
	       </#list>
       </#list>
</body> 
</html>