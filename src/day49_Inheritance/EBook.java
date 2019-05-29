package day49_Inheritance;

public class EBook extends Book {
private	double size;
private int pages;

public void readEbook(int pageNum) {
	System.out.println("Reading "+ getTitle()+ " by "+ 
     getAuthor()+" at page "+pageNum);
}
@Override
public String toString() {
	return "EBook [size=" + size + ", pages=" + pages + "]";
}
public double getSize() {
	return size;
}
public void setSize(double size) {
	this.size = size;
}
public int getPages() {
	return pages;
}
public void setPages(int pages) {
	this.pages = pages;
}
	
}
