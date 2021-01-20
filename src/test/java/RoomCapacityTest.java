import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoomCapacityTest {

    @Test
    public void returnsTooManyPeopleIfThreatLevelIsRed(){
        // given
        String threatLevel = "Red";
        int  numberOfPeople = 3;

        // when
        String actual = RoomCapacity.getStatus(numberOfPeople, threatLevel);

        // then
        assertEquals("Too many people", actual);
    }

    @Test
    public void returnsTooManyPeopleIfThereAreMoreThan30PeopleInTheRoomAndThreatLevelIsYellow(){
        // given
        String threatLevel = "Yellow";
        int numberOfPeople = 42;

        // when
        String actual = RoomCapacity.getStatus(numberOfPeople, threatLevel);

        // then
        assertEquals("Too many people", actual);
    }

    @Test
    public void returnsCapacityLimitNotReachedIfThereAreLessThan30PeopleInTheRoomAndThreatLevelIsYellow(){
        // given
        String threatLevel = "Yellow";
        int numberOfPeople = 23;

        // when
        String actual = RoomCapacity.getStatus(numberOfPeople, threatLevel);

        // then
        assertEquals("Capacity limit not reached", actual);
    }

    @Test
    public void returnsTooManyPeopleIfThereAreMoreThan60PeopleInTheRoomAndThreatLevelIsGreen(){
        // given
        String threatLevel = "Green";
        int numberOfPeople = 66;

        // when
        String actual = RoomCapacity.getStatus(numberOfPeople, threatLevel);

        // then
        assertEquals("Too many people", actual);
    }

    @Test
    public void returnsCapacityLimitNotReachedIfThereAreLessThan30PeopleInTheRoomAndThreatLevelIsGreen(){
        // given
        String threatLevel = "Green";
        int numberOfPeople = 42;

        // when
        String actual = RoomCapacity.getStatus(numberOfPeople, threatLevel);

        // then
        assertEquals("Capacity limit not reached", actual);
    }


}
