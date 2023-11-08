import java.awt.*;

public class Car implements Imovable {
    private int nrDoors;
    private double enginePower;
    private Color color;
    private String modelName;
    protected double currentSpeed;
    private double x;
    private double y;
    private directions dir;

    enum directions {
        NORTH, EAST, SOUTH, WEST
    }

    public Car(int nrDoors, double enginePower, Color color, String modelName) {
        this.nrDoors = nrDoors;
        this.color = color;
        this.enginePower = enginePower;
        this.modelName = modelName;
        x = 0; // Starting position
        y = 0;
        dir = directions.NORTH; // Start with a direction, north.
        stopEngine();
    }

    public void turnleft() {
        switch (dir) {
            case NORTH:
                dir = directions.WEST;
            case WEST:
                dir = directions.SOUTH;
            case SOUTH:
                dir = directions.EAST;
            case EAST:
                dir = directions.NORTH;
        }
    }

    public void turnright() {
        switch (dir) {
            case NORTH:
                dir = directions.EAST;
            case EAST:
                dir = directions.SOUTH;
            case SOUTH:
                dir = directions.WEST;
            case WEST:
                dir = directions.NORTH;
        }
    }

    public void move() {
        switch (dir) {
            case NORTH:
                x += currentSpeed;
            case WEST:
                y -= currentSpeed;
            case SOUTH:
                x -= currentSpeed;
            case EAST:
                y += currentSpeed;
        }

    }

    public int getNrDoors() {
        return nrDoors;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color clr) {
        color = clr;
    }

    public void startEngine() {
        currentSpeed = 0.1;
    }

    public void stopEngine() {
        currentSpeed = 0;
    }


}


