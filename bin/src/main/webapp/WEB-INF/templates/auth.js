$(document).ready(function() {
	if (localStorage.getItem("token") === null) {
		window.location = "/login";
		return;
	} else {
		var userInfo = JSON.parse(localStorage.getItem('userInfo'));
		/*var isAdmin = Object.keys(userInfo.role).some(function(k) {
			return userInfo.role[k].name === "ROLE_ADMIN";
		});

		var isUser = Object.keys(userInfo.role).some(function(k) {
			return userInfo.role[k].name === "ROLE_USER";
		});*/
		
		//set label
		/*if(isAdmin) {
			$(".title_book").text("Book List");
		} else {
			$(".title_book").text("My Book List");
		}*/
		$("#authorLogin").html(userInfo.member.first_name + " "+userInfo.user.last_name);
		$("#avatarLogin").html(' <img src="/resources/uploads/'+userInfo.mem.avatar+'" id="avatarLogin"  class="img-circle elevation-2" >');
	}
});