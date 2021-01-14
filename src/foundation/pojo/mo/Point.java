package foundation.pojo.mo;

/**
 * @Author : leaf.fly(?)
 * @Create : 2021-01-14 12:42
 * @Desc : 坐标
 * @Version : v1.0.0
 * @Blog : http://laiyefei.com
 * @Github : http://github.com/laiyefei
 */
public class Point {

    private final double x;
    private final double y;
    private boolean isDraw;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int getIntX() {
        return (int) x;
    }

    public int getIntY() {
        return (int) y;
    }

    public boolean isDraw() {
        return isDraw;
    }

    public void setDraw(boolean draw) {
        isDraw = draw;
    }

    public static final Point buildBy(double x, double y) {
        return new Point(x, y);
    }
}
