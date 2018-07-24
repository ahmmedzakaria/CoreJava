/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnumAndConstant;

/**
 *
 * @author Zakaria
 */
public enum Season2 {

    WINTER(10) {
        @Override
        public String displaySeason() {
            return "Winter";
        }
    }, SUMMER(20) {
        @Override
        public String displaySeason() {
            return "Summer";
        }
    };
    public int value;
    public abstract String displaySeason();

    private Season2(int value) {
        this.value = value;
    }

}

class EnumExample2 {

    public static void main(String[] args) {
        for (Season2 s : Season2.values()) {
            System.out.println("Season: " + s + " Value: " + s.value+" byMehodCallValue: "+s.displaySeason());
        }
    }
}
