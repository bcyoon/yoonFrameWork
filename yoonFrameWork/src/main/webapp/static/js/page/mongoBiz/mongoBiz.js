$(document).ready(function(){	

	setEvent();

	
});

function setEvent(){
	
	$("#reloadBtn").click(function(){
		document.location.reload();
	})
	
	//정상업데이트
	$("#updateBtn").click(function(){
		
		
		//2. 저장
		if(!confirm("정상 저장 하시겠습니까?")) return;

			$.ajax({
				url		: "/ajax/setMongoBiz",
				type	: "POST",
				data	: {},
				success : function(data){
					alert(data)
				},
				error: function (error) {
			    	alert(error);
			     }
			});
	});	
	
	

}
