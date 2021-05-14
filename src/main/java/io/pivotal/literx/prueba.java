package io.pivotal.literx;

import io.pivotal.literx.domain.User;
import io.pivotal.literx.repository.ReactiveRepository;
import io.pivotal.literx.repository.ReactiveUserRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import java.util.function.Consumer;

public class prueba {
    public static void main(String[] args) {
//        Consumer<Integer> consumer = s -> System.out.println(s + " : " + Thread.currentThread().getName());
//
//        Flux.range(1, 5)
//                .doOnNext(consumer)
//                .map(i -> {
//                    System.out.println("Inside map the thread is " + Thread.currentThread().getName());
//                    return i * 10;
//                })
//                .publishOn(Schedulers.newElastic("First_PublishOn()_thread"))
//                .doOnNext(consumer)
//                .publishOn(Schedulers.newElastic("Second_PublishOn()_thread"))
//                .doOnNext(consumer)
//                .subscribeOn(Schedulers.newElastic("subscribeOn2_thread"))
//                .doOnNext(consumer)
//                .subscribe();


        //DEFER METHOD

        //if you see mono.just has created the observable immediatly and it doesn't change
        // even if value has changed but the defer create the observable in subscribe
        // so you will work with the current onsubscribe value
//        int a = 5;
//        @Override
//        public void run(String... args) throws Exception {
//
//            Mono<Integer> monoJust = Mono.just(a);
//            Mono<Integer> monoDefer = Mono.defer(() -> Mono.just(a));
//
//            monoJust.subscribe(integer1 -> System.out.println(integer1));
//            monoDefer.subscribe(integer1 -> System.out.println(integer1));
//
//            a = 7;
//            monoJust.subscribe(integer1 -> System.out.println(integer1));
//            monoDefer.subscribe(integer1 -> System.out.println(integer1));
//        }
//        print: 5,5,5,7

//        if you see mono.just has created the observable immediatly and it doesn't change even if value has changed but
//        the defer create the observable in subscribe so you will work with the current onsubscribe value

         //comparteTo method.
        // "pepe" "pepe" <- return 0 en compareTo method
        // "pep" "pepe" <- value < 0 is returned when string has less than other string values
        // "pepe" "pep" <- value > 0 wether first string is more greater than second string
    }

}
