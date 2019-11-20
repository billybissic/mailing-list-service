/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package repository;

/**
 * @author Billy Bissic
 *
 */
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import domain.Subscriber;


public interface SubscriberRepository extends CrudRepository<Subscriber, Integer> {

	@Query("SELECT s.subscriberEmail FROM Subscriber s WHERE s.subscriberEmail = ?1")
	List<Subscriber> findBySubscriberEmail(String email);

	@Query("SELECT s.subscriberId, s.firstName, s.lastName, s.subscriberEmail, s.birthDay FROM Subscriber s WHERE s.subscriberId = ?1")
	Subscriber findById(Integer subscriber_id);

	@Transactional
	@Modifying
	@Query("DELETE FROM Subscriber WHERE subscriberId = ?1")
	void deleteById(Integer id);

	@Query("SELECT s.subscriberId, s.firstName, s.lastName, s.subscriberEmail, s.birthDay "
			+ "FROM Subscriber s WHERE s.subscriberId NOT IN ( SELECT subscriberId FROM SubscriberGroupMembers)")
	Iterable<Subscriber> findUnAssignedSubscribers();

	/* TODO: needs more research on the named query to allow for NOT IN clause support */
	/*@Query( value = "SELECT s.subscriber_id, s.first_name, s.last_name, s.subscriber_email, s.birth_day  "
		          + "  FROM Subscribers s,               "
		          + " WHERE s.subscriber_id IN (     "
		          + "SELECT sgm.subcriber_id             "
		          + "  FROM SubscriberGroupMembers sgm)  ")
	Iterable<SubscriberGroups> findUnAssignedSubscribers();*/

		//CriteriaBuilder builder = em.getCriteriaBuilder();
	
		/* build query */
		//CriteriaQuery<Subscribers> q = builder.createQuery(Subscribers.class);
		//Root<Subscribers> root = q.from(Subscribers.class);
		
		//TypedQuery<Subscribers> query = em.createQuery(q);
		//Iterable<Subscribers> subscribers = query.getResultList();
	
	@Query("SELECT s.subscriberId, s.firstName, s.lastName, s.birthDay, s.subscriberEmail "
			+ "FROM Subscriber s,"
			+ " SubscriberGroupMembers sgm"
			+ " WHERE s.subscriberId = sgm.subscriberId"
			+ " AND sgm.subscriberGroupId = ?1")
	Iterable<Subscriber> subscribersOfGroup(Integer subscriberGroupId);
}

