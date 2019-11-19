  int ellipseSize = 150;
void setup(){

size(200,200);
ellipse(100,100,ellipseSize,ellipseSize);}
void draw(){
for(int i = 1; i<=9; i++){
  if(i%2 ==0){
   fill( #FF0000);
  }
  else{
   fill( #000000);
  }
  ellipseSize = ellipseSize - i * 30;
  ellipse(100,100,ellipseSize, ellipseSize);
}}
  
