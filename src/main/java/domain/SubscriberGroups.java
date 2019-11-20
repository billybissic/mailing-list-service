/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package domain;

/**
 * @author Billy Bissic
 *
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SubscriberGroups {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer subscriber_group_id;
	private String subscriber_group_name;
	private String subscriber_group_description;
	/**
	 * @return the subscriber_group_id
	 */
	public Integer getSubscriber_group_id() {
		return subscriber_group_id;
	}
	/**
	 * @param subscriber_group_id the subscriber_group_id to set
	 */
	public void setSubscriber_group_id(Integer subscriber_group_id) {
		this.subscriber_group_id = subscriber_group_id;
	}
	/**
	 * @return the subscriber_group_name
	 */
	public String getSubscriber_group_name() {
		return subscriber_group_name;
	}
	/**
	 * @param subscriber_group_name the subscriber_group_name to set
	 */
	public void setSubscriber_group_name(String subscriber_group_name) {
		this.subscriber_group_name = subscriber_group_name;
	}
	/**
	 * @return the subscriber_group_description
	 */
	public String getSubscriber_group_description() {
		return subscriber_group_description;
	}
	/**
	 * @param subscriber_group_description the subscriber_group_description to set
	 */
	public void setSubscriber_group_description(String subscriber_group_description) {
		this.subscriber_group_description = subscriber_group_description;
	}
}
