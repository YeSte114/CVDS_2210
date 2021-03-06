package hangman.model;

/**
 * Esta interface contiene la lógica para el calculo del puntaje del juego hagman
 * @author Yeison Barreto
 * @author Laura García
 */

public interface GameScore {

    /**
     *Calcula el puntaje del juego en base a las letras correctas e incorrectas
     * @param correctCount entero que representa el numero de letras correctas
     * @param incorrectCount entero que representa el numero de letras incorrectas
     * @return el puntaje
     */
    public int calculateScore (int correctCount, int incorrectCount);

    public int getScore();

    public void setScore (int score);

    public void restart();

}
