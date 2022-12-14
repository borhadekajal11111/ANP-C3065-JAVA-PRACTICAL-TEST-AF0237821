Public class WordGame
{
 static String cityName[]={ "chennai","mumbai", "hyderbad","pune"};
 static String cityNameWithBlanks[]=new String[5];
int randomNumberArr[]=new int[10];
void displaycityNameWithBlanks()
{
for(int i=0;i<cityName.length;i++)
{
int length=cityName[i].length();
char cityNameCharArr[]=new char[length];
generaterandomNumber()(length);
for(int j=0;j<length;j++)
{
cityNameCharArr[j]=cityName[i].charAt(j);
for(int k=0;k<randomNumberArr.length;k++)
{
if(j==randomNumberArr[k])
cityNameCharArr[j]="-";
}
}
String newcityName=new String(cityNameCharArr);
cityNameWithBlanks[i]]=newcityName;
System.out.println(cityNameWithBlanks[i];
}
}
void generateRandomNumber(int count)
{
int minimum=0;
int maximum=count;
for(int=randomNumber=minimum+(int)(Math.random()*maximum);
randomNumberArr[k]=randomNumber;
System.out.println(randomNumber);
}
}
Public static void main(String[] args)
{
WordGame WordGameObj=new WordGame();
WordGameobj.displaycityNameWithBlanks();
}
}















