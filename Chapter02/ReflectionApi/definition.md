\#Reflection allows a Java program to look at and manipulate itself at runtime.

or,

Reflection API allows Java programs to examine and modify class structure and behavior at runtime.



Normally in Java:

You know class names

You know methods

You know fields



\#With Reflection:

\##You can discover and use them dynamically while the program is running.





without reflection

User u = new User();

u.getName();



with reflection

Class<?> c = Class.forName("User");

Object obj = c.newInstance();





