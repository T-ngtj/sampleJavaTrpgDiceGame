package trpgPlayer.EveryData.enemys;

public class DeepOne extends trpgPlayer.EveryData.Enemy{

	{
		super.setType(1,1,1);
	}
	
	public DeepOne(){
		super.setStatus(
				//name,   str,int,dex,pow,
				"深きもの", 10, 10, 9, 8, 
						//con,app,size, edu, 
							12, 4, 15,  8, 
						//pSV1,pSV2,pSV3,pSV4) {
							0, 0, 1, 6);
	}
	
	
	
}
	
