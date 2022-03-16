package junit5Tutorials;


import org.junit.jupiter.api.Test;

import java.awt.geom.QuadCurve2D;
import java.time.Duration;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class J06PerformanceTest {
    @Test
    void performance(){
        assertTimeout(Duration.ofSeconds(1),()-> IntStream.rangeClosed(0,100000).forEach(System.out::println));
        assertTimeout(Duration.ofSeconds(1),()->IntStream.rangeClosed(0,100000)).forEach(System.out::println);
        assertTimeout(Duration.ofMillis(10),()-> DoubleStream.iterate(1,t->t+1).limit(10000).sum());
    }
}
