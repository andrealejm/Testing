import javax.swing.*;
import java.awt.*;
public class Ventana extends JFrame {
    public void abrirVentana (){

        this.setVisible(true);
        this.setSize(450, 450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My Window");
        this.setMinimumSize(new Dimension(250,250));
        this.setMaximumSize(new Dimension(750,750));
        this.setResizable(true);
        this.setLocation(200, 200);
        this.setLocationRelativeTo(null);
        iniciarComponentes();
    }

    public void iniciarComponentes(){
        JPanel login =new JPanel();
        login.setSize(this.getWidth(),this.getHeight());

        this.add(login);
        login.setBackground(Color.LIGHT_GRAY);
        login.setLayout(null);

        JLabel label = new JLabel();
        label.setText("Hola");
        label.setBounds(100,10,200,100);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Comic Sans MS",Font.PLAIN,40));
        label.setOpaque(true);
        label.setBackground(Color.DARK_GRAY);
        label.setForeground(Color.WHITE);

        JLabel nombreUsuarioLb = new JLabel("Nombre De Usuario");
        nombreUsuarioLb.setBounds(10,120,200,50);
        nombreUsuarioLb.setFont(new Font("Comic Sans MS",Font.PLAIN,17));

        JTextField nombreUsuarioTF = new JTextField();
        nombreUsuarioTF.setBounds(10,160,300,30);

        JLabel contraseñaLb = new JLabel("Contraseña:");
        contraseñaLb.setBounds(10,220,200,50);
        contraseñaLb.setFont(new Font("Comic Sans MS",Font.PLAIN,17));

        JTextField contraseñaTF = new JTextField();
        contraseñaTF.setBounds(10,260,300,30);

        JCheckBox recordarmeCB = new JCheckBox();
        recordarmeCB.setText("Recordarme");
        recordarmeCB.setBounds(10,290,100,30);

        JLabel olvideContraseñaLb = new JLabel("Olvido su contraseña?");
        olvideContraseñaLb.setBounds(150,290,130,30);


        JButton accederB = new JButton("ACCEDER");
        accederB.setBounds(100,330,200,50);

        login.add(label);
        login.add(nombreUsuarioTF);
        login.add(nombreUsuarioLb);
        login.add(contraseñaTF);
        login.add(contraseñaLb);
        login.add(recordarmeCB);
        login.add(olvideContraseñaLb);
        login.add(accederB);

    }

}