package com.javatechie.webflux;


import org.junit.Test;
import reactor.core.publisher.Mono;

public class MonoFluxTest {

    @Test
     public void testMono(){
        Mono<String> monoString  = Mono.just("javatechie").log();
        monoString.subscribe(System.out::println);

    }
}
