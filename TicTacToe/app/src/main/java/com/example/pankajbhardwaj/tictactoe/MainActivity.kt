package com.example.pankajbhardwaj.tictactoe

import android.content.res.Resources
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var values = Array(3, { CharArray(3) })
    var turn: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        for (i in 0..2) {
            for (j in 0..2)
                values[i][j] = ' '
        }
        var width: Int = Resources.getSystem().displayMetrics.widthPixels
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
                    values[0][0] = 'O'
                    text.text = "X's Turn"
                    turn = 1
                } else {
                    r1c1.text = "X"
                    values[0][0] = 'X'
                    text.text = "O's Turn"
                    turn = 0;
                }
                checkWin()
            }
        }
        r1c2.setOnClickListener {
            if (r1c2.text.toString().equals("") || r1c2.text.toString().isEmpty()) {
                if (turn == 0) {
                    r1c2.text = "O"
                    values[0][1] = 'O'
                    text.text = "X's Turn"
                    turn = 1
                } else {
                    r1c2.text = "X"
                    values[0][1] = 'X'
                    text.text = "O's Turn"
                    turn = 0
                }
                checkWin()
            }
        }
        r1c3.setOnClickListener {
            if (r1c3.text.toString().equals("") || r1c3.text.toString().isEmpty()) {
                if (turn == 0) {
                    r1c3.text = "O"
                    values[0][2] = 'O'
                    text.text = "X's Turn"
                    turn = 1
                } else {
                    r1c3.text = "X"
                    values[0][2] = 'X'
                    text.text = "O's Turn"
                    turn = 0
                }
                checkWin()
            }
        }
        r2c1.setOnClickListener {
            if (r2c1.text.toString().equals("") || r2c1.text.toString().isEmpty()) {
                if (turn == 0) {
                    r2c1.text = "O"
                    values[1][0] = 'O'
                    text.text = "X's Turn"
                    turn = 1
                } else {
                    r2c1.text = "X"
                    values[1][0] = 'X'
                    text.text = "O's Turn"
                    turn = 0
                }
                checkWin()
            }
        }
        r2c2.setOnClickListener {
            if (r2c2.text.toString().equals("") || r2c2.text.toString().isEmpty()) {
                if (turn == 0) {
                    r2c2.text = "O"
                    values[1][1] = 'O'
                    text.text = "X's Turn"
                    turn = 1
                } else {
                    r2c2.text = "X"
                    values[1][1] = 'X'
                    text.text = "O's Turn"
                    turn = 0
                }
                checkWin()
            }
        }
        r2c3.setOnClickListener {
            if (r2c3.text.toString().equals("") || r2c3.text.toString().isEmpty()) {
                if (turn == 0) {
                    r2c3.text = "O"
                    values[1][2] = 'O'
                    text.text = "X's Turn"
                    turn = 1
                } else {
                    r2c3.text = "X"
                    values[1][2] = 'X'
                    text.text = "O's Turn"
                    turn = 0
                }
                checkWin()
            }
        }
        r3c1.setOnClickListener {
            if (r3c1.text.toString().equals("") || r3c1.text.toString().isEmpty()) {
                if (turn == 0) {
                    r3c1.text = "O"
                    values[2][0] = 'O'
                    text.text = "X's Turn"
                    turn = 1
                } else {
                    r3c1.text = "X"
                    values[2][0] = 'X'
                    text.text = "O's Turn"
                    turn = 0
                }
                checkWin()
            }
        }
        r3c2.setOnClickListener {
            if (r3c2.text.toString().equals("") || r3c2.text.toString().isEmpty()) {
                if (turn == 0) {
                    r3c2.text = "O"
                    values[2][1] = 'O'
                    text.text = "X's Turn"
                    turn = 1
                } else {
                    r3c2.text = "X"
                    values[2][1] = 'X'
                    text.text = "O's Turn"
                    turn = 0
                }
                checkWin()
            }
        }
        r3c3.setOnClickListener {
            if (r3c3.text.toString().equals("") || r3c3.text.toString().isEmpty()) {
                if (turn == 0) {
                    r3c3.text = "O"
                    values[2][2] = 'O'
                    text.text = "X's Turn"
                    turn = 1
                } else {
                    r3c3.text = "X"
                    values[2][2] = 'X'
                    text.text = "O's Turn"
                    turn = 0
                }
                checkWin()
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
            textView.text = " "
            text.text = "O's Turn"
            for (i in 0..2) {
                for (j in 0..2)
                    values[i][j] = ' '
            }
            r1c1.isEnabled = true
            r1c2.isEnabled = true
            r1c3.isEnabled = true
            r2c1.isEnabled = true
            r2c2.isEnabled = true
            r2c3.isEnabled = true
            r3c1.isEnabled = true
            r3c2.isEnabled = true
            r3c3.isEnabled = true

        }
    }

    fun checkWin() {
        Log.i("message", "Inside check Win")
        var found: Boolean = false;
        for (i in 0..2) {
            if (values[i][0] != ' ' && values[i][0] == values[i][1] && values[i][0] == values[i][2]) {
                textView.text = values[i][1] + " is the winner"
                disAll()
                text.text = " "
                found = true
                break
            }
        }
        if (!found) {
            for (i in 0..2) {
                if (values[0][i] != ' ' && values[0][i] == values[1][i] && values[0][i] == values[2][i]) {
                    textView.text = values[0][i] + " is the winner"
                    disAll()
                    text.text = " "
                    found = true
                    break
                }
            }
        }
        if  (!found) {
            if (values[0][0] != ' ' && values[0][0] == values[1][1] && values[1][1] == values[2][2]) {
                textView.text = values[0][0] + " is the winner"
                disAll()
                text.text = " "
                found = true
            } else if (values[0][2] != ' ' && values[0][2] == values[1][1] && values[1][1] == values[2][0]) {
                textView.text = values[0][2] + " is the winner"
                disAll()
                text.text = " "
                found = true
            }
        }
        if (!found) {
            for (i in 0..2) {
                for (j in 0..2)
                    if (values[i][j] == ' ') {
                        found = true;
                    }
            }
        }
        if (!found) {
            textView.text = "Draw"
            text.text = " "
        }
    }

    fun disAll() {
        r1c1.isEnabled = false
        r1c2.isEnabled = false
        r1c3.isEnabled = false
        r2c1.isEnabled = false
        r2c2.isEnabled = false
        r2c3.isEnabled = false
        r3c1.isEnabled = false
        r3c2.isEnabled = false
        r3c3.isEnabled = false
    }
}
