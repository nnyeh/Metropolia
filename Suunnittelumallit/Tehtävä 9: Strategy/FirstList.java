package tsydeemi;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class FirstList implements ListConverter {

    @SuppressWarnings({"rawtypes", "unchecked"})
	@Override
    public String listToString(List list) {
    	
        String stringList = "";
        ArrayList arrayList = new ArrayList();
        
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(list.get(i));
        }

        for (Iterator i = arrayList.iterator(); i.hasNext();) {
        	stringList += i.next() + "\n";
        }

        return stringList;
        
    }
}