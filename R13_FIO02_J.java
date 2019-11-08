/*Rule 13. Input Output (FIO)
FIO02-J. Detect and handle file-related errors
Non-Compliant Code:*/
File file = new File(args[0]);
file.delete();
