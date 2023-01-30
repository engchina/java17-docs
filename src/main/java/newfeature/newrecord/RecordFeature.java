package newfeature.newrecord;

public class RecordFeature{
    public static void main(String[] args) {

    }
}

 record User(String name, Integer age) {
    @Override
    public String toString() {
        return "User2[" +
                "name='" + name + '\'' +
                ", age=" + age +
                ']';
    }
    @Override
    public boolean equals(Object obj) {
        return false;
    }
    @Override
    public int hashCode() {
        return 0;
    }
}


