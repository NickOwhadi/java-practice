package day49_Inheritance;

public abstract class BarnesAndNobles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EBook ebook=new EBook();
		ebook.setTitle("Intro to java pro");
		ebook.setAuthor("savitch");
		ebook.setPages(1016);
		ebook.setPrice(170);
		ebook.setSize(500);
		ebook.setType("Tech Book");
		
		System.out.println(ebook.getTitle());
		System.out.println(ebook.getAuthor());
		ebook.readEbook(621);
		AudioBook audioBook=new AudioBook();
		audioBook.setAuthor("Jeanne");
		audioBook.setNarrator("Marufjon");
		audioBook.setTitle("OCA preparation");
		audioBook.listen();
		PaperBack pb=new PaperBack();
		pb.setAuthor("Malcom Gladwell");
		pb.setTitle("Outliners");
		pb.setType("Biography");
		pb.setPages(304);
		pb.setPrice(20);
		System.out.println(pb.toString());
		
		
		
	}

}
