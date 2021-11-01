import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TestListCity {

    private CustomList list;


    public void createList(){
        list = new CustomList(null,new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        createList();
        int listSize = list.getCount();
        list.addCity(new City("halifax","NS"));
        assertEquals(list.getCount(),listSize+1);
    }

    @Test
    public void hascityTest(){
        createList();
        City newcity = new City("halifax","NS");
        list.addCity(newcity);
        City newcity1 = new City("Edmonton","AB");
        assertTrue(list.hascity(newcity));
        assertFalse(list.hascity(newcity1));
    }
}
