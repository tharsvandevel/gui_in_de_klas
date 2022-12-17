import javax.swing.*;

public class ProductCalculatorPanel {
    private JPanel panel1;
    private JButton berekenButton;
    private JTextPane uitkomstTextPane;
    private JTextPane getal2TextPane;
    private JTextPane getal1TextPane;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;

    public void run() {
        JFrame frame = new JFrame();
        frame.setContentPane(panel1);
        frame.setTitle("Bereken product");
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
