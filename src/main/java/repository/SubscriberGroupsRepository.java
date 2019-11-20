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

import domain.SubscriberGroups;

public interface SubscriberGroupsRepository extends CrudRepository<SubscriberGroups, Long> {

	@Query("SELECT sg.subscriber_group_id, sg.subscriber_group_name, sg.subscriber_group_description FROM SubscriberGroups as sg WHERE sg.subscriber_group_id = ?1")
	List<SubscriberGroups> findById(Integer subscriber_group_id);

	@Transactional
	@Modifying
	@Query("DELETE FROM SubscriberGroups WHERE subscriber_group_id = ?1")
	void deleteById(Integer id);
}
