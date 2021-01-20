package foundation.pojo.co;


import java.awt.*;

/**
 * @Author : leaf.fly(?)
 * @Create : 2021-01-14 12:42
 * @Desc : 窗口配置
 * @Version : v1.0.0
 * @Blog : http://laiyefei.com
 * @Github : http://github.com/laiyefei
 */
public enum WinConfig {
    WIDTH(800, "加载窗口宽度"),
    HEIGHT(800, "加载窗口高度"),
    SCREEN_WIDTH(Toolkit.getDefaultToolkit().getScreenSize().width, "加载窗口宽度"),
    SCREEN_HEIGHT(Toolkit.getDefaultToolkit().getScreenSize().height, "加载窗口高度"),
    ;
    private final int param;
    private final String description;

    WinConfig(int param, String description) {
        this.param = param;
        this.description = description;
    }

    public int getParam() {
        return param;
    }

    public String getDescription() {
        return description;
    }
}
