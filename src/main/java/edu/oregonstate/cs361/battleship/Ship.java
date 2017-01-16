package edu.oregonstate.cs361.battleship;
/**
*This is licensed to be used by all, as long as not used for evil
*/

/**
 * Created by michaelhilton on 1/5/17.
 * Who is my aweomse ta
 */
public class Ship {
    private String name;
    private int length;
    private Coordinate start;
    private Coordinate end;

    public Ship(String n, int l,Coordinate s, Coordinate e) {
        name = n;
        length = l;
        start = s;
        end = e;
    }
    public Ship(String n, int l) {
        name = n;
        length = l;
    }

    public void setLocation(Coordinate s, Coordinate e) {
        start = s;
        end = e;

    }

    public boolean covers(Coordinate test) {
        //horizontal
        if(start.getAcross() == end.getAcross()){
            if(test.getAcross() == start.getAcross()){
                if((test.getDown() >= start.getDown()) &&
                (test.getDown() <= end.getDown()))
                return true;
            } else {
                return false;
            }
        }
        //vertical
        else{
            if(test.getDown() == start.getDown()){
                if((test.getAcross() >= start.getAcross()) &&
                        (test.getAcross() <= end.getAcross()))
                    return true;
            } else {
                return false;
            }

        }
        return false;
    }

}
