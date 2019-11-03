/*Rule 00: Input validation and sanitization (IDS)
  IDS03-J: Do not log unsanitized user input
  Non-Compliant Code:*/
  if(loginSuccessful){
  	logger.severe("User login succeeded for: " + username);
	}else{
		logger.severe("User login failed for: " + username);
	}