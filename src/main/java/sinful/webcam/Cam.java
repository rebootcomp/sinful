
package sinful.webcam;

import com.github.sarxos.webcam.Webcam;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author tiagorlampert
 *
 * Source: https://github.com/sarxos/webcam-capture
 */
public class Cam {

    public static void Capture(String filePath, String fileName, int widthx, int heighty) throws IOException {
        Webcam webcam = Webcam.getDefault();
        if (webcam != null) {
//            System.out.println("Webcam: " + webcam.getName());
            webcam.setViewSize(new Dimension(widthx, heighty));
            webcam.open();
            ImageIO.write(webcam.getImage(), "PNG", new File(filePath + fileName + ".png"));
            webcam.close();
        }
    }
}
