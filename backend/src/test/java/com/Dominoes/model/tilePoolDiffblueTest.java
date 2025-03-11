package com.Dominoes.model;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class tilePoolDiffblueTest {
    /**
     * Test new {@link tilePool} (default constructor).
     * <p>
     * Method under test: default or parameterless constructor of {@link tilePool}
     */
    @Test
    @DisplayName("Test new tilePool (default constructor)")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testNewTilePool() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.util.Collection.add(Object)" because "that" is null
        //       at com.Dominoes.model.tilePool.<init>(tilePool.java:11)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        tilePool tilePool = new tilePool();

        for(tile tile : tilePool.getTiles()) {
            System.out.println(tile.toString());
        }
    }
}
