package th.co.easygas.budget

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    val TAG = LoginActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login_loginGoogle.setOnClickListener { view ->
            val intent = Intent(this@LoginActivity, MainActivity::class.java)
            startActivity(intent)
        }

    }

}