Class Student 

{                                  
        String name;
        int  r no,
 
      Student ()             //   Constructor without Arguments      //   Default Constructor
        {
           Name = “ABC”
            R no   = “123”
         }
   
Print (string str, int n)         //  //   Constructor with Arguments   // Parameterized  Constructor
     {
      name = str;
      r no = n;
 }
 
 Public static void main (string arg [] )
 { 
            Student  s1 = new student () ;                            // Default Constructor
            Student  s2 = new student (  “DEF”, 456) ;      // Parameterized  Constructor

           System .out.print ln ( S1.name ) ;  
           System .out.print ln ( S1.r .o ) ;     
           System .out.print ln ( S2.name ) ;  
           System .out.print ln ( S2.r .o ) ;
}
