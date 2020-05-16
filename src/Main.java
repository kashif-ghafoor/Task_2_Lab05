//My name is kashif ghafoor
public class Main {
    public static void main(String[] args) {
        Line line1 = new Line(1.0,2.0,3.0, 4.0);
        Line line2 = new Line(2.0, 3.0, 7.0, 5.0);
        boolean b1 = line1.isGreater(line1,line2);
        System.out.println("line1 is greater than line2: "+b1);
        boolean b2 = line1.isEqual(line1,line2);
        System.out.println("line1 is equal to line line2: "+b2);
        boolean b3 = line1.isLess(line1,line2);
        System.out.println("line1 is less than line2: "+b3);
        RelationInterface line3 = new Line(1.0, 5.0, 7.0, 9.0);
        boolean b4 = line3.isEqual(line1, (Line) line3);
        System.out.println("line1 is equal to line 3: "+b4);
        System.out.println("length of line1 is "+line1.getLength());
        System.out.println("length of line2 is "+line2.getLength());

    }
}