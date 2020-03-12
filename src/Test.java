import javax.swing.*;
import java.awt.*;

public class Test
{
    public static void main(String[] args) {
        MyFrame f = new MyFrame("Prova Frame");
        Container c = f.getContentPane();
        MyPanel panel = new MyPanel();
        c.add(panel);

        f.setVisible(true);
    }
}
