function setup() {
	let canvas = createCanvas(300, 300);
	canvas.parent("sketch");
	background(50);
}

function draw() {
	circle(mouseX, mouseY, 50);

	let xLabel = document.getElementById("x-label");
	xLabel.innerText = "X: " + mouseX;

	let yLabel = document.getElementById("y-label");
	yLabel.innerText = "Y: " + mouseY;
}

// Called when the button in index.html is clicked
function drawBackground() {
	background(random(255), random(255), random(255));
}
