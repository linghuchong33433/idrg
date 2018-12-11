function autoScroll(obj){  
	  $(obj).find("ul").animate({  
		  marginTop : "-30px"  
	  },500,function(){  
		  $(this).css({marginTop : "0px"}).find("li:first").appendTo(this);  
	  })  
  }  
  $(function(){  
	  setInterval('autoScroll("#inotice")',3000);
  })