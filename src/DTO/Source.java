package DTO;

import java.util.HashSet;
import java.util.Set;

public  class Source  {

    private Set<Double> sources;

    public Source(Set<Double> sources) {
        this.sources = sources;
    }

    public Source() {

    }

    public void setSources(Set<Double> sources) {
//        this.sources = sources;
        sources = new HashSet<>();
    }

    public Set<Double> getSources() {
        return sources;
    }

    @Override
    public String toString() {
        return "Source{" +
                "sources=" + sources +
                '}';
    }
}
