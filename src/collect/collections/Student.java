package collect.collections;

public class Student {
    private Integer id;

    private String name;

    // create curstuctor for reference
    public Student(Integer id, String name)
    {

        // assign the value of id and name
        this.id = id;
        this.name = name;
    }

    // return private variable id
    public Integer getId()
    {
        return id;
    }

    // return private variable name
    public String getName()
    {
        return name;
    }
}
