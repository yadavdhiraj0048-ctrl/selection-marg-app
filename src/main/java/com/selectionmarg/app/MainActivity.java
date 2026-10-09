package com.selectionmarg.app;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ScrollView scrollView = new ScrollView(this);
        scrollView.setBackgroundColor(Color.parseColor("#F4F6F9"));

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(32, 48, 32, 48);

        TextView title = new TextView(this);
        title.setText("Selection Marg");
        title.setTextSize(26);
        title.setTextColor(Color.parseColor("#0D47A1"));
        title.setTypeface(null, Typeface.BOLD);
        title.setGravity(Gravity.CENTER);
        layout.addView(title);

        TextView subtitle = new TextView(this);
        subtitle.setText("सही दिशा, बेहतर भविष्य");
        subtitle.setTextSize(16);
        subtitle.setTextColor(Color.parseColor("#555555"));
        subtitle.setGravity(Gravity.CENTER);
        subtitle.setPadding(0, 8, 0, 32);
        layout.addView(subtitle);

        layout.addView(createCard("Daily Quiz (दैनिक क्विज़)", "#1E88E5", "GK, Maths, Reasoning & Science"));
        layout.addView(createCard("Mock Test (मॉक टेस्ट)", "#43A047", "SSC, Railway, Banking, UPSC"));
        layout.addView(createCard("Study Planner (योजना)", "#FB8C00", "आज का लक्ष्य और समय सारणी"));
        layout.addView(createCard("Notes & Material (नोट्स)", "#8E24AA", "सभी विषयों के महत्वपूर्ण नोट्स"));

        scrollView.addView(layout);
        setContentView(scrollView);
    }

    private CardView createCard(final String title, String colorHex, String desc) {
        CardView card = new CardView(this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        params.setMargins(0, 16, 0, 16);
        card.setLayoutParams(params);
        card.setRadius(20);
        card.setCardElevation(8);
        card.setCardBackgroundColor(Color.WHITE);

        LinearLayout cardContent = new LinearLayout(this);
        cardContent.setOrientation(LinearLayout.VERTICAL);
        cardContent.setPadding(32, 32, 32, 32);

        TextView tView = new TextView(this);
        tView.setText(title);
        tView.setTextSize(18);
        tView.setTypeface(null, Typeface.BOLD);
        tView.setTextColor(Color.parseColor(colorHex));
        cardContent.addView(tView);

        TextView dView = new TextView(this);
        dView.setText(desc);
        dView.setTextSize(14);
        dView.setTextColor(Color.DKGRAY);
        dView.setPadding(0, 8, 0, 16);
        cardContent.addView(dView);

        Button btn = new Button(this);
        btn.setText("शुरू करें");
        btn.setBackgroundColor(Color.parseColor(colorHex));
        btn.setTextColor(Color.WHITE);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, title + " जल्द आ रहा है!", Toast.LENGTH_SHORT).show();
            }
        });
        cardContent.addView(btn);

        card.addView(cardContent);
        return card;
    }
}
