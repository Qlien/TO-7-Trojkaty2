/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle2;

/**
 *
 * @author Michał
 */

public class Triangle2 {

    private int side1, side2, side3;
    private String[] args1;
    private boolean main_Called = false;

    public Triangle2(int _side1, int _side2, int _side3) {
        side1 = _side1;
        side2 = _side2;
        side3 = _side3;
    }

    // Is right data?
    public boolean is_data_right() {
        if (main_Called) {
            if (args1.length != 3) {
                return false;
            }
            try {
                side1 = Integer.parseInt(args1[0]);
                side2 = Integer.parseInt(args1[1]);
                side3 = Integer.parseInt(args1[2]);
            } catch (Exception e) {
                return false;
            }
        }
        return !(side1 > 999 || side2 > 999 || side3 > 999 || side1 < 1 || side2 < 1|| side3 < 1);
    }

    // Method to test for a right-angled triangle.
    public boolean is_right() {
        return (((side1 * side1) == ((side2 * side2) + (side3 * side3)))
                || ((side2 * side2) == ((side1 * side1) + (side3 * side3)))
                || ((side3 * side3) == ((side1 * side1) + (side2 * side2))));
    }

    // Method to test for a scalene triangle.
    public boolean is_scalene() {
        return (side1 != side2) && (side1 != side3) && (side2 != side3);
    }

    // Method to test for an isosceles triangle.
    public boolean is_isosceles() {
        return ((side1 == side2) && (side1 != side3))
                || ((side1 == side3) && (side1 != side2))
                || ((side2 == side3) && (side2 != side1));
    }

    // Method to test for an equilateral triangle.
    public boolean is_equilateral() {
        return (side1 == side2) && (side1 == side3);
    }

    public int test_triangle() {
        if (!is_data_right()) {
            return 0;
        } else if (is_equilateral()) {
            return 1;
        } else if (is_right() && is_isosceles()) {
            return 2;
        } else if (is_isosceles()) {
            return 3;
        } else if (is_right()) {
            return 4;
        } else if (is_scalene()) {
            return 5;
        }
        return 6;
    }

}

