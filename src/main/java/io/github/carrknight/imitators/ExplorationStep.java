package io.github.carrknight.imitators;

import com.google.common.collect.ImmutableList;

import java.util.SplittableRandom;

/**
 * any function that tells me how to "explore", that is how to pick a new spot at random
 */
public interface ExplorationStep<O,R,C> {

    O explore(
            ImmutableList<O> optionsAvailable,
            O lastChoiceMade,
            SplittableRandom random);


}
