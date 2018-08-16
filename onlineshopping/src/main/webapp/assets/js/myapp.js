$(function() {
	// solving the active menu problem
	switch (menu) {

	case 'AboutUs':
		$('#about').addClass('nav-item active');
		break;
	case 'Contact':
		$('#contact').addClass('nav-item active');
		break;
	case 'Products':
		$('#listProducts').addClass('nav-item active');
		break;
	default:
		$('#listProducts').addClass('nav-item active');
		$('#a_'+menu).addClass('nav-item active');
		break;
	}
});