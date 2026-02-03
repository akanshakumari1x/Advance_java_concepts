HashMap:-

HashMap stores key-value pairs using a hash table where keys are converted into hash codes to determine bucket location, and collisions are handled using linked lists or red-black trees. HashMap stores data in key-value pairs.



Some important points:-

&nbsp;Keys must be unique

&nbsp;Values can be duplicate

&nbsp;Not ordered

&nbsp;Allows one null key, multiple null values.

&nbsp;Default capacity = 16

&nbsp;Load factor = 0.75

&nbsp;Rehashing happens when:



Internal Working of HashMap (Step-by-step):-

HashMap internally uses: Array of Nodes (Bucket Array)



How put(key, value) works:-

map.put(101, "Akan");



1.Hash Code - java Calls key.hashcode();

2.Find Bucket Index - index = hash \&(arr.len - 1);

if array size = 16  then 101 \& 15 = 5 data goes to bucket 5.



3.Collision check - If bucket empty → store directly. If already has data → Collision happens.

Before java 8 linked list used.



after java 8+ - If list size > 8 → converts into Red-Black Tree for faster search.

