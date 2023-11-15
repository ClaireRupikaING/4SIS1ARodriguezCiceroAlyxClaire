import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BubbleShooterGUI extends JFrame {
    private BubbleShooterGame game;
    private JLabel titleLabel;
    private JButton startButton;
    private JPanel gamePanel;
    private JTextField nameField;
    private JButton submitButton;
    private JButton restartButton;
    private Timer timer; // Moví la declaración de la variable timer aquí

    public BubbleShooterGUI(BubbleShooterGame game) {
        this.game = game;

        // Configuración de la pantalla de inicio
        setupStartScreen();

        setTitle("Burbujas Aburridas");
        setSize(480, 854);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    private void setupStartScreen() {
        getContentPane().setBackground(Color.BLACK);
        setLayout(new BorderLayout());

        // Configuración del título
        titleLabel = new JLabel("Burbujas Aburridas");
        titleLabel.setForeground(new Color(200, 100, 255)); // Tono morado claro
        titleLabel.setFont(new Font("Arial", Font.BOLD, 40));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setVerticalAlignment(SwingConstants.CENTER);
        add(titleLabel, BorderLayout.CENTER);

        // Configuración del botón de inicio
        startButton = new JButton("Iniciar Juego");
        startButton.setForeground(new Color(255, 100, 100)); // Color rojo claro
        startButton.setBorderPainted(false);
        startButton.setFocusPainted(false);
        startButton.setContentAreaFilled(false);
        startButton.setFont(new Font("Arial", Font.BOLD, 20));
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startGame();
            }
        });
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.BLACK);
        buttonPanel.add(startButton);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void startGame() {
        // Configuración del panel de juego
        remove(titleLabel);
        remove(startButton);

        gamePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dibuja el fondo morado difuminado
                Graphics2D g2d = (Graphics2D) g;
                GradientPaint gradient = new GradientPaint(
                        getWidth() / 2, 0, new Color(75, 0, 130), getWidth() / 2, getHeight(), new Color(0, 0, 0));
                g2d.setPaint(gradient);
                g2d.fillRect(0, 0, getWidth(), getHeight());

                if (game.isGameOver()) {
                    drawGameOverScreen(g2d);
                } else {
                    // Dibuja las burbujas
                    ArrayList<Bubble> fallingBubbles = game.getFallingBubbles();
                    for (Bubble bubble : fallingBubbles) {
                        g2d.setColor(bubble.getColor());
                        g2d.fillOval(bubble.getX(), bubble.getY(), Bubble.BUBBLE_RADIUS * 2, Bubble.BUBBLE_RADIUS * 2);
                    }

                    // Dibuja la burbuja actual del jugador
                    Bubble currentBubble = game.getCurrentBubble();
                    g2d.setColor(currentBubble.getColor());
                    g2d.fillOval(currentBubble.getX(), currentBubble.getY(), Bubble.BUBBLE_RADIUS * 2, Bubble.BUBBLE_RADIUS * 2);
                }
            }
        };

        // Configuración del panel de juego
        gamePanel.setLayout(null);
        add(gamePanel);

        // Configuración de la lógica del juego (podrías tener un hilo de juego aquí)
        timer = new Timer(1000 / 60, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.update(); // Actualiza la lógica del juego
                gamePanel.repaint(); // Vuelve a dibujar el panel de juego

                if (game.isGameOver()) {
                    timer.stop();
                    showGameOverScreen();
                }
            }
        });
        timer.start();

        // Configuración de los controles (puedes manejar eventos del teclado aquí)

        // Actualiza la interfaz gráfica
        revalidate();
        repaint();
    }

    private void drawGameOverScreen(Graphics2D g2d) {
        // Dibuja la pantalla de Game Over
        Font gameOverFont = new Font("Arial", Font.BOLD, 40);
        g2d.setFont(gameOverFont);
        g2d.setColor(new Color(200, 100, 255)); // Tono morado claro
        String gameOverText = "Game Over";
        int textWidth = g2d.getFontMetrics().stringWidth(gameOverText);
        g2d.drawString(gameOverText, (getWidth() - textWidth) / 2, getHeight() / 2 - 50);

        // Dibuja el rectángulo para el nombre del jugador
        g2d.setColor(Color.WHITE);
        g2d.drawRect(getWidth() / 4, getHeight() / 2, getWidth() / 2, 30);

        // Configuración del campo de texto para el nombre
        nameField = new JTextField();
        nameField.setBounds(getWidth() / 4 + 5, getHeight() / 2 + 5, getWidth() / 2 - 10, 20);
        gamePanel.add(nameField);

        // Configuración del botón de enviar
        submitButton = new JButton("Enviar");
        submitButton.setBounds(getWidth() / 2 - 50, getHeight() / 2 + 40, 100, 30);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para enviar el nombre y el puntaje
                String playerName = nameField.getText();
                // Puedes manejar la lógica de almacenamiento aquí
            }
        });
        gamePanel.add(submitButton);

        // Configuración del botón de reinicio
        restartButton = new JButton("Volver al inicio");
        restartButton.setBounds(getWidth() / 2 - 100, getHeight() / 2 + 80, 200, 30);
        restartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                restartGame();
            }
        });
        gamePanel.add(restartButton);
    }

    private void showGameOverScreen() {
        // Muestra la pantalla de Game Over
        gamePanel.repaint();
    }

    private void restartGame() {
        if (game.isGameOver()) {
            // Si el juego ya terminó, reinicia el juego completamente
            game.reset();
            gamePanel.removeAll();
            setupStartScreen();
        } else {
            // Si el juego está en curso, simplemente limpia el panel y reinicia la interfaz gráfica
            gamePanel.removeAll();
            setupGamePanel();
        }
    
        revalidate();
        repaint();
    }
    // Resto de la implementación de la interfaz gráfica y la lógica del juego...
}
