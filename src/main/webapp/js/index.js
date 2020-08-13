var img_carpenter = document.getElementById("img_carpenter");
var img_carpenter_table = document.getElementById("img_carpenter_table");
var img_wood_house = document.getElementById("img_wood_house");
var transparent_screen = document.getElementById("transparent_screen");

var x = 0, x_previous = 0;
var marginLeft_carpenter = 200;
var marginLeft_table = 300;
var marginLeft_house = 0;


initialise();
slide();


function initialise() {
	transparent_screen.addEventListener("mouseenter", function(event) {
		img_carpenter.style.marginLeft = "200px";
		x = 0;
		x_previous = 0;
		marginLeft_carpenter = 200;
		marginLeft_table = 300;
		marginLeft_house = 0;
	});
}

function slide() {
	transparent_screen.addEventListener("mousemove", function(MouseEvent) {
		x = MouseEvent.clientX;
		if (x_previous === 0) {
			x_previous = x;
		} else {
			if (x > x_previous) {
				marginLeft_carpenter += 0.5;
				img_carpenter.style.marginLeft = marginLeft_carpenter + "px";
				marginLeft_table += 1;
				img_carpenter_table.style.marginLeft = marginLeft_table + "px";
				marginLeft_house += 0.25;
				img_wood_house.style.marginLeft = marginLeft_house + "px";
			}
			if (x < x_previous) {
				marginLeft_carpenter -= 0.5;
				img_carpenter.style.marginLeft = marginLeft_carpenter + "px";
				marginLeft_table -= 1;
				img_carpenter_table.style.marginLeft = marginLeft_table + "px";
				marginLeft_house -= 0.25;
				img_wood_house.style.marginLeft = marginLeft_house + "px";
			}
		}
		x_previous = x;
	});
}