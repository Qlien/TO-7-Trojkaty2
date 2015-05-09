/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import triangle2.Triangle2;

/**
 *
 * @author Michał
 */
public class JUnitTest {

    public JUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void is_equilateral() {
        Triangle2 t = new Triangle2(6, 6, 6);
        assertTrue(t.is_equilateral());
    }

    @Test
    public void is_data_right() {
        Triangle2 t = new Triangle2(17777, 6, 6);
        assertFalse(t.is_data_right());
    }

    @Test
    public void is_isosceles_and_data() {
        Triangle2 t = new Triangle2(17777, 6, 6);
        assertFalse(t.is_data_right());
        assertTrue(t.is_isosceles());
    }

    @Test
    public void is_right() {
        Triangle2 t = new Triangle2(3, 4, 5);
        assertTrue(t.is_right());
    }

    @Test
    public void is_scalene() {
        Triangle2 t = new Triangle2(3, 4, 5);
        assertTrue(t.is_scalene());
    }
}
