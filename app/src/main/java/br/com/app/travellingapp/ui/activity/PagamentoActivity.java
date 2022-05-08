package br.com.app.travellingapp.ui.activity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.math.BigDecimal;

import br.com.app.travellingapp.R;
import br.com.app.travellingapp.model.Pacote;
import br.com.app.travellingapp.util.MoedaUtil;

public class PagamentoActivity extends AppCompatActivity {

    public static final String TITULO_APP_BAR = "Pagamento";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagamento);

        setTitle(TITULO_APP_BAR);

        Pacote pacoteSaoPaulo = new Pacote("São Paulo", "sao_paulo_sp",
                2, new BigDecimal("243.99"));

        mostraPreco(pacoteSaoPaulo);
    }

    private void mostraPreco(Pacote pacoteSaoPaulo) {
        TextView preco = findViewById(R.id.pagamento_preco_pacote);
        String moedaBrasileira = MoedaUtil
                .formataParaBrasileiro(pacoteSaoPaulo.getPreco());
        preco.setText(moedaBrasileira);
    }
}