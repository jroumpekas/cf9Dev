package gr.aueb.cf.cf9.ch17;

/**
 * Στη θέση του object, μπορούμε να έχουμε
 * οποιονδήποτε τύπο.
 */

public class NodeFlexible {
    private Object value;

    public NodeFlexible(){

    }

    public NodeFlexible(Object value) {
        this.value = value;
    }


    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }


}
