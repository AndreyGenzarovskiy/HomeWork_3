package gameplay;

import static data.GameStates.*;
import static data.Sign.*;
import static draw.Draw.drawField;
import static gameplay.TestUtils.textToArray;
import static org.junit.jupiter.api.Assertions.assertEquals;

import data.GameStates;
import data.Sign;
import org.junit.jupiter.api.Test;
import java.io.IOException;




class GamePlayTest {
    final int size = 3;

    @Test
    void game_FillsFieldWithSignsChecksWinner_Field3X3_ReturnTie(){
        final int size = 3;
        //Arrange

        Sign[][] field = new Sign[size][size];

        field[0][0] = CROSS;
        field[0][1] = ZERO;
        field[0][2] = CROSS;

        field[1][0] = ZERO;
        field[1][1] = CROSS;
        field[1][2] = CROSS;

        field[2][0] = ZERO;
        field[2][1] = CROSS;
        field[2][2] = ZERO;

        GamePlay gamePlay = new GamePlay(field, size);

        drawField(field);

        GameStates expected = TIE;
        String expectedMessage = TIE.getGameStateMessage();

        // Act
        GameStates actual = gamePlay.checkGameState(CROSS);
        String actualMessage = gamePlay.checkGameState(CROSS).getGameStateMessage();

        // Assert
        assertEquals(expected, actual, "Game state wrong");
        assertEquals(expectedMessage, actualMessage, "Game state message wrong");
    }

    @Test
    void game_FillsFieldWithSignsChecksWinner_Field3X3_ReturnTie_LoadFile() throws IOException {
        // Arrange
        final int size = 3;
        Sign[][] testArray = textToArray("test_data_cross_wins.txt", size);

        GamePlay gamePlay = new GamePlay(testArray, size);
        drawField(testArray);

        GameStates expected = WINNER_X;
        String expectedMessage = WINNER_X.getGameStateMessage();

        // Act
        GameStates actual = gamePlay.checkGameState(CROSS);
        String actualMessage = gamePlay.checkGameState(CROSS).getGameStateMessage();

        // Assert
        assertEquals(expected, actual, "Game state wrong");
        assertEquals(expectedMessage, actualMessage, "Game state message wrong");

    }

    @Test
    void checkSignState(){
        Sign expected = EMPTY;
        Sign actual = getSign('P');

        assertEquals(expected, actual);
    }

    @Test
    void checkOppositeSignState(){
        Sign expected = ZERO;
        Sign actual = Sign.getOppositeSign(CROSS);

        assertEquals(expected, actual);
    }

    @Test
    void checkGameState() throws IOException {

        Sign[][] testArray = textToArray("test_data_zeros_wins.txt", size);

        GamePlay gamePlay = new GamePlay(testArray, size);
        drawField(testArray);

        Sign testData = CROSS;

        GameStates expected = TIE;

        GameStates actual = gamePlay.checkGameState(testData);

        assertEquals(expected, actual);
    }

    @Test
    void checkInputCoordinatesWhenCoordinateBiggerThanSize() throws IOException {
        Sign[][] testArray = getEmptyArraySign(size);

        GamePlay gamePlay = new GamePlay(testArray, size);
        int x = 4;
        int y = 3;

        boolean expected = false;

        boolean actual = gamePlay.inputTurnsCoordinates(x, y, CROSS);

        assertEquals(expected, actual);
    }

    @Test
    void checkInputCoordinatesWhenSignIsNotEmpty() throws IOException {
        Sign[][] testArray = textToArray("test_data_zeros_wins.txt", size);

        GamePlay gamePlay = new GamePlay(testArray, size);
        drawField(testArray);

        int x = 3;
        int y = 3;

        boolean expected = false;

        boolean actual = gamePlay.inputTurnsCoordinates(x, y, CROSS);

        assertEquals(expected, actual);
    }

    @Test
    void checkInputCoordinatesWhenSignIsEmpty(){
        Sign[][] testArray = getEmptyArraySign(size);

        GamePlay gamePlay = new GamePlay(testArray, size);
        int x = 2;
        int y = 2;

        Sign testData = CROSS;

        boolean expected = true;
        boolean actual = gamePlay.inputTurnsCoordinates(x, y, testData);

        assertEquals(expected, actual);
        Sign actualSign = gamePlay.getField()[x][y];
        assertEquals(testData, actualSign);
    }

    private Sign[][] getEmptyArraySign(int size){
        Sign[][] field = new Sign[size][size];

        field[0][0] = EMPTY;
        field[0][1] = EMPTY;
        field[0][2] = EMPTY;

        field[1][0] = EMPTY;
        field[1][1] = EMPTY;
        field[1][2] = EMPTY;

        field[2][0] = EMPTY;
        field[2][1] = EMPTY;
        field[2][2] = EMPTY;

        return field;
    }
}