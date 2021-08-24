import java.util.*;

class bank{

    private List<Map<String, String>> users = new ArrayList<>();

    public void addUser(String name,int age, String country){
        Map userDetails = new HashMap<>();

        userDetails.put("Name",name);
        userDetails.put("Age",age);
        userDetails.put("Country",country);
        userDetails.put("ID",users.size()+1000);
        userDetails.put("Loan",false);

        users.add(userDetails);
    }

    public void removeUser(int id){
        for(Map map:users){
            if(map.get("ID").equals(id)){
                users.remove(map);
                break;
            }
        }
    }

    public List getUsers(){
        return users;
    }

    public Map getUser(int ID){

        for(Map map:users){
            if(map.get("ID").equals(ID)){
                return map;
            }
        }
        return users.get(0);
    }

    public int loan(int amount){
        return amount;
    }
}

public class Practice {
    public static void main(String[] args) {
        bank B = new bank();
        B.addUser("Arvind",22,"India");
        B.addUser("Mani",20,"African");
        B.addUser("Amar",19,"Canadian");
        B.addUser("Smith",23,"American");

        B.removeUser(1000);
        System.out.println(B.getUser(1001));
    }
}