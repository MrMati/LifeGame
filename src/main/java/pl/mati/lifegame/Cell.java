package pl.mati.lifegame;

public class Cell implements Cloneable {

    private boolean alive;

    Cell(boolean alive) {
        this.setAlive(alive);
    }

    boolean isAlive() {
        return alive;
    }

    void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override
    public Cell clone() {
        return new Cell(alive);
    }

    void changeState(int neighboursCount) {

        if (alive) {

            if (neighboursCount < 2) {
                alive = false;
            } else if (neighboursCount > 3) {
                alive = false;
            }

        } else {

            if (neighboursCount == 3) {
                alive = true;
            }

        }

    }

}
