import java.util.*;
public class DEA_Creator {
    private SortedMap<DFAState, Map<Character, DFAState>> stateTransitionTable = new TreeMap<>();
    private SortedMap<Integer, FollowposTableEntry> followposTableEntries = new TreeMap<>();
    public SortedMap<DFAState, Map<Character, DFAState>> synaxtreeToDEAMatrix(SortedMap<Integer, FollowposTableEntry> followposTableEntries){
        this.followposTableEntries=followposTableEntries;
        ArrayList<DFAState> theStates = new ArrayList<>();
        for(int i=0;i<followposTableEntries.size();i++){
            FollowposTableEntry tempFollowposTableEntry=followposTableEntries.get(i);
            boolean isAcceptingState=false;
            DFAState theTempState=new DFAState(i,isAcceptingState,tempFollowposTableEntry.followpos);
            theStates.add(theTempState);
        }
        Map<Character,DFAState> theFinishedStates = new HashMap<>();
        for(int i=0;i<theStates.size();i++){
            theFinishedStates.put(followposTableEntries.get(i).symbol,theStates.get(i));
        }

        return stateTransitionTable;
    }
}
