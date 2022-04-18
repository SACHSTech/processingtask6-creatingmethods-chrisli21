import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0, 251, 255);

    // Return statement output center
    System.out.println("Center of the house 1 (x): " + houseReturnOutput(25, 50, 400));
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    // Grass Rectangle
    grass(0, 300, 400, 100);

    // Sun
    sun(50,60, 80);

    // House 1 
    house(150, 100, 200);

    // House 2
    house(houseReturnOutput(25, 50, 400)+150, 200, 200);
    }

  /**
  * draw base rectangle
  *
  * @param intGrassX 
  * @param intGrassY
  * @param intGrassWidth
  * @param intGrassHeight
  *
  */
    
    private void grass(int intGrassX, int intGrassY, int intGrassWidth, int intGrassHeight)
      {
        // Draw the rectangle base for the grass
        stroke(0, 120, 0);
        fill(0, 120, 0);
        rect(intGrassX, intGrassY, intGrassWidth, intGrassHeight);
      }
  /**
  * draw the circle
  *
  * @param intSunX
  * @param intSunY
  * @param intSunSize
  *
  */

    private void sun(int intSunx, int intSunY, int intSunSize)
      
	  // Sun
    stroke(255, 167, 0);
    fill(255,255,0);
    ellipse(intSunX, intSunY, intSunSize, intSunSize);
	 
  }
/**
  * house coordinates scale
  *
  * @param intHouseX 
  * @param intHouseY
  * @param intScale
  *
  */

private void house(int intHouseX, int intHouseY, int intScale)
  {
    // Base square for house
    fill(255, 25,, 255);
    rect(intHouseX, intHouseY + (intScale/8), (intScale/2), (intScale/2));

    // triangle for roof
    fill(247, 76, 2)
    triangle(intHouseX, intHouseY+(intScale/8, intHouseX+(intScale/4), intHouseY, intHouseX+(intScale/2), intHouseY+(intScale/8)));

    // rectangle door
    fill(168, 81, 0);
    rect(intHouseX+(intScale/4), intHouseY+((intScale/4)+(intScale/8)), (intScale/8) (intScale/4));
  }

/**
  * return function
  *
  * @param intHouseX
  * @param intHouseY
  * @param intScale
  * @return
  *
  */
private int houseReturnOutput(int housex, int housey, intscale)
  {
    return housex+(scale/4);
  }
}