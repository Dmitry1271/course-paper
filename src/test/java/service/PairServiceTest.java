package service;

import com.yet.spring.core.entity.Pair;
import com.yet.spring.core.entity.Weekdays;
import com.yet.spring.core.service.PairService;
import org.junit.Test;

/**
 * Created by cplus on 12.05.2017.
 */
public class PairServiceTest {

    PairService service = new PairService();

    @Test
    public void saveRecordTest(){
        Pair pair = new Pair("qewr",2,2, Weekdays.MONDAY,"bvj");
        Pair pair1 = service.add(pair);
        System.out.println(pair1);
    }
}
