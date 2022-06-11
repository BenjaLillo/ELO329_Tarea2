

import javafx.scene.Node;

public class Lamp extends DomoticDevice{
    //Código rellenado (copiado de Lamp del Stage1)
    public Lamp (int channel){
        super(channel); //Añadido dado que ahora Lamp extiende DomoticDevice
        this.channel= channel;
        r=g=b= 255; //por defecto
        r=b=0;
        g=128;  //color verde para probar Stage1
        state = LampState.OFF;
        view = new LampView();
    }
    public int getChannel(){
        return channel;
    }
    public void changePowerState(){
        state = state==LampState.ON ? LampState.OFF : LampState.ON;
        if (state==LampState.OFF) view.setColor((short)0,(short)0, (short)0);
        else view.setColor(r,g,b);
    }
    public Node getView() {
        return view;
    }
    public void changeRed(short new_val){
        r = new_val;
    }

    private int channel;
    private short r,g,b;
    private LampState state;
    private LampView view;
}
