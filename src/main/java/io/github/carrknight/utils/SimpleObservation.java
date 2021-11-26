package io.github.carrknight.utils;

import io.github.carrknight.Observation;

/**
 * numerical observation with no context; this is just syntactic sugar
 */
public class SimpleObservation extends Observation<Integer, Double, Object> {


    public SimpleObservation(
        Integer choiceMade,
        Double rewardObserved
    ) {
        super(choiceMade, rewardObserved);
    }
}
