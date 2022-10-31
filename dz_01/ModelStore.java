package dz_01;

public class ModelStore {
    public PoligonalModel models;
    public Scene Scenes;
    public Flash Flashes;
    public Camera Cameras;
    public IModelChangedObserver changeObserver;

    public Scene GetScena(int i)
    {
        return null;
    }
    public void NotifyChange(IModelChanger iModelChanger)
    {

    }
}
