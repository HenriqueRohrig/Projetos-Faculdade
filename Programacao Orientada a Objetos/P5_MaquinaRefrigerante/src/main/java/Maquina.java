public class Maquina {    
    
    int refri;
    int gas;
    int agua;
    
    public boolean refilRefri (int quantRefri)
    {
        boolean ok = false;
        if (refri + quantRefri <= 1000)
        {
            refri += quantRefri;
            ok = true;
        }
        return ok;
    }
    public boolean refilGas (int quantGas)
    {
        boolean ok = false;
        if (gas + quantGas <= 1000)
        {
            gas += quantGas;
            ok = true;
        }
        return ok;
    }
    public boolean refilAgua (int quantAgua)
    {
        boolean ok = false;
        if (agua + quantAgua <= 10000)
        {
            agua += quantAgua;
            ok = true;
        }
        return ok;
    }
    public boolean copoRefri ()
    {
        boolean ok = false;
        if (refri >= 5 && gas >= 1 && agua >= 95)
        {
            ok = true;
            refri -= 5;
            gas -= 1;
            agua -= 95;
        }
        return ok;
    }
}
