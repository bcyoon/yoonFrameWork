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
				url		: "/ajax/setMariaBiz",
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
	
	//실패업데이트
	$("#updateBadBtn").click(function(){
		
		
		//2. 저장
		if(!confirm("실패 저장 하시겠습니까?")) return;

			$.ajax({
				url		: "/ajax/setMariaBizBad",
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
