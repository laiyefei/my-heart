package adaptive;

import foundation.pojo.co.Who;

/**
 * @Author : leaf.fly(?)
 * @Create : 2021-01-14 12:42
 * @Desc : my heart
 * @Version : v1.0.0
 * @Blog : http://laiyefei.com
 * @Github : http://github.com/laiyefei
 */
public enum MyHeart {
    Only;

    public void meet(final String who) {
        if (!Who.LINSIJIA.equals(who)) {
            throw new RuntimeException("error: not allow.");
        }
        PCShow.run();
    }
}
