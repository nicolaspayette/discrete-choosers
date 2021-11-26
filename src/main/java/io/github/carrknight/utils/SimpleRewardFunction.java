package io.github.carrknight.utils;


import java.util.function.Function;

/**
 * simple utility function that ignores context and option picked and just focuses on the reward
 * object
 *
 * @param <R> the class of the reward object
 */
public abstract class SimpleRewardFunction<R> implements RewardFunction<Object, R, Object>,
    Function<R, Double> {


    @Override
    public double extractUtility(
        Object optionTaken, R experimentResult, Object contextObject
    ) {
        return apply(experimentResult);
    }
}
