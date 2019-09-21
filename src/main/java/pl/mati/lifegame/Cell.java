package pl.mati.lifegame;

public class Cell implements Cloneable {

    private boolean alive;

    public Cell(boolean alive) {
        this.setAlive(alive);
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override
    public Cell clone() {
        return new Cell(alive);
    }

    public void changeState(int neighboursCount) {

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
