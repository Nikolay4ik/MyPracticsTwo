public class Poynts {
    public static void main(String[] args) {
String[]df=new String[3];
df[0]="3:1";
df[1]="2:2";
df[2]="0:1";
        System.out.println(start(df));
    }

    static public int start(String[] games) {
        int ballsMyTeam=0;
        int[] x= new int[games.length];
        int[] y= new int[games.length];
        int numsX=0;
        int numsY=0;
        int num=0;
        char[] numsChar=new char[games.length*2];
        for (String s : games) {
            String goodString = s.replaceAll(":", "");
             for (char goodChar:goodString.toCharArray()){
                 numsChar[num] =goodChar;
                 num++;
             }
        }
        for (int i = 0; i <numsChar.length; i++) {
            if (i%2==0){
                x[numsX]=Integer.parseInt(String.valueOf(numsChar[i]));
                numsX++;
            }else {
                y[numsY]=Integer.parseInt(String.valueOf(numsChar[i]));
                numsY++;
            }
        }
        for (int i = 0; i < games.length; i++) {
            if (x[i]>y[i]){
                ballsMyTeam+=3;
            }
            if (x[i]<y[i]){
                ballsMyTeam+=0;
            }
            if (x[i]==y[i]){
                ballsMyTeam+=1;
            }
        }
        return ballsMyTeam;
    }
}
