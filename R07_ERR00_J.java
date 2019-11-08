/*Rule 07. Exceptional Behavior (ERR)
ERR00-J. Do not supress or ignore checked expressions.
Non-Compliant Code:*/
try {
  //...
} catch (IOException ioe) {
  ioe.printStackTrace();
}
