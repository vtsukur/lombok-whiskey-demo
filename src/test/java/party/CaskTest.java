package party;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class CaskTest {

    @Test
    public void shouldCreateImmutableInstance() {
        final Cask cask = new Cask(Cask.Type.BOURBON, 500);

        assertThat(cask.getType(), equalTo(Cask.Type.BOURBON));
        assertThat(cask.getLitres(), equalTo(500));
    }

}
