package com.example.jaysonapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView SampleText;
    Button ButtonSample;

    String[] quotes = {
                    "Believe in yourself",
                    " Trust yourself",
                    "Succes takes Patience",
                    " Small step matter",
                    "Dream big",
                    "Never stop learner",
                    "Never Give up",
                    "Progress over Perfection",
                    "Failure is a part of your growth",
                    "Stay Consistent"


    };
    int index = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        SampleText = findViewById(R.id.textView3);
        ButtonSample = findViewById(R.id.button2);

        ButtonSample.setOnClickListener(v -> {
            if (index < quotes.length) {
                SampleText.setText(quotes[index]);
                index++;
            }
            if (index == quotes.length) {
                ButtonSample.setEnabled(false);
                ButtonSample.setText("Done");
            }

            });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
