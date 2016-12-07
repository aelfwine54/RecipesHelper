package com.example.juasp_g73.recipeshelper;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import core.Ingredient;
import core.Recipe;
import dao.ConnectionPostgreSQL;
import dao.IngredientDao;
import dao.RecipeDao;

import java.sql.Connection;

public class RecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        setContentView(R.layout.activity_recipe);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TextView tv_test = (TextView) findViewById(R.id.textView_test);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String recipe_id = extras.getString("recipe_id");
            //Recipe r = new RecipeDao().find(Integer.parseInt(recipe_id));
            //tv_test.setText(r.toString());
            Connection connect = ConnectionPostgreSQL.getInstance();
            //tv_test.setText(connect.toString());
        }
    }
}
