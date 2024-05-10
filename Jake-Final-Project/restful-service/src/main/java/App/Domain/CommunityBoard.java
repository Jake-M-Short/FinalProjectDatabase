package App.Domain;

public class CommunityBoard {
    private int BoardID;
    private String Username;
    private String Title;
    private String Description;
    private String CreationTimestamp;
    private String Comments;

    public void setBoardID(int BoardID) {this.BoardID = BoardID;}
    public void setUsername(String Username) {this.Username = Username;}
    public void setTitle(String Title) {this.Title = Title;}
    public void setDescription(String Description) {this.Description = Description;}
    public void setCreationTimestamp(String CreationTimestamp) {this.CreationTimestamp = CreationTimestamp;}
    public void setComments(String Comments) {this.Comments = Comments;}

    public int getBoardID() {return this.BoardID;}
    public String getUsername() {return this.Username;}
    public String getTitle() {return this.Title;}
    public String getDescription() {return this.Description;}
    public String getCreationTimestamp() {return this.CreationTimestamp;}
    public String getComments() {return this.Comments;}


}
