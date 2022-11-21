class Cat {
    private int id;
    private int age;
    private String name;
    private String gender;
    private String breed;

    public Cat(int id, String name, String breed, String gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.breed = breed;
        this.age = age;
    }

    @Override
    public String toString() {
        return "id: " + this.id + " name: " + this.name + " gender: " + this.gender + " age: " + this.age + " breed: " + this.breed;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Cat)) return false;
        Cat cat = (Cat) obj;
        return name.equals(cat.name) && gender.equals(cat.gender) && breed.equals(cat.breed) && age == cat.age && id == cat.id;
    }

    @Override
    public int hashCode() {
        return this.id = this.name.hashCode() + this.breed.hashCode();
    }
}