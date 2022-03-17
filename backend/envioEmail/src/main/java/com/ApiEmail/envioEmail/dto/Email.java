package com.ApiEmail.envioEmail.dto;


public class Email {
	
	private String nome;

    private String email;

    private String mensagem;

	public String getNome() {

		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	@Override
	public String toString() {
		return "Email [nome=" + nome + ", email=" + email + ", mensagem=" + mensagem + "]";
	}

	public Email(String nome, String email, String mensagem) {
		super();
		this.nome = nome;
		this.email = email;
		this.mensagem = mensagem;
	}

	public Email() {
		super();
	}
    

    


}