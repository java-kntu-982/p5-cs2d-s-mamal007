package Walls;

public class Wall {
    private Colors color;
    private boolean bullet;

    @Override
    public String toString() {
        return "Wall{" +
                "color=" + color +
                ", bullet=" + bullet +
                '}';
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public boolean isBullet() {
        return bullet;
    }

    public void setBullet(boolean bullet) {
        this.bullet = bullet;
    }
}
