package creationalDesignPattern.prototype;

import javafx.geometry.Point3D;

/**
 * This class represents an abstract creationalDesignPattern.prototype & defines the clone method
 */
public abstract class GameUnit implements Cloneable {
	
	private Point3D position;
	
	public GameUnit() {
		position = Point3D.ZERO;
	}
	
	public GameUnit(float x, float y, float z) {
		position = new Point3D(x, y, z);
	}

	public void move(Point3D direction, float distance) {
		Point3D finalMove = direction.normalize();
		finalMove = finalMove.multiply(distance);
		position = position.add(finalMove);
	}
	
	public Point3D getPosition() {
		return position;
	}

    @Override
    //made public and changed the return type
    public GameUnit clone() throws CloneNotSupportedException { //Throws exception because there is a possibility that a subclass dont support cloning
	    //first thing that we need to think in cloning is whether we need deep copy or shallow copy

        //here in our case Point3D is immutable class so we can get away with shallow copy

        GameUnit unit = (GameUnit) super.clone();

        //whenever we are cloning an ibject we want to make sure that we reset its all values to initial stage
        unit.initialize();
        return unit;
    }

    protected void initialize() {
	    this.position = Point3D.ZERO;
	    reset();
    }

    //in the initialize method we are initialising the member of this class only.
    //There could be case where child class has there own member and we want them also to initialise to default when clone method is called
    //For that we are creating an abstract method which is going to be override by child classes

    protected abstract void reset();
}
