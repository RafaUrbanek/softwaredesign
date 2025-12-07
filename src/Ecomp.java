import java.util.ArrayList;
import java.util.List;

public class Ecomp {
    private List<Ecomper> membros = new ArrayList<>();
    private List<Projeto> projetos = new ArrayList<>();
    private List<Desenvolvedor> devs = new ArrayList<>();
    private List<Atividade> atividades = new ArrayList<>();

    public Ecomp() {}

    // -------------------- MÉTODOS DE ECOMPER --------------------

    public void cadastrarEcomper(String nome, String cpf, String email, String cargo) {
        Ecomper e = new Ecomper(nome, cpf, email, cargo);
        adicionarEcomper(e);
    }

    public void adicionarEcomper(Ecomper e) {
        this.membros.add(e);
    }

    // -------------------- MÉTODOS DE PROJETOS --------------------

    public void cadastrarProjeto(Cliente cliente, String dataInicio, String prazo, String descricao, String contrato) {
        Projeto p = new Projeto(cliente, dataInicio, prazo, descricao, contrato);
        adicionarProjeto(p);
    }

    public void adicionarProjeto(Projeto p) {
        this.projetos.add(p);
    }

    public Projeto selecionarProjeto(int id) {
        for (Projeto p : projetos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    // -------------------- MÉTODOS DE DESENVOLVEDORES --------------------

    public boolean cadastrarDesenvolvedor(Projeto p, int id) {
        Desenvolvedor dev = selecionarDesenvolvedor(id);

        if (dev == null)
            return false;

        return p.cadastrarDesenvolvedor(dev);
    }

    public void adicionarDesenvolvedor(Desenvolvedor dev) {
        this.devs.add(dev);
    }

    public Desenvolvedor selecionarDesenvolvedor(int id) {
        for (Desenvolvedor dev : devs) {
            if (dev.getId() == id)
                return dev;
        }
        return null;
    }

    // -------------------- RELATÓRIOS --------------------

    public Relatorio gerarRelatorio(String tipoRelatorio) {
        Relatorio r = new Relatorio(tipoRelatorio);

        if (tipoRelatorio.equals("Atividade")) {
            r.gerarRelatorioAtividade(this.atividades);
        } else if (tipoRelatorio.equals("Itens Fiscais")) {
            r.gerarRelatorioItensFiscais(this.projetos);
        }

        return r;
    }

    public void exibirRelatorio(Relatorio r, String tipoRelatorio) {
        if (tipoRelatorio.equals("Atividade")) {
            r.visualizarRelatorioAtividades();
        } else if (tipoRelatorio.equals("Itens Fiscais")) {
            r.visualizarRelatorioItensFiscais();
        }
    }

    // -------------------- ITENS FISCAIS --------------------

    public void cadastrarItemFiscal(String data, float valor, String tipo, Projeto p) {
        ItemFiscal item = new ItemFiscal(data, valor, tipo);
        p.adicionarItemFiscal(item);
    }

    // -------------------- ETAPAS --------------------

    public Etapa cadastrarEtapaProjeto(int id, String cronograma, String status) {
        Projeto p = selecionarProjeto(id);
        if (p == null) return null;

        return p.cadastrarEtapaProjeto(cronograma, status);
    }

    // -------------------- ATIVIDADES --------------------

    public Atividade cadastrarAtividade(String nome, String duracao, String local, String objetivo, String resumo) {
        return new Atividade(nome, duracao, local, objetivo, resumo);
    }

    public void adicionarAtividade(Atividade a) {
        this.atividades.add(a);
    }

    public boolean adicionarParticipanteAtividade(Atividade a, int id) {
        Ecomper e = selecionarEcomper(id);

        if (e == null)
            return false;

        Participante p = new Participante(e.getId(), e.getNome(), e.getCpf(), e.getEmail(), e.getCargo());

        a.adicionarParticipante(p);
        return true;
    }

    public Ecomper selecionarEcomper(int id) {
        for (Ecomper e : membros) {
            if (e.getId() == id)
                return e;
        }
        return null;
    }

    // -------------------- IMPRESSÕES --------------------

    public void imprimirProjetos() {
        for (Projeto p : projetos) {
            System.out.println(p);
        }
        System.out.println("\n");
    }

    public void imprimirDesenvolvedores() {
        for (Desenvolvedor d : devs) {
            System.out.println(d);
        }
        System.out.println("\n");
    }

    public void imprimirMembros() {
        for (Ecomper m : membros) {
            System.out.println(m);
        }
        System.out.println("\n");
    }

    public void imprimirAtividades() {
        for (Atividade a : atividades) {
            System.out.println(a);
        }
        System.out.println("\n");
    }
}