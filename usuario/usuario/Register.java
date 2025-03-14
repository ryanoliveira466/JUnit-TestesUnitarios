 
package usuario;

 
public class Register {
    
    public Register(){
        
    }
    
    public int registering(String email, String name,String password){
        String finalEmail;
        String finalName;
        String finalPassword;
        

        //EMAIL
        if (email.toLowerCase().contains("@gmail.com") || email.toLowerCase().contains("@yahoo.com") || email.toLowerCase().contains("@outlook.com") || email.toLowerCase().contains("@hotmail.com")) {
            email = email.toLowerCase();
            finalEmail = email;
        }
        
        else{
            System.out.println("Email sem provedor");
            return -1;
        }
        //EMAIL
         
        //PASSWORD
        String passwordToString = String.valueOf(password);
        if(passwordToString.length() < 8){
            System.out.println("Senha menor que 8 caracteres");
            return -2;
        }
        
        else{
            password = password;
            finalPassword = password;
        }
        //PASSWORD
        
         //NAME
         if(name.trim().equals("")){
             System.out.println("Nome vazio");
             return -3;
         }
         else{
             finalName = name;
         }
        
        //NAME
        
        User usuario = new User(finalName, finalEmail, finalPassword);
        System.out.println("Usuário registrado foi: " + usuario.getName());
        System.out.println("Email: " + usuario.getEmail());
        System.out.println("Senha: " + usuario.getPassword());
        return 1;
        
    }
    
}
