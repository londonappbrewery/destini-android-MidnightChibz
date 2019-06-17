package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button topButton, bottomButton;
    TextView storyPane;
    int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        storyPane = findViewById(R.id.storyTextView);
        topButton = findViewById(R.id.buttonTop);
        bottomButton = findViewById(R.id.buttonBottom);

        if (mStoryIndex == 1) {
            storyPane.setText(R.string.T1_Story);
            topButton.setText(R.string.T1_Ans1);
            bottomButton.setText(R.string.T1_Ans2);
        }
        else {
            storyPane.setText(R.string.T4_End);
        }

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Story","Top button pressed");
                mStoryIndex = mStoryIndex + 2;
                Log.d("story", "the index is" + mStoryIndex);
                updateStory();
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Story", "Bottom button pressed");
                mStoryIndex = mStoryIndex + 3;
                Log.d("story", "the index is" + mStoryIndex);
                updateStory();
            }
        });
    }

    private void updateStory(){
        if (mStoryIndex == 1) {
            storyPane.setText(R.string.T1_Story);
            topButton.setText(R.string.T1_Ans1);
            bottomButton.setText(R.string.T1_Ans2);
        }

        else if (mStoryIndex == 3 || mStoryIndex == 6){
            storyPane.setText(R.string.T3_Story);
            topButton.setText(R.string.T3_Ans1);
            bottomButton.setText(R.string.T3_Ans2);
        }

        else if (mStoryIndex == 4){
            storyPane.setText(R.string.T2_Story);
            topButton.setText(R.string.T2_Ans1);
            bottomButton.setText(R.string.T2_Ans2);
        }

        else if (mStoryIndex == 5){
            storyPane.setText(R.string.T6_End);
            topButton.setVisibility(View.GONE);
            bottomButton.setVisibility(View.GONE);
        }

        else if (mStoryIndex == 6 && storyPane.getText() == "He nods slowly, unphased by the question."){
            storyPane.setText(R.string.T3_Story);
            topButton.setText(R.string.T3_Ans1);
            bottomButton.setText(R.string.T3_Ans2);
        }

        else if (mStoryIndex == 6 && storyPane.getText() == "As you begin to drive, the stranger starts talking about his relationship with his mother. He gets angrier and angrier by the minute. He asks you to open the glovebox. Inside you find a bloody knife, two severed fingers, and a cassette tape of Elton John. He reaches for the glove box."){
            storyPane.setText(R.string.T5_End);
            topButton.setVisibility(View.GONE);
            bottomButton.setVisibility(View.GONE);
        }

        else if (mStoryIndex == 7){
            storyPane.setText(R.string.T4_End);
            topButton.setVisibility(View.GONE);
            bottomButton.setVisibility(View.GONE);
        }

        else if (mStoryIndex == 8){
            storyPane.setText(R.string.T6_End);
            topButton.setVisibility(View.GONE);
            bottomButton.setVisibility(View.GONE);
        }

        else if (mStoryIndex == 9){
            storyPane.setText(R.string.T5_End);
            topButton.setVisibility(View.GONE);
            bottomButton.setVisibility(View.GONE);
        }
        else {
            storyPane.setText(R.string.T4_End);
            topButton.setVisibility(View.GONE);
            bottomButton.setVisibility(View.GONE);
            Log.d("Story","Something is wrong");
        }
    }

}
