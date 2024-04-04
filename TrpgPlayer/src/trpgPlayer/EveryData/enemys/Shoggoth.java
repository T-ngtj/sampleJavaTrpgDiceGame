package trpgPlayer.EveryData.enemys;

public class Shoggoth extends trpgPlayer.EveryData.Enemy {

	{
		super.setType(2,2,2);
	}
	public Shoggoth(){
					   //name,   str,int,dex,pow,
		super.setStatus("ショゴス", 82, 10, 5, 12, 
					//con,app,size, edu, 
						49, 1, 140,  11, 
					//pSV1,pSV2,pSV3,pSV4) {
						1, 6, 1, 20);
					//1D6/1D20	
	}
}

