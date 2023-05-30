package util;

import javax.swing.*;

public class Login {
    private String username;
    private String password;

    public void showLoginDialog() {
        JTextField usernameField = new JTextField(20);
        JPasswordField passwordField = new JPasswordField(20);

        JPanel panel = new JPanel();
        panel.add(new JLabel("Usuario:"));
        panel.add(usernameField);
        panel.add(new JLabel("Contrasena:"));
        panel.add(passwordField);

        int option = JOptionPane.showConfirmDialog(null, panel, "Iniciar sesion", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            username = usernameField.getText();
            password = new String(passwordField.getPassword());
        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

