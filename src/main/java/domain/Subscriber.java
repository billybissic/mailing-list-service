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
import javax.persistence.EntityResult;
import javax.persistence.FieldResult;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

@Entity
@Table(name = "subscribers")
public class Subscriber {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "subscriber_id")
	private Integer subscriberId;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "birth_day")
	private String birthDay;
	@Column(name = "subscriber_email")
	private String subscriberEmail;
	
	public Subscriber() {}
	
	public Subscriber(Integer subscriberId, String firstName, String lastName, String birthDay, String subscriberEmail) {
		this.setSubscriberId(subscriberId);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setBirthDay(birthDay);
		this.setSubscriberEmail(subscriberEmail);
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
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the birthDay
	 */
	public String getBirthDay() {
		return birthDay;
	}
	/**
	 * @param birthDay the birthDay to set
	 */
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	/**
	 * @return the subscriberEmail
	 */
	public String getSubscriberEmail() {
		return subscriberEmail;
	}
	/**
	 * @param subscriberEmail the subscriberEmail to set
	 */
	public void setSubscriberEmail(String subscriberEmail) {
		this.subscriberEmail = subscriberEmail;
	}
}
