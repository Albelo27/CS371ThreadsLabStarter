package edu.up.cs301threadslab;

public class ThreadedAnimationView extends Thread{
    AnimationView view;

    public ThreadedAnimationView(AnimationView v) {
        view = v;
    }

    @Override
    public void run() {
        while (true) {
            view.postInvalidate();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
