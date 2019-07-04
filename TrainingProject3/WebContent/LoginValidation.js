$(document).ready(function() {
    $("#form1").validate({
    	rules: {
    		Uname:"required",
    		pwd:{
    			required: true,
    			minlength:5
    		}
    	},
   		messeges: {
    	
   		 Uname: "Please enter valid username",
    	 pwd: {
             required: "Please provide a password",
             minlength: "Your password must be at least 5 characters long"
         }
    }
    });
});