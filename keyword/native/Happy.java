// writing and using native methods on the Linux platform

// Compile Java Code
// % javac Happy.java

// Create a C header file
// % javah Happy

// Create a C stubs file
// % javah -stubs Happy

// Write C code
// #include &ltStubPreamble.h>      /* Standard native method stuff. */
// #include "Happy.h"         /* Generated earlier. */
// #include &ltstdio.h>         /* Standard C IO stuff. */
// void Happy_printText (struct HHappy *this)
//     {
//     puts ("Happy New Year!!!");
//     } 

// Create a shared library
// % gcc -I/usr/local/java/include -I/usr/local/java/include/genunix -fPIC -c Happy.c HappyImp.c
// % gcc -shared -Wl,-soname,libhappy.so.1 -o libhappy.so.1.0 Happy.o HappyImp.o
// % cp libhappy.so.1.0 libhappy.so
// % export LD_LIBRARY_PATH=`pwd`:$LD_LIBRARY_PATH

// Execute the application
// % java Happy

class Happy
{
  public native void printText ();
  static
  {
    System.loadLibrary ("happy");   /* Note lowercase of classname! */
  }
  public static void main (String[] args)
  {
    Happy happy = new Happy ();
    happy.printText ();
  }
}
