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

import org.hibernate.annotations.DynamicInsert;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_equipo_dental")
@DynamicInsert
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
@Getter
@Setter


public class Equipo_Dental {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "nro_equipo" )
	@EqualsAndHashCode.Include
	private int idEquipo;
	
	@Column(name = "nombre", nullable = false, length = 100)
	private String nombre;
	
	@Column(name = "costo", nullable = false)
	private Double costo;
	
	@Column(name = "fecha_adquisicion", nullable = false, columnDefinition = "DATATIME DEFAULT CURRENT_TIMESTAMP")
	private LocalDate fec_adq;
	
	@Column(name = "estado", nullable = false, length = 1)
	private String estado;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_dentista")
	private Dentista dentista;
	
	
	

}
