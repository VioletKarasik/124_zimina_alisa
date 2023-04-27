function setup()
{
 //create a canvas for the robot
 createCanvas(1000, 700);
}

function draw()
{
 strokeWeight(2);

 //robot body 1 - delete this code and make your own robot body
 fill(200);
 rect(90, 200, 120, 130);
 rect(70, 200, 30, 100);
 rect(200, 200, 30, 100);
 rect(120, 330, 30, 110);
 rect(150, 330, 30, 110);

 //robot body 2 - delete this code and make your own robot body
 fill(255, 0, 0);
 rect(390, 200, 120, 130);
 rect(370, 200, 30, 100);
 rect(500, 200, 30, 100);
 rect(420, 330, 30, 110);
 rect(450, 330, 30, 110);


 //robot body 3 - delete this code and make your own robot body
 fill(0, 255, 0);
 rect(690, 200, 120, 130);
 rect(670, 200, 30, 100);
 rect(800, 200, 30, 100);
 rect(720, 330, 30, 110);
 rect(750, 330, 30, 110);


 // !!! Draw the robot heads - You shouldn't need to change this code !!!

 //robot head 1
 fill(200);
 rect(100, 100, 100, 100, 10);
    //robot head 2
 rect(400, 100, 100, 100, 10);
    //robot head 3
 rect(700, 100, 100, 100, 10);

 //ears
 fill(250, 50, 50);

 //robot ears 1
 rect(93, 130, 10, 33);
 rect(197, 130, 10, 33);

 //robot ears 2
 rect(393, 130, 10, 33);
 rect(497, 130, 10, 33);

 //robot ears 3
 rect(693, 130, 10, 33);
 rect(797, 130, 10, 33);



 //robots' antennas
 fill(250, 250, 0);
    // robot antenna 1
 ellipse(150, 93, 15, 15);
    // robot antenna 1
 ellipse(450, 93, 15, 15);
    // robot antenna 1
 ellipse(750, 93, 15, 15);

    //robots' antennas
 fill(200, 0, 200);
    // robot antenna 1
 rect(140, 97, 25, 20);
    // robot antenna 2
 rect(440, 97, 25, 20);
    // robot antenna 3
 rect(740, 97, 25, 20);


 //robot 1's eyes
 fill(255, 0, 0);
 ellipse(125, 130, 30, 30);
 point(135, 130);
 ellipse(175, 130, 30, 30);
 point(165, 130);

 //robot 2's eyes
 fill(0, 255, 0);
 ellipse(425, 130, 30, 30);
 point(435, 130);
 ellipse(475, 130, 30, 30);
 point(465, 130);

 //robot 3's eyes
 fill(0, 0, 255);
 ellipse(725, 130, 30, 30);
 point(735, 130);
 ellipse(775, 130, 30, 30);
 point(765, 130);


 //robots' noses
 fill(255, 255, 0);
    //robot 1 nose
 triangle(150, 135, 135, 170, 165, 170);
    //robot 2 nose
 triangle(450, 135, 435, 170, 465, 170);
    //robot 3 nose
 triangle(750, 135, 735, 170, 765, 170);

 //robot 1 mouth
 noFill();
 beginShape();
 vertex(128, 175);
 vertex(136, 195);
 vertex(142, 175);
 vertex(150, 195);
 vertex(158, 175);
 vertex(166, 195);
 vertex(174, 175);
 endShape();

 //robot 2 mouth
 beginShape();
 vertex(428, 175);
 vertex(436, 195);
 vertex(442, 175);
 vertex(450, 195);
 vertex(458, 175);
 vertex(466, 195);
 vertex(474, 175);
 endShape();

 //robot 3 mouth
 beginShape();
 vertex(728, 175);
 vertex(736, 195);
 vertex(742, 175);
 vertex(750, 195);
 vertex(758, 175);
 vertex(766, 195);
 vertex(774, 175);
 endShape();
}
