<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
<script type="text/javascript">
	$(document).ready(function(){
		$('#listBtn').on('click',function(){
			$.get('/boards',function(data){
				console.log(data);
				alert(JSON.stringify(data));
			})
		});
		
		$('#readBtn').on('click',function(){
			var boardNo = $('#boardNo');
			var boardNoVal = boardNo.val();
		})
	})
</script>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
