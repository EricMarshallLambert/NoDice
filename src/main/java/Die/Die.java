package Die;

import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Representation of a Die
 */
public class Die {
    // contains a set of side objects
    //  What type of set do we want to use
    private final Set<Side> sides;

    public Die (int numberOfSides, String sideColor){
        sides = new HashSet<>();
        for (int i = 1; i <= numberOfSides; i++) {
            Side side = new Side(i, sideColor);
            sides.add(side);
        }
    }

    public int rollDie(){
        int upperBound = getSides().size();
        // return random int with upperbound of amount of sides
        return new SecureRandom().nextInt(upperBound);
    }

    public Set<Side> getSides() {
        return sides;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Die die = (Die) o;
        return getSides().equals(die.getSides());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSides());
    }

    @Override
    public String toString() {
        return "Die{" +
                "sides=" + sides +
                '}';
    }
}
