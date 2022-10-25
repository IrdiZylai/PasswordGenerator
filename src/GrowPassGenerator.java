import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class GrowPassGenerator {
    private JTextField txtUrl;
    private JPanel passGenerator;
    private JTextField txtUsername;
    private JFormattedTextField txtGeneratedAdminPasss;
    private JLabel txtGeneratedUserPass;
    private JButton btnGenerateAdminPass;
    private JButton btnGenerateUserPass;
    private JFormattedTextField txtGeneratedUserPasss;

    public GrowPassGenerator() { passGenerator.addComponentListener(new ComponentAdapter() { } );
        txtUrl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        btnGenerateAdminPass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String adminPass = txtUrl.getText();
                String cap = adminPass.substring(0, 1).toUpperCase() + adminPass.substring(1);
                String firstCapLetter = cap.substring(0,1);
                String lastCapLetter = cap.substring(cap.length()-1);;
                String firstTwoCapitalize = firstCapLetter.toUpperCase() + lastCapLetter.toUpperCase();
                String lastTwoCapitalize = lastCapLetter.toUpperCase() + firstCapLetter.toUpperCase();
                String finalPass = cap + firstTwoCapitalize + "123" + lastTwoCapitalize + ".";
                txtGeneratedAdminPasss.setText(finalPass);
            }
        });


        btnGenerateUserPass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String adminPass = txtUsername.getText();
                String cap = adminPass.substring(0, 1).toUpperCase() + adminPass.substring(1);
                String firstCapLetter = cap.substring(0,1);
                String lastCapLetter = cap.substring(cap.length()-1);;
                String firstTwoCapitalize = firstCapLetter.toUpperCase() + lastCapLetter.toUpperCase();
                String lastTwoCapitalize = lastCapLetter.toUpperCase() + firstCapLetter.toUpperCase();
                if(cap.length()>=3) {
                    String finalPass = cap + firstTwoCapitalize + cap.length() + (cap.length() - 1) + (cap.length() - 2) + lastTwoCapitalize + ".";
                    txtGeneratedUserPasss.setText(finalPass);
                }else JOptionPane.showMessageDialog(new JFrame(), "Username duhet me i gjat se 3 karaktere");

            }
        });
    }public static void main(String[] args) {
        JFrame frame = new JFrame("GrowPassGenerator");
        frame.setContentPane(new GrowPassGenerator().passGenerator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
