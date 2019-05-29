package day51_;

public class AtTheGym {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise e=new Exercise();
		Runnung r=new Runnung();
		Swimming s=new Swimming();
		Yoga y=new Yoga();
		Jujitsu j=new Jujitsu();
		Sprinting sp=new Sprinting();
		
		
		System.out.println(e.perform(30));
		System.out.println(r.perform(40));
		System.out.println(s.perform(20));
		System.out.println(y.perform(60));
		System.out.println(j.perform(25));
		System.out.println(sp.perform(10));
		System.out.println("###########");
		Snowboarding sn=new Snowboarding();
		System.out.println(sn.perform(100));

	}

}
