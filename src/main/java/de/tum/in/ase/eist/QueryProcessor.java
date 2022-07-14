package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "Patrick";
        } else if (query.contains("plus")) {
            String x =query;
            int first = Integer.parseInt(x.substring(0,x.indexOf(" ")));
            int second = Integer.parseInt(x.substring(x.indexOf("s")));
            return String.valueOf(first+second);
        }else if(query.contains("largest")){ // TODO extend the programm here
            String numberOnly = query.replaceAll("\\D,", "");
            String[] x = numberOnly.split(",");
            int y=0;
            for (int i=0;i<x.length;i++){
                if(y<Integer.parseInt(x[i])){
                    y=Integer.parseInt(x[i]);
                }
            }
            return String.valueOf(y);
        }else{
            return "";
        }
    }
}
