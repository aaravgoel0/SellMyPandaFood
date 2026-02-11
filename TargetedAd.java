/*
 * Problem 2.3.1 Sell My Pet Food
 */
public class TargetedAd {

  public static void main(String[] args)
  {
    /*  
     * TODO:
     * PREPARATION WORK
     * (1) Create a file called targetWords.txt. Populate this file with words on each line that
     *     you think would determine if a user is a dog or cat owner.
     * 
     * PROGRAMMING
     * (2) Create a new DataCollector object and set the data to "socialMediaPostsSmall.txt" and "targetWords.txt"
     *     Important: Use the socialMedialPostsSmall to create your algorithm. Using a small file will help you 
     *     generate your solution quicker and give you the ability to double check your work.
     * (4) Compare each user's post to each target word. If a user mentions a target word, add their username to 
     *     the String of users. Separate usernames with a space. 
     *         Hint: You can use loops to look through each word. 
     *         Hint2: You can use indexOf to check if a word is in a user post. 
     * 
     * THE FINAL SOLUTION
     * (6) Your solution should work with the socialMedialPostsSmall.txt. Modify your DataCollector initialization
     *    so you use the socialMediaPosts.txt. You should now have a larger file of users to target.
     */


    /* your code here */
<<<<<<< HEAD

    DataCollector dc = new DataCollector();
    dc.setData("socialMediaPostsSmall.txt", "target.txt");

    // Iterate through social media posts to find users who might have pets
    String post = dc.getNextPost();
    while (!post.equals("NONE")) {
        String username = post.split(" ")[0];
        // Check if post contains any target word
        String target = dc.getNextTargetWord();
        boolean hasPetReference = false;
        while (!target.equals("NONE")) {
            if (post.toLowerCase().indexOf(target.toLowerCase()) != -1) {
                hasPetReference = true;
                break;
            }
            target = dc.getNextTargetWord();
        }
        if (hasPetReference) {
            // Add username to list (we'll collect them in the next step)
            System.out.println("Found user: " + username);
        }
        post = dc.getNextPost();
    }
    
=======
    DataCollector d = new DataCollector();
    d.setData();
  
>>>>>>> d0a9f87b98d2bafca298011f833b9c98fbee1e10
     
  }

}
