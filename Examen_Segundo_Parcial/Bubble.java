import java.awt.Color;

public class Bubble {
    public static final int PURPLE_SCORE = 500;
    public static final int RED_SCORE = 200;
    public static final int PINK_SCORE = 100;
    public static final int BLUE_SCORE = 50;
    public static final int BUBBLE_RADIUS = 15; // Ajusta según tus necesidades

    private Color color;
    private int speed;
    private int score;
    private int x, y; // posición de la burbuja en la pantalla
    private int angle; // ángulo de lanzamiento en grados

    public Bubble(Color color, int x, int y, int speed) {
        this.color = color;
        this.speed = speed;
        this.x = x;
        this.y = y;
        setScore(); // establecer el puntaje basado en el color
    }

    public Color getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public int getScore() {
        return score;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void updatePosition() {
        // Actualiza la posición en función de la velocidad y el ángulo
        // Implementa la lógica de movimiento aquí
        // Mueve la burbuja hacia abajo
        y += speed;
    }

    private void setScore() {
        // Establecer puntaje basado en el color
        if (color.equals(Color.MAGENTA)) {
            score = PURPLE_SCORE;
        } else if (color.equals(Color.RED)) {
            score = RED_SCORE;
        } else if (color.equals(Color.PINK)) {
            score = PINK_SCORE;
        } else if (color.equals(Color.BLUE)) {
            score = BLUE_SCORE;
        }
    }
}
