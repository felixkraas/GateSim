package de.germanspacebuild.gatesim.gui;

import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Felix on 22.10.2016
 * for GateSim
 *
 * @author Felix
 */
public class DisplayManagerTest {

    @Test
    public void createDisplayIDTest() throws Exception {
        DisplayManager.createDisplay();
        assertNotNull(DisplayManager.windowID);
    }

    @Test
    public void createDisplayErrorCallbackTest() throws Exception {
        DisplayManager.createDisplay();
        assertNotNull(DisplayManager.errorCallback);
    }

    @After
    public void tearDown() throws Exception {
        DisplayManager.closeDisplay();
    }
}