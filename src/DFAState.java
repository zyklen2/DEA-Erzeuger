import java.util.*;
class DFAState implements Comparable<DFAState>
{
    public final int index;
    public final Boolean isAcceptingState;
    public final Set<Integer> positionsSet;
    public DFAState(int index,
                    Boolean isAcceptingState,
                    Set<Integer> positionsSet)
    {
        this.index = index;
        this.isAcceptingState = isAcceptingState;
        this.positionsSet = positionsSet;
    }
    @Override
    public boolean equals(Object obj)
    {
        if(this == obj) return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        DFAState other = (DFAState)obj;
        return (other.index == this.index);
    }
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + this.index;
        return result;
    }
    @Override
    public int compareTo(DFAState other)
    {
        return (this.index - other.index);
    }
}