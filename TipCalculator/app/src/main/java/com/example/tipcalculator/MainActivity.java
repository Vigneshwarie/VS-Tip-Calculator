package com.example.tipcalculator;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private EditText billAmountEditText;
    private TextView readOnlyOutputEditText;
    private Button submit15Button;
    private Button submit18Button;
    private Button submit20Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        billAmountEditText = findViewById(R.id.billAmountEditText);
        readOnlyOutputEditText = findViewById(R.id.readOnlyOutputEditText);
        submit15Button = findViewById(R.id.submit15Button);
        submit18Button = findViewById(R.id.submit18Button);
        submit20Button = findViewById(R.id.submit20Button);


        // functionality to calculate 15% tip
        submit15Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String billAmount = billAmountEditText.getText().toString();
                double tipValue = (Integer.parseInt(billAmount)*.15);
                String outputStr = "Tip: $"+ String.format("%.2f",tipValue)+ ", Total Bill: $"+billAmount;
                readOnlyOutputEditText.setText(outputStr);
            }
        });

        // functionality to calculate 18% tip
        submit18Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String billAmount = billAmountEditText.getText().toString();
                double tipValue = (Integer.parseInt(billAmount)*.18);
                String outputStr = "Tip: $"+ String.format("%.2f",tipValue) + ", Total Bill: $"+billAmount;
                readOnlyOutputEditText.setText(outputStr);
            }
        });

        // functionality to calculate 20% tip
        submit20Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String billAmount = billAmountEditText.getText().toString();
                double tipValue = (Integer.parseInt(billAmount)*.20);
                String outputStr = "Tip: $" + String.format("%.2f",tipValue) + ", Total Bill: $"+billAmount;
                readOnlyOutputEditText.setText(outputStr);
            }
        });
    }
}