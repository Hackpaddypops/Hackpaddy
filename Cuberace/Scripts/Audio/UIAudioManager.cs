using FMODUnity;
using UnityEngine;

public class UIAudioManager : MonoBehaviour
{
    public static UIAudioManager instance;

   

    private void Awake()
    {
        if(instance != null){
            Debug.LogError("Found more than one FMOD Events Instance in the scene.");
        }
        instance = this;
    }

    public void PlayUIOkEvent()
    {
        if (FMODEvents.instance.uiOk.IsNull==false)
        {
            RuntimeManager.PlayOneShot(FMODEvents.instance.uiOk);
        }
    }

    public void PlayUICancelEvent()
    {
        if (FMODEvents.instance.uiCancel.IsNull==false)
        {
            RuntimeManager.PlayOneShot(FMODEvents.instance.uiCancel);
        }
    }

    public void PlayOneShot(EventReference sound, Vector3 worldPos)
    {
        RuntimeManager.PlayOneShot(sound, worldPos);
    }

}
