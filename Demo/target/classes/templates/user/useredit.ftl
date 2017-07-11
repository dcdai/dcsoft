<html>

<head>
<title>user.myuser</title>

<style type="text/css">
.us-region-line-displayname{display:none}
</style>

<script type="text/javascript">
 


 
function adduser(){
 	
     
			
			var thisform = document.getElementById("userform");
	        thisform.action = "/users/add";
	        thisform.method = "post";
	        thisform.submit();
		 
 }
 
 function saveuser(){
 	
     
			
			var thisform = document.getElementById("userform");
	        thisform.action = "/users/save";
	        thisform.method = "post";
	        thisform.submit();
		 
 }     
        
     
function deleteuser(){
	var thisform = document.getElementById("userform");
	thisform.action = "/users/delete/${user.id}";
	thisform.method = "post";
	thisform.submit();
  
}  
  
</script>
</head>

<body>
  <form name="userform" id="userform" action="" method="post"> 

	<input type="hidden" id="id"  name="id" value="${user.id}"/>
	user/useredit
	<input type="text" value="${user.name}"  id="firstname" name="name" maxlength='20' style='width:323px; height:25px;'>	
	<input type="text" value="${user.address}"  id="firstname" name="address" maxlength='20' style='width:323px; height:25px;'>	 
	<a onclick="adduser()"><input type="button" value="add"></a>	
	<a onclick="saveuser()"><input type="button" value="save"></a>
	<a onclick="deleteuser()"><input type="button" value="delete"></a>
</body>
</html>
