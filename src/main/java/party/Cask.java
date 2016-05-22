package party;

import lombok.Value;

@Value
public class Cask {

    private final Type type;

    private final int litres;

    public enum Type {FRESH, BOURBON, SHERRY}

}
