## Updates

  I added a lot of lines, here's a summary of my changes:
  - I made it so there's no limit on the amount of books, the array gets bigger if you try to add one outside the size of the current array
    I did this by changing the array in Books.java from **Book theBook[] = new Book[50];** into **Book theBook[] = new Book[n]** and implemented n to change.
    
  - I added a menu before the library menu. It asks if you're a student, staff or IT staff and then presents the appropiate options. 
    I still need to add verification but it makes sense to add this feature otherwise students could edit the library system. 
    First I added the menus into Books.java (I might add another class for them all together we'll see) 
    The way I implemented it into to the main class was to create a new switch and nest the current student and new Staff and ITStaff switches inside of it.
    From there I made a new scanner to take the input from them.
    I'm sure there's a better way then a bunch of switches but it was easiest solution I could think of. 
