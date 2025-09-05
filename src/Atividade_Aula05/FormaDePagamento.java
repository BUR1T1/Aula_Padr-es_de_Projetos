package Atividade_Aula05;

public class FormaDePagamento {
    
    String nome_do_devedor;
    String email;
    double valor;
    int cod_id_pagamento;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public FormaDePagamento(String nome_do_devedor, String email, double valor, int cod_id_pagamento){
        this.nome_do_devedor =nome_do_devedor;
        this.email = email;
        this.valor = valor;
        this.cod_id_pagamento = cod_id_pagamento;
    }

    public String getNome_do_devedor() {
        return nome_do_devedor;
    }

    public void setNome_do_devedor(String nome_do_devedor) {
        this.nome_do_devedor = nome_do_devedor;
    }

    public int getCod_id_pagamento() {
        return cod_id_pagamento;
    }

    public void setCod_id_pagamento(int cod_id_pagamento) {
        this.cod_id_pagamento = cod_id_pagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "FormaDePagamento{" +
                "nome_do_devedor='" + nome_do_devedor + '\'' +
                "Email: " + email +
                ", valor=" + valor +
                ", cod_id_pagamento=" + cod_id_pagamento +
                '}';
    }
}
