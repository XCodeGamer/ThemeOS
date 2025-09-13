import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> {
            JFrame f = new JFrame("Theme OS — Mario");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(600,400);
            JPanel p = new JPanel();
            p.setBackground(new Color(79,195,247)); // mario blue
            p.setLayout(new BorderLayout(10,10));

            JLabel title = new JLabel("🍄 Theme OS — Mario Theme", SwingConstants.CENTER);
            title.setFont(new Font("SansSerif", Font.BOLD, 20));
            title.setForeground(new Color(198,40,40)); // mario red

            JTextArea content = new JTextArea("Welcome! Trial Version — 10 days\nOpen an Issue to submit a theme.");
            content.setEditable(false);
            content.setBackground(new Color(255, 245, 225));
            content.setFont(new Font("SansSerif", Font.PLAIN, 14));

            JButton themesBtn = new JButton("Browse Themes ⭐");
            themesBtn.setBackground(new Color(255, 213, 79));
            themesBtn.setFocusPainted(false);

            p.add(title, BorderLayout.NORTH);
            p.add(new JScrollPane(content), BorderLayout.CENTER);
            p.add(themesBtn, BorderLayout.SOUTH);

            f.setContentPane(p);
            f.setLocationRelativeTo(null);
            f.setVisible(true);
        });
    }
}
