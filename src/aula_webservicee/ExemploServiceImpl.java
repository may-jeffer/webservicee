package aula_webservicee;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "aula_webservicee.ExemploService")
public class ExemploServiceImpl implements ExemploService {

    @WebMethod
    public int calcula(int id) {
        return id+10;
    }

    @WebMethod
    public String meuNome(String nome) {
        return "Maicon Jefferson Pereira dos Santos";
    }

}