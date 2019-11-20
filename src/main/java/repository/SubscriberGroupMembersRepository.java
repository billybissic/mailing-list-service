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

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import domain.Subscriber;
import domain.SubscriberGroupMembers;
import domain.SubscriberGroups;

public interface SubscriberGroupMembersRepository extends CrudRepository<SubscriberGroupMembers, Integer> {

	/*@Query("SELECT s.subscriberId, s.subscriberEmail, s.firstName, s.lastName, s.birthDay "
			+ "FROM Subscribers s,"
			+ " SubscriberGroupMembers sgm"
			+ " WHERE s.subscriberId = sgm.subscriberId"
			+ " AND sgm.subscriberGroupId = ?1")
	Iterable<Subscribers> subscribersOfGroup(Integer subscriberGroupId);*/
	
	/*@Query("SELECT subscriberGroupId, subscriberId FROM SubscriberGroupMembers WHERE subscriberGroupId = ?1")
	Iterable<SubscriberGroupMembers> subscribersOfGroup(Integer subscriberGroupId);*/

	@Transactional
	@Modifying
	@Query("DELETE FROM SubscriberGroupMembers WHERE subscriberGroupId = ?1 AND subscriberId = ?2")
	void deleteById(Integer subscriberGroupId, Integer subscriberId);

	@Query("SELECT subscriberId FROM SubscriberGroupMembers") 
	Iterable<Integer> findMemberIds();
}
