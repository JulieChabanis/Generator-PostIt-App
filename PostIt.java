public class PostIt implements Cloneable {
    private static int numberPostItCreate = 0;

    private int id;
    private User author; 
    private char tag; 
    private String contenu;

    public PostIt(User author, char tag, String contenu) {
        this.id = ++numberPostItCreate; 
        this.author = author; 
        this.tag = tag; 
        this.contenu = contenu; 
    }

    public static int getNumberPostItCreate() {
        return numberPostItCreate; 
    }

    public int getId(){
        return this.id;
    }

    public User getAuthor() {
        return author; 
    }

    public char getTag() {
        return this.tag; 
    }

    public void setTag (char tag) {
        this.tag = tag;
    }

    public String getContenu() {
        return this.contenu; 
    }

    public void setContenu(String contenu) {
        this.contenu = contenu; 
    }

    @Override
    public boolean equals(Object o) {
        return o != null && o.getClass() == this.getClass()
            && this.getTag() == ((PostIt) o).getTag()
            && this.getContenu().equals(((PostIt) o).getContenu());
	}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + tag;
        result = prime * result + ((contenu == null) ? 0 : contenu.hashCode());
        return result;
	}

	@Override
    public String toString() {
        return "[" + this.getTag() + "] " + this.getContenu() + " par " + this.getAuthor();
	}

    @Override
	public Object clone() throws CloneNotSupportedException {
		PostIt clone = (PostIt) super.clone();
		clone.id = ++numberPostItCreate;

		return clone;
	}
    
}
