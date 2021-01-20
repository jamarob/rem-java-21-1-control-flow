public class RoomCapacity {

    public static String getStatus(int numberOfPeopleInRoom) {
        if(numberOfPeopleInRoom > 30){
            return "Too many people";
        }
        return "Capacity limit not reached";
    }

}
