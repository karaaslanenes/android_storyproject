package com.example.storyproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText inputString_EditText_Name;
    private EditText inputString_EditText_Age;
    private EditText inputString_EditText_City;
    private  EditText inputString_EditText_CollegeName;
    private EditText inputString_EditText_Profession;
    private EditText inputString_EditText_AnimalType;
    private EditText inputString_EditText_PetName;
    private TextView storyString_TextView;
    private Button display_Button;

    private String inputName;
    private String inputAge;
    private String inputCity;
    private String inputCollegeName;
    private String inputProfession;
    private String inputAnimalType;
    private String inputPetName;
    private String story;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

display_Button=(Button) findViewById(R.id.displayStory_Button);
display_Button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
inputString_EditText_Name=(EditText) findViewById(R.id.inputString_Edit_text_name);
inputName=inputString_EditText_Name.getText().toString();

inputString_EditText_Age=(EditText) findViewById(R.id.inputString_Edit_text_age);
inputAge=inputString_EditText_Age.getText().toString();

inputString_EditText_City=(EditText) findViewById(R.id.inputString_Edit_text_city);
inputCity=inputString_EditText_City.getText().toString();

inputString_EditText_CollegeName=(EditText) findViewById(R.id.inputString_Edit_text_College_Name);
inputCollegeName=inputString_EditText_CollegeName.getText().toString();

inputString_EditText_Profession=(EditText) findViewById(R.id.inputString_Edit_text_Profession);
inputProfession=inputString_EditText_Profession.getText().toString();

inputString_EditText_AnimalType=(EditText) findViewById(R.id.inputString_Edit_text_Animal_Type);
inputAnimalType=inputString_EditText_AnimalType.getText().toString();

inputString_EditText_PetName=(EditText) findViewById(R.id.inputString_Edit_text_Pet_Name);
inputPetName=inputString_EditText_PetName.getText().toString();

story="There once was a person named "+ inputName+" who lived in "+inputCity+". At the age of "+
        inputAge+", "+inputName+ " went to college at "+inputCollegeName+"."+inputName + " graduated and went to work as a "+inputProfession+" Then, "+inputName+" adopted a (n) "
        +inputAnimalType+" named "+inputPetName+" .They both lived happily ever after!";

storyString_TextView=(TextView) findViewById(R.id.toryString_Text_view);
storyString_TextView.setText(story);



    }
});

    }
}