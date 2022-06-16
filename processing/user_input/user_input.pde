void setup(){
  size(800,800);
  circleX=-500;
  circleY=-500;
}

int circleX,circleY;
float rate=0.9;

void draw(){
  background(32);
  stroke(random(0,255),random(0,255),random(0,255));
  ellipse(circleX,circleY,50,50);
  
  if(mouseX!=circleX)circleX+=(mouseX-circleX)*rate/10;
  if(mouseY!=circleY)circleY+=(mouseY-circleY)*rate/10;
}
