
package com.Glass4Child.project.entities;

import java.io.Serializable;
import com.Glass4Child.project.entities.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;
@Entity
public class beneficent extends User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	public int maxdonacao=0;
	public int totaldedoacoas=0;
	public boolean freguente=false;
	public beneficent(Object object, String string, String string2, String string3, String string4) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.password = password;
		this.freguente=false;
		this.maxdonacao=0;
		this.totaldedoacoas=0;
	}
	protected int getMaxdonacao() {
		return maxdonacao;
	}
	protected void setMaxdonacao(int maxdonacao) {
		this.maxdonacao = maxdonacao;
	}
	protected int getTotaldedoacoas() {
		return totaldedoacoas;
	}
	protected void setTotaldedoacoas(int totaldedoacoas) {
		this.totaldedoacoas = totaldedoacoas;
	}
	protected boolean isFreguente() {
		return freguente;
	}
	protected void setFreguente(boolean freguente) {
		this.freguente = freguente;
	}
	public void computa_doacao_feita(int valor) {
		if(this.maxdonacao<valor) {
			this.maxdonacao=valor;
		}
		this.totaldedoacoas=valor+this.totaldedoacoas;
	}
	
}
