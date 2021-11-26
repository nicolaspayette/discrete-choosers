package io.github.carrknight.imitators;

import com.google.common.collect.ImmutableList;
import java.util.SplittableRandom;

/**
 * simplest possible exploration rule: pick one option at random!
 * @param <O>
 * @param <R>
 * @param <C>
 */
public class ExploreAtRandom<O,R,C> implements ExplorationStep<O, R, C> {
    @Override
    public O explore(
            ImmutableList<O> optionsAvailable, O lastChoiceMade, SplittableRandom random) {
        return optionsAvailable.get(
                random.nextInt(optionsAvailable.size())
        );
    }
}
