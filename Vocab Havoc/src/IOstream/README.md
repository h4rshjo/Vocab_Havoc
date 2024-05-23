# HOW TO USE THE IOSTREAM PACKAGE BY YOURS TRULY (luis)
Everything in the IOstream package is meant for reading and writing scores to the leaderboard (stored in savedata/leaderboard.txt). 
## `Ostream` class
The Ostream class contains all the methods concerned with writing to the leaderboard. The only methods you have access to are the `saveScoreFrenzy` and `saveScoreTimeAttack` methods.
### `saveScoreFrenzy(String name, int wordsGuessed, int time)`
* saves a frenzy score to the leaderboard
* PARAMETERS:
	* `String name`
		* the name of the player
	* `int wordsGuessed`
		* the number of words guessed correctly
	* `int time`
		* the time in seconds
* EXAMPLE:
```java
saveScoreFrenzy("luis", 4, 23);
saveScoreFrenzy("jek", 5, 61);
saveScoreFrenzy("erin", 5, 83);
```
```
// leaderboard.txt
[FRENZY]
luis,4/5,00:23
jek,5/5,01:01
erin,5/5,01:23
[TIME ATTACK]
```
### `saveScoreTimeAttack(String name, int time)`
* saves a time attack score to the leaderboard
* PARAMETERS:
	* `String name`
		* the name of the player
	* `int time`
		* the time in seconds
* EXAMPLE:
```java
saveScoreTimeAttack("ryoji", 74);
saveScoreFrenzy("arjay", 47);
```
```
// leaderboard.txt
[FRENZY]
luis,4/5,00:23
jek,5/5,01:01
erin,5/5,01:23
[TIME ATTACK]
ryoji,01:14
arjay,00:47
```
## `Istream` class
The `Istream` class contains all the methods concerned with reading scores from the leaderboard. The only methods you have access to are the `getScore` and `getWords` methods.
### `getScore(int scorePosition, String mode)`
* returns the desired score
* PARAMETERS:
	* `int scorePosition`
		* the "position" of the score in the leaderboard STARTING FROM 1 (hindi 0!!!!!!)
		* pang ilan sya sa list?
	* `String mode`
		* the game mode of the desired score
		* the only valid values are `"FRENZY"` and `"TIME ATTACK"` (not case sensitive)
* RETURN VALUE
		- returns a `String[]` containing the values of the desired score
		- if for whatever reason score retrieval fails, the method returns `null`		
* EXAMPLE:
```
// leaderboard.txt
[FRENZY]
luis,4/5,00:23
jek,5/5,01:01
erin,5/5,01:23
[TIME ATTACK]
// no scores here yet
```
```java
String[] score1 getScore(1, "FRENZY"); // OK
System.out.println(score1[0]); // "luis"
System.out.println(score1[1]); // "4/5"
System.out.println(score1[2]); // "00:23"

String[] score2 getScore(2, "FRENZY"); // OK
System.out.println(score2[0]); // "jek"
System.out.println(score2[1]); // "5/5"
System.out.println(score2[2]); // "01:01"

String[] score2 getScore(1, "TIME ATTACK"); 
// score2 is null because TIME ATTACK doesnt have any scores yet

System.out.println(score1[0]); // NullPointerException
```
### `getWords()`
* returns the entire word list
* EXAMPLE:
```java
String[] words = getWords();
```