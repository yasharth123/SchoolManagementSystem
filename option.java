
package schoolmanagement;


public enum option {
    Admin,Student;
    
     private option(){}
    
    public String Value(){
        return  name();
    }
    public static option fromvalue(String v){
    
        return valueOf(v); 
    }
}
