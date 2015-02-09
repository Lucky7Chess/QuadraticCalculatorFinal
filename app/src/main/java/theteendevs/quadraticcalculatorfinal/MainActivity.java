package theteendevs.quadraticcalculatorfinal;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import theteendevs.newquadraticcalculator.R;


public class MainActivity extends ActionBarActivity {

    public  String output31;
    public String output32;
    public float number11;
    public float number22;
    public float number33;
    public float real1;
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText1 = (EditText) findViewById(R.id.editText1);
        final EditText editText2 = (EditText) findViewById(R.id.editText2);
        final EditText editText3 = (EditText) findViewById(R.id.editText3);
        final EditText editText4 = (EditText) findViewById(R.id.editText4);
        final EditText editText5 = (EditText) findViewById(R.id.editText5);
        final Button button1 = (Button) findViewById(R.id.button1);
        final Button button2 = (Button) findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {//clear button
            @Override
            public void onClick(View view) {
                editText1.setText("");
                editText2.setText("");
                editText3.setText("");
            }
        });



        button2.setOnClickListener(new View.OnClickListener() {//clear button
            @Override
            public void onClick(View view) {
                Editable text1 = editText1.getText();
                Editable text2 = editText2.getText();
                Editable text3 = editText3.getText();
                number11 = Float.valueOf(editText1.getText().toString());
                number22 = Float.valueOf(editText2.getText().toString());
                number33 = Float.valueOf(editText3.getText().toString());
                if ((number22 * number22) - (4 * number11 * number33)>=0) {
                    float answer1 = (float) ((-number22 + Math.sqrt(number22 * number22 - 4 * number11 * number33)) / (2 * number11));
                    float answer2 = (float) ((-number22 - Math.sqrt(number22 * number22 - 4 * number11 * number33)) / (2 * number11));
                    output31 = Float.toString(answer1);
                    output32 = Float.toString(answer2);
                    editText4.setText(output31);
                    editText5.setText(output32);

                }
                if ((number22 * number22) - (4 * number11 * number33)<0) {
                    real1 = (-number22/ (2 * number11));
                    float answer1=(float)Math.sqrt(-((number22*number22 - (4 * number11 * number33))/2*number11));
                    output31 = Float.toString(answer1);
                    editText4.setText(real1+"+"+output31+" i");
                    editText5.setText(real1+"-"+output31+" i");
                }


            }
        });




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
        /////onk
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
//




        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}



