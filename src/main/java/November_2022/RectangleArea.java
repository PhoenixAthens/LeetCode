package November_2022;

public class RectangleArea {
    //Time: 65ms, Memory: 45.1MB
    public static int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int Length1=0;
        int Breadth1=0;
        int max=Integer.max(ax1,ax2);
        int min=Integer.min(ax1,ax2);
        Length1=max-min;
        max=Integer.max(ay1,ay2);
        min=Integer.min(ay1,ay2);
        Breadth1=max-min;
        //System.out.println(Breadth1);
        int area1=Length1*Breadth1;
        //
        System.out.println(area1);
        //
        max=Integer.max(bx1,bx2);
        min=Integer.min(bx1,bx2);
        Length1=max-(min);
        max=Integer.max(by1,by2);
        min=Integer.min(by1,by2);
        Breadth1=max-(min);
        int area2=Length1*Breadth1;
        //
        System.out.println(area2);
        //
        int totalArea=Math.abs(area1)+Math.abs(area2);
        //
        //System.out.println(totalArea);
        //
        if(area1==0 || area2==0){
            return totalArea;
        }else{
            int commonLength=0;
            //case where vertices coincide
            if(ax1==bx1 && ax2==bx2){
                max=Integer.max(ax2,ax1);
                min=Integer.min(ax2,ax1);
                commonLength=max-min;
                //System.out.println("1");
            }
            //when a fig is somewhat in b fig
            else if(ax2>bx1 && ax2<=bx2 && ax1<bx1 ){
                commonLength=ax2-(bx1);
                //System.out.println("2");
            }
            // when a fig is inside b fig
            else if(ax1>=bx1 && ax2<=bx2 && ax2>ax1){
                max=Integer.max(ax1,ax2);
                min=Integer.min(ax1,ax2);
                commonLength=max-(min);
                //System.out.println("3");
            }
            // when b fig is somewhat in a fig
            else if(bx2>ax1 && bx2<=ax2 && bx1<ax1){
                commonLength=bx2-(ax1);
                //System.out.println("4");
            }
            //
            else if(bx1>=ax1  && bx2<=ax2) {
                max = Integer.max(bx1, bx2);
                min = Integer.min(bx1, bx2);
                commonLength = max - (min);
                //System.out.println("5");
            }
            //
            System.out.println("Common Length: "+commonLength);
            //
            int commonBreadth=0;
            if(ay1==by1 && ay2==by2){
                max=Integer.max(ay2,ay1);
                min=Integer.min(ay2,ay1);
                commonBreadth=max-min;
            }
            else if(ay2>by1 && ay2<=by2 && ay1<by1 ){
                commonBreadth=ay2-(by1);
            }else if(ay1>=by1 && ay2>ay1 && ay2<=by2){
                max=Integer.max(ay1,ay2);
                min=Integer.min(ay1,ay2);
                commonBreadth=max-(min);
            }else if(by2>ay1 && by2<=ay2 && by1<=ay1){
                commonBreadth=by2-(ay1);
            }else if(by1>=ay1 && by2<=ay2){
                max=Integer.max(by1,by2);
                min=Integer.min(by1,by2);
                commonBreadth=max-(min);
            }
            //
            System.out.println("Common Breadth: "+commonBreadth);
            //
            int commonArea=commonBreadth*commonLength;
            //System.out.println(commonArea);
            return totalArea-commonArea;
        }
    }
    public static void main(String...args){
        System.out.println(computeArea(-3,-5,5,0,-3,-3,3,3));//Output: 3, expected:4
    }
}

