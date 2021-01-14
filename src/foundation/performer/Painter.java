package foundation.performer;

import foundation.pojo.mo.Formula;
import foundation.pojo.mo.Point;
import foundation.prepper.Framer;

import java.awt.*;
import java.util.List;

/**
 * @Author : leaf.fly(?)
 * @Create : 2021-01-14 12:42
 * @Desc : 画家
 * @Version : v1.0.0
 * @Blog : http://laiyefei.com
 * @Github : http://github.com/laiyefei
 */
public class Painter {

    private final Formula formula;

    public Painter(Formula formula) {
        this.formula = formula;
    }

    public void paint(Framer framer, Graphics g) {
        Image offScreen = framer.createImage();
        Graphics graphics = offScreen.getGraphics();
        final List<Point> points = this.formula.toPoints(framer);
        for (Point point : points) {
            graphics.setColor(Color.PINK);
            graphics.fillOval(point.getIntX(), point.getIntY(), 2, 2);
            if (point.isDraw()) {
                // 生成图片
                g.drawImage(offScreen, 0, 0, framer);
            }
        }
    }
}
