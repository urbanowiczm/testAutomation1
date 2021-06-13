import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    @DisplayName("Single push and pop value operation verification.")
    void basicPushPop() {
        final int valToPush = 1;
        Stack stack = new Stack(3);

        stack.push(valToPush);
        int valFromStack = stack.pop();

        assertEquals(valToPush, valFromStack);
    }

    @Test
    void popOnEmptyStack() {
        assertThrows(
                EmptyStackException.class,
                () -> {
                    Stack stack = new Stack(3);
                    stack.pop();
                }
        );
    }

    @Test
    void assertAllExample() {
        assertAll(
                () -> assertEquals(1 + 1, 2),
                () -> assertEquals(1 + 3, 4)
        );
    }
}
