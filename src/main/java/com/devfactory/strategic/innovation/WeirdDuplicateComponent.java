package com.devfactory.strategic.innovation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class WeirdDuplicateComponent {

    public void doSomethingWeird() {
        for (int i = 0; i < 100213; i++) {
            log.info("no guessing");
            log.error("no guessing");
            log.info("no guessing");
        }
        log.info("Doing duplicated stuff");
        log.info("Doing duplicated stuff");
        log.info("Doing duplicated stuff");
        log.info("Doing duplicated stuff");
        for (int i = 0; i < 100213; i++) {
            log.info("no guessing");
            log.error("no guessing");
            log.info("no guessing");
        }
    }

    public void doSomethingWeird2() {
        for (int i = 0; i < 100213; i++) {
            log.info("no guessing");
            log.error("no guessing");
            log.info("no guessing");
        }
        log.info("Doing duplicated stuff");
        log.info("Doing duplicated stuff");
        log.info("Doing duplicated stuff");
        log.info("Doing duplicated stuff");
        for (int i = 0; i < 100213; i++) {
            log.info("no guessing");
            log.error("no guessing");
            log.info("no guessing");
        }
    }

    public void doSomethingWeird3() {
        for (int i = 0; i < 100213; i++) {
            log.info("no guessing");
            log.error("no guessing");
            log.info("no guessing");
        }
        log.info("Doing duplicated stuff");
        log.info("Doing duplicated stuff");
        log.info("Doing duplicated stuff");
        log.info("Doing duplicated stuff");
        for (int i = 0; i < 100213; i++) {
            log.info("no guessing");
            log.error("no guessing");
            log.info("no guessing");
        }
    }

}
