package io.github.carrknight.utils;

/**
 * any function that maps a (option,reward object, context) tuple to a double
 *
 * @param <O> class of options available
 * @param <R> result object (the output of an experiment; usually)
 * @param <C> context object
 */
public interface RewardFunction<O, R, C> {


    double extractUtility(
        O optionTaken,
        R experimentResult,
        C contextObject
    );

}
