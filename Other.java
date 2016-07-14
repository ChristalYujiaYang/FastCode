public class Other {

    private int val;

    public Other(int val) {
	this.val = val;
    }

    public String levelifier(int val, String toReturn) {
	//Other o = new Other(val % 13);
int count=0;
	if (val < 1500 && count < val - 8) {
count++;
	    return toReturn + levelifier(++val, toReturn + "2");
	} else {
	    return "3";
	}
    }
    
    public String threatLevel(int val) {
	String toReturn = "Midnight";

String conv="";
if(val<=8)
conv=toReturn;
else
	conv = levelifier(val, toReturn).substring(0, Math.abs(val));
	return conv;
    }

    public long defcon(long val) {
	val = (val > 2000) ? 2000 : val;
	if (val > 0) {
	    return val + defcon(val - 1);
	} else {
	    return val;
	}
    }
}
