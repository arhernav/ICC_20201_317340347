import processing.core.PApplet;
public class Sketch extends PApplet{

    public int ancho = 80;
    
    public static void main(String[] args){
	PApplet.main("Sketch");
    }

    public void settings(){
	size(640, 640);
    }

    public void setup(){
	fill(120, 50, 240);
    }

    public void draw(){
        for(int i = 0; i < 8; i++){
	    for(int j = 0; j < 8; j++){
		rect(i*ancho, j*ancho, ancho, ancho);
	    }
	}
    }
}
