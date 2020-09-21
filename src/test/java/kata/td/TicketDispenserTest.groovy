package kata.td;

import org.junit.Test
import spock.lang.Specification;

import static org.junit.Assert.assertEquals;


class TicketDispenserTest extends Specification{
    def "a_trivial_test"() {

        expect:
        assertEquals(5, 2 + 3);
    }
}
