/*Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.*/

public int countX(String str) {
  if(str.equals("x")) return 1;
  if(str.length()<=1) return 0;
  if((str.substring(0,1)).equals("x")) return 1+countX(str.substring(1,str.length()));
  return countX(str.substring(1,str.length()));
}
