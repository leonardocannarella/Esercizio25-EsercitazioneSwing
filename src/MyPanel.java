import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener
{
    JLabel lblInfo;
    JButton btnProva, btnProva2;
    JTextField text1, text2;

    public MyPanel()
    {
        lblInfo = new JLabel("Sfondo bianco.");
        btnProva = new JButton("Imposta lo sfondo AZZURRO");
        btnProva2 = new JButton("Imposta lo sfondo ROSSO");
        text1 = new JTextField("Scrivi qui");
        text2 = new JTextField("Non puoi modificarmi.");
        text2.setEditable(false);

        setLayout(new GridLayout(6,1));
        add(lblInfo);
        add(text1);
        add(text2);
        add(btnProva);
        add(btnProva2);

        btnProva.addActionListener(this);
        btnProva2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        Object pulsantePremuto = e.getSource();

        if(pulsantePremuto==btnProva)
        {
            lblInfo.setText("Sfondo impostato su AZZURRO.");
            setBackground(Color.cyan);
        }
        if(pulsantePremuto==btnProva2)
        {
            lblInfo.setText("Sfondo impostato su ROSSO.");
            setBackground(Color.red);
        }
    }
}
