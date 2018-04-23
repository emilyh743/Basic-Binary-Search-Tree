# Basic-Binary-Search-Tree

Data Structures Assignment for Basic Binary Search Tree Implementation with Linked Cells in Java:

A binary search tree (BST) is also called an ordered/sorted binary tree. Binary search trees have an advantage over other data structures in that in-order traversals can be very efficient. It has such properties:
  1) the left subtree of a node contains nodes that have keys less than the node's key
  2) the right subtree of a node contains nodes that have keys greater than the node's key
  3) the left and right subtree has to be a binary search tree
  4) no duplicate nodes

Interface: The BST will provide this collection of operations:

  insert:
   
    in: a string (the element to be stored into the tree)
   
    return: boolean; if inserted successfully then return true, else return false
   
    effect: if the tree already contains the string, then no change to the tree; else, return false
            if the tree does not already contain the string: 
            
            - then a new tree cell/node is created
            - the string is put into the node as data
            - the new node is linked into the tree at the appropriate location
            - size is incremented by 1 and return true
              
  remove:
   
    in: a string (the element to be taken out of the tree)
   
    return: boolean; if removed successfully then return true, else return false
    
               - (this means return false if the tree size is 0)
   
    effect: if the tree contains the element being searched for: 
               
               - unlink the node containing it and return true (success)
               - decrement size by one
            if the tree does not contain the element being searched for:
               - return false and make no change to the tree state
  contains:
   
    in: a string (the element to be searched for)
   
    return: boolean; 
              
               - if tree contains string being searched for then return true, else return false
               - (this means return false if tree size is 0)
   
    effect: no change to the tree's state

  findMin:
   
    in: none
   
    return: string, the smallest element value from the tree
   
    effect: no tree state change
   
    error: if tree size is 0, return null

  findMax:
   
    in: none
   
    return: string, the largest element value from the tree
   
    effect: no tree state change
   
    error: if tree size is 0, return null

  size:
   
    in: nothing
   
    return: number of elements stored in the tree
   
    effect: no change to tree state

  empty:
   
    in: nothing
   
    return: boolean; 
            
            - if tree contains no elements, then true; if size is 0, then true
            - if either contains elements or size is not 0, then return false
   
    effect: no change to tree state

  height:
   
    in: none
   
    return: integer, the length of the longest path in the tree from root to a leaf
   
    effect: no change in tree state
   
    error: if tree is empty (size is 0, root is null), then return -1

  getRoot:
   
    in: none    
   
    return: a tree cell/node, the one that is the root of the entire tree
            means if the tree is empty, then return null
   
    effect: no change to tree state
