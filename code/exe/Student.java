public class Student {
    private String id;
    private String name;
    private int age;
    private String sx;
    private String classmater;
    private String major;

    public Student() {
    }

    public Student(String id, String name, int age, String sx, String classmater, String major) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sx = sx;
        this.classmater = classmater;
        this.major = major;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return sx
     */
    public String getSx() {
        return sx;
    }

    /**
     * 设置
     * @param sx
     */
    public void setSx(String sx) {
        this.sx = sx;
    }

    /**
     * 获取
     * @return classmater
     */
    public String getClassmater() {
        return classmater;
    }

    /**
     * 设置
     * @param classmater
     */
    public void setClassmater(String classmater) {
        this.classmater = classmater;
    }

    /**
     * 获取
     * @return major
     */
    public String getMajor() {
        return major;
    }

    /**
     * 设置
     * @param major
     */
    public void setMajor(String major) {
        this.major = major;
    }


}
