using UnityEngine;
using UnityEngine.SceneManagement;

public class GameManager : MonoBehaviour
{
    bool gameHasEnded=false;
    private float restartDelay=1f;
    public GameObject completeLevelUI;
   public void EndGame(){
    if(gameHasEnded==false){
        gameHasEnded=true;
        Invoke("RestartGame", restartDelay);
    }
   }

    private void RestartGame()
    {
        SceneManager.LoadScene(SceneManager.GetActiveScene().name);
    }

    public void CompleteLevel(){
        completeLevelUI.SetActive(true);
    }
}
