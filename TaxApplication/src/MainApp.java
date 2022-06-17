import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainApp extends JFrame{
    private JTextField PricetextField;
    private JButton CalButton;
    private JLabel PriceTextLabel;
    private JLabel ResultLabel;
    private JPanel MainPanel;
    private JButton DuheeBottom;

    public MainApp(String title) {
        super(title);
        this.setContentPane(MainPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();


        CalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double price = Double.parseDouble(PricetextField.getText());
                price = price * 1.1;
                ResultLabel.setText(price.toString() + "THB");

            }
        });
        DuheeBottom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DUHEE duhee=new DUHEE("HeeYai");
                duhee.setVisible(true);
            }
        });
    }
}
