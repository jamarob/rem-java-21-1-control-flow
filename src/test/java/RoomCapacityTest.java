import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoomCapacityTest {

    @Test
    public void returnsTooManyPeopleIfThereAreMoreThan30PeopleInTheRoom(){
        // given
        int numberOfPeople = 42;

        // when
        String actual = RoomCapacity.getStatus(numberOfPeople);

        // then
        assertEquals("Too many people", actual);
    }

    @Test
    public void returnsCapacityLimitNotReachedIfThereAreLessThan30PeopleInTheRoom(){
        // given
        int numberOfPeople = 23;

        // when
        String actual = RoomCapacity.getStatus(numberOfPeople);

        // then
        assertEquals("Capacity limit not reached", actual);
    }
}
