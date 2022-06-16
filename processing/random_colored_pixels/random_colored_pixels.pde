void setup(){
 size(600,600); 
 background(32);
}


void draw(){
   for(int i=0;i<width;i++){
     for(int j=0;j<height;j++){
       stroke(random(0,255),random(0,255),random(0,255));
       //point(i,j);
       rect(i,j,2,2);
     }
   }
}
