package br.com.rubensoliveira.agenda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaAlunosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos);

        String[] alunos = {"Rubens", "Ana", "Valentina", "Paulecir", "Aláric", "Déborah", "Rachel", "Roger", "Pietra", "Bernardo", "Ozzy", "Kim", "Thor"};
        ListView listaAlunos = (ListView) findViewById(R.id.lista_alunos);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alunos);
        listaAlunos.setAdapter(adapter);

    }
}
