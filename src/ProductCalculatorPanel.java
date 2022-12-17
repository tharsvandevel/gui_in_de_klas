import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductCalculatorPanel {
    private JPanel panel1;
    private JButton berekenButton;
    private JTextPane uitkomstTextPane;
    private JTextPane getal2TextPane;
    private JTextPane getal1TextPane;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;

    public ProductCalculatorPanel() {
        berekenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double getal1 = Double.parseDouble(textField1.getText());
                double getal2 = Double.parseDouble(textField2.getText());
                //+"" => convert opnieuw naar String
                textField3.setText((getal1*getal2)+"");
            }
        });
    }

    public void run() {
        JFrame frame = new JFrame();
        frame.setContentPane(panel1);
        frame.setTitle("Bereken product");
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
