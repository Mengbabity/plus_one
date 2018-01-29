# plus_one

题目是将一个用数组表示的数字加一再返回。

#Java
From the back to the head,if the digit is 9,set it to 0,else plus 1 to the digit,then return.
If no return in the for-cycle,which means every digit is 9 and the array is 00000...so define a new array which length is n+1,
set the first to 1.

#C++
The method is same to Java,but the vector is easy to use because the function push_back.No need to define a new array like Java.
