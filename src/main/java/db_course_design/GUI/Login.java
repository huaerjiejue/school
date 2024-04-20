package db_course_design.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JPanel LoginPanel;
    private JLabel Title;
    private JTextField AccountInput;
    private JPasswordField PasswordInput;
    private JLabel AccountLabel;
    private JLabel PasswordLabel;
    private JLabel Choice;
    private JButton LoginButton;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JButton ReginsterBotton;

    private String account;
    private String password;
    private boolean isAdministrator;

    //    private void getAccount() {
//        account = AccountInput.getText();
//    }
//    private void getPassword() {
//        password = new String(PasswordInput.getPassword());
//    }
//    private void getIsAdministrator() {
//        isAdministrator = radioButton2.isSelected();
//    }
    private void getInfo() {
        account = AccountInput.getText();
        password = new String(PasswordInput.getPassword());
        isAdministrator = radioButton2.isSelected();
    }

    public Login() {
        JFrame frame = new JFrame("Login");
        frame.setContentPane(LoginPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
        // 单选按钮, 选择是否是管理员
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        // 注册按钮
        ReginsterBotton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Register"); //todo: 完成相应的注册操作，跳转到注册界面
            }
        });
        // 登录按钮
        LoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Login"); //todo: 完成相应的登录操作，跳转到主界面
                getInfo();
                System.out.println(account);
                System.out.println(password);
                System.out.println(isAdministrator);
            }
        });
    }

    public static void main(String[] args) {
        new Login();
    }
}
