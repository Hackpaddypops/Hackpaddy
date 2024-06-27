using UnityEngine;
using FMODUnity;

public class FMODEvents : MonoBehaviour
{
    public static FMODEvents instance;

     [field: Header("Player SFX")]
    [field: SerializeField]
    public EventReference playerFootsteps { get; private set; }

    [field: Header("UI")]
    [field: SerializeField]
    public EventReference uiOk { get; private set; }

    [field: SerializeField]
    public EventReference uiCancel { get; private set; }
    private void Awake()
    {
        if(instance != null){
            Debug.LogError("Found more than one FMOD Events Instance in the scene.");
        }
        instance = this;
    }
}
