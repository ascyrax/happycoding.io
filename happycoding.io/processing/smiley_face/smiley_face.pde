size(400,400);

background(random(0,255),random(0,255),random(0,255));

fill(random(0,255),random(0,255),random(0,255));
ellipse(width/2,height/2,200,200);

fill(random(0,255),random(0,255),random(0,255));
ellipse(width/2-30,height/2-25,40,25);
ellipse(width/2+30,height/2-25,40,25);
// eyeballs
fill(random(0,255),random(0,255),random(0,255));
ellipse(width/2-30,height/2-25,12,12);
ellipse(width/2+30,height/2-25,12,12);

// mouth
fill(random(0,255),random(0,255),random(0,255));
arc(width/2,height/2+35,100,75,0,PI);
line(width/2-100/2,height/2+35,width/2+100/2,height/2+35);

//triangle(random(0,width),random(0,height),random(0,width),random(0,height),random(0,width),random(0,height));

fill(random(0,255),random(0,255),random(0,255));
