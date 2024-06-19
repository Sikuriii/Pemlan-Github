package Tugas7;

public class GUI {

    public static void main(String[] args) {
    
        JFrame frame = new JFrame("Form Daftar Ulang Online");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel nameLabel = new JLabel("Nama Lengkap");
        JTextField nameField = new JTextField(20);

        JLabel tgllahirLabel = new JLabel("Tanggal Lahir");
        JTextField tgllahirField = new JTextField(20);

        JLabel nopendaftaranLabel = new JLabel("Nomor Pendaftaran");
        JTextField nopendaftaranField = new JTextField(20);

        JLabel noTelpLabel = new JLabel("Nomor Telepon");
        JTextField noTelpField = new JTextField(20);

        JLabel alamatLabel = new JLabel("Alamat");
        JTextArea alamatTextArea = new JTextArea(3, 20); 
        alamatTextArea.setLineWrap(true);
        alamatTextArea.setWrapStyleWord(true);
        JScrollPane alamatScrollPane = new JScrollPane(alamatTextArea);

        JLabel emailLabel = new JLabel("E-mail");
        JTextField emailField = new JTextField(20);

        Button submitButton = new JButton("Submit");
        submitButton.addActionListener(e -> {
            if (nameField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nama Lengkap harus diisi!");
                return;
            }

            if (tgllahirField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Tanggal Lahir harus diisi!");
                return;
            }

            if (nopendaftaranField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nomor Pendaftaran harus diisi!");
                return;
            }

            if (noTelpField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nomor Telepon harus diisi!");
                return;
            }

            if (alamatTextArea.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Alamat harus diisi!");
                return;
            }

            if (emailField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "E-mail harus diisi!");
                return;
            }

            int confirmation = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin data yang diisi sudah benar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);

            if (confirmation == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "DATA PENDAFTARAN\n" +
                        "Nama Lengkap: " + nameField.getText() + "\n" +
                        "Tanggal Lahir: " + tgllahirField.getText() + "\n" +
                        "Nomor Pendaftaran: " + nopendaftaranField.getText() + "\n" +
                        "Alamat: " + alamatTextArea.getText() + "\n" +
                        "Nomor Telepon: " + noTelpField.getText() + "\n" +
                        "Email: " + emailField.getText());
            }
        });
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(nameLabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(tgllahirLabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(tgllahirField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(nopendaftaranLabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(nopendaftaranField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(noTelpLabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(noTelpField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(alamatLabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(alamatScrollPane, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(emailLabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 5;
        panel.add(emailField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        panel.add(submitButton, gbc);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}