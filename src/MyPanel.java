import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MyPanel extends JPanel implements ActionListener, ItemListener
{
    JLabel lblInfo;
    JButton btnProva, btnProva2;
    JCheckBox ck1;
    JTextField text1, text2;
    JRadioButton b1, b2;
    ButtonGroup grp;

    public MyPanel()
    {
        lblInfo = new JLabel("Sfondo bianco.");
        btnProva = new JButton("Imposta lo sfondo AZZURRO");
        btnProva2 = new JButton("Imposta lo sfondo ROSSO");
        text1 = new JTextField("Scrivi qui");
        text2 = new JTextField("Non puoi modificarmi.");
        text2.setEditable(false);
        ck1 = new JCheckBox("Cambia sfondo");
        b1 = new JRadioButton("Arancione");
        b2 = new JRadioButton("Rosa");
        grp = new ButtonGroup();
        grp.add(b1);
        grp.add(b2);

        setLayout(new GridLayout(8,1));
        add(lblInfo);
        add(text1);
        add(text2);
        add(btnProva);
        add(btnProva2);
        add(ck1);
        add(b1);
        add(b2);

        btnProva.addActionListener(this);
        btnProva2.addActionListener(this);
        ck1.addItemListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void itemStateChanged(ItemEvent e)
    {
        if(ck1.isSelected())
        {
            setBackground(Color.BLUE);
            text2.setText("Opzione attivata.");
        }
        else
        {
            setBackground(Color.white);
            text2.setText("Opzione disattivata.");
        }
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
        if(pulsantePremuto==b1)
        {
            text2.setText("Radio button cliccato - ARANCIONE!");
            setBackground(Color.orange);
        }
        if(pulsantePremuto==b2)
        {
            text2.setText("Radio button cliccato - ROSA!");
            setBackground(Color.pink);
        }
    }
}
