package analyze;
import data.*;
public class forcast {
	double alpha=0;
public forcast(double alpha){
	this.alpha = alpha;
}
public void setAlpha(double alpha){
	this.alpha = alpha;
}
public String getForcast(data d){
	String s="";
	int temp=d.temp();
	int humi= d.humi();
	if(temp+alpha<=8&&temp>=1&&humi>=25){s="rainy";}
	else if(temp+alpha<=0&&humi>=20){s="snowy";}
	else if(temp+alpha<=8&&humi<25){s="windy";}
	else if(temp+alpha>=8&&humi<25){s="cloudy";}
	else if(temp+alpha>=8&&humi>25){s="Sunny";}
	else{s="error";}
	return s;
}
}
