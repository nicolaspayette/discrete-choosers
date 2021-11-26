package io.github.carrknight.bandits;

import io.github.carrknight.Observation;
import io.github.carrknight.heatmaps.BeliefState;

/**
 * ignores all additional observations
 * @param <O> Observation type
 * @param <R> Reward type
 * @param <C> Context type
 */
public class IgnoreBanditImitationPolicy<O,R,C> implements BanditImitationPolicy<O, R, C> {

    /**
     * always return null
     */
    @Override
    public Observation<O, R, C> decideOnAdditionalInformation(
            Observation<O, R, C> additionalInformation, BeliefState<O,R,C> state) {

        return null;


    }
}
