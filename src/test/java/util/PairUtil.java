package util;

import com.yet.spring.core.entity.Pair;
import com.yet.spring.core.entity.Weekdays;

/**
 * Created by cplus on 12.05.2017.
 */
public class PairUtil {
    public  static Pair createPair(){
        Pair pair = new Pair("qwer",2,2, Weekdays.MONDAY,"Кремень");
        return pair;
    }
}
