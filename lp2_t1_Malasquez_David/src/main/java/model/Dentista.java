package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_dentista")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
@Getter
@Setter


public class Dentista {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_dentista")
	@EqualsAndHashCode.Include
	private int idDentista;
	
	@Column(name = "cop" , nullable = false, length = 6)
	private String Cop;
	
	@Column(name = "nombre_completo", nullable = false, length = 50)
	private String Nom_Com;
	
	@Column(name = "fecha_inicio_contrato", nullable = false)
	private LocalDate FecIniCon;
	
	@Column(name = "turno", nullable = false, length = 1)
	private String Turno;
	
	@Column(name = "correo" , nullable = false, length = 50)
	private String Correo;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_especialidad")
	private Especialidad especialidad;
	
	@Override
    public String toString() {
        return Nom_Com; 
    }
	

}
