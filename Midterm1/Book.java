public class Book {
    private String name; 
    private String author; 
    private float price; 
    public void book(String n, String a, float p)
    {
        if( n == null || a== null || p<0.0){
            throw new IllegalArgumentException("Illegal parameters passed");
        }
        name = n; 
        author = a; 
        price = p; 
    }
    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return name;
    }
    public float getPrice(){
        return price;
    }
    public void setTitle(String t) {
      if (t==null)
      {
        throw new IllegalArgumentException("Bad title");
      }
      name = t;
   }
   public void setAuthor(String a) {
      if (a == null)
      {
        throw new IllegalArgumentException("Bad author");
      }
      author = a;
   }
   public void setPrice(float p) {
      if (p<0.0f)
      {
        throw new IllegalArgumentException("Bad price");
      }
      price = p;
   }
}