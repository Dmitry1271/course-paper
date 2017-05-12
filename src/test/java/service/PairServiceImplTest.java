package service;

import com.yet.spring.core.entity.Pair;
import com.yet.spring.core.entity.Weekdays;
import com.yet.spring.core.service.impl.PairServiceImpl;
import org.junit.Test;

/**
 * Created by cplus on 12.05.2017.
 */
public class PairServiceImplTest {
    PairServiceImpl pairService = new PairServiceImpl();

    @Test
    public void addPairTest(){
        Pair pair = new Pair("qwer",2,2, Weekdays.MONDAY,"Кремень");
        pairService.addPair(pair);

    }
}
