$(document).ready(
		function() {

			$('#contact-form').validate(
					{
						rules : {
							first_name : {
								required : true,
								minlength : 3
							},

							display_name : {
								minlength : 3,

								required : true
							},
							last_name : {
								minlength : 3,
								required : true
							},

							password : {
								required : true,
								minlength : 5,
								
							},
							password_confirmation : {
								equalTo: '#password'
							},

							email : {
								required : true,
								email : true
							},
						},
						highlight : function(element) {
							$(element).closest('.control-group').removeClass(
									'success').addClass('error');
						},
						messages: {
							tandc: "Please accept our policy",
							boton: "Please accept our policy"
						},

					});

		}); // end document.ready
