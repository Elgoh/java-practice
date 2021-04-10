**Create a Java CLI (Command Line Interface) which allows the user to choose which function they want to use, by entering a function number after starting the program. Wherever possible, ensure that user input is properly handled, so that the program will not crash or deliver undefined results due to incorrect inputs.**

*You may choose to use a GUI (Swing/JavaFX/etc) instead, but you will be judged by the usability, correctness and robustness of your program, not the interface by which it can be accessed - no merit will be given to any UI-related design or programming work for this task.*

**Functions:**
1. From 1 to [Number A], count all the palindromic primes and store them in a list, printing them out for the User to see. 
**BONUS: Execute this in a multi-threaded manner which should yield a faster output than if done on a single thread**
   - User Input: 1 Integer - Number A
   - Example: 2, 3, 5, 7, 11, 101, 131, 151, 181, 191, 313, 353, 373, 383, 727, 757, 787, 797, 919...

2. From 1 to 100,000, given [Numbers A & B], find all the numbers between those two which are palindromic prime after removing one digit. 
**BONUS: Execute this in a multi-threaded manner which should yield a faster output than if done on a single thread**
   - User Input: 2 Integers - Number A, B
   - Example: For inputs 115 and 130, then the answer should be 115, 116, 117, 118, 119, 121.

3. Count the frequency of each word in any given [Text String], print out the top 10 words with their individual frequency, and print out the sentence where the top 10 words appeared for the first and last time.
   - User Input: Any text input conformant to a sentence structure (demarcated by full stops) **BONUS: Any valid .txt file path**
   - Example
   - Input: `It’s a story about people believing what they want to believe, even when there’s evidence to the contrary. It’s a story about people not being what they seem. And it’s a story, as the movie poster says, "so unbelievable it must be true." Which it is. I know this because the widow in the freezer was, in real life, my Aunt Marge, Mrs. Marjorie Nugent, my mother’s sister and, depending on whom you ask, the meanest woman in East Texas. She was 81 when she was murdered, and Bernie Tiede, her constant companion and rumored paramour, was 38. He’ll be eligible for parole in 2027, when he’ll be 69.`
   - Output (For 1 Word): [{"keyword": "the", "frequency": 5, "first_time": "It’s a story about people believing what they want to believe, even when there’s evidence to the contrary.", "last_time": "Marjorie Nugent, my mother’s sister and, depending on whom you ask, the meanest woman in East Texas."}].

4. Perform a GET request on "https://dev.beepbeep.tech/v1/sample_customer", the data returned from the API should have the structure below. Print the list of promotions sorted by their titles in descending alphabetical order. 
```
{
	"name": "(str)",
	"email": "(str)", 
	"promotions": [
		{
			"title": "(str)",
			"quantity": (int),
			"type": "discount",
			"discount": (float)
		},
 		{
			"title": "(str)",
			 "quantity": (int), 
			 "type": "redeem"
		}
	]
}
```

5. Using the information in the data directory, print out the following:
   1. List the top 10 sellers with the highest review score.
   2. Calculate the top 10 product categories with the highest sales and show their english name.
   3. Count the daily average revenue by the top 10 sellers with the highest total revenue.
   4. Count the monthly revenue in each seller state.
   5. If you are a seller, what kind of products you will sell? Where are you going to open your store? And why?
