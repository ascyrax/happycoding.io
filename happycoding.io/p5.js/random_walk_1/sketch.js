function setup() {
  createCanvas(400, 400);
  background(220);
  drawDottedGrid();
  startRed();
  startBlue();
  frameRate(60);
}

function draw() {
  // every frame
  animateRandomWalkRed();
  animateRandomWalkBlue();
}

let AX, AY;
let BX, BY;
let colA={},colB={};

function drawDottedGrid() {
  for (let i = 0; i <= height / 10; i++) {
    for (let j = 0; j <= width / 10; j++) {
      // text(".",i*10,j*10);
      let temp = createVector(i * 10, j * 10);
      point(temp);
      // point(i * 10, j * 10);
      // circle(i*10,j*10,1);
    }
  }
}

function startRed() {
  AX = parseInt(random(0, width / 10));
  AY = parseInt(random(0, height / 10));
  randomStroke(1);
  point(AX * 10, AY * 10);
}

function startBlue() {
  BX = parseInt(random(0, width / 10));
  BY = parseInt(random(0, height / 10));
  randomStroke(2);
  point(BX * 10, BY * 10);
}

function animateRandomWalkRed() {
  let coin = parseInt(random(-2, 2));
  AX += coin;
  coin = parseInt(random(-2, 2));
  AY += coin;
  
  if(AX*10>width || AX*10<0 || AY*10>height || AY*10<0){
    console.log("restart A");
    startRed();
  }
  
  stroke(colA.r,colA.g,colA.b);
  point(AX * 10, AY * 10);
}

function animateRandomWalkBlue() {
  let coin = parseInt(random(-2, 2));
  BX += coin;
  coin = parseInt(random(-2, 2));
  BY += coin;
  
  
  if(BX*10>width || BX*10<0 || BY*10>height || BY*10<0){
    console.log("restart B");
    startBlue();
  }
  stroke(colB.r,colB.g,colB.b);
  point(BX * 10, BY * 10);
}

function randomStroke(num) {
  let r=parseInt(random(0,256));
  let g=parseInt(random(0,256));
  let b=parseInt(random(0,256));
  stroke(r,g,b);
  strokeWeight(7);
  if(num==1){
    colA={r,g,b};
  }else if(num==2){
    colB={r,g,b};
  }
}
