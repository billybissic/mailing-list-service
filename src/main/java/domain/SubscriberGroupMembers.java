/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package domain;

import javax.persistence.Column;
/**
 * @author Billy Bissic
 *
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SubscriberGroupMembers {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="subscriber_group_id")
	private Integer subscriberGroupId;
	@Column(name="subscriber_id")
	private Integer subscriberId;
	/**
	 * @return the subscriberGroupId
	 */
	public Integer getSubscriberGroupId() {
		return subscriberGroupId;
	}
	/**
	 * @param subscriberGroupId the subscriberGroupId to set
	 */
	public void setSubscriberGroupId(Integer subscriberGroupId) {
		this.subscriberGroupId = subscriberGroupId;
	}
	/**
	 * @return the subscriberId
	 */
	public Integer getSubscriberId() {
		return subscriberId;
	}
	/**
	 * @param subscriberId the subscriberId to set
	 */
	public void setSubscriberId(Integer subscriberId) {
		this.subscriberId = subscriberId;
	}
}
