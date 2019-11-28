package com.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public Button boton_0, boton_1, boton_2, boton_3, boton_4, boton_5, boton_6, boton_7, boton_8, boton_9;
    public Button botonSuma, botonResta, botonMulti, botonDiv, botonRespuesta, botonDecimal, botonLimpiar, botonDelete, botonSqrt, botonPow;
    public EditText txtNumero, txtMemoria;

    float valor1, valor2, valorMemoria;
    boolean esSuma, esResta, esMulti, esDivision, esPow, esSqrt;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putFloat("valor1",valor1);
        outState.putFloat("valor2",valor2);
        outState.putBoolean("esSuma",esSuma);
        outState.putBoolean("esResta",esResta);
        outState.putBoolean("esDivision",esDivision);
        outState.putBoolean("esMulti",esMulti);
        outState.putBoolean("esPow",esPow);
        outState.putBoolean("esSqrt",esSqrt);
        outState.putFloat("valorMemoria",valorMemoria);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState!=null){
            valor1=savedInstanceState.getFloat("valor1");
            valor2=savedInstanceState.getFloat("valor2");
            esSuma=savedInstanceState.getBoolean("esSuma");
            esResta=savedInstanceState.getBoolean("esResta");
            esMulti=savedInstanceState.getBoolean("esMulti");
            esDivision=savedInstanceState.getBoolean("esDivision");
            esPow=savedInstanceState.getBoolean("esPow");
            esSqrt=savedInstanceState.getBoolean("esSqrt");
            valorMemoria=savedInstanceState.getFloat("valorMemoria");
        }

        boton_0 = (Button) findViewById(R.id.boton_0);
        boton_1 = (Button) findViewById(R.id.boton_1);
        boton_2 = (Button) findViewById(R.id.boton_2);
        boton_3 = (Button) findViewById(R.id.boton_3);
        boton_4 = (Button) findViewById(R.id.boton_4);
        boton_5 = (Button) findViewById(R.id.boton_5);
        boton_6 = (Button) findViewById(R.id.boton_6);
        boton_7 = (Button) findViewById(R.id.boton_7);
        boton_8 = (Button) findViewById(R.id.boton_8);
        boton_9 = (Button) findViewById(R.id.boton_9);
        botonSuma = (Button) findViewById(R.id.botonSuma);
        botonDiv = (Button) findViewById(R.id.botonDiv);
        botonResta = (Button) findViewById(R.id.botonResta);
        botonMulti = (Button) findViewById(R.id.botonMulti);
        botonSqrt = (Button) findViewById(R.id.botonSqrt);
        botonPow = (Button) findViewById(R.id.botonPow);
        botonRespuesta = (Button) findViewById(R.id.botonRespuesta);
        botonDecimal = (Button) findViewById(R.id.botonDecimal);
        botonLimpiar = (Button) findViewById(R.id.botonLimpiar);
        botonDelete = (Button) findViewById(R.id.botonDelete);
        txtNumero = (EditText) findViewById(R.id.txtNumeroEditar);
        txtMemoria = (EditText) findViewById(R.id.txtMemoriaEditar);

        boton_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNumero.setText(txtNumero.getText()+"0");
            }
        });

        boton_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNumero.setText(txtNumero.getText()+"1");
            }
        });

        boton_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNumero.setText(txtNumero.getText()+"2");
            }
        });

        boton_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNumero.setText(txtNumero.getText()+"3");
            }
        });

        boton_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNumero.setText(txtNumero.getText()+"4");
            }
        });

        boton_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNumero.setText(txtNumero.getText()+"5");
            }
        });

        boton_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNumero.setText(txtNumero.getText()+"6");
            }
        });

        boton_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNumero.setText(txtNumero.getText()+"7");
            }
        });

        boton_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNumero.setText(txtNumero.getText()+"8");
            }
        });

        boton_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNumero.setText(txtNumero.getText()+"9");
            }
        });

        botonDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNumero.setText(txtNumero.getText()+".");
            }
        });

        botonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(txtNumero == null) && !txtNumero.getText().toString().equals("")){
                    valor1 = Float.parseFloat(txtNumero.getText() + "");
                    esSuma = true;
                    txtNumero.setText(null);
                }
            }
        });

        botonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(txtNumero == null) && !txtNumero.getText().toString().equals("")){
                    valor1 = Float.parseFloat(txtNumero.getText() + "");
                    esResta = true ;
                    txtNumero.setText(null);
                }
            }
        });

        botonMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(txtNumero == null) && !txtNumero.getText().toString().equals("")){
                    valor1 = Float.parseFloat(txtNumero.getText() + "");
                    esMulti = true ;
                    txtNumero.setText(null);
                }

            }
        });

        botonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(txtNumero == null) && !txtNumero.getText().toString().equals("")){
                    valor1 = Float.parseFloat(txtNumero.getText()+"");
                    esDivision = true ;
                    txtNumero.setText(null);
                }
            }
        });
        botonPow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(txtNumero == null) && !txtNumero.getText().toString().equals("")){
                    valor1 = Float.parseFloat(txtNumero.getText() + "");
                    esPow = true ;
                    txtNumero.setText(null);
                }

            }
        });
        botonSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(txtNumero == null) && !txtNumero.getText().toString().equals("")){
                    valor1 = Float.parseFloat(txtNumero.getText() + "");
                    esSqrt = true ;
                    txtNumero.setText(null);
                }

            }
        });

        txtMemoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valorMemoria % 1 == 0){
                    int memoriaEntera = (int) valorMemoria;
                    txtNumero.setText(memoriaEntera + "");
                } else {
                    txtNumero.setText(valorMemoria+"");
                }
            }
        });

        botonRespuesta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float respuesta = 0;
                if (!(txtNumero == null) && !txtNumero.getText().toString().equals("")){
                    valor2 = Float.parseFloat(txtNumero.getText() + "");
                    respuesta = valor2;

                    if (esSuma){
                        respuesta = valor1 + valor2;
                        esSuma = false;
                    }
                    if (esResta){
                        respuesta = valor1 - valor2;
                        esResta = false;
                    }
                    if (esMulti){
                        respuesta = valor1 * valor2;
                        esMulti = false;
                    }
                    if (esDivision){
                        respuesta = valor1 / valor2;
                        esDivision = false;
                    }
                    if (esPow){
                        respuesta = (float) Math.pow(valor1,valor2);
                        esPow = false;
                    }
                    if (esSqrt){
                        respuesta = (float) Math.sqrt(valor1);
                        esSqrt = false;
                    }

                    valorMemoria = respuesta;
                    if (respuesta % 1 == 0){
                        int respuestaEntera = (int) respuesta;
                        txtMemoria.setText(respuestaEntera + "");
                        txtNumero.setText(respuestaEntera + "");
                    } else {
                        txtNumero.setText(respuesta + "");
                        txtMemoria.setText(respuesta + "");
                    }
                } else {
                    if (esSqrt){
                        respuesta = (float) Math.sqrt(valor1);
                        esSqrt = false;
                    }
                    valorMemoria = respuesta;
                    if (respuesta % 1 == 0){
                        int respuestaEntera = (int) respuesta;
                        txtMemoria.setText(respuestaEntera + "");
                        txtNumero.setText(respuestaEntera + "");
                    } else {
                        txtNumero.setText(respuesta + "");
                        txtMemoria.setText(respuesta + "");
                    }
                }
            }
        });

        botonLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNumero.setText("");
            }
        });
        botonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor = String.valueOf(txtNumero.getText());
                if (! (valor == null)){
                    txtNumero.setText(valor.substring(0, valor.length()-1) + "");
                }

            }
        });
    }

    public void nuevaVentana(View view){


        Intent intent = new Intent(this, AutoresActivity.class);
        intent.setType("text/plain");

        if (valorMemoria % 1 == 0){
            int memoriaEntera = (int) valorMemoria;
            intent.putExtra(Intent.EXTRA_TEXT,String.valueOf(memoriaEntera));
        } else {
            intent.putExtra(Intent.EXTRA_TEXT,String.valueOf(valorMemoria));
        }

        startActivity(intent);
    }

}
