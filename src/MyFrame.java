import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame
{
    public MyFrame(String titolo)
    {
        super(titolo);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(30,30,400,600);
    }
}