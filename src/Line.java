//My name is kashif ghafoor
import java.lang.reflect.Field;//importing java library to get
// the fields of class

public class Line implements RelationInterface {//keyword implement is used to implement interface in class
    private double x1;
    private double x2;
    private double y1;
    private double y2;


    public Line(double x1, double x2, double y1, double y2) {//constructor
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    public double getLength() {
        Field[] fields = Line.class.getDeclaredFields();//getting fields of this class
        return fields.length;//returning number of fields to main class
    }

    public boolean isGreater(Line x, Line y) {
        if ((x.x1 + x.x2 + x.y1 + x.y2) > (y.x1 + y.x2 + y.y1 + y.y2))
            return true;
        else
            return false;
    }

    public boolean isLess(Line x, Line y) {
        if ((x.x1 + x.x2 + x.y1 + x.y2) < (y.x1 + y.x2 + y.y1 + y.y2))
            return true;
        else
            return false;
    }

    public boolean isEqual(Line x, Line y) {
        if ((x.x1 + x.x2 + x.y1 + x.y2) == (y.x1 + y.x2 + y.y1 + y.y2))
            return true;
        else
            return false;
    }
}