package kadai_018;

abstract public class Kato_Chapter18 {
	public String familyName = "加藤";
	public String givenName = "";
	public String address = "東京都中野区〇×";
//	public String each = "";
	
	public void setGivenName(String givenName) {
        this.givenName = givenName;
	}
	
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です\n住所は" + address + "です");
	}
	
	abstract public void eachIntroduce() ;
	
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	    /*System.out.println();*/
	}

}