package io.github.carrknight.bandits;

import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

import io.github.carrknight.Observation;
import io.github.carrknight.heatmaps.BeliefState;
import org.junit.Test;

public class IgnoreBanditImitationPolicyTest {

    @Test
    public void believeNoOne() {

        IgnoreBanditImitationPolicy a = new IgnoreBanditImitationPolicy();

        Observation input = mock(Observation.class);
        Observation output = a.decideOnAdditionalInformation(
            input,
            mock(BeliefState.class)
        );

        assertNull(output);

    }

}