package al.jacek.musi.util;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.*;

class MatrixTest {
    Matrix matrix = new Matrix();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        matrix.putOneToMatrix(1);
        matrix.putOneToMatrix(2);
        matrix.putOneToMatrix(3);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        assert((matrix.didUserWon() == 1));
    }

    @org.junit.jupiter.api.Test
    void putOneToMatrix() {
    }

    @org.junit.jupiter.api.Test
    void putTwoToMatrix() {
    }

    @org.junit.jupiter.api.Test
    void didUserWon() {
    }

}