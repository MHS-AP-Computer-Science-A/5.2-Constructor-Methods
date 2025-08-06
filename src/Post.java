
public class Post {

	String postAuthor;
	String postAuthor;
      	String postContent;
      	int postLikes;

	public Post(){
		postAuthor = "";
		postContent = "";
		postLikes = 1;
	}

	public Post(String postAuthor, String postContent){
		this.postAuthor = postAuthor;
		this.postContent = postContent;
		likes = 1;
	}
   
     	void likePost(){
           	postLikes++;
            	System.out.println("You liked this.");
      	}
		
   	public String toString(){
           	return p.postAuthor + " posted \n" 
                       + p.postContent + "\n" 
                       + p.postLikes + " likes";
      	}

}

