package central.core;

import central.service.IDraw;
import foundation.performer.Painter;
import foundation.pojo.mo.Formula;
import foundation.prepper.Framer;

/**
 * @Author : leaf.fly(?)
 * @Create : 2021-01-14 12:42
 * @Desc : 画图公式的实现
 * @Version : v1.0.0
 * @Blog : http://laiyefei.com
 * @Github : http://github.com/laiyefei
 */
public class DrawImpl implements IDraw {

    private final Framer framer;
    private final Painter painter;
    private final Formula formula;

    public DrawImpl() {
        this.formula = new Formula();
        this.painter = new Painter(this.formula);
        this.framer = new Framer(this.painter);
    }
}
