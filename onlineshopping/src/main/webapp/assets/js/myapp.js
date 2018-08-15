$(function() {
	// solving the active menu problem
switch(menu) {
	

case 'AboutUs':
		$('#about').addClass('nav-item active');
		break;
case 'Contact':
	$('#contact').addClass('nav-item active');
	break;		
	
	default:
		$('#home').addClass('nav-item active');
	break;
}	
});