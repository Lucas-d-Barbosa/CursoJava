package entites;

import java.util.Objects;

public class Candidates implements Comparable<Candidates> {
    private String name;
    private Integer votes;

    public Candidates(String name, Integer votes) {
        this.name = name;
        this.votes = votes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVotes() {
        return votes;
    }

    public void addVotes(Integer votes) {
        this.votes += votes;
    }

    @Override
    public int compareTo(Candidates other) {
        return name.compareTo(other.getName());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Candidates that = (Candidates) obj;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
