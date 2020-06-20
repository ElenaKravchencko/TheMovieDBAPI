package info.movito.themoviedbapi;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import info.movito.themoviedbapi.model.config.Timezone;
import org.junit.Test;

import java.util.List;
import java.util.TimeZone;

import static org.junit.Assert.*;

public class TimezonesApiTest extends AbstractTmdbApiTest {

    @Test
    public void testJavaUtilTimezoneCompliance() throws Exception {
        List<Timezone> timezones = tmdb.getTimezones();

        for (Timezone tz : timezones) {
            // Check if the time zone conforms to the JAVA TimeZone names 
            TimeZone t = TimeZone.getTimeZone(tz.getName());
            assertFalse("Timezone '" + tz + "' is unknown", t == null);
        }

        assertEquals("unexpected number of timezone timezone names", 427, timezones.size());


        // disabled because certain time-zones are present in multiple countries
//        HashSet<String> tzNames = Sets.newHashSet(Iterables.transform(timezones, Functions.toStringFunction()));
//        assertEquals("duplicated timezone names", tzNames.size(), timezones.size());

    }
}
