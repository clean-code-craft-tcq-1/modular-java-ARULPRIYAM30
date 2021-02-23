package colorcoder;

public class Main {
    static void testNumberToPair(int pairNumber,MajorColor expectedMajor,MinorColor expectedMinor)
    {
        ColorPair colorPair = Exchange.GetColorFromPairNumber(pairNumber);
        System.out.println("Got pair " + colorPair.ToString());
        assert(colorPair.getMajor() == expectedMajor);
        assert(colorPair.getMinor() == expectedMinor);
    }
    static void testPairToNumber(MajorColor major, MinorColor minor,int expectedPairNumber)
    {
        int pairNumber = Exchange.GetPairNumberFromColor(major, minor);
        System.out.println("Got pair number " + pairNumber);
        assert(pairNumber == expectedPairNumber);
    }
    public String toString() {
    	String Manual="";
    	for(int i=1; i<=25; i++) {
    		Manual += i + " " + Exchange.GetColorFromPairNumber(i).ToString()+"\n";
    	}
    	return Manual;
    }
    public static void main(String[] args) {
        testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
        testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);
        testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
        testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
    }}
