import java.util.Comparator;

public class AgeComparator implements Comparator<Hero> {
    public int compare(Hero currentHero, Hero comparedHero){
        return currentHero.getAge() - comparedHero.getAge();
    }
}
