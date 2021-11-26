package io.github.carrknight.bandits;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import io.github.carrknight.Observation;
import io.github.carrknight.heatmaps.BeliefState;
import org.junit.Test;

public class BelieveAllBanditImitationPolicyTest {

    @Test
    public void believeAll() {

        BelieveAllBanditImitationPolicy a = new BelieveAllBanditImitationPolicy();

        Observation input = mock(Observation.class);
        Observation output = a.decideOnAdditionalInformation(
            input,
            mock(BeliefState.class)
        );

        assertEquals(input, output);

    }
}