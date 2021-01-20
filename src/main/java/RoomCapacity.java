public class RoomCapacity {

    public static String getStatus(int numberOfPeopleInRoom, String threatLevel) {
        int limit;
        switch(threatLevel){
            case "Green":
                limit = 60;
                break;
            case "Yellow":
                limit = 30;
                break;
            default:
                limit = 0;
        }
        if(numberOfPeopleInRoom > limit){
            return "Too many people";
        }
        return "Capacity limit not reached";
    }

}
