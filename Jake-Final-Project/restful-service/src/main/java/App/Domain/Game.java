package App.Domain;

public class Game {
    private String GameName;
    private String description;
    private String platform;
    private int price;
    private String releaseDate;
    private int devID;
    private String genre;


    public void setGameName(String GameName) {
        this.GameName = GameName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setDevID(Integer devID) {
        this.devID = devID;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public void setGenre(String genre) {
        this.genre = genre;
    }


    public String getGameName() {return this.GameName;}

    public String getDescription() {return this.description;}

    public String getPlatform() {return this.platform;}

    public int getPrice() {return this.price;}

    public String getReleaseDate() {return this.releaseDate;}

    public Integer getDevID() {return this.devID;}

    public String getGenre() {return this.genre;}


}
