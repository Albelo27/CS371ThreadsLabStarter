package edu.up.cs301threadslab;

public class StarChanger extends Thread{

    StarAnimation givenStarAnimation;

    public StarChanger(StarAnimation given) {
        givenStarAnimation = given;
    }

    @Override
    public void run() {
        while (true) {
            try {
                if (Math.random() < 0.5) {
                    givenStarAnimation.removeStar();
                } else {
                    givenStarAnimation.addStar();
                }
                Thread.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
