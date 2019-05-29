package day47_Blocks;

public class Value {
	int val;
	  boolean modified;
	  public Value(int val) {
	    this.val = val;
	  }
	  public Value() {
	  }
	  public void setVal(int val) {
	    this.val = val;
	    modified = true;
	  }
	  public boolean wasModified() {
	    return modified;
	  }
	  public int getVal() {
	    return val;
	  }
}