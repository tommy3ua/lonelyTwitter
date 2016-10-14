package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class EditTweetActivity extends Activity {

    TextView editTweetMessage;
    TextView editTweetDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        editTweetMessage = (TextView) findViewById(R.id.editTweetMessage);
        editTweetDate = (TextView) findViewById(R.id.editTweetDate);

        editTweetMessage.setText(getIntent().getStringExtra("Message"));
        editTweetDate.setText(getIntent().getStringExtra("Date"));
    }
}
