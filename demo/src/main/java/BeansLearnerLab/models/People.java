package BeansLearnerLab.models;

import java.util.Arrays;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {
    private List<PersonType> personList;

    public People(List<PersonType> personList) {
        this.personList = personList;
    }

    public void add(PersonType person) {
        personList.add(person);
    }

    public void remove(PersonType person) {
        personList.removeIf(person::equals);
    }

    public int size() {
        return personList.size();
    }

    public void clear() {
        personList.clear();
    }

    public void addAll(Iterable<PersonType> persons) {
        for(PersonType peep : persons){
            this.personList.add(peep);
        }
    }

    public PersonType findById(int id){
        for(PersonType peep : personList){
            if(peep.getId().equals(id)){
                return peep;
            }
        }
            return null;
    }

    public List<PersonType> findAll(){
        return this.personList;
    }
}
