package com.nttdata.spring.repository;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase de la entidad Idioma
 * 
 * @author Manoli
 *
 */
@Entity
@Table(name = "T_LANGUAGE")
public class Language implements Serializable {

	/** Serial version **/
	private static final long serialVersionUID = 1L;

	/** Identificador (PK) **/
	private Long languageId;

	/** Nombre del idioma. **/
	private String name;

	/** Mensaje. **/
	private String message;
	
	/**
	 * @return the languageId
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	public Long getLanguageId() {
		return languageId;
	}

	/**
	 * @param languageId the languageId to set
	 */
	public void setLanguageId(Long languageId) {
		this.languageId = languageId;
	}

	/**
	 * @return the name
	 */
	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the message
	 */
	@Column(name = "MESSAGE")
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Language [languageId=" + languageId + ", name=" + name + ", message=" + message + "]";
	}
}
