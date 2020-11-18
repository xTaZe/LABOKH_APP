package com.fr.adaming.jsfapp.model;

// Generated 13 nov. 2015 10:42:14 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fr.adaming.jsfapp.utils.IConstants;

/**
 * Intervale generated by hbm2java
 */
@Entity
@Table(name = "intervale", catalog = IConstants.SCHEMA)
public class Intervale implements java.io.Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -8331893523326042230L;
	private long idIntervale;
	private RefPoint refPoint;
	private Long min;
	private Long max;
	private Long nbPonts;
	private Boolean FActif;

	public Intervale() {
	}

	public Intervale(long idIntervale) {
		this.idIntervale = idIntervale;
	}

	public Intervale(long idIntervale, RefPoint refPoint, Long min, Long max, Long nbPoints, Boolean FActif) {
		this.idIntervale = idIntervale;
		this.refPoint = refPoint;
		this.min = min;
		this.max = max;
		this.nbPonts = nbPoints;
		this.FActif = FActif;
	}

	@Id
	@Column(name = "ID_INTERVALE", unique = true, nullable = false, precision = 18, scale = 0)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getIdIntervale() {
		return this.idIntervale;
	}

	public void setIdIntervale(long idIntervale) {
		this.idIntervale = idIntervale;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_POINT")
	public RefPoint getRefPoint() {
		return this.refPoint;
	}

	public void setRefPoint(RefPoint refPoint) {
		this.refPoint = refPoint;
	}

	@Column(name = "MIN", precision = 18, scale = 0)
	public Long getMin() {
		return this.min;
	}

	public void setMin(Long min) {
		this.min = min;
	}

	@Column(name = "F_ACTIF")
	public Boolean getFActif() {
		return this.FActif;
	}

	public void setFActif(Boolean FActif) {
		this.FActif = FActif;
	}

	@Column(name = "MAX", precision = 18, scale = 0)
	public Long getMax() {
		return this.max;
	}

	public void setMax(Long max) {
		this.max = max;
	}

	@Column(name = "NB_PONTS", precision = 18, scale = 0)
	public Long getNbPonts() {
		return this.nbPonts;
	}

	public void setNbPonts(Long nbPonts) {
		this.nbPonts = nbPonts;
	}

	@Override
	public String toString() {
		return "Intervale [idIntervale=" + idIntervale + ", refPoint=" + refPoint + ", min=" + min + ", max=" + max
				+ ", nbPonts=" + nbPonts + ", FActif=" + FActif + "]";
	}

}