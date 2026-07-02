
package com.prowidesoftware.swift.model.mx.sys.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for SessionInfo complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionInfo", propOrder = {
    "userDN",
    "snlId",
    "sessionMode",
    "snFSessionId",
    "queue",
    "subset"
})
public class SwSessionInfo {

    @XmlElement(name = "UserDN", namespace = "urn:swift:snl:ns.SwSec", required = true)
    protected String userDN;
    @XmlElement(name = "SNLId", namespace = "urn:swift:snl:ns.SwInt", required = true)
    protected String snlId;
    @XmlElement(name = "SessionMode", required = true)
    protected String sessionMode;
    @XmlElement(name = "SnFSessionId")
    protected String snFSessionId;
    @XmlElement(name = "Queue", namespace = "urn:swift:snl:ns.SwInt")
    protected String queue;
    @XmlElement(name = "Subset")
    protected List<String> subset;

    /**
     * Gets the value of the userDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDN() {
        return userDN;
    }

    /**
     * Sets the value of the userDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSessionInfo setUserDN(String value) {
        this.userDN = value;
        return this;
    }

    /**
     * Gets the value of the snlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNLId() {
        return snlId;
    }

    /**
     * Sets the value of the snlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSessionInfo setSNLId(String value) {
        this.snlId = value;
        return this;
    }

    /**
     * Gets the value of the sessionMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionMode() {
        return sessionMode;
    }

    /**
     * Sets the value of the sessionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSessionInfo setSessionMode(String value) {
        this.sessionMode = value;
        return this;
    }

    /**
     * Gets the value of the snFSessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnFSessionId() {
        return snFSessionId;
    }

    /**
     * Sets the value of the snFSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSessionInfo setSnFSessionId(String value) {
        this.snFSessionId = value;
        return this;
    }

    /**
     * Gets the value of the queue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueue() {
        return queue;
    }

    /**
     * Sets the value of the queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwSessionInfo setQueue(String value) {
        this.queue = value;
        return this;
    }

    /**
     * Gets the value of the subset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubset() {
        if (subset == null) {
            subset = new ArrayList<String>();
        }
        return this.subset;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * Adds a new item to the subset list.
     * @see #getSubset()
     * 
     */
    public SwSessionInfo addSubset(String subset) {
        getSubset().add(subset);
        return this;
    }

}
