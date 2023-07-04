package be.laurent.gamehistory

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import be.laurent.gamehistory.databinding.ActivityMainBinding
import be.laurent.gamehistory.models.GameModel
import be.laurent.gamehistory.viewmodels.AddGameViewModel
import java.util.UUID

class AddGameActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var nameField : EditText
    private lateinit var descriptionField : EditText
    private lateinit var playersField : EditText
    private lateinit var timerField : EditText

    private lateinit var confirmButton : Button
    private val viewModel : AddGameViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_game)

        nameField = this.findViewById(R.id.game_name)
        descriptionField = this.findViewById(R.id.game_description)
        playersField = this.findViewById(R.id.number_players)
        timerField = this.findViewById(R.id.game_timer)
        confirmButton = this.findViewById(R.id.confirm_button)

        confirmButton.setOnClickListener{submit()}

        /*val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.containerFragmentHome, HomeFragment(this))
        transaction.replace(R.id.containerFragmentBar, BarFragment())
        transaction.addToBackStack(null)
        transaction.commit()*/
    }

    private fun submit(){
        onBackPressed()
    }
}