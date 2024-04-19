package com.example.tictiktoegame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.btn1
import kotlinx.android.synthetic.main.activity_main.btn2
import kotlinx.android.synthetic.main.activity_main.btn3
import kotlinx.android.synthetic.main.activity_main.btn4
import kotlinx.android.synthetic.main.activity_main.btn5
import kotlinx.android.synthetic.main.activity_main.btn6
import kotlinx.android.synthetic.main.activity_main.btn7
import kotlinx.android.synthetic.main.activity_main.btn8
import kotlinx.android.synthetic.main.activity_main.btn9
import kotlinx.android.synthetic.main.activity_main.restart2
import kotlinx.android.synthetic.main.activity_main.restartbtn1

class MainActivity : AppCompatActivity() {
    var flag = 0
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // here we apply set on click listener on restart button

        restartbtn1.setOnClickListener {
            toastShow("Game Restart")
            restart()
        }

        // here we apply restart button 2

        restart2.setOnClickListener {
            toastShow("Game Restart")
            restart()
        }

    }




    // create a function

    fun check(myFunction: View) {

        val current_Btn = myFunction as Button
        if (current_Btn.text == "") {
          count++

          if (flag == 0) {
              current_Btn.text = "X"
              flag = 1
          } else {
              current_Btn.text = "O"
              flag = 0
          }

            if(count > 4){
                if(checkMyCondition(btn1,btn2,btn3)){
                    toastShow("Winner is ${btn1.changeMyString()} 🎈💕")
                    restart()

                }else if (checkMyCondition(btn4,btn5,btn6)){
                    toastShow("Winner is ${btn4.changeMyString()} 🎈💕 ")
                    restart()

                }else if (checkMyCondition(btn7,btn8,btn9)){
                    toastShow("Winner is ${btn1.changeMyString()}🎈💕")
                    restart()

                }else if (checkMyCondition(btn1,btn4,btn7)){
                    toastShow("Winner is ${btn1.changeMyString()}🎈💕")
                    restart()

                }else if (checkMyCondition(btn2,btn5,btn8)){
                    toastShow("Winner is ${btn2.changeMyString()}🎈💕")
                    restart()

                }else if(checkMyCondition(btn3,btn6,btn9)){
                    toastShow("Winner is ${btn3.changeMyString()}🎈💕")
                    restart()

                }else if(checkMyCondition(btn1,btn5,btn9)){
                    toastShow("Winner is ${btn9.changeMyString()}🎈💕")
                    restart()

                }else if(checkMyCondition(btn3, btn5,btn7)){
                    toastShow("Winner is ${btn3.changeMyString()}🎈💕")
                    restart()

                }
                else{
                    if (count == 9) {
                        toastShow("😊 Game is Draw 😊")
                    }
                }
            }

      }

    }
    // here we create function for change value into String
    fun Button.changeMyString() = this.text.toString()

    // here we create lambda function for check condition for different btn
    val checkMyCondition : (Button , Button ,Button) -> Boolean = {a,b,c -> a.changeMyString()==b.changeMyString()
            && b.changeMyString() == c.changeMyString()
            && c.changeMyString() != ""
    }

    // here we create lambda function for showing Toast
    val toastShow = {msg : String ->
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

    // here we create restart function
    fun restart (){
        btn9.text=""
        btn8.text=""
        btn7.text=""
        btn6.text=""
        btn5.text=""
        btn4.text=""
        btn3.text=""
        btn2.text=""
        btn1.text=""
        flag = 0
        count = 0
    }

}
