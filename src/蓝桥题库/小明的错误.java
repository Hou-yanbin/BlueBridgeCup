package 蓝桥题库;

public class 小明的错误 {

	public static void main(String[] args) {
	String string="iawaswapwauawhawdwafwanbiopwanivgbikvblvbwawawawvolyuvgbololvolgbyolgyowagbolgawgboplwawaolgyolwaogblwaygbowawagwabwayawopwawagyowabwaowapjwapcfrtuywawacvujwawawaufttyfuftywawawatifgugbgbyguwawawawayugbigwwwytigwygwgbwyoawawgoghwaogwborgrewabouyhwabyuhowabhnwawauygbawyawuwaoawfcawaaaahwaywauwagwawefwaafmbawklawjiawihnwanhawawawawijwajiofjeriofgjrefjhwaewarwaowagwahwauwaiwarwaiwaqwarwahwaqwawwaowapfweofbwewafwahwaiwaewawwawawawawafwawawawaeiufwepfhnewfwahwajwatwafowawajtokshwawafwaiwahwafwahmgoewawawawafkfjkewnwawafiewhfwawawafjkernhawkrenwawawawafujnrheiowanwakawawawawwanoifewajrwaoawawfweojnwawawawawawawafjkwenawawferkwmpwawawawaforeijawawferhfiueorghwuwafguwegfwaghrwiufgwahweofgowaidwiweaiwwawieyiwe";
	char[] arr=string.toCharArray();
	int cuowu=0;
	int jinggao=0;
	for (int i = 0; i < arr.length-3; i++) {
		if (arr[i]=='a'&&arr[i+1]=='w'&&arr[i+2]!='a') {
			jinggao++;
		}
		if (arr[i]=='w'&&arr[i+1]=='a'&&arr[i+2]!='w') {
			jinggao++;
		}
		if (arr[i]=='a'&&arr[i+1]=='w'&&arr[i+2]=='a'&&arr[i+3]=='w'&&arr[i+4]=='a'&&arr[i+5]=='w') {
			cuowu++;
			i+=6;
			
		}
		if (arr[i]=='w'&&arr[i+1]=='a'&&arr[i+2]=='w'&&arr[i+3]=='a'&&arr[i+4]=='w'&&arr[i+5]=='a') {
			cuowu++;
			i+=6;
		}
		if (arr[i]=='a'&&arr[i+1]=='w'&&arr[i+2]=='a'&&arr[i+3]=='w') {
			cuowu++;
			i+=4;
			
		}
		if (arr[i]=='w'&&arr[i+1]=='a'&&arr[i+2]=='w'&&arr[i+3]=='a') {
			cuowu++;
			i+=4;
		}
	}
	System.out.println(jinggao);
	System.out.println(cuowu);
	}

}
