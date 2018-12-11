$(function(){

  $(".ilist7 ul li").hover(function(){
	  $(this).siblings().removeClass("on").end().addClass("on");
  });
  
  $(".tt_box_t .clo ,.tt_box_t2 .clo").click(function(){
	  $(".tt_main").hide();
  });
  
  $(".nav_btn").click(function(){
	  $(".top_search").hide();
	  $(".topnav").slideToggle();
  });
  
  $(".search_btn").click(function(){
	  $(".topnav").hide();
	  $(".top_search").slideToggle();
  });
  
  $(".notice_nav_t").click(function(){
	  $(".notice_nav").slideToggle();
  });


});