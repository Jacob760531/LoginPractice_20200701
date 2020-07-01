package kr.co.tjoeun.loginpractice_20200701

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {
            val emailText = emailEdt.text.toString()
            val passText = passEdt.text.toString()

//            if (emailText.equals("admin@test.com")  && passText.equals("qwer1234"))
            if (emailText == "admin@test.com"  && passText=="qwer1234")
            {
                Toast.makeText(this,"관리자입니다.",Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(this,"틀렸음.",Toast.LENGTH_SHORT).show()
            }

        }
    }
}
