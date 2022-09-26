import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ActionnListener extends JFrame{
    private static final long serialVersionUID = 1L;

    JButton button1 = new JButton("Click me, button 1");
    JButton button2 = new JButton("Click me, button 2");

    public ActionnListener(){
        super("Action Lister Interface");

        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(button1);
        getContentPane().add(button2);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Without Lambda Expression");
            }
        });

        button2.addActionListener(e -> {
            System.out.println("With Lambda Expression");
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,100);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ActionnListener().setVisible(true);
            }
        });

    
    }
}