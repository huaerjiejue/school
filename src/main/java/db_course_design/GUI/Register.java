package db_course_design.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register {
    private JPanel Register;
    private JPasswordField PasswordInput1;
    private JPasswordField PasswordInput2;
    private JButton RegisterButton;
    private JTextField AccountInput;
    private JLabel AccountLabel;
    private JLabel PasswordLabel1;
    private JLabel PassWordLabel2;
    private JRadioButton RadioButton1;
    private JRadioButton RadioButton2;
    private JLabel Choice;
    private String account;
    private String password;
    private boolean isAdministrator;


    public Register() {
        JFrame frame = new JFrame("Register");
        frame.setContentPane(this.Register);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);

        ButtonGroup group = new ButtonGroup();
        group.add(RadioButton1);
        group.add(RadioButton2);

        getInfo();

        RegisterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Register"); //todo: 完成相应的注册操作，跳转到注册界面
            }
        });
    }

    private void getInfo() {
        account = AccountInput.getText();
        password = new String(PasswordInput1.getPassword());
        // 如果两个密码不相等
        if (!password.equals(new String(PasswordInput2.getPassword()))) {
            JOptionPane.showMessageDialog(null, "两次输入的密码不一致", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        isAdministrator = RadioButton2.isSelected();
    }
    public static void main(String[] args) {
        new Register();
    }

}
