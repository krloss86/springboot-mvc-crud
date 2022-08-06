package com.educacionit.springmvc.domain;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="cupones")
public class Cupones {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nombre",length = 100, nullable = false)
	private String nombre;
	
	@Column(name="codigo")
	private String codigo;
	
	@Min(value=0)
	@Max(value=100)
	@Column(name="descuento")
	private Float descuento;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="fecha_vigencia_desde",nullable = false)
	private Date fechaVigenciaDesde;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="fecha_vigencia_hasta", nullable = true)
	private Date fechaVigenciaHasta;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Float getDescuento() {
		return descuento;
	}

	public void setDescuento(Float descuento) {
		this.descuento = descuento;
	}

	public Date getFechaVigenciaDesde() {
		return fechaVigenciaDesde;
	}

	public void setFechaVigenciaDesde(Date fechaVigenciaDesde) {
		this.fechaVigenciaDesde = fechaVigenciaDesde;
	}

	public Date getFechaVigenciaHasta() {
		return fechaVigenciaHasta;
	}

	public void setFechaVigenciaHasta(Date fechaVigenciaHasta) {
		this.fechaVigenciaHasta = fechaVigenciaHasta;
	}

	@Override
	public String toString() {
		return "Cupones [id=" + id + ", nombre=" + nombre + ", codigo=" + codigo + ", descuento=" + descuento
				+ ", fechaVigenciaDesde=" + fechaVigenciaDesde + ", fechaVigenciaHasta=" + fechaVigenciaHasta + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, descuento, fechaVigenciaDesde, fechaVigenciaHasta, id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cupones other = (Cupones) obj;
		return Objects.equals(codigo, other.codigo) && Objects.equals(descuento, other.descuento)
				&& Objects.equals(fechaVigenciaDesde, other.fechaVigenciaDesde)
				&& Objects.equals(fechaVigenciaHasta, other.fechaVigenciaHasta) && Objects.equals(id, other.id)
				&& Objects.equals(nombre, other.nombre);
	}
	
}
