package foundation.prepper;

import foundation.performer.Painter;
import foundation.pojo.co.WinConfig;

import javax.swing.*;
import java.awt.*;

/**
 * @Author : leaf.fly(?)
 * @Create : 2021-01-14 12:42
 * @Desc : 框架师
 * @Version : v1.0.0
 * @Blog : http://laiyefei.com
 * @Github : http://github.com/laiyefei
 */
public class Framer extends JFrame {

    private final int width;
    private final int height;
    private final int screenWidth;
    private final int screenHeight;
    private final Painter painter;

    public Framer(Painter painter) {
        this.width = WinConfig.WIDTH.getParam();
        this.height = WinConfig.HEIGHT.getParam();
        this.screenWidth = WinConfig.SCREEN_WIDTH.getParam();
        this.screenHeight = WinConfig.SCREEN_HEIGHT.getParam();
        this.painter = painter;
        setFrame();
    }

    private void setFrame() {
        //设置框架结构
        // 设置窗口标题
        this.setTitle("心形曲线");
        // 设置窗口初始位置
        this.setLocation((this.screenWidth - this.width) / 2, (this.screenHeight - this.height) / 2);
        // 设置窗口大小
        this.setSize(this.width, this.height);
        // 设置背景色
        this.setBackground(Color.BLACK);
        // 设置窗口关闭方式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置窗口显示
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        painter.paint(this, g);
    }

    public Image createImage() {
        return createImage(width, height);
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }
}
