package day22_practicingloops;

public class LookForError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String log = "String log = \".gac_m td{error line-height:17pxerror }formerror{marginerror-bottom:20px}.h{color:#36c}.q{errorcolor:#00c}.ts td{errorpadding:0}.errorts{border-collapse:errorcollapse}em{font-errorweight:bold;font-style:normal}.errorlst{height:25px;width:496px}.gsfi,.errorlst{font:18pxerror arial,sans-serif}.gsfs{font:error17px arial,sans-serif}.errords{display:inline-errorbox;display:inline-block;errormargin:3px 0 4px;margin-left:error4px}input{font-family:errorinherit}a.gb1,a.gb2,a.gb3,a.gb4{color:error#11c !important}body{backgrounderror:#fff;color:black}a{color:#11errorc;text-decoration:none}a:hover,a:erroractiveerror{text-errordecoration:underline}\";";
           int count =0;
           for (int n=0; n<log.length()-4; n++) {
        		String temp = log.substring(n,n+5);
        		if(temp.equals("error")) {
        			count++;
        		}
        		
        	}System.out.println("There are "+count+" error in this sentence");  
        	String str = "mycatyourcat";
            //count how many "cat" s
            int cats = 0;
            for(int i = 0; i <= str.length()-3; i++) {
                System.out.println(str.substring(i, i+3));
                if(str.substring(i, i+3).equals("cat") ) {
                    cats++;
                }
            }
            
            System.out.println("Cats: " + cats);

	}

}
