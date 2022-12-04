package pair;

import java.util.Objects;

public class Pair {
    public Object first;
    public Object second;

    public Pair (){}
    public Pair(Object first, Object second){
        this.first = first;
        this.second = second;
    }

    @Override
    public int hashCode() {
        int prime = 67;
        return prime * Objects.hash(first, second);
    }
    @Override
    public String toString(){
        return "{ " + this.first + ", " + this.second + " }";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return (first.equals(pair.first) && (second.equals(pair.second)));
    }
}
