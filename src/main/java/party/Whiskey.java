package party;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

import static party.Whiskey.Material.BARLEY;
import static party.Whiskey.Material.CORN;

@Data
@EqualsAndHashCode(of = {"brand", "label"})
@ToString(exclude = "materials")
public class Whiskey {

    private String brand;

    private String label;

    private int abv = 40;

    private String name;

    public enum Material {BARLEY, CORN, RYE}

    @Getter(AccessLevel.PACKAGE)
    private Map<Material, Integer> materials = new HashMap<>();

    private boolean blended;

    public boolean isBourbon() {
        return abv >= 40 && materials.getOrDefault(CORN, 0) >= 51;
    }

    public boolean isSingleMaltBarley() {
        return materials.getOrDefault(BARLEY, 0) == 100;
    }

}
