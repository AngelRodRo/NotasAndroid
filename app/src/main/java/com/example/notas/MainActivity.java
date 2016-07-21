    package com.example.notas;

    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;

    public class MainActivity extends AppCompatActivity {


        EditText edtPA1,edtPA2,edtPA3,edtPA4,
                edtPB1,edtPB2,edtPB3,edtPB4;
        EditText edtPromedio;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            edtPA1 = (EditText) findViewById(R.id.edtPA1);
            edtPA2 = (EditText) findViewById(R.id.edtPA2);
            edtPA3 = (EditText) findViewById(R.id.edtPA3);
            edtPA4 = (EditText) findViewById(R.id.edtPA4);
            edtPB1 = (EditText) findViewById(R.id.edtPB1);
            edtPB2 = (EditText) findViewById(R.id.edtPB2);
            edtPB3 = (EditText) findViewById(R.id.edtPB3);
            edtPB4 =  (EditText) findViewById(R.id.edtPB4);

            ((Button)findViewById(R.id.btnCalculate)).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    calcularPromedio();
                }
            });


        }

        public void calcularPromedio(){
            edtPromedio = (EditText) findViewById(R.id.edtPromedio);

            double PY = Double.valueOf(((EditText) findViewById(R.id.edtPY)).getText().toString());

            double PA = 0.2*Double.valueOf(edtPA1.getText().toString())
                    + 0.2*Double.valueOf(edtPA2.getText().toString())
                    + 0.25*Double.valueOf(edtPA3.getText().toString())
                    + 0.35*Double.valueOf(edtPA4.getText().toString());

            double PB = 0.2*Double.valueOf(edtPB1.getText().toString()) +
                    0.2*Double.valueOf(edtPB2.getText().toString())+
                    0.25*Double.valueOf(edtPB3.getText().toString())+
                    0.35*Double.valueOf(edtPB4.getText().toString());

            double PF = 0.30*PA + 0.35*PB + 0.35*PY;

            edtPromedio.setText(String.valueOf(PF));


        }
    }
