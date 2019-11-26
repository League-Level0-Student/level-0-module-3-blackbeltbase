      int ellipseSize = 150;
void setup(){

size(200, 200);
}
void draw(){
for(int i = 0; i<=8; i++){


  if(i%2 ==0){
   fill( #FF0000);
     ellipse(100,100,ellipseSize- i * 21, ellipseSize- i * 21);
  }
  else{
   fill( #000000);
     ellipse(100,100,ellipseSize- i * 21, ellipseSize- i * 21);
  }
  fill(#000000);
  ellipse(100,100, 15, 15);

}
}
  
