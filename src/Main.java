import static java.lang.System.out;

public class Main {
    public static void main(String[] args) throws Exception{
        int a=5,b=10,ketqua=0;
        if(a>b) ketqua=1;
        else if(a<b) ketqua = -1;
        else ketqua=0;
        //out.print(ketqua);

        ketqua = a>b?1:a<b?-1:0;
        out.print(ketqua);
    }
}
