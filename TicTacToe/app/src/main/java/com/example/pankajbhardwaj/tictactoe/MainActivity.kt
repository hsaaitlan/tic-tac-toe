package com.example.pankajbhardwaj.tictactoe

import android.content.res.Resources
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var turn : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var width : Int  = Resources.getSystem().displayMetrics.widthPixels
        r1c1.width = width / 4
        r1c2.width = width / 4
        r1c3.width = width / 4
        r2c1.width = width / 4
        r2c2.width = width / 4
        r2c3.width = width / 4
        r3c1.width = width / 4
        r3c2.width = width / 4
        r3c3.width = width / 4
        r1c1.height = width / 4
        r1c2.height = width / 4
        r1c3.height = width / 4
        r2c1.height = width / 4
        r2c2.height = width / 4
        r2c3.height = width / 4
        r3c1.height = width / 4
        r3c2.height = width / 4
        r3c3.height = width / 4
        r1c1.setOnClickListener {
            if (r1c1.text.toString().equals("") || r1c1.text.toString().isEmpty()) {
                if (turn == 0) {
                    r1c1.text = "O"
                    text.text = "X's Turn"
                    turn = 1
                } else {
                    r1c1.text = "X"
                    text.text = "O's Turn"
                    turn = 0;
                }
            }
        }
        r1c2.setOnClickListener {
            if (r1c2.text.toString().equals("") || r1c2.text.toString().isEmpty()) {
                if (turn == 0) {
                    r1c2.text = "O"
                    text.text = "X's Turn"
                    turn = 1
                } else {
                    r1c2.text = "X"
                    text.text = "O's Turn"
                    turn = 0
                }
            }
        }
        r1c3.setOnClickListener {
            if (r1c3.text.toString().equals("") || r1c3.text.toString().isEmpty()) {
                if (turn == 0) {
                    r1c3.text = "O"
                    text.text = "X's Turn"
                    turn = 1
                } else {
                    r1c3.text = "X"
                    text.text = "O's Turn"
                    turn = 0
                }
            }
        }
        r2c1.setOnClickListener {
            if (r2c1.text.toString().equals("") || r2c1.text.toString().isEmpty()) {
                if (turn == 0) {
                    r2c1.text = "O"
                    text.text = "X's Turn"
                    turn = 1
                } else {
                    r2c1.text = "X"
                    text.text = "O's Turn"
                    turn = 0
                }
            }
        }
        r2c2.setOnClickListener {
            if (r2c2.text.toString().equals("") || r2c2.text.toString().isEmpty()) {
                if (turn == 0) {
                    r2c2.text = "O"
                    text.text = "X's Turn"
                    turn = 1
                } else {
                    r2c2.text = "X"
                    text.text = "O's Turn"
                    turn = 0
                }
            }
        }
        r2c3.setOnClickListener {
            if (r2c3.text.toString().equals("") || r2c3.text.toString().isEmpty()) {
                if (turn == 0) {
                    r2c3.text = "O"
                    text.text = "X's Turn"
                    turn = 1
                } else {
                    r2c3.text = "X"
                    text.text = "O's Turn"
                    turn = 0
                }
            }
        }
        r3c1.setOnClickListener {
            if (r3c1.text.toString().equals("") || r3c1.text.toString().isEmpty()) {
                if (turn == 0) {
                    r3c1.text = "O"
                    text.text = "X's Turn"
                    turn = 1
                } else {
                    r3c1.text = "X"
                    text.text = "O's Turn"
                    turn = 0
                }
            }
        }
        r3c2.setOnClickListener {
            if (r3c2.text.toString().equals("") || r3c2.text.toString().isEmpty()) {
                if (turn == 0) {
                    r3c2.text = "O"
                    text.text = "X's Turn"
                    turn = 1
                } else {
                    r3c2.text = "X"
                    text.text = "O's Turn"
                    turn = 0
                }
            }
        }
        r3c3.setOnClickListener {
            if (r3c3.text.toString().equals("") || r3c3.text.toString().isEmpty()) {
                if (turn == 0) {
                    r3c3.text = "O"
                    text.text = "X's Turn"
                    turn = 1
                } else {
                    r3c3.text = "X"
                    text.text = "O's Turn"
                    turn = 0
                }
            }
        }
        reset.setOnClickListener {
            r1c1.text = ""
            r1c2.text = ""
            r1c3.text = ""
            r2c1.text = ""
            r2c2.text = ""
            r2c3.text = ""
            r3c1.text = ""
            r3c2.text = ""
            r3c3.text = ""
            turn = 0
            text.text = "O's Turn"
        }
    }
    fun checkWin() {

    }
}
