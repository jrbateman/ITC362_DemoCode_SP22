package com.bateman.hangmanv1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

// V0 - Defining and Adding a Fragment to an Activity Using a Layout XML File
// V1 - Adding GUI Components, Styles, Strings, and Colors

public class MainActivity extends AppCompatActivity {

  private Hangman game;

  @Override
  protected void onCreate( Bundle savedInstanceState ) {
    super.onCreate( savedInstanceState );
    if ( game == null )
      game = new Hangman( Hangman.DEFAULT_GUESSES );
    setContentView( R.layout.activity_main );
    TextView status = ( TextView ) findViewById( R.id.status );
    status.setText( "" + game.getGuessesLeft( ) );
  }

  public void play( View view ) {
  }
}
