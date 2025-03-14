 
package caesarCipher;

 
public class outOfBondariesMain {
    
    public int outOfBondariesEncrypt(int increase, int numberIndex, int lenght){
        
        int index = 0;
        int numberIncreasingBondaries = numberIndex;
        
        for (int i = 0; i < increase; i++) {
            
            numberIncreasingBondaries+=1;
            
            if(numberIncreasingBondaries > lenght - 1){
                numberIncreasingBondaries = 0;
            }
            
             
                  
        }
        
        index = numberIncreasingBondaries;
        return index;
        
    }
    
    
    public int outOfBondariesDecrypt(int increase, int numberIndex, int lenght){
        
        int index = 0;
        int numberIncreasingBondaries = numberIndex;
        
        for (int i = 0; i < increase; i++) {
            
            numberIncreasingBondaries-=1;
            
            if(numberIncreasingBondaries < 0){
                numberIncreasingBondaries = lenght - 1;
            }
            
             
                  
        }
        
        index = numberIncreasingBondaries;
        return index;
        
    }
    
}
