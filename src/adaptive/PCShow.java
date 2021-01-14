package adaptive;

import central.core.DrawImpl;
import central.service.IDraw;

/**
 * @Author : leaf.fly(?)
 * @Create : 2021-01-14 12:42
 * @Desc : pc展示方式
 * @Version : v1.0.0
 * @Blog : http://laiyefei.com
 * @Github : http://github.com/laiyefei
 */
public class PCShow {
    static final IDraw getDraw() {
        return new DrawImpl();
    }

    public static final void run() {
        PCShow.getDraw();
    }
}
