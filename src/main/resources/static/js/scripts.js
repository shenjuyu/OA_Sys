(function() {
	"use strict";

	// custom scrollbar
	$("html").niceScroll({
		styler: "fb",
		cursorcolor: "#F2B33F",
		cursorwidth: '6',
		cursorborderradius: '10px',
		background: '#424f63',
		spacebarenabled: false,
		cursorborder: '0',
		zindex: '1000'
	});
	addScrollBar();

})(jQuery);

function addScrollBar(){
	$(".scrollbar1").niceScroll({
		styler: "fb",
		cursorcolor: "rgba(97, 100, 193, 0.78)",
		cursorwidth: '6',
		cursorborderradius: '0',
		autohidemode: 'false',
		background: '#F1F1F1',
		spacebarenabled: false,
		cursorborder: '0'
	});
	
	$(".scrollbar1").getNiceScroll();
		if ($('body').hasClass('scrollbar1-collapsed')) {
		$(".scrollbar1").getNiceScroll().hide();
	}
}

function removeScrollBar(){
	for(i = 2000 ;i < 3000; i++){
		if($('#ascrail'+i).length > 0){
			$('#ascrail'+i).remove();
			$('#ascrail'+i+'-hr').remove();
		}
		if($('#ascrail2996').length > 0){
			// 如果scrollerBar的id到达了这个数值 证明用户已经进行了很多次的页面切换，则进行强制刷新页面。否则会出BUG
			window.location.reload();
		}
	}
	addScrollBar();
}