package al.jacek.musi.util;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.*;

class MatrixTest {
    Matrix matrix;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        matrix = new Matrix();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        //assert((matrix.didUserWon() == 1));
    }

    @org.junit.jupiter.api.Test
    void putOneToMatrix() {
        matrix.putOneToMatrix(-11);
        matrix.putOneToMatrix(1);
        matrix.putOneToMatrix(2);
        matrix.putOneToMatrix(4);
    }

    @org.junit.jupiter.api.Test
    void putTwoToMatrix() {
        throw new java.lang.UnsupportedOperationException();
    }

    @org.junit.jupiter.api.Test
    void didUserWon() {
        System.out.print(matrix.didUserWon());
    }

}