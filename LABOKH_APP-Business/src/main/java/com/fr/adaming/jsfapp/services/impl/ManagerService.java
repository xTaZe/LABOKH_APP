package com.fr.adaming.jsfapp.services.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.fr.adaming.jsfapp.model.Journal;
import com.fr.adaming.jsfapp.services.IManagerService;

public class ManagerService<T> implements IManagerService<T> {

	@Autowired
	@Qualifier("managerDao")
	private com.fr.adaming.jsfapp.dao.IManagerDao<T> managerDao;

	/**
	 * cette méthode consiste à créer ou modifier une entité
	 * 
	 * @param entity
	 *            l'entité
	 * @param journal
	 *            le journal
	 * @return retourner l'entité créée ou modifiée
	 */
	public T saveOrUpdateService(T entity, Journal journal) {
		return managerDao.saveOrUpdate(entity, journal);

	}

	public void persist(T entity, Journal journal) {
		managerDao.persist(entity, journal);
	}

	/**
	 * cette méthode consiste à supprimer une entité
	 * 
	 * @param entity
	 *            l'entité
	 * @param journal
	 *            le journal
	 */
	public void deleteService(T entity, Journal journal) {
		managerDao.delete(entity, journal);
	}

	/**
	 * cette méthode consiste à récupérer une entité à partir de son identifiant
	 * 
	 * @param clazz
	 *            l'entité classe
	 * @param id
	 *            l'identifiant de l'entité
	 * @param journal
	 *            le journal
	 * @return retourner l'entité récupérée à patir de son identifiant
	 */
	public T findByIDService(Class<?> clazz, Long id, Journal journal) {

		return managerDao.findByID(clazz, id, journal);
	}

	/**
	 * cette méthode consiste à récupérer une entité à partir d'une requete SQL
	 * 
	 * @param query
	 *            la requete
	 * @param journal
	 *            le journal
	 * @return retourner l'entité récupérée à partir de la requete entrée
	 */
	public T findOneService(String query, Journal journal) {
		return managerDao.findOne(query, journal);
	}

	/**
	 * cette méthode consiste à récupérer une liste d'enregistrement d'une
	 * entité à partir d'une requete SQL
	 * 
	 * @param query
	 *            la requete
	 * @param journal
	 *            le journa
	 * @return retourner la liste d'enregistrement d'une entité à partir de la
	 *         requete entrée
	 */
	public List<T> findManyService(Query query, Journal journal) {

		return managerDao.findMany(query, journal);
	}

	/**
	 * cette méthode consiste à récupérer tous les enregistrements de l'entité
	 * passée en paramètre
	 * 
	 * @param clazz
	 *            l'entité classe
	 * @param journal
	 *            le journal
	 * @return retourner la liste de tous les enregistrements de l'entité passée
	 *         en paramètre
	 */
	public List<T> findAll(Class<?> clazz, Journal journal) {
		return managerDao.findAll(clazz, journal);
	}

	/**
	 * cette méthode consiste à récupérer une entité à patir de la propriété et
	 * la valeur passées en paramètre
	 * 
	 * @param clazz
	 *            l'entité
	 * @param proprety
	 *            la propriété à vérifier
	 * @param value
	 *            la valeur que doit prendre la propriété
	 * @return retourner l'entité récupérée
	 */
	@Override
	public T getEntityByProprety(Class<?> clazz, String proprety, String value) {
		return managerDao.getEntityByProprety(clazz, proprety, value);
	}

}
