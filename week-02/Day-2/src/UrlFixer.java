public class UrlFixer {
    public static void main(String... args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";

        String bots = "bots";
        String odds = "odds";
        int botsLength = bots.length();
        System.out.println(botsLength);
        url = url.substring(0, url.length() - botsLength);
        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crucial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!

        System.out.println(url + odds);
    }
}
