package tsydeemi;

import java.util.List;

public class ThirdList implements ListConverter{

	@SuppressWarnings("rawtypes")
	@Override
	public String listToString(List list) {
		
		String stringList = "";
        String tempList[] = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
        	tempList[i] = list.get(i).toString();
        }

        for (int i = 1; i < list.size() + 1; i++) {
        	stringList += tempList[i - 1];
            if(i % 3 == 0) {
            	stringList += "\n";
            }
        }
        
        return stringList;
        
	}
}
