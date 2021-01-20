package foundation.pojo.mo;

import foundation.prepper.Framer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : leaf.fly(?)
 * @Create : 2021-01-14 12:42
 * @Desc : 公式
 * @Version : v1.0.0
 * @Blog : http://laiyefei.com
 * @Github : http://github.com/laiyefei
 */
public final class Formula {
    private int maxPointX = 90;
    private int maxPointY = 90;
    private double r;

    public final List<Point> toPoints(Framer framer) {
        int width = framer.getWidth();
        int height = framer.getHeight();
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < maxPointX; i++) {
            for (int j = 0; j < maxPointY; j++) {
                r = Math.PI / 45 * i * (1 - Math.sin(Math.PI / 45 * j)) * 45;
                Point point = Point.buildBy(
                        r * Math.cos(Math.PI / 45 * j) * Math.sin(Math.PI / 45 * i) + width / 2,
                        -r * Math.sin(Math.PI / 45 * j) + height / 4
                );
                point.setDraw(maxPointY - 1 <= j);
                points.add(point);
            }
        }
        return points;
    }
}
