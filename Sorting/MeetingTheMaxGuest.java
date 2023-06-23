package Sorting;

import java.util.Arrays;

public class MeetingTheMaxGuest {

    static int findMaxGuest(int arrival[] ,int departure[]){
        Arrays.sort(arrival);
        Arrays.sort(departure);
        int i=1,j=1;
        int current = 1;
        int result = 1;
        while (i<arrival.length&&j<departure.length){
            if(arrival[i]<departure[j]){
                i++;
                current++;
            }else {
                j++;
                current--;
            }
            result = Integer.max(result,current);
        }
        return result;
    }
    public static void main(String[] args) {
        int [] arrival = new int[]{900,600,700};
        int [] departure = new int []{100,800,730};
        int maxGuestMeetup = findMaxGuest(arrival,departure);
        System.out.println(maxGuestMeetup);
    }
}
