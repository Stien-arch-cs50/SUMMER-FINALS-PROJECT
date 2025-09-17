    package Entity;
    import java.awt.*;
    import java.io.File;
    import java.io.IOException;
    import javax.imageio.ImageIO;
    import javax.swing.*;

    public class BackgroundPanel extends JPanel {
        private Image backgroundImage;

        public BackgroundPanel(String imagePath) {
            try {
                backgroundImage = ImageIO.read(new File(imagePath));
            } catch (IOException e) {
                e.printStackTrace();
                // Handle image loading error
                JOptionPane.showMessageDialog(null, "Failed to load background image: " + imagePath, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g); // Call superclass method to ensure proper painting
            if (backgroundImage != null) {
                // Draw the image to fill the panel
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        }
    }