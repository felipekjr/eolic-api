package api.arq.seguranca.jwt;

import java.util.Date;
import java.util.Optional;

import api.model.Usuario;
import  api.arq.util.SituacaoToken;
import org.springframework.stereotype.Service;

@Service
public interface JwtService {
    String toToken(Usuario usuario);
    Optional<Long> getIdFromToken(String token);
    SituacaoToken verificaTempoExpirado(String token);
    SituacaoToken identificaSituacaoToken(Date horaAtual, Date horarioExpiracao, Date horarioRefresh);
    Date getHorarioRefresh(Date horaExpiracao, int sessionTime, int refreshTime);
}
