$(document).ready(function(){
	$(document).scroll(function(){
		var scrollValue =$(document).scrollTop();
		if(scrollValue > 100 ){
			if(!$("#StaticMenu").hasClass("menuEstatico")){
				$("#StaticMenu").addClass("menuEstatico");				
			}
		}else{
			$("#StaticMenu").removeClass("menuEstatico");
		}
	})
})