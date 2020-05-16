//My name is kashif ghafoor
public interface RelationInterface {
    // all methods inside an interface are implicitly
    // public and all fields are implicitly public static final.
    // So, there is no need to write public while prototyping a  public method in interface
    boolean isGreater(Line x,Line y);
    boolean isLess(Line x, Line y);
    boolean isEqual(Line x, Line y);
}
