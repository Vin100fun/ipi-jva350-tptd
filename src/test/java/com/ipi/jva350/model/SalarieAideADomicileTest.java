package com.ipi.jva350.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalarieAideADomicileTest {

    @Test
    void aLegalementDroitADesCongesPayes() {
        SalarieAideADomicile aide = new SalarieAideADomicile();
        boolean res = aide.aLegalementDroitADesCongesPayes();
        Assertions.assertEquals(false, res);
    }
}