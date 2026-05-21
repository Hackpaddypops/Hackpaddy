using UnityEngine;
using UnityEngine.SceneManagement;

public class Menu : MonoBehaviour
{
    public void StartGame()
    {
        UIAudioManager.instance.PlayUIOkEvent();
        SceneManager.LoadScene(SceneManager.GetActiveScene().buildIndex + 1);
    }

}
