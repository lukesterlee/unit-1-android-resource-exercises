package nyc.c4q.unit_1_android_resource_exercises;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class ResourceExercisesActivity extends AppCompatActivity {

    public static final String TAG = "ResourceExercises";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resource_exercises);

        Button button = (Button) findViewById(R.id.exercise_button);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText input = (EditText) findViewById(R.id.exercise_edit_text_input);
                int score = Integer.parseInt(input.getText().toString());
                TextView output = (TextView) findViewById(R.id.exercise_text_view_grade);
                String grade = calculateGrade(score);
                output.setText(grade);
            }
        });

    }

    public String calculateGrade(int score) {
        if(score == 100)
            return "A+";
        else if(score >= 90)
            return "A";
        else if(score >= 80)
            return "B";
        else if(score >= 70)
            return "C";
        else if(score >= 60)
            return "D";
        else
            return "F";

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_resource_exercises, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
