package party;

import static party.Whiskey.Material.BARLEY;
import static party.Whiskey.Material.CORN;
import static party.Whiskey.Material.RYE;

public class PopularWhiskeys {

    public static final Whiskey JACK_DANIELS = newJackDaniels();

    static Whiskey newJackDaniels() {
        final Whiskey whiskey = new Whiskey();
        whiskey.setBrand("Jack Daniel's");
        whiskey.setLabel("Old No. 7");
        whiskey.getMaterials().put(CORN, 80);
        whiskey.getMaterials().put(RYE, 8);
        whiskey.getMaterials().put(BARLEY, 12);
        whiskey.setAbv(40);
        return whiskey;
    }

    public static final Whiskey JOHNNIE_WALKER = newJohnnieWalker();

    private static Whiskey newJohnnieWalker() {
        final Whiskey whiskey = new Whiskey();
        whiskey.setBrand("Johnnie Walker");
        whiskey.setLabel("Black Label");
        whiskey.setAbv(40);
        whiskey.setBlended(true);
        return whiskey;
    }

    public static final Whiskey BALVENIE = newBalvenie();

    private static Whiskey newBalvenie() {
        final Whiskey whiskey = new Whiskey();
        whiskey.setBrand("Balvenie");
        whiskey.setLabel("DoubleWood 17 Years Old");
        whiskey.getMaterials().put(BARLEY, 100);
        whiskey.setAbv(43);
        return whiskey;
    }

}
