
package sinful.screenshot;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author tiagorlampert
 * 
 * Source: http://www.codejava.net/java-se/graphics/how-to-capture-screenshot-programmatically-in-java
 */
public class Screenshot {

    public static void TakeScreenshot(String filePath, String fileName) {
        try {
            Robot robot = new Robot();
            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
            ImageIO.write(screenFullImage, "jpg", new File(filePath + fileName + ".jpg"));
        } catch (AWTException | IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
