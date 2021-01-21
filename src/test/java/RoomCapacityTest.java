import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoomCapacityTest {

    private static final String TOO_MANY_PEOPLE = "Too many people";
    private static final String CAPACITY_NOT_REACHED = "Capacity limit not reached";

    @ParameterizedTest(name = "For <{0}> people and threat level <{1}> it returns <{2}>")
    @MethodSource
    public void testGetStatus(int givenNumberOfPeople, String givenThreatLevel, String expectedResult){
        String actual = RoomCapacity.getStatus(givenNumberOfPeople, givenThreatLevel);

        assertEquals(expectedResult, actual);
    }

    private static Stream<Arguments> testGetStatus(){
        return Stream.of(
                Arguments.of(3, "Red", TOO_MANY_PEOPLE),
                Arguments.of(42, "Yellow", TOO_MANY_PEOPLE),
                Arguments.of(23, "Yellow", CAPACITY_NOT_REACHED),
                Arguments.of(66, "Green", TOO_MANY_PEOPLE),
                Arguments.of(42, "Green", CAPACITY_NOT_REACHED)
        );
    }

}
