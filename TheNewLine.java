//{ Driver Code Starts
//Initial Template for Java

// } Driver Code Ends
//User function Template for Java

class Geeks{
    
    // Function to print each word in single line
    static void printIndividualLine(){
        String input = "Geeks for Geeks";
        String[] words  = input.split(" ");
            for(String word: words ){
                System.out.println(word);
            }

        
    }
    public static void main (String[]args){
        printIndividualLine();
    }
    
}

//{ Driver Code Starts.
class GfG{
    
    public static void main(String args[]){
        
        //Creating an object of Class Geeks
        Geeks g = new Geeks();
        
        //Calling a function of Class Geeks
        g.printIndividualLine();
    }
    
}
// } Driver Code Ends
