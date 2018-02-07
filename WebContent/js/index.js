/**
 * 
 */

$(document).ready(function() {
	projectA.callLoadServlet("a", "b");
	// projectA.callLoadServlet1();

});

projectA = {
	multiply : function(x, y) {
		alert(x * y);
	},
	click1 : function() {
		alert("CLICK1");
	},
	callLoadServlet : function(type, param2) {
		$.ajax({
			type : "POST",
			url : "LoadServlet",
			contentType : "application/json",
			dataType : "json",
			data : JSON.stringify({
				type : type,
				param2 : param2
			}),
			success : function(data) {
				$.each(JSON.parse(JSON.stringify(data)), function(i, owner) {
					$('.owner-list').append(
							'<li><a href="#">' + owner.ownerName + ' - '
									+ owner.email + '</a></li>');

				});

			},
			error : function(textStatus, errorThrown) {
			}

		});
	},
	callLoadServlet1 : function() {

		$.ajax({
			type : "GET",
			url : "LoadServlet",
			contentType : "application/json",
			success : function(data) {
				alert(data)
			},
			error : function(textStatus, errorThrown) {
			}

		});
	}
}