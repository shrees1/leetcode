public class MeetingRooms {
  public boolean canAttendMeetings(int[][] intervals) {
    for(int i=0;i<intervals.length;i++){
      if(intervals[i][1]>intervals[i+1][0]){
        return false;
      }
    }
    return false;
  }
}
