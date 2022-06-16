function setup() {
  createCanvas(400, 400);
  frameRate(1);
}

function draw() {
  background(220);
  for(let i=0;i<width;i++){
    for(let j=0;j<height;j++){
      randomStroke();
      rect(i,j,1,1);
    }
  }
}


function randomStroke(){
 stroke(random(0,255),random(0,255),random(0,255));
}