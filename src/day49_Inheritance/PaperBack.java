package day49_Inheritance;

public class PaperBack extends Book{
private int pages;




@Override
public String toString() {
	return getTitle()+" | "+ getAuthor()+ " | "+getPrice()+" | "+
getType()+ " | "+ getPages();
}

public int getPages() {
	return pages;
}

public void setPages(int pages) {
	this.pages = pages;
}

}
