package appgitclient;

public class GitClient {

    private String cliente;
    private String version;
    private String sistemaOperativo;
    private String licencia;

    public GitClient() {
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    @Override
    public String toString() {
        return "GitClient{" +
                "cliente='" + cliente + '\'' +
                ", version='" + version + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", licencia='" + licencia + '\'' +
                '}';
    }
}
