package BeansLearnerLab.models;

import BeansLearnerLab.interfaces.Learner;
import BeansLearnerLab.interfaces.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Instructor extends Person implements Teacher {


    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        List<Learner> learnerList = new ArrayList<>();

        for(Learner learner: learners){
            learnerList.add(learner);
        }

        double numberOfHoursPerLearner = numberOfHours / learnerList.size();

        for(Learner learner : learnerList){
            learner.learn(numberOfHoursPerLearner);
        }


    }
}
