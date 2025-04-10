package com.xworkz.tarun.internal;

public class YouTubeReview extends Review {
    @Override
    public void rate() {
        System.out.println("Giving review on YouTube channel...");
    }

    public void upload() {
        System.out.println("Uploading review video.");
    }
}
