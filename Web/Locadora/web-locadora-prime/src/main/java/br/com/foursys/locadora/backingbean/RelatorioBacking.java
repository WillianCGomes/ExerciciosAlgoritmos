package br.com.foursys.locadora.backingbean;

import java.io.Serializable;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.chart.PieChartModel;

import br.com.foursys.locadora.bean.Locacao;
import br.com.foursys.locadora.controller.LocacaoController;
import br.com.foursys.locadora.util.JSFUtil;
import br.com.foursys.locadora.util.Mensagem;
import br.com.foursys.locadora.util.Titulo;
import br.com.foursys.locadora.util.Valida;

@ViewScoped
@ManagedBean (name = "relatorioBacking")
public class RelatorioBacking implements Serializable {
	private ArrayList<Locacao> todasLocacoes;
    private static final long serialVersionUID = 1L;
	
	private PieChartModel pieModel;
	private String ano;
	private double janeiro=0;
	private double fevereiro=0;
	private double marco=0;
	private double abril=0;
	private double maio=0;
	private double junho=0;
	private double julho=0;
	private double agosto=0;
	private double setembro=0;
	private double outubro=0;
	private double novembro=0;
	private double dezembro=0;
	private double montante=0;
	private boolean render;

    private PieChartModel pieModel2;

    public PieChartModel getPieModel2() {
        return pieModel2;
    }

    public void setPieModel2(PieChartModel pieModel2) {
        this.pieModel2 = pieModel2;
    }

    public ArrayList<Locacao> getTodasLocacoes() {
		return todasLocacoes;
	}

	public void setTodasLocacoes(ArrayList<Locacao> todasLocacoes) {
		this.todasLocacoes = todasLocacoes;
	}

	public PieChartModel getPieModel() {
		return pieModel;
	}

	public void setPieModel(PieChartModel pieModel) {
		this.pieModel = pieModel;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public double getJaneiro() {
		return janeiro;
	}

	public void setJaneiro(double janeiro) {
		this.janeiro = janeiro;
	}

	public double getFevereiro() {
		return fevereiro;
	}

	public void setFevereiro(double fevereiro) {
		this.fevereiro = fevereiro;
	}

	public double getMarco() {
		return marco;
	}

	public void setMarco(double marco) {
		this.marco = marco;
	}

	public double getAbril() {
		return abril;
	}

	public void setAbril(double abril) {
		this.abril = abril;
	}

	public double getMaio() {
		return maio;
	}

	public void setMaio(double maio) {
		this.maio = maio;
	}

	public double getJunho() {
		return junho;
	}

	public void setJunho(double junho) {
		this.junho = junho;
	}

	public double getJulho() {
		return julho;
	}

	public void setJulho(double julho) {
		this.julho = julho;
	}

	public double getAgosto() {
		return agosto;
	}

	public void setAgosto(double agosto) {
		this.agosto = agosto;
	}

	public double getSetembro() {
		return setembro;
	}

	public void setSetembro(double setembro) {
		this.setembro = setembro;
	}

	public double getOutubro() {
		return outubro;
	}

	public void setOutubro(double outubro) {
		this.outubro = outubro;
	}

	public double getNovembro() {
		return novembro;
	}

	public void setNovembro(double novembro) {
		this.novembro = novembro;
	}

	public double getDezembro() {
		return dezembro;
	}

	public void setDezembro(double dezembro) {
		this.dezembro = dezembro;
	}

	public double getMontante() {
		return montante;
	}

	public void setMontante(double montante) {
		this.montante = montante;
	}

	public boolean isRender() {
		return render;
	}

	public void setRender(boolean render) {
		this.render = render;
	}

	public RelatorioBacking() {
		ano=2021+"";
        createPieModel2();
        setRender(false);
        todasLocacoes = new ArrayList<Locacao>(new LocacaoController().buscarTodos());	
		}
    
    
    
 
	private void createPieModel2() {
        pieModel2 = new PieChartModel();
 
        pieModel2.set("Janeiro", 0);
        pieModel2.set("Fevereiro", 0);
        pieModel2.set("Março", 0);
        pieModel2.set("Abril", 0);
        pieModel2.set("Maio", 45);
        pieModel2.set("Junho", 30);
        pieModel2.set("Julho", 25);
        pieModel2.set("Agosto", 0);
        pieModel2.set("Setembro", 0);
        pieModel2.set("Outubro", 0);
        pieModel2.set("Novembro", 0);
        pieModel2.set("Dezembro", 0);
 
        pieModel2.setTitle("Relatório anual de vendas");
        pieModel2.setLegendPosition("e");
        pieModel2.setFill(false);
        pieModel2.setShowDataLabels(true);
        pieModel2.setDiameter(350);
        pieModel2.setShadow(false);
        
    }
    
    public void anoPesquisar()
	{			
		if(validar())
		{
			limpaCampos();				
			for(Locacao l: todasLocacoes)
			{
				if(comparaAno(l.getDataLocacao(),ano))
				{
					if(comparaMes(l.getDataLocacao(), 1))
					{
						janeiro += l.getValor();
						montante += l.getValor();
					}
					else if(comparaMes(l.getDataLocacao(), 2))
					{
						fevereiro += l.getValor();
						montante += l.getValor();
					}
					else if(comparaMes(l.getDataLocacao(), 3))
					{
						marco += l.getValor();
						montante += l.getValor();
					}
					if(comparaMes(l.getDataLocacao(), 4))
					{
						abril += l.getValor();
						montante += l.getValor();
					}
					if(comparaMes(l.getDataLocacao(), 5))
					{
						maio += l.getValor();
						montante += l.getValor();
					}
					if(comparaMes(l.getDataLocacao(), 6))						
					{							
						junho += l.getValor();
						montante += l.getValor();
					}
					if(comparaMes(l.getDataLocacao(), 7))
					{
						julho += l.getValor();
						montante += l.getValor();
					}
					if(comparaMes(l.getDataLocacao(), 8))
					{
						agosto += l.getValor();
						montante += l.getValor();
					}
					if(comparaMes(l.getDataLocacao(), 9))
					{
						setembro += l.getValor();
						montante += l.getValor();
					}
					if(comparaMes(l.getDataLocacao(), 10))
					{
						outubro += l.getValor();
						montante += l.getValor();
					}
					if(comparaMes(l.getDataLocacao(), 11))
					{
						novembro += l.getValor();
						montante += l.getValor();
					}
					if(comparaMes(l.getDataLocacao(), 12))
					{
						dezembro += l.getValor();
						montante += l.getValor();
					}						
				}
			}				
			if(montante > 0)
			{
				setPieModel();
				setRender(true);
			}
			else
			{
				JSFUtil.addInfoMessage(Titulo.FINANCEIRO, Mensagem.MONTANTE_VAZIO);
				setRender(false);
			}
		}		
	}
	
	private void limpaCampos()
	{
		setJaneiro(0);
		setFevereiro(0);
		setMarco(0);
		setAbril(0);
		setMaio(0);
		setJunho(0);
		setJulho(0);
		setAgosto(0);
		setSetembro(0);
		setOutubro(0);
		setNovembro(0);
		setDezembro(0);
		setMontante(0);
	}
	
	private boolean validar()
	{
		if(Valida.isEmptyOrNull(ano))
		{
			JSFUtil.addErrorMessage(Titulo.FINANCEIRO, Mensagem.ANO_VAZIO);
			return false;
		}
		return true;
	}
	
	
	
	private boolean comparaAno(String a, String b) {
		
		try {
			String ano[] = a.split("/");
			if(Integer.parseInt(ano[2]) == Integer.parseInt(b))
			{					
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}			
		return false;
	}
	private boolean comparaMes(String a, int b) {
		
		try {
			String mes[] = a.split("/");
			if(Integer.parseInt(mes[1]) == b)
			{				
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	private void setPieModel()
	{

       
	}
	
	private void createPieModel() 
	{
        pieModel = new PieChartModel();
 	        
        pieModel.setShadow(true);
    }
}