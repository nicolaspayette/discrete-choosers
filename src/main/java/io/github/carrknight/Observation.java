package io.github.carrknight;


/**
 * a pairing optionTaken ---> rewardAchieved
 * @param <O> the class of the options available (say, FishingSpot if we are modelling a fisher deciding where to go next);
 * @param <R> the class describing the xperiment result  (say, FishCaught if we are modelling the fisher judging the spot they have just been to)
 * @param <C> the class describing the context in which the decision or reward was observed (say, Weather for fisher)

 */
public class Observation<O,R,C> {


    private final O choiceMade;

    private final R resultObserved;

    private final C context;


    public Observation(O choiceMade, R resultObserved) {
        this.choiceMade = choiceMade;
        this.resultObserved = resultObserved;
        this.context=null;
    }

    public Observation(O choiceMade, R resultObserved, C context) {
        this.choiceMade = choiceMade;
        this.resultObserved = resultObserved;
        this.context = context;
    }


    /**
     * Getter for property 'choiceMade'.
     *
     * @return Value for property 'choiceMade'.
     */
    public O getChoiceMade() {
        return choiceMade;
    }

    /**
     * Getter for property 'resultObserved'.
     *
     * @return Value for property 'resultObserved'.
     */
    public R getResultObserved() {
        return resultObserved;
    }

    /**
     * Getter for property 'context'.
     *
     * @return Value for property 'context'.
     */
    public C getContext() {
        return context;
    }
}
