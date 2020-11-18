package com.fr.adaming.jsfapp.model;

// Generated 13 nov. 2015 10:42:14 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fr.adaming.jsfapp.utils.IConstants;

/**
 * RefPoint generated by hbm2java
 */
@Entity
@Table(name = "Ref_Point", catalog = IConstants.SCHEMA)
public class RefPoint implements java.io.Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -6992179471636981895L;
	private long idPoint;
	private BigDecimal coef;
	private boolean FActif;
	private boolean isCoef;
	private Set<Intervale> intervales = new HashSet<Intervale>(0);

	public RefPoint() {
	}

	public RefPoint(long idPoint, boolean FActif, boolean isCoef) {
		this.idPoint = idPoint;
		this.FActif = FActif;
		this.isCoef = isCoef;
	}

	public RefPoint(long idPoint, BigDecimal coef, boolean FActif, boolean isCoef, Set<Intervale> intervales) {
		this.idPoint = idPoint;
		this.coef = coef;
		this.FActif = FActif;
		this.isCoef = isCoef;
		this.intervales = intervales;
	}

	@Id
	@Column(name = "ID_POINT", unique = true, nullable = false, precision = 18, scale = 0)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getIdPoint() {
		return this.idPoint;
	}

	public void setIdPoint(long idPoint) {
		this.idPoint = idPoint;
	}

	@Column(name = "COEF", precision = 18, scale = 3)
	public BigDecimal getCoef() {
		return this.coef;
	}

	public void setCoef(BigDecimal coef) {
		this.coef = coef;
	}

	@Column(name = "F_ACTIF", nullable = false)
	public boolean isFActif() {
		return this.FActif;
	}

	public void setFActif(boolean FActif) {
		this.FActif = FActif;
	}

	@Column(name = "IS_COEF", nullable = false)
	public boolean isIsCoef() {
		return this.isCoef;
	}

	public void setIsCoef(boolean isCoef) {
		this.isCoef = isCoef;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "refPoint")
	public Set<Intervale> getIntervales() {
		return this.intervales;
	}

	public void setIntervales(Set<Intervale> intervales) {
		this.intervales = intervales;
	}

}
