package io.github.juninhoojl.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public double op1, op2, res;
    public TextView tela;
    int ope;

    // Variavel ja foi ponto?
    // Eliminar dps de chamar operador
    // variavel quantidade para poder adicionar ponto divisor


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tela = findViewById(R.id.textRes);
    }

    public void cbt0(View v){
        String cap= tela.getText().toString();
        cap=cap+"0";
        tela.setText(cap);
    }
    public void cbt1(View v){
        String cap= tela.getText().toString();
        cap=cap+"1";
        tela.setText(cap);
    }

    public void cbt2(View v){
        String cap= tela.getText().toString();
        cap=cap+"2";
        tela.setText(cap);
    }

    public void cbt3(View v){
        String cap= tela.getText().toString();
        cap=cap+"3";
        tela.setText(cap);
    }

    public void cbt4(View v){
        String cap= tela.getText().toString();
        cap=cap+"4";
        tela.setText(cap);
    }

    public void cbt5(View v){
        String cap= tela.getText().toString();
        cap=cap+"5";
        tela.setText(cap);
    }

    public void cbt6(View v){
        String cap= tela.getText().toString();
        cap=cap+"6";
        tela.setText(cap);
    }

    public void cbt7(View v){
        String cap= tela.getText().toString();
        cap=cap+"7";
        tela.setText(cap);
    }

    public void cbt8(View v){
        String cap= tela.getText().toString();
        cap=cap+"8";
        tela.setText(cap);
    }

    public void cbt9(View v){
        String cap= tela.getText().toString();
        cap=cap+"9";
        tela.setText(cap);
    }

    public void cbtp(View v){
        String cap= tela.getText().toString();
        cap=cap+".";
        tela.setText(cap);
    }

    @SuppressLint("SetTextI18n")
    public void soma(View v){

        try {
            String aux1= tela.getText().toString();
            op1 =Double.parseDouble(aux1);

        }catch (NumberFormatException nfe){
            tela.setText("ERROR"); // Limpa mostrador

        }

        tela.setText(""); // Limpa mostrador
        ope=1;
    }

    @SuppressLint("SetTextI18n")
    public void subt(View v){

        try {
            String aux1= tela.getText().toString();
            op1 =Double.parseDouble(aux1);

        }catch (NumberFormatException nfe){
            tela.setText("ERROR"); // Limpa mostrador

        }

        tela.setText(""); // Limpa mostrador
        ope=2;
    }

    @SuppressLint("SetTextI18n")
    public void mult(View v){

        try {
            String aux1= tela.getText().toString();
            op1 =Double.parseDouble(aux1);

        }catch (NumberFormatException nfe){
            tela.setText("ERROR"); // Limpa mostrador

        }

        tela.setText(""); // Limpa mostrador
        ope=3;
    }

    @SuppressLint("SetTextI18n")
    public void divi(View v){

        try {
            String aux1= tela.getText().toString();
            // Colocaria aqui para remover pontos de milhares
            op1 =Double.parseDouble(aux1);

        }catch (NumberFormatException nfe){
            tela.setText("ERROR"); // Limpa mostrador

        }

        tela.setText(""); // Limpa mostrador
        ope=4;
    }

    @SuppressLint("SetTextI18n")
    public void sen(View v){

        try {
            String aux1= tela.getText().toString();
            // Colocaria aqui para remover pontos de milhares
            op1 =Double.parseDouble(aux1);

        }catch (NumberFormatException nfe){
            tela.setText("ERROR"); // Limpa mostrador

        }

        tela.setText("Sen ("+op1+")");

        ope=5;
    }

    @SuppressLint("SetTextI18n")
    public void cos(View v){

        try {
            String aux1= tela.getText().toString();
            // Colocaria aqui para remover pontos de milhares
            op1 =Double.parseDouble(aux1);

        }catch (NumberFormatException nfe){
            tela.setText("ERROR"); // Limpa mostrador

        }

        tela.setText("Cos ("+op1+")");

        ope=6;
    }

    @SuppressLint("SetTextI18n")
    public void tan(View v){

        try {
            String aux1= tela.getText().toString();
            // Colocaria aqui para remover pontos de milhares
            op1 =Double.parseDouble(aux1);

        }catch (NumberFormatException nfe){
            tela.setText("ERROR"); // Limpa mostrador

        }

        tela.setText("Tan ("+op1+")");

        ope=7;
    }

    @SuppressLint("SetTextI18n")
    public void igual(View v){

        try{
            String aux2= tela.getText().toString();
            op2=Double.parseDouble(aux2);
        }catch (NumberFormatException nfe){
            tela.setText("ERROR");
        }

        tela.setText("");

        if(ope==1){ // Soma
            res=op1+op2;
        }else if(ope==2){ // Sub
            res=op1-op2;
        }else if(ope==3){ // Mult
            res=op1*op2;
        }else if(ope==4){ // Div
            if(op2==0){
                tela.setText("ERROR");
            }else{
                res=op1/op2;
            }
        }else if(ope==5){ // Sen
            res=Math.sin(Math.toRadians(op1));
        }else if(ope==6){ // Cos
            res=Math.cos(Math.toRadians(op1));
        }else if(ope==7){ // Tan
            res=Math.tan(Math.toRadians(op1));
        }
        tela.setText(""+res);
        op1=res;
    }

    public void zera(View v){
        tela.setText("");
        op1=0;
        op2=0;
        res=0;
    }

    @SuppressLint("SetTextI18n")
    public void limpa(View v){

        if(!tela.getText().toString().equals("")){
            tela.setText(tela.getText().subSequence(0, tela.getText().length()-1)+"");
        }
    }

    public void off (View v){
        finish();
    }

}
