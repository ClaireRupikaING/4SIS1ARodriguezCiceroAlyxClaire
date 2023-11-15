import Bubble;
import javax.swing.SwingUtilities;

public class BubbleShooterMain {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Crear una instancia del jugador
            Player player = new Player();

            // Crear una instancia del juego
            BubbleShooterGame game = new BubbleShooterGame(player);

            // Crear una instancia de la interfaz gráfica y pasarle el juego
            BubbleShooterGUI gui = new BubbleShooterGUI(game);

            // Configurar la interfaz gráfica para que sea visible
            gui.setVisible(true);
        });
    }
}

