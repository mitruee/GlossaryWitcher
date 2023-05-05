package com.example.glossarywitcher;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    List<Hero> heroes = new ArrayList<Hero>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setInitialData();

        RecyclerView recyclerView = findViewById(R.id.list_hero);

        HeroAdapter adapter = new HeroAdapter(this, heroes);

        recyclerView.setAdapter(adapter);
    }

    private void setInitialData() {

        heroes.add(new Hero("Геральт из Ривии", "Главный герой литературной саги и протагонист последующих игр, ведьмак из Школы Волка, профессиональный охотник на монстров, один из лучших фехтовальщиков Севера.", R.drawable.geralt));
        heroes.add(new Hero("Йеннифер из Венгерберга", "Один из основных персонажей литературной саги и игры Ведьмак 3: Дикая Охота, возлюбленная Геральта из Ривии, талантливая и могущественная чародейка, фактически приёмная мать Цириллы. Входила в состав последнего Совета Чародеев, позднее — в Ложу Чародеек.", R.drawable.yennefer));
        heroes.add(new Hero("Цирилла", "Один из центральных персонажей литературной саги и второй протагонист игры Ведьмак 3: Дикая Охота.", R.drawable.cirilla));
        heroes.add(new Hero("Трисс Меригольд", "Второстепенный персонаж литературной саги и основной персонаж игр Ведьмак, Ведьмак 2: Убийцы Королей и Ведьмак 3: Дикая Охота, чародейка и целительница, один из самых молодых, но вместе с тем самых талантливых магов Севера. Имеет близкие отношения с Геральтом, является подругой Йеннифэр, Цири и ведьмаков из Каэр Морхена.", R.drawable.triss));
        heroes.add(new Hero("Весемир", "Второстепенный персонаж литературной саги, а также игр Ведьмак и Ведьмак 3: Дикая Охота, старейший, самый опытный и уважаемый ведьмак из Школы Волка, являвшийся её мастером и хранителем традиций Цеха.", R.drawable.vesemir))
    }
}