import ddf.minim.*;
//SoundFile song;
Minim minim;          
AudioPlayer player;
PImage ima;
int value =0;
float i,j;
float x1=0,x2=0,x1speedplus=0,x2speedplus=0;
int redLampClolr=0,greenLampColor=#03FF72;
int t=0,k=0;

void setup(){
  size(1300,700);
 //layout
  fill(#595959);
  rect(0,0,1300,600);
  fill(197,224,180);
  rect(0,600,1300,100);
  //sound
  minim = new
  Minim(this);
  player = minim.loadFile("WarningTone.mp3");
  //button images
  ima = loadImage( "SpeedButton.png" );
  
}

void draw(){
  background(#595959);
  paintLeftRoad();
  paintRightRoad();
  paintCenterRoad();
  paintLamp(); 
  button();
  paintCar1();
  paintCar2();
  //red-Button was pressed
  if(value==1){
    //warnningtone's playing
    if(t==1){
    player.play();
    player.rewind();
    t=0;  
   }
    redLampClolr=#CB1D46;
    greenLampColor=0;
    //stop two cars
      x1=i;
      x2=j; 
      //while two cars have passed the crossroad
      if(x1+130>840&&x2+977<460){
        value=0;
        redLampClolr=#CB1D46;
        greenLampColor=0;
      }
  }
  //car's running
  else if(value==0){
    x1=x1speedplus+x1+0.5;//car's running
    i=x1;
    x2=x2speedplus+x2-0.5;
    j=x2;
    //lamp's colorchangde
    redLampClolr=0;
    greenLampColor=#03FF72; 
  }
}

void mousePressed() { 
   if (mouseX>930 && mouseX<970 &&mouseY>610 &&mouseY<650) {
      value=1;  
      t=1;
   }
   
  if(mouseX>1020 && mouseX<1060 &&mouseY>610 &&mouseY<650) 
     value=0;   
}

void paintLeftRoad(){
  fill(#a9a9a9);
  rect(0,0,460,600);
  fill(#FFEC5A);
  beginShape();
  vertex(158,120);
  vertex(158,100);
  vertex(114,146);
  vertex(158,185);
  vertex(158,165);
  vertex(290,165);
  vertex(290,120);
  vertex(158,120);
  endShape();
}

void paintRightRoad(){
  fill(#a9a9a9);
  rect(840,0,1300,600);

  fill(#FFEC5A);
   beginShape();
  vertex(1067,408);
  vertex(1067,450);
  vertex(1198,450);
  vertex(1198,470);
  vertex(1244,429);
  vertex(1198,385);
  vertex(1198,405);
  vertex(1067,408);
  endShape();
}

void paintCenterRoad(){
  line(0,280,1300,280);
  for(int i=0;i<12;i=i+2){
    fill(255);
    rect(460,i*50,380,50);
    line(0,600,1300,600);
  }
}

void paintCar1(){
  fill(255);
  triangle(x1+218,377,x1+218,410,x1+250,410);
  fill(#F4F585);
  rect(x1+130,377,88,33);
  rect(x1+130,410,120,35);
  fill(0);
  ellipse(x1+150,445,25,25);
  ellipse(x1+218,445,25,25);
}
void paintCar2(){
  fill(255);
  triangle(x2+977+32,115-33,x2+977,115,x2+977+32,115);
  fill(#74A6EA);
  rect(x2+977+32,115-33,88,33);
  
  rect(x2+977,115,120,35);
  fill(0);
  ellipse(x2+977+32,150,25,25);
  ellipse(x2+977+100,150,25,25);
  // x=x-2;
}
void paintLamp(){
  fill(#555555);
  rect(925,213,87,172);
  fill(#969897);
  rect(937,226,62,148);  
  fill(redLampClolr);//redlamp #CB1D46 or 0
  ellipse(968,262,30,30);
  fill(greenLampColor);//greenlamp #03FF72 or 0
  ellipse(968,332,30,30);  
  fill(#3B3B3B);
  rect(988,385,22,199);
}

void button(){
  //Switch of Lamp
  fill(255);
  rect(900,600,180,90);
  
  fill(#CB1D46);
  rect(930,610,40,40);
  
  fill(#03FF72);
  rect(1020,610,40,40);
  
  fill(50);
  textSize(30);
  text("switch", 940, 675);
  //SpeedMachine
  imageMode(CORNER);
  image(ima, 200, 600, 130, 100);
   if (mouseX>200 && mouseX<330 &&mouseY>600 &&mouseY<700) {
     x1speedplus=x1speedplus+0.5;
     x2speedplus=x2speedplus-0.5;
   } 
}
