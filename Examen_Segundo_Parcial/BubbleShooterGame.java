import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class BubbleShooterGame {
    private Player player;
    private ArrayList<Bubble> fallingBubbles;
    private Bubble currentBubble; // burbuja que el jugador está a punto de disparar
    private boolean gameOver;

    public BubbleShooterGame(Player player) {
        this.player = player;
        fallingBubbles = new ArrayList<>();
        initializeGame();
        setupGameTimer();
        this.gameOver = false;
    }

    private void initializeGame() {
        // Inicializa el juego, crea burbujas descendentes, etc.
        int initialX = 360; // Ajusta según tus necesidades
        int initialY = 600; // Ajusta según tus necesidades
        for (int i = 0; i < 10; i++) {
            Color randomColor = generateRandomColor();
            Bubble newBubble = new Bubble(randomColor, initialX, initialY, 1); // 1 es la velocidad inicial, ajusta según tus necesidades
            fallingBubbles.add(newBubble);
            initialX += 30; // Ajusta según tus necesidades
        }
    }

    public ArrayList<Bubble> getFallingBubbles() {
        return fallingBubbles;
    }

    public Bubble getCurrentBubble() {
        return currentBubble;
    }

    private void setupGameTimer() {
        // Configura un temporizador para actualizar la posición de las burbujas descendentes y verificar colisiones
        Timer timer = new Timer(1000 / 60, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                update(); // Lógica de actualización del juego
            }
        });
        timer.start();
    }

    public void update() {
        if (!gameOver) {
            // Actualizar la posición de las burbujas que caen
            updateFallingBubbles();

            // Verificar colisiones y patrones solo si el juego no ha terminado
            checkCollisionAndPatterns();
        }
        // Otros elementos de actualización del juego
    }

    private void updateFallingBubbles() {
        for (Bubble bubble : fallingBubbles) {
            bubble.updatePosition();
        }
    }

    private void checkCollisionAndPatterns() {
        // Verificar colisiones con el borde inferior
        checkCollisionWithBottom();

        // Verificar patrones de cuatro burbujas del mismo color
        ArrayList<Bubble> matchedBubbles = findMatchingBubbles();
        for (Bubble bubble : matchedBubbles) {
            removeMatchingBubbles(bubble);
        }
    }

    private void checkCollisionWithBottom() {
        for (Bubble bubble : fallingBubbles) {
            if (bubble.getY() + Bubble.BUBBLE_RADIUS * 2 >= 600) {
                handleCollisionWithBottom();
            }
        }
    }

    private ArrayList<Bubble> findMatchingBubbles() {
        ArrayList<Bubble> matchingBubbles = new ArrayList<>();
        for (Bubble bubble : fallingBubbles) {
            // Implementa la lógica para verificar patrones
            // ...
        }
        return matchingBubbles;
    }

    private void removeMatchingBubbles(Bubble matchedBubble) {
        // Implementa la lógica para eliminar burbujas coincidentes
        // ...
    }

    private void handleCollisionWithBottom() {
        // Manejar la colisión con el borde inferior (por ejemplo, perder el juego)
        gameOver = true;
        System.out.println("Game Over");
        // Agrega aquí la lógica para reiniciar el juego o mostrar un mensaje de finalización.
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void shootBubble(int angle) {
        // Lógica para disparar la burbuja
        // Crea la burbuja y establece el ángulo y la posición
        currentBubble = new Bubble(generateRandomColor(), 360, 600); // Ejemplo de posición inicial
        currentBubble.setAngle(angle);

        // Agrega la burbuja actual a las burbujas descendentes
        fallingBubbles.add(currentBubble);
    }

    private Color generateRandomColor() {
        Color[] possibleColors = {Color.MAGENTA, Color.RED, Color.PINK, Color.BLUE};
        Random random = new Random();
        return possibleColors[random.nextInt(possibleColors.length)];
    }

    public void reset() {
        fallingBubbles.clear();
        initializeGame();
        currentBubble = null;
        gameOver = false;
    }
    

    // Otros métodos y lógica del juego...
}
