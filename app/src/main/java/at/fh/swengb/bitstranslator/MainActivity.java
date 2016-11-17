package at.fh.swengb.bitstranslator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText editText2;
    private TextView resultText;
    private TextView textProblem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText2 = (EditText) findViewById(R.id.editText);
        resultText = (TextView) findViewById(R.id.resultText);
        textProblem = (TextView) findViewById(R.id.problemText);

    }


    public void buttonCode(View view) {

        textProblem.setText("");
        resultText.setText("");


        ArrayList<Character> codeList = new ArrayList<>();
        ArrayList<String> codeListResult = new ArrayList<>();


        String onlyLetters = editText2.getText().toString();

        if (onlyLetters.replaceAll("\\s+", "").matches("[a-zA-Z]+")) {


            for (char onlyLetter : onlyLetters.toLowerCase().toCharArray()) {

                codeList.add(onlyLetter);

            }

            for (Character character : codeList) {
                switch (character.toString()) {

                    case "a":
                        codeListResult.add("00001");
                        break;
                    case "b":
                        codeListResult.add("00010");
                        break;
                    case "c":
                        codeListResult.add("00011");
                        break;
                    case "d":
                        codeListResult.add("00100");
                        break;
                    case "e":
                        codeListResult.add("00101");
                        break;
                    case "f":
                        codeListResult.add("00110");
                        break;
                    case "g":
                        codeListResult.add("00111");
                        break;
                    case "h":
                        codeListResult.add("01000");
                        break;
                    case "i":
                        codeListResult.add("01001");
                        break;
                    case "j":
                        codeListResult.add("01010");
                        break;
                    case "k":
                        codeListResult.add("01011");
                        break;
                    case "l":
                        codeListResult.add("01100");
                        break;
                    case "m":
                        codeListResult.add("01101");
                        break;
                    case "n":
                        codeListResult.add("01110");
                        break;
                    case "o":
                        codeListResult.add("01111");
                        break;
                    case "p":
                        codeListResult.add("10000");
                        break;
                    case "q":
                        codeListResult.add("10001");
                        break;
                    case "r":
                        codeListResult.add("10010");
                        break;
                    case "s":
                        codeListResult.add("10011");
                        break;
                    case "t":
                        codeListResult.add("10100");
                        break;
                    case "u":
                        codeListResult.add("10101");
                        break;
                    case "v":
                        codeListResult.add("10110");
                        break;
                    case "w":
                        codeListResult.add("10111");
                        break;
                    case "x":
                        codeListResult.add("11000");
                        break;
                    case "y":
                        codeListResult.add("11001");
                        break;
                    case "z":
                        codeListResult.add("11010");
                        break;


                }
            }


            resultText.setText(codeListResult.toString().replaceAll("\\[|\\]|,", ""));

        } else

        {
            textProblem.setText("Wrong Input!!! Please only use letters a-z,A-Z");

        }
    }

    public void buttonAbout (View view){




        Intent intent = new Intent(this,AboutView.class);
        String resultMessage = resultText.getText().toString();
        String yourMessage = editText2.getText().toString();
        intent.putExtra("data",resultMessage);
        intent.putExtra("data2",yourMessage);
        startActivity(intent);

    }

}
