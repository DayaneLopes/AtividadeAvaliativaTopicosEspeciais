import java.io.IOException;
import java.util.Scanner;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.primefaces.event.FileUploadEvent;


@ManagedBean(name = "FileUploadView")
@SessionScoped
public class FileUploadView {
    
    private String conteudoDoArquivo;
    
    public void handleFileUpload(FileUploadEvent event) throws IOException {
         conteudoDoArquivo = new Scanner(event.getFile().getInputstream(),"UTF-8").useDelimiter("\\A").next();
             }

    public String getConteudoDoArquivo() {
        return conteudoDoArquivo;
    }

    public void setConteudoDoArquivo(String conteudoDoArquivo) {
        this.conteudoDoArquivo = conteudoDoArquivo;
    }
    
    
}

