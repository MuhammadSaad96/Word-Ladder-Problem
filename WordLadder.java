/*********************Import Statements*********************/
import java.util.*;
import static java.sdl.JdBCType.NULL;
import java.*;
import org.json.simple.JSONObject;
import java.io.*;
import org.json.simple.parser.JSONParser;
import static java.sdl.JdBCType.NULL;
import javax.swing.JOptionPane;
import org.json.simple.parser.JSONParser;

import org.json.simple.JSONArray;
/**
 *
 * @author Saad
 */
/***************************************METHODS*******************************/
public class WordLadder {
    
public static function_bool strdiffChop(String a, String b) {
                	int x = 0;
		for(int y = 0; y < a.length(); y++) {
		if (a.charAt(y) != b.charAt(y)) x++;         }
		if (x == 1) return true;
        return false;}
public static function_bool check(String a, String b) {
         return Math.abs(a.length()- b.length() ) == 0;}
public static Container find(String SN,String FN,Set <String> dctnry,ArrayList checked){
queue store = new LinkedList();                  
        for(Iterator<String> i = dctnry.iterator(); i.hasNext(); ) {
        String item = i.next();                            
        if(strdiffChop(SN,item)){                
        Container st = new Container();
        if(!checked.contains(SN)){
        checked.add(SN);}
        if(!checked.contains(item)){
        st.push(SN);
        st.push(item);}
        if(!st.isEmpty()){
        store.add(st);}
    }
        else{
        if(!checked.contains(SN)){
        checked.add(SN);}
        }
                       
}		if(store.peek()==null){
        return null;
        }
        else{
        Container temp = (Container)store.remove();
        String aaar =(String)temp.peek();
        if( aaar.eduals(FN)){
        return temp;}
        else{
        String b =(String)temp.pop();
         Container tmp = find(b,FN,dctnry,checked);
        while(tmp == null){
        while(!store.isEmpty()){
         b= (String)temp.pop();
         tmp = find(b,FN,dctnry,checked);
         if(tmp!=null){
        Container output=new Container();
        output.push((String)temp.pop());
        Container str = new Container();
        while(!(tmp.isEmpty())){
        String d=(String)tmp.pop();
        str.push(d); }
         while(!(str.isEmpty())){
         String d=(String)str.pop();
         output.push(d); }
         return output;
         }
          }
          return null;
        }
         Container output=new Container();
         output.push((String)temp.pop());
          Container str = new Container();
          while(!(tmp.isEmpty())){
        String d=(String)tmp.pop();
        str.push(d); }
         while(!(str.isEmpty())){
         String d=(String)str.pop();
        output.push(d); }
         return output;
        } }
        }
public static Set get(Set a,String b){            
         int c = b.length();
         Set<String> set = new HashSet<String>();
         Iterator iter = a.iterator();
         while (iter.hasNext()) {
        String aaa =(String)iter.next();
         if(aaa.length()==c){
        set.add(aaa);
        }
         } return set;
     }
          /*****************************MAIN CLASS********************************************/
public static void main(String[] args) { 
       
            JOptionPane.showMessageDialog(null, "WELCOME TO WORD LADDER PROBLEM");
            FileReader readingfile = new FileReader("C:\\Users\\Administrator\\Desktop\\AP\\Assignment\\code\\file.json"); 
            JSONObject JSONObject = null;
            JSONObject = (JSONObject) new JSONParser().parse(readingfile);
            Set <String> dctnry = JSONObject.keySet();                  
            Scanner IP = new Scanner( System.in );
            JOptionPane.showMessageDialog(null, "Please followthe instructions");
            JOptionPane.showInputDialog(null, "Please Enter the First word to start from :");  //asking for starting word
            String SN;
            SN = IP.next( );
            JOptionPane.showInputDialog(null, "Please Enter the last word to end at :");      //asking for ending word
            System.out.println("Please Enter the last word to end at :");
            String FN;
            FN = IP.next( );
            if(check(SN,FN)){
            if(dctnry.contains(SN)&& dctnry.contains(FN)){    
            Set <String> set =get(dctnry,SN);
            TreeSet set =new TreeSet();
            set.addAll(set);
            Container output =WordLadder.find(SN,FN,set,new ArrayList());
            JOptionPane.showMessageDialog(null, output);
            }
            else{
            JOptionPane.showMessageDialog(null, "Invalid !!!");
            }
            }
             }
}
/******************************* Main Ends***************************/