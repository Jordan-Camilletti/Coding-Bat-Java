/*Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.*/

public String changeXY(String str) {
  if(str.equals("x")) return "y";
  if(str.length()<=1) return str;
  if((str.substring(0,1)).equals("x")) return "y"+changeXY(str.substring(1,str.length()));
  return str.substring(0,1)+changeXY(str.substring(1,str.length()));
}
