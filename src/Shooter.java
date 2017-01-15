
public class Shooter {

    private	double height;
    private	double velocity;
    
    public Shooter(){
    	height = 2.47;  // in meters
    	velocity = 8.8;   // meters per second are the measure units
    }
    
    /**
    @param r is the distance from the target
    @param angle is the angle of the shooter
    */
	public void shoot(double r, double angle){
		
		
		double radians = Math.toRadians(angle);
		r= r+0.8; // the distance from the target's end- the basket's end.
		double time= r/(velocity*Math.cos(radians));
		
		double height2 = (r*Math.tan(radians)-5*(r/(velocity*Math.cos(radians)))*(r/(velocity*Math.cos(radians))));
		
		if (height-0.4<height2 && height>height2 ){
		    System.out.println("we're good to go");
		      
		}
		else {
			System.out.println(angle);System.out.println(height2); 
			this.shoot(r-0.8, angle+0.5);
		}
		}
		
	}
	
		
	
