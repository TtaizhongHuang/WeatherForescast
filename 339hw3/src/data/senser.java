package data;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import data.*;
public class senser{
	data d= new data(0,0);
	Integer[] arr2 = new Integer[50];
	Integer[] arr = new Integer[70];
	public senser(){
	    
	    for (int i = 0; i < arr.length; i++) {
	        arr[i] = i-20;
	    }
	    Collections.shuffle(Arrays.asList(arr));
	    
	    for (int i = 0; i < arr2.length; i++) {
	        arr2[i] = i;
	    }
	    Collections.shuffle(Arrays.asList(arr2));
		d = new data(arr[3],arr[3]);

	}
	public data getData(){
		Collections.shuffle(Arrays.asList(arr));
		Collections.shuffle(Arrays.asList(arr2));
		d = new data(arr[3],arr[3]);
		return d;
	}
}
