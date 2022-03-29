<%@page import="br.com.foursys.locadora.backingbean.FuncionarioBacking"%>
<%@page import="br.com.foursys.locadora.bean.Estado"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html>
<html style="background-image: url('img/Wallpaperhtml4.png');">
<head>
<link href="./css/estilo.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Cadastro de Funcionario</title>
</head>
<body>
	<div align="center" style="color: white">
		<f:view>
			<jsp:include page="/menu.jsp" />
			<br>
			<br>
			<br>
			<br>
			<br>
			<h:form>
				<h1>Cadastro de Funcionários</h1>
				<fieldset class="Cadastro_Funcionarios">
					<legend style="color: #87CEEB">Dados Pessoais</legend>

					<br> <br>
					<h:panelGrid columns="1">
						<h:messages />
					</h:panelGrid>


					<h:panelGrid columns="2">
						<h:outputText value="Nome:" />
						<h:inputText value="#{funcionarioBacking.nome}" maxlength="45"
							size="40" />

						<h:outputText value="CPF:" />
						<h:inputText value="#{funcionarioBacking.cpf}" maxlength="14"
							size="15" />

						<h:outputText value="RG:" />
						<h:inputText value="#{funcionarioBacking.rg}" maxlength="12"
							size="15" />

						<h:outputText value="Data de Nascimento:" />
						<h:inputText value="#{funcionarioBacking.dataNascimento}"
							maxlength="10" size="15" />

						<h:outputText value="Idade:" />
						<h:inputText value="#{funcionarioBacking.idade}" maxlength="3"
							size="15" />

						<h:outputText value="Sexo:" />
						<h:selectOneRadio value="#{funcionarioBacking.sexo}">
							<f:selectItem itemValue="M" itemLabel="Masculino" />
							<f:selectItem itemValue="F" itemLabel="Feminino" />
						</h:selectOneRadio>

						<h:outputText value="Login:" />
						<h:inputText value="#{funcionarioBacking.login}" maxlength="15"
							size="20" />

						<h:outputText value="Senha:" />
						<h:inputText value="#{funcionarioBacking.senha}" maxlength="15"
							size="20" />

						<h:outputText value="Perfil de Acesso:" />
						<h:inputText value="#{funcionarioBacking.perfilAcesso}"
							maxlength="40" size="40" />
					</h:panelGrid>

					<h:panelGrid columns="3">
						<h:commandButton action="#" value="Cadastrar" />
						<h:commandButton action="#{funcionarioBacking.cancelar}"
							value="Cancelar" />
						<h:commandButton action="#{funcionarioBacking.sair}" value="Sair" />
					</h:panelGrid>
				</fieldset>

				<fieldset class="Cadastro_Funcionarios">
					<legend style="color: #87CEEB">Endereço</legend>

					<h:outputText value="Estado:" />
					<h:selectOneMenu value="#{funcionarioBacking.estado}">
						<f:selectItem itemValue="" itemLabel="- Selecione um Estado -" />
						<f:selectItems value="#{funcionarioBacking.listaEstados}"
							var="estado" itemLabel="#{estado.nome}" itemValue="#{estado}" />
					</h:selectOneMenu>


				</fieldset>
			</h:form>
		</f:view>
	</div>

</body>
</html>