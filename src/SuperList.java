import java.util.ArrayList;
import java.util.Iterator;

public class SuperList extends ListManager{

    ArrayList<Object> collection = new ArrayList<Object>();

    @Override
    public void addElement(Object element) {
        collection.add(collection.size(), element);
    }

    @Override
    public Object removeElement(int position) {

        Object valor = collection.get(position);

        collection.remove(position);

        return valor;
    }

    @Override
    public void showElements() {

        Iterator<Object> it = collection.iterator();

        while (it.hasNext()) {
            Object valor = it.next();
            System.out.println(valor);
        }
    }


    @Override
    public void showReversedElements() {

        Iterator<Object> it = collection.iterator();

        while (it.hasNext()) {
            Object valor = it.next();
            System.out.println(valor);
        }

    }
}
