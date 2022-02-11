package ZMyOwnClass.ReferencjaAZmienna;

public class ObjectFieldsChanging {

    private int attribute;

    public ObjectFieldsChanging(int attribute){
        this.attribute = attribute;
    }

    public int getAttribute() {
        return attribute;
    }

    public void setAttribute(int attribute) {
        this.attribute = attribute;
    }
}
