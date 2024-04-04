package trpgPlayer.EveryData.enemys;

public class Ghoul extends trpgPlayer.EveryData.Enemy {

	{
		super.setType(1,1,1);
	}
	public Ghoul(){
					   //name,   str,int,dex,pow,
		super.setStatus("グール", 17, 13, 13, 13, 
					//con,app,size, edu, 
						13, 0, 13,  0, 
					//pSV1,pSV2,pSV3,pSV4) {
						0, 0, 1, 6);
	}
}


