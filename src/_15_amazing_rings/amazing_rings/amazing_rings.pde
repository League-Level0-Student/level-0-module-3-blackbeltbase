      int ellipseSize = 300;
      int ring1X = 100;
      int ringY = 250;
      int ring2X = 950;
void setup(){

size(1000,500);
}
void draw(){
background(#C6C6C2);
for(int i = 0; i<= 20; i++){
noFill();
//left ring
     ellipse(ring1X, ringY,ellipseSize- i * 21, ellipseSize- i * 21); 
     //right ring
 ellipse(ring2X, ringY,ellipseSize- i * 21, ellipseSize- i * 21);
if(ring2X ==0){
  redoRings();
}
}
ring1X ++;
ring2X --;
}

void redoRings()
{
ring1X = 0;
ring2X = 1000;
}

  
