package org.example;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void hypothenuse() {
        Assertions. assertEquals (
                Main. hypothenuse (10,20),
                22.360679774997898
        );
    }
}