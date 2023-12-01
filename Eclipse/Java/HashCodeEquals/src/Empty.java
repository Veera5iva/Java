class Empty {
    private String name;
    private int id;
    
    public String getname(String name) {
    	return name;
    }
    public int id(int id) {
    	return id;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setid(int id) {
        this.id = id;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empty e = (Empty) o;
        return this.id == e.id;
    }
//    public int hashCode() {
//    	return this.id.hashCode();
//    }
}
