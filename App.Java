import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class App extends JPanel implements ActionListener {
    private JTextField nombre;
    private JLabel jcomp2;
    private JLabel jcomp3;
    private JTextField salario;
    private JLabel jcomp5;
    private JTextField ng1;
    private JLabel jcomp7;
    private JTextField ng2;
    private JTextField ng3;
    private JTextField ng4;
    private JTextField ng5;
    private JLabel jcomp12;
    private JTextField vg2;
    private JTextField vg3;
    private JTextField vg4;
    private JTextField vg5;
    private JLabel jcomp17;
    private JTextField nObjetivo;
    private JLabel jcomp19;
    private JTextArea dg;
    private JLabel jcomp21;
    private JTextArea im;
    private JLabel jcomp23;
    private JLabel jcomp24;
    private JTextArea pam;
    private JLabel jcomp26;
    private JLabel jcomp27;
    private JLabel jcomp28;
    private JTextField cm;
    private JLabel jcomp30;
    private JTextField anos;
    private JLabel jcomp32;
    private JTextField deudas;
    private JLabel jcomp34;
    private JLabel jcomp35;
    private JTextArea ctqa;
    private JButton ok1;
    private JButton ok2;
    private JButton ok3;
    private JButton ok4;
    private JButton ok5;
    private JButton ok6;
    private JButton ok7;
    private JTextField vObjetivo;
    private JTextField vg1;
    private JTextField ci;

    public App() {
        
        nombre = new JTextField (5);
        jcomp2 = new JLabel ("Nombre:");
        jcomp3 = new JLabel ("Salario:");
        salario = new JTextField (5);
        jcomp5 = new JLabel ("5 Principales gastos:");
        ng1 = new JTextField (5);
        jcomp7 = new JLabel ("Nombre de los gastos:");
        ng2 = new JTextField (5);
        ng3 = new JTextField (5);
        ng4 = new JTextField (5);
        ng5 = new JTextField (5);
        jcomp12 = new JLabel ("Valor del gasto:");
        vg2 = new JTextField (5);
        vg3 = new JTextField (5);
        vg4 = new JTextField (5);
        vg5 = new JTextField (5);
        jcomp17 = new JLabel ("Objetivo financiero:");
        nObjetivo = new JTextField (5);
        jcomp19 = new JLabel ("Plan de ahorro mensual:");
        dg = new JTextArea (5, 5);
        jcomp21 = new JLabel ("Impuestos:");
        im = new JTextArea (5, 5);
        jcomp23 = new JLabel ("Valor del objetivo:");
        jcomp24 = new JLabel ("Después de gastos:");
        pam = new JTextArea (5, 5);
        jcomp26 = new JLabel ("Calculadora de interés compuesto:");
        jcomp27 = new JLabel ("Cantidad Inicial:");
        jcomp28 = new JLabel ("Cantidad Mensual:");
        cm = new JTextField (5);
        jcomp30 = new JLabel ("Años:");
        anos = new JTextField (5);
        jcomp32 = new JLabel ("Deudas:");
        deudas = new JTextField (5);
        jcomp34 = new JLabel ("(Si no tienes, 0)") ;
        jcomp35 = new JLabel ("Cuánto tienes que ahorrar deuda:");
        ctqa = new JTextArea (5, 5);
        ok1 = new JButton ("Ok");
        ok1.addActionListener(this);
        ok2 = new JButton ("Ok");
        ok2.addActionListener(this);
        ok3 = new JButton ("Ok");
        ok3.addActionListener(this);
        ok4 = new JButton ("OK");
        ok4.addActionListener(this);
        ok5 = new JButton ("Ok");
        ok5.addActionListener(this);
        ok6 = new JButton ("Ok");
        ok6.addActionListener(this);
        ok7 = new JButton ("Ok");
        ok7.addActionListener(this);
        vObjetivo = new JTextField (5);
        vg1 = new JTextField (5);
        ci = new JTextField (5);

   
        setPreferredSize (new Dimension (884, 512));
        setLayout (null);

        
        add (nombre);
        add (jcomp2);
        add (jcomp3);
        add (salario);
        add (jcomp5);
        add (ng1);
        add (jcomp7);
        add (ng2);
        add (ng3);
        add (ng4);
        add (ng5);
        add (jcomp12);
        add (vg2);
        add (vg3);
        add (vg4);
        add (vg5);
        add (jcomp17);
        add (nObjetivo);
        add (jcomp19);
        add (dg);
        add (jcomp21);
        add (im);
        add (jcomp23);
        add (jcomp24);
        add (pam);
        add (jcomp26);
        add (jcomp27);
        add (jcomp28);
        add (cm);
        add (jcomp30);
        add (anos);
        add (jcomp32);
        add (deudas);
        add (jcomp34);
        add (jcomp35);
        add (ctqa);
        add (ok1);
        add (ok2);
        add (ok3);
        add (ok4);
        add (ok5);
        add (ok6);
        add (ok7);
        add (vObjetivo);
        add (vg1);
        add (ci);

        (only needed by Absolute Positioning)
        nombre.setBounds (125, 25, 100, 25);
        jcomp2.setBounds (10, 25, 100, 25);
        jcomp3.setBounds (10, 60, 100, 25);
        salario.setBounds (125, 65, 100, 25);
        jcomp5.setBounds (15, 185, 130, 40);
        ng1.setBounds (15, 260, 100, 25);
        jcomp7.setBounds (10, 220, 125, 25);
        ng2.setBounds (15, 295, 100, 25);
        ng3.setBounds (15, 330, 100, 25);
        ng4.setBounds (15, 365, 100, 25);
        ng5.setBounds (15, 400, 100, 25);
        jcomp12.setBounds (140, 220, 100, 25);
        vg2.setBounds (135, 295, 100, 25);
        vg3.setBounds (135, 330, 100, 25);
        vg4.setBounds (135, 365, 100, 25);
        vg5.setBounds (135, 400, 100, 25);
        jcomp17.setBounds (5, 105, 120, 30);
        nObjetivo.setBounds (125, 115, 100, 25);
        jcomp19.setBounds (420, 135, 150, 25);
        dg.setBounds (450, 5, 100, 75);
        jcomp21.setBounds (645, 30, 100, 25);
        im.setBounds (725, 5, 100, 75);
        jcomp23.setBounds (10, 155, 120, 30);
        jcomp24.setBounds (340, 25, 115, 30);
        pam.setBounds (575, 115, 100, 75);
        jcomp26.setBounds (295, 230, 230, 40);
        jcomp27.setBounds (260, 290, 100, 25);
        jcomp28.setBounds (255, 335, 115, 30);
        cm.setBounds (375, 340, 100, 25);
        jcomp30.setBounds (275, 390, 100, 25);
        anos.setBounds (375, 385, 100, 25);
        jcomp32.setBounds (565, 280, 100, 25);
        deudas.setBounds (630, 280, 100, 25);
        jcomp34.setBounds (620, 250, 120, 25);
        jcomp35.setBounds (555, 410, 215, 50);
        ctqa.setBounds (755, 400, 100, 75);
        ok1.setBounds (230, 25, 95, 20);
        ok2.setBounds (230, 65, 100, 25);
        ok3.setBounds (230, 115, 100, 25);
        ok4.setBounds (230, 160, 100, 25);
        ok5.setBounds (75, 445, 100, 25);
        ok6.setBounds (485, 340, 100, 25);
        ok7.setBounds (755, 280, 100, 25);
        vObjetivo.setBounds (125, 160, 100, 25);
        vg1.setBounds (135, 260, 100, 25);
        ci.setBounds (375, 290, 100, 25);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ok1) {
            String nombreTexto = nombre.getText();
        } else if (e.getSource() == ok2) {
            int CSalario = Integer.parseInt(salario.getText());
        } else if (e.getSource() == ok3) {
            String nObjetivoText = nObjetivo.getText();
        } else if (e.getSource() == ok4) {
            int CvObjetivo = Integer.parseInt(vObjetivo.getText());
        } else if (e.getSource() == ok5) {
            String ng1Text = ng1.getText();
            String ng2Text = ng2.getText();
            String ng3Text = ng3.getText();
            String ng4Text = ng4.getText();
            String ng5Text = ng5.getText();
            int Cvg1 = Integer.parseInt(vg1.getText());
            int Cvg2 = Integer.parseInt(vg2.getText());
            int Cvg3 = Integer.parseInt(vg3.getText());
            int Cvg4 = Integer.parseInt(vg4.getText());
            int Cvg5 = Integer.parseInt(vg5.getText());
            
        } else if (e.getSource() == ok6) {
            String ciText = ci.getText();
            int Ccm = Integer.parseInt(cm.getText());
            int Canos = Integer.parseInt(anos.getText());
        } else if (e.getSource() == ok7) {
            int cdeudas = Integer.parseInt(deudas.getText());
        }

        
        actualizarInformacion();
    }

    
    private void actualizarInformacion() {
        
        dg.setText("Texto");
        im.setText("Texto");
        pam.setText("Texto");
        ctqa.setText("Texto");
    }
