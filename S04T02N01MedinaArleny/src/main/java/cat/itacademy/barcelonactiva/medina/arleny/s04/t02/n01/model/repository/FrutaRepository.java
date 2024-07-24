package cat.itacademy.barcelonactiva.medina.arleny.s04.t02.n01.model.repository;

import cat.itacademy.barcelonactiva.medina.arleny.s04.t02.n01.model.domain.Fruta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FrutaRepository extends JpaRepository<Fruta, Long> {

}
