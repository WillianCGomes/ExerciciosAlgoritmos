package br.com.foursys.locadora.backingbean;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.foursys.locadora.bean.Funcionario;
import br.com.foursys.locadora.controller.FuncionarioController;
import br.com.foursys.locadora.util.JSFUtil;
import br.com.foursys.locadora.util.Perfil;
import br.com.foursys.locadora.util.Valida;

@ManagedBean(name = "loginBacking")
@SessionScoped
public class LoginBacking implements Serializable {
	private static final long serialVersionUID = 1L;

	private String login;
	private String senha;

	public boolean user;
	public boolean dev;

	public boolean isAdm() {
		return adm;
	}

	public void setAdm(boolean adm) {
		this.adm = adm;
	}

	public boolean adm;

	public static Funcionario funcionarioLogado;

	public boolean isUser() {
		return user;
	}

	public void setUser(boolean user) {
		this.user = user;
	}

	public boolean isDev() {
		return dev;
	}

	public void setDev(boolean dev) {
		this.dev = dev;
	}

	public Funcionario getFuncionarioLogado() {
		return funcionarioLogado;
	}

	public void setFuncionarioLogado(Funcionario funcionarioLogado) {
		LoginBacking.funcionarioLogado = funcionarioLogado;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void efetuarLogin() {
		logout();
		if (validar()) {
			try {
				ArrayList<Funcionario> funcionarios = new FuncionarioController().buscarPorLogin(login);
				if (validaDados(funcionarios)) {
					defineLogin();
					try {
						FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");
					} catch (IOException e) {
						e.printStackTrace();
					}
				} else {
					JSFUtil.addErrorMessage("Login", "Credenciais inválidas!");
				}
			} catch (Exception e) {
				JSFUtil.addErrorMessage("Login", "Credenciais inválidas!");
			}
		}
	}

	private boolean validar() {
		if (Valida.isEmptyOrNull(login)) {
			JSFUtil.addErrorMessage("Login", "Credenciais inválidas!");
			return false;
		}
		if (Valida.isEmptyOrNull(senha)) {
			JSFUtil.addErrorMessage("Login", "Credenciais inválidas!");
			return false;
		}
		return true;
	}

	private boolean validaDados(ArrayList<Funcionario> func) {
		for (Funcionario funcionario : func) {
			if (funcionario.getSenha().equals(senha)) {
				setLogin(null);
				setSenha(null);
				setFuncionarioLogado(funcionario);
				if (funcionario.getPerfilAcesso().equals(Perfil.USER.getDescricao())) {
					setUser(true);
				} else {
					setUser(false);
					if (funcionario.getPerfilAcesso().equals(Perfil.DEV.getDescricao())) {
						setDev(true);
					} else {
						setDev(false);
						if (funcionario.getPerfilAcesso().equals(Perfil.ADMIN.getDescricao())) {
							setAdm(true);
						} else {
							setAdm(false);
						}
					}
				}
				return true;
			}
		}
		return false;
	}

	public void defineLogin() {
		if (user) {
			dev = false;
			adm = false;
		} else if (adm) {
			dev = false;
			user = false;
		} else {
			user = false;
			adm = false;
		}
	}

	public void logout() {
		dev = false;
		user = false;
		adm = false;
	}

}
