import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class App extends JPanel implements ActionListener {
    private JTextField Nombre;
    private JLabel jcomp2;
    private JLabel jcomp3;
    private JTextField Salario;
    private JLabel jcomp5;
    private JTextField NG1;
    private JLabel jcomp7;
    private JTextField NG2;
    private JTextField NG3;
    private JTextField NG4;
    private JTextField NG5;
    private JLabel jcomp12;
    private JTextField VG2;
    private JTextField VG3;
    private JTextField VG4;
    private JTextField VG5;
    private JLabel jcomp17;
    private JTextField NObjetivo;
    private JLabel jcomp19;
    private JTextArea DG;
    private JLabel jcomp21;
    private JTextArea Im;
    private JLabel jcomp23;
    private JLabel jcomp24;
    private JTextArea PAM;
    private JLabel jcomp26;
    private JLabel jcomp27;
    private JLabel jcomp28;
    private JTextField CM;
    private JLabel jcomp30;
    private JTextField anos;
    private JLabel jcomp32;
    private JTextField Deudas;
    private JLabel jcomp34;
    private JLabel jcomp35;
    private JTextArea CTQA;
    private JButton Ok1;
    private JButton Ok2;
    private JButton Ok3;
    private JButton Ok4;
    private JTextField Vobjetivo;
    private JTextField VG1;
    private JTextField CI;
    private JTextArea jcomp44;
    private JLabel Total;
    
    

    public App() {
       
        Nombre = new JTextField (5);
        jcomp2 = new JLabel ("Nombre:");
        jcomp3 = new JLabel ("Salario:");
        Salario = new JTextField (5);
        jcomp5 = new JLabel ("5 Principales gastos:");
        NG1 = new JTextField (5);
        jcomp7 = new JLabel ("Nombre de los gatos:");
        NG2 = new JTextField (5);
        NG3 = new JTextField (5);
        NG4 = new JTextField (5);
        NG5 = new JTextField (5);
        jcomp12 = new JLabel ("Valor del gasto:");
        VG2 = new JTextField (5);
        VG3 = new JTextField (5);
        VG4 = new JTextField (5);
        VG5 = new JTextField (5);
        jcomp17 = new JLabel ("Objetivo financiero:");
        NObjetivo = new JTextField (5);
        jcomp19 = new JLabel ("Plan de ahorro mensual:");
        DG = new JTextArea (5, 5);
        jcomp21 = new JLabel ("Impuestos:");
        Im = new JTextArea (5, 5);
        jcomp23 = new JLabel ("Valor del objetivo:");
        jcomp24 = new JLabel ("Depues de gastos:");
        PAM = new JTextArea (5, 5);
        jcomp26 = new JLabel ("Calculadora de interes compuesto:");
        jcomp27 = new JLabel ("Cantidad Inicial:");
        jcomp28 = new JLabel ("Cantidad Mensual:");
        CM = new JTextField (5);
        jcomp30 = new JLabel ("Años:");
        anos = new JTextField (5);
        jcomp32 = new JLabel ("Deudas:");
        Deudas = new JTextField (5);
        jcomp34 = new JLabel ("(Sino tienes digita 0 )");
        jcomp35 = new JLabel ("Cuánto tienes que ahorrar deuda:");
        CTQA = new JTextArea (5, 5);
        Ok1 = new JButton ("OK");
        Ok1.addActionListener(this);
        Ok2 = new JButton ("Ok");
        Ok2.addActionListener(this);
        Ok3 = new JButton ("Ok");
        Ok3.addActionListener(this);
        Ok4 = new JButton ("Ok");
        Ok4.addActionListener(this);
        Vobjetivo = new JTextField (5);
        VG1 = new JTextField (5);
        CI = new JTextField (5);
        jcomp44 = new JTextArea (5, 5);
        Total = new JLabel ("Total:");

        //adjust size and set layout
        setPreferredSize (new Dimension (907, 549));
        setLayout (null);

        //add components
        add (Nombre);
        add (jcomp2);
        add (jcomp3);
        add (Salario);
        add (jcomp5);
        add (NG1);
        add (jcomp7);
        add (NG2);
        add (NG3);
        add (NG4);
        add (NG5);
        add (jcomp12);
        add (VG2);
        add (VG3);
        add (VG4);
        add (VG5);
        add (jcomp17);
        add (NObjetivo);
        add (jcomp19);
        add (DG);
        add (jcomp21);
        add (Im);
        add (jcomp23);
        add (jcomp24);
        add (PAM);
        add (jcomp26);
        add (jcomp27);
        add (jcomp28);
        add (CM);
        add (jcomp30);
        add (anos);
        add (jcomp32);
        add (Deudas);
        add (jcomp34);
        add (jcomp35);
        add (CTQA);
        add (Ok1);
        add (Ok2);
        add (Ok3);
        add (Ok4);
        add (Vobjetivo);
        add (VG1);
        add (CI);
        add (jcomp44);
        add (Total);

        //set component bounds (only needed by Absolute Positioning)
        Nombre.setBounds (125, 25, 100, 25);
        jcomp2.setBounds (10, 25, 100, 25);
        jcomp3.setBounds (10, 60, 100, 25);
        Salario.setBounds (125, 65, 100, 25);
        jcomp5.setBounds (15, 185, 130, 40);
        NG1.setBounds (15, 260, 100, 25);
        jcomp7.setBounds (10, 220, 125, 25);
        NG2.setBounds (15, 295, 100, 25);
        NG3.setBounds (15, 330, 100, 25);
        NG4.setBounds (15, 365, 100, 25);
        NG5.setBounds (15, 400, 100, 25);
        jcomp12.setBounds (140, 220, 100, 25);
        VG2.setBounds (135, 295, 100, 25);
        VG3.setBounds (135, 330, 100, 25);
        VG4.setBounds (135, 365, 100, 25);
        VG5.setBounds (135, 400, 100, 25);
        jcomp17.setBounds (5, 105, 120, 30);
        NObjetivo.setBounds (125, 115, 100, 25);
        jcomp19.setBounds (255, 165, 150, 25);
        DG.setBounds (405, 5, 100, 75);
        jcomp21.setBounds (610, 55, 100, 25);
        Im.setBounds (710, 30, 120, 100);
        jcomp23.setBounds (10, 155, 120, 30);
        jcomp24.setBounds (290, 25, 115, 30);
        PAM.setBounds (405, 140, 120, 100);
        jcomp26.setBounds (270, 240, 230, 40);
        jcomp27.setBounds (260, 290, 100, 25);
        jcomp28.setBounds (255, 335, 115, 30);
        CM.setBounds (375, 340, 100, 25);
        jcomp30.setBounds (275, 390, 100, 25);
        anos.setBounds (375, 385, 100, 25);
        jcomp32.setBounds (550, 235, 100, 25);
        Deudas.setBounds (610, 240, 100, 25);
        jcomp34.setBounds (600, 205, 120, 25);
        jcomp35.setBounds (500, 450, 215, 50);
        CTQA.setBounds (705, 440, 160, 100);
        Ok2.setBounds (75, 455, 100, 25);
        Ok3.setBounds (485, 340, 100, 25);
        Ok4.setBounds (735, 240, 100, 25);
        Vobjetivo.setBounds (125, 160, 100, 25);
        VG1.setBounds (135, 260, 100, 25);
        CI.setBounds (375, 290, 100, 25);
        jcomp44.setBounds (370, 445, 100, 75);
        Total.setBounds (275, 475, 100, 25);
    }

    public void actionPerformed(ActionEvent e){

        String nombre = Nombre.getText();
        String salarioStr = Salario.getText();
        String nombreObjetivo = NObjetivo.getText();
        String valorObjetivoStr = Vobjetivo.getText();

        int salario = Integer.parseInt(salarioStr);
        int valorObjetivo = Integer.parseInt(valorObjetivoStr);
        String nombre_Gasto1 = NG1.getText();
        String nombre_Gasto2 = NG2.getText();
        String nombre_Gasto3 = NG3.getText();
        String nombre_Gasto4 = NG4.getText();
        String nombre_Gasto5 = NG4.getText();

        String valor_Gasto1Str = VG1.getText();
        String valor_Gasto2Str = VG2.getText();
        String valor_Gasto3Str = VG3.getText();
        String valor_Gasto4Str = VG4.getText();
        String valor_Gasto5Str = VG5.getText();

        int valor_Gasto1 =  Integer.parseInt(valor_Gasto1Str);
        int valor_Gasto2 =  Integer.parseInt(valor_Gasto2Str);
        int valor_Gasto3 =  Integer.parseInt(valor_Gasto3Str);
        int valor_Gasto4 =  Integer.parseInt(valor_Gasto4Str);
        int valor_Gasto5 =  Integer.parseInt(valor_Gasto5Str);
        
        Usuario usuario = new Usuario(nombre, salario, nombreObjetivo, valorObjetivo);
    


        if(e.getSource() == Ok2){
            usuario.setNombre(nombre);
            usuario.setSalario(salario); // Asigna el salario como int
            usuario.setObjetivoNombre(nombreObjetivo);

            usuario.agregarGasto(Integer.parseInt(valor_Gasto1Str));
            usuario.agregarGasto(Integer.parseInt(valor_Gasto2Str));
            usuario.agregarGasto(Integer.parseInt(valor_Gasto3Str));
            usuario.agregarGasto(Integer.parseInt(valor_Gasto4Str));
            usuario.agregarGasto(Integer.parseInt(valor_Gasto5Str));


            int resultado2 = usuario.calcularSobranteDespuesGastos();
            DG.setText("Te sobran:\n " + resultado2);
            String resultado3 = usuario. mostrarPlanAhorroMensual();
            PAM.setText(resultado3);

            double resultado4 = usuario.calcularDineroDespuesImpuestos();
            Im.setText("Te sobran después de impuestos:\n"+ resultado4);



            

        }else if(e.getSource() == Ok3){

            String Cant_InicialStr = CI.getText();
            String Cant_mensualStr = CM.getText();
            String anStr = anos.getText();

            int Cant_Inicial  = Integer.parseInt(Cant_InicialStr);
            int Cant_mensual  = Integer.parseInt(Cant_mensualStr);
            int an = Integer.parseInt(anStr);
            
                    
            String resultado = InteresCompuesto.calcularInteresCompuesto(Cant_Inicial, Cant_mensual, an);

            jcomp44.setText(resultado);

        }else if(e.getSource() == Ok4){
        
            String duadasStr = Deudas.getText();
          
            
            int deudas = Integer.parseInt(duadasStr);
            String resultado1 = Deuda.calcularPagoDeuda(deudas, usuario);

            CTQA.setText(resultado1);


            

            
            
          
        
        }


    }
    public static void main (String[] args) { 
        JFrame frame = new JFrame ("Mis Finanzas");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new App());
        frame.pack();
        frame.setVisible (true);
    }
}

