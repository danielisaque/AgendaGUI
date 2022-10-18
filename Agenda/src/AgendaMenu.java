import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.ActionListener;


public class AgendaMenu extends JFrame {

    public AgendaMenu(){
        setTitle("AGENDA");
        setSize(400, 700);
        setLocation(150, 150);
        setResizable(false);
        getContentPane().setBackground(Color.darkGray);
    }

    public static void main(String [] args) {
        JFrame janela = new AgendaMenu();
        JMenuBar menu = new JMenuBar();

        JMenu menuOption1 = new JMenu("Criar evento");
        ActionListener listenerCriarEvento = new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                JFrame newWindow = new JFrame("Novo Evento");
                newWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                newWindow.setVisible(true);
            }
        };

        menu.add(menuOption1);
        JMenu menuOption2 = new JMenu("Excluir evento");
        menu.add(menuOption2);
        janela.setJMenuBar(menu);




        WindowListener fechaJanela = new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        };

        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

