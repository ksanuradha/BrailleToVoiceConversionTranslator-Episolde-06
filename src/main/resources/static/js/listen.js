/**
 * 2019-05-27 K S Anuradha
 */

$(document).ready(function() {
	$("#listenDoc").click(function() {
		listen();
	});
	
	function listen() {
		var sinhala = document.getElementById("contactChoice1S");
		var selectedBox="";
		if(sinhala.checked == true){
			selectedBox = "sinhala";
		}
		else{
			selectedBox = "english";
		}	
		$.ajax({
			url : "/api/brailleapplication/listen/"+selectedBox,
			type : "POST",
			cache : false,
			success : function() {
				//alert("Listen Value send");
			},
			error : function() {
			}
		});
	}
});