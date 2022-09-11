package com.example.gatote_erandi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button arreglo [] [];
    int turno=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arreglo = new Button[6][6];
        arreglo[0][0] = this.findViewById(R.id.button00);
        arreglo[0][1] = this.findViewById(R.id.button01);
        arreglo[0][2] = this.findViewById(R.id.button02);
        arreglo[0][3] = this.findViewById(R.id.button03);
        arreglo[0][4] = this.findViewById(R.id.button04);
        arreglo[0][5] = this.findViewById(R.id.button05);
        arreglo[1][0] = this.findViewById(R.id.button10);
        arreglo[1][1] = this.findViewById(R.id.button11);
        arreglo[1][2] = this.findViewById(R.id.button12);
        arreglo[1][3] = this.findViewById(R.id.button13);
        arreglo[1][4] = this.findViewById(R.id.button14);
        arreglo[1][5] = this.findViewById(R.id.button15);
        arreglo[2][0] = this.findViewById(R.id.button20);
        arreglo[2][1] = this.findViewById(R.id.button21);
        arreglo[2][2] = this.findViewById(R.id.button22);
        arreglo[2][3] = this.findViewById(R.id.button23);
        arreglo[2][4] = this.findViewById(R.id.button24);
        arreglo[2][5] = this.findViewById(R.id.button25);
        arreglo[3][0] = this.findViewById(R.id.button30);
        arreglo[3][1] = this.findViewById(R.id.button31);
        arreglo[3][2] = this.findViewById(R.id.button32);
        arreglo[3][3] = this.findViewById(R.id.button33);
        arreglo[3][4] = this.findViewById(R.id.button34);
        arreglo[3][5] = this.findViewById(R.id.button35);
        arreglo[4][0] = this.findViewById(R.id.button40);
        arreglo[4][1] = this.findViewById(R.id.button41);
        arreglo[4][2] = this.findViewById(R.id.button42);
        arreglo[4][3] = this.findViewById(R.id.button43);
        arreglo[4][4] = this.findViewById(R.id.button44);
        arreglo[4][5] = this.findViewById(R.id.button45);
        arreglo[5][0] = this.findViewById(R.id.button50);
        arreglo[5][1] = this.findViewById(R.id.button51);
        arreglo[5][2] = this.findViewById(R.id.button52);
        arreglo[5][3] = this.findViewById(R.id.button53);
        arreglo[5][4] = this.findViewById(R.id.button54);
        arreglo[5][5] = this.findViewById(R.id.button55);
    }

    public void darValor(int fila, int columna){
        if(arreglo[fila][columna].getText().equals("")){
            if (turno==1){
                arreglo[fila][columna].setText("x");
                turno = 2;
            }else{
                arreglo[fila][columna].setText("O");
                turno = 1;
            }
            comprobar();
        }
    }

    public void comprobar() {
        if (arreglo[0][0].equals("x") && arreglo [0][1].equals("x")
                && arreglo[0][2].equals("x") && arreglo [0][3].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][1].equals("x") && arreglo [0][2].equals("x")
                && arreglo[0][3].equals("x") && arreglo [0][4].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][2].equals("x") && arreglo [0][3].equals("x")
                && arreglo[0][4].equals("x") && arreglo [0][5].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][0].equals("x") && arreglo [1][1].equals("x")
                && arreglo[1][2].equals("x") && arreglo [1][3].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][1].equals("x") && arreglo [1][2].equals("x")
                && arreglo[1][3].equals("x") && arreglo [1][4].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][2].equals("x") && arreglo [1][3].equals("x")
                && arreglo[1][4].equals("x") && arreglo [1][5].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][0].equals("x") && arreglo [2][1].equals("x")
                && arreglo[2][2].equals("x") && arreglo [2][3].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][1].equals("x") && arreglo [2][2].equals("x")
                && arreglo[2][3].equals("x") && arreglo [2][4].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][2].equals("x") && arreglo [2][3].equals("x")
                && arreglo[2][4].equals("x") && arreglo [2][5].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[3][0].equals("x") && arreglo [3][1].equals("x")
                && arreglo[3][2].equals("x") && arreglo [3][3].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[3][1].equals("x") && arreglo [3][2].equals("x")
                && arreglo[3][3].equals("x") && arreglo [3][4].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[3][2].equals("x") && arreglo [3][3].equals("x")
                && arreglo[3][4].equals("x") && arreglo [3][5].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[4][0].equals("x") && arreglo [4][1].equals("x")
                && arreglo[4][2].equals("x") && arreglo [4][3].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[4][1].equals("x") && arreglo [4][2].equals("x")
                && arreglo[4][3].equals("x") && arreglo [4][4].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[4][2].equals("x") && arreglo [4][3].equals("x")
                && arreglo[4][4].equals("x") && arreglo [4][5].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[5][0].equals("x") && arreglo [5][1].equals("x")
                && arreglo[5][2].equals("x") && arreglo [5][3].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[5][1].equals("x") && arreglo [5][2].equals("x")
                && arreglo[5][3].equals("x") && arreglo [5][4].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[5][2].equals("x") && arreglo [5][3].equals("x")
                && arreglo[5][4].equals("x") && arreglo [5][5].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][0].equals("x") && arreglo [1][0].equals("x")
                && arreglo[2][0].equals("x") && arreglo [3][0].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][0].equals("x") && arreglo [2][0].equals("x")
                && arreglo[3][0].equals("x") && arreglo [4][0].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][0].equals("x") && arreglo [3][0].equals("x")
                && arreglo[4][0].equals("x") && arreglo [5][0].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][1].equals("x") && arreglo [1][1].equals("x")
                && arreglo[2][1].equals("x") && arreglo [3][1].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][1].equals("x") && arreglo [2][1].equals("x")
                && arreglo[3][1].equals("x") && arreglo [4][1].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][1].equals("x") && arreglo [3][1].equals("x")
                && arreglo[4][1].equals("x") && arreglo [5][1].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][2].equals("x") && arreglo [1][2].equals("x")
                && arreglo[2][2].equals("x") && arreglo [3][2].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][2].equals("x") && arreglo [2][2].equals("x")
                && arreglo[3][2].equals("x") && arreglo [4][2].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][2].equals("x") && arreglo [3][2].equals("x")
                && arreglo[4][2].equals("x") && arreglo [5][2].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][3].equals("x") && arreglo [1][3].equals("x")
                && arreglo[2][3].equals("x") && arreglo [3][3].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][3].equals("x") && arreglo [2][3].equals("x")
                && arreglo[3][3].equals("x") && arreglo [4][3].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][3].equals("x") && arreglo [3][3].equals("x")
                && arreglo[4][3].equals("x") && arreglo [5][3].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][4].equals("x") && arreglo [1][4].equals("x")
                && arreglo[2][4].equals("x") && arreglo [3][4].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][4].equals("x") && arreglo [2][4].equals("x")
                && arreglo[3][4].equals("x") && arreglo [4][4].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][4].equals("x") && arreglo [3][4].equals("x")
                && arreglo[4][4].equals("x") && arreglo [5][4].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][5].equals("x") && arreglo [1][5].equals("x")
                && arreglo[2][5].equals("x") && arreglo [3][5].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][5].equals("x") && arreglo [2][5].equals("x")
                && arreglo[3][5].equals("x") && arreglo [4][5].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][5].equals("x") && arreglo [3][5].equals("x")
                && arreglo[4][5].equals("x") && arreglo [5][5].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][1].equals("x") && arreglo [1][1].equals("x")
                && arreglo[2][2].equals("x") && arreglo [3][3].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][1].equals("x") && arreglo [2][2].equals("x")
                && arreglo[3][3].equals("x") && arreglo [4][4].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][2].equals("x") && arreglo [3][3].equals("x")
                && arreglo[4][4].equals("x") && arreglo [5][5].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][5].equals("x") && arreglo [1][4].equals("x")
                && arreglo[2][3].equals("x") && arreglo [3][2].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][4].equals("x") && arreglo [2][3].equals("x")
                && arreglo[3][2].equals("x") && arreglo [4][1].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][3].equals("x") && arreglo [3][2].equals("x")
                && arreglo[4][1].equals("x") && arreglo [5][0].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][2].equals("x") && arreglo [1][3].equals("x")
                && arreglo[2][4].equals("x") && arreglo [3][5].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][0].equals("x") && arreglo [3][1].equals("x")
                && arreglo[4][2].equals("x") && arreglo [5][3].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][3].equals("x") && arreglo [1][2].equals("x")
                && arreglo[2][1].equals("x") && arreglo [3][0].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[5][2].equals("x") && arreglo [4][3].equals("x")
                && arreglo[3][4].equals("x") && arreglo [2][5].equals("x")) {
            Toast.makeText(this, "Felicidades Jugador 1", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][0].equals("O") && arreglo [0][1].equals("O")
                && arreglo[0][2].equals("O") && arreglo [0][3].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][1].equals("O") && arreglo [0][2].equals("O")
                && arreglo[0][3].equals("O") && arreglo [0][4].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][2].equals("O") && arreglo [0][3].equals("O")
                && arreglo[0][4].equals("O") && arreglo [0][5].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][0].equals("O") && arreglo [1][1].equals("O")
                && arreglo[1][2].equals("O") && arreglo [1][3].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][1].equals("O") && arreglo [1][2].equals("O")
                && arreglo[1][3].equals("O") && arreglo [1][4].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][2].equals("O") && arreglo [1][3].equals("O")
                && arreglo[1][4].equals("O") && arreglo [1][5].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][0].equals("O") && arreglo [2][1].equals("O")
                && arreglo[2][2].equals("O") && arreglo [2][3].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][1].equals("O") && arreglo [2][2].equals("O")
                && arreglo[2][3].equals("O") && arreglo [2][4].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][2].equals("O") && arreglo [2][3].equals("O")
                && arreglo[2][4].equals("O") && arreglo [2][5].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[3][0].equals("O") && arreglo [3][1].equals("O")
                && arreglo[3][2].equals("O") && arreglo [3][3].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[3][1].equals("O") && arreglo [3][2].equals("O")
                && arreglo[3][3].equals("O") && arreglo [3][4].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[3][2].equals("O") && arreglo [3][3].equals("O")
                && arreglo[3][4].equals("O") && arreglo [3][5].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[4][0].equals("O") && arreglo [4][1].equals("O")
                && arreglo[4][2].equals("O") && arreglo [4][3].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[4][1].equals("O") && arreglo [4][2].equals("O")
                && arreglo[4][3].equals("O") && arreglo [4][4].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[4][2].equals("O") && arreglo [4][3].equals("O")
                && arreglo[4][4].equals("O") && arreglo [4][5].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[5][0].equals("O") && arreglo [5][1].equals("O")
                && arreglo[5][2].equals("O") && arreglo [5][3].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[5][1].equals("O") && arreglo [5][2].equals("O")
                && arreglo[5][3].equals("O") && arreglo [5][4].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[5][2].equals("O") && arreglo [5][3].equals("O")
                && arreglo[5][4].equals("O") && arreglo [5][5].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][0].equals("O") && arreglo [1][0].equals("O")
                && arreglo[2][0].equals("O") && arreglo [3][0].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][0].equals("O") && arreglo [2][0].equals("O")
                && arreglo[3][0].equals("O") && arreglo [4][0].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][0].equals("O") && arreglo [3][0].equals("O")
                && arreglo[4][0].equals("O") && arreglo [5][0].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][1].equals("O") && arreglo [1][1].equals("O")
                && arreglo[2][1].equals("O") && arreglo [3][1].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][1].equals("O") && arreglo [2][1].equals("O")
                && arreglo[3][1].equals("O") && arreglo [4][1].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][1].equals("O") && arreglo [3][1].equals("O")
                && arreglo[4][1].equals("O") && arreglo [5][1].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][2].equals("O") && arreglo [1][2].equals("O")
                && arreglo[2][2].equals("O") && arreglo [3][2].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][2].equals("O") && arreglo [2][2].equals("O")
                && arreglo[3][2].equals("O") && arreglo [4][2].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][2].equals("O") && arreglo [3][2].equals("O")
                && arreglo[4][2].equals("O") && arreglo [5][2].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][3].equals("O") && arreglo [1][3].equals("O")
                && arreglo[2][3].equals("O") && arreglo [3][3].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][3].equals("O") && arreglo [2][3].equals("O")
                && arreglo[3][3].equals("O") && arreglo [4][3].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][3].equals("O") && arreglo [3][3].equals("O")
                && arreglo[4][3].equals("O") && arreglo [5][3].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][4].equals("O") && arreglo [1][4].equals("O")
                && arreglo[2][4].equals("O") && arreglo [3][4].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][4].equals("O") && arreglo [2][4].equals("O")
                && arreglo[3][4].equals("O") && arreglo [4][4].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][4].equals("O") && arreglo [3][4].equals("O")
                && arreglo[4][4].equals("O") && arreglo [5][4].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][5].equals("O") && arreglo [1][5].equals("O")
                && arreglo[2][5].equals("O") && arreglo [3][5].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][5].equals("O") && arreglo [2][5].equals("O")
                && arreglo[3][5].equals("O") && arreglo [4][5].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][5].equals("O") && arreglo [3][5].equals("O")
                && arreglo[4][5].equals("O") && arreglo [5][5].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][1].equals("O") && arreglo [1][1].equals("O")
                && arreglo[2][2].equals("O") && arreglo [3][3].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][1].equals("O") && arreglo [2][2].equals("O")
                && arreglo[3][3].equals("O") && arreglo [4][4].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][2].equals("O") && arreglo [3][3].equals("O")
                && arreglo[4][4].equals("O") && arreglo [5][5].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][5].equals("O") && arreglo [1][4].equals("O")
                && arreglo[2][3].equals("2") && arreglo [3][2].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[1][4].equals("O") && arreglo [2][3].equals("O")
                && arreglo[3][2].equals("O") && arreglo [4][1].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][3].equals("O") && arreglo [3][2].equals("O")
                && arreglo[4][1].equals("O") && arreglo [5][0].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][2].equals("O") && arreglo [1][3].equals("O")
                && arreglo[2][4].equals("O") && arreglo [3][5].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[2][0].equals("O") && arreglo [3][1].equals("O")
                && arreglo[4][2].equals("O") && arreglo [5][3].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[0][3].equals("O") && arreglo [1][2].equals("O")
                && arreglo[2][1].equals("O") && arreglo [3][0].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
        if (arreglo[5][2].equals("O") && arreglo [4][3].equals("O")
                && arreglo[3][4].equals("O") && arreglo [2][5].equals("O")) {
            Toast.makeText(this, "Felicidades Jugador 2", Toast.LENGTH_LONG).show();
        }
    }
    public void boton00(View view){
        darValor( 0, 0);
    }
    public void boton01(View view){
        darValor(0, 1);
    }
    public void boton02(View view){
        darValor(0, 2);
    }
    public void boton03(View view){
        darValor(0, 3);
    }
    public void boton04(View view){
        darValor(0, 4);
    }
    public void boton05(View view){
        darValor(0, 5);
    }
    public void boton10(View view){
        darValor(1, 0);
    }
    public void boton11(View view){
        darValor(1, 1);
    }
    public void boton12(View view){
        darValor(1, 2);
    }
    public void boton13(View view){
        darValor(1, 3);
    }
    public void boton14(View view){
        darValor(1, 4);
    }
    public void boton15(View view){
        darValor(1, 5);
    }
    public void boton20(View view){
        darValor(2, 0);
    }
    public void boton21(View view){
        darValor(2, 1);
    }
    public void boton22(View view){
        darValor(2, 2);
    }
    public void boton23(View view){
        darValor(2, 3);
    }
    public void boton24(View view){
        darValor(2, 4);
    }
    public void boton25(View view){
        darValor(2, 5);
    }
    public void boton30(View view){
        darValor(3, 0);
    }
    public void button31(View view){
        darValor(3, 1);
    }
    public void button32(View view){
        darValor(3, 2);
    }
    public void button33(View view){
        darValor(3, 3);
    }
    public void button34(View view){
        darValor(3, 4);
    }
    public void button35(View view){
        darValor(3, 5);
    }
    public void button40(View view){
        darValor(4, 0);
    }
    public void button41(View view){
        darValor(4, 1);
    }
    public void button42(View view){
        darValor(4, 2);
    }
    public void button43(View view){
        darValor(4, 3);
    }
    public void button44(View view){
        darValor(4, 4);
    }
    public void button45(View view){
        darValor(4, 5);
    }
    public void button50(View view){
        darValor(5, 0);
    }
    public void button51(View view){
        darValor(5, 1);
    }
    public void button52(View view){
        darValor(5, 2);
    }
    public void button53(View view){
        darValor(5, 3);
    }
    public void button54(View view){
        darValor(5, 4);
    }
    public void button55(View view){
        darValor(5, 5);
    }



}