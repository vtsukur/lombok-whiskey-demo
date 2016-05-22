package party;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.assertThat;
import static party.PopularWhiskeys.JACK_DANIELS;

public class BottleTest {

    @Test
    public void shouldContainGivenWhiskeyAndProducedOnTheGivenYear() {
        final Bottle bottle = Bottle.of(JACK_DANIELS).producedInYear(2015);

        assertThat(bottle.whiskey(), sameInstance(JACK_DANIELS));
        assertThat(bottle.producedInYear(), is(2015));
    }

    @Test(expected = NullPointerException.class)
    public void shouldNotBeCreatedIfGivenWhiskeyIsNull() {
        Bottle.of(null);
    }

}
