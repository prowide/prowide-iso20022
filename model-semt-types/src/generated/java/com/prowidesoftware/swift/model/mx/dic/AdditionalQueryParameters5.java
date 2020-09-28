
package com.prowidesoftware.swift.model.mx.dic;

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
 * Additional specific query criteria.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalQueryParameters5", propOrder = {
    "sts",
    "rsn",
    "finInstrmId"
})
public class AdditionalQueryParameters5 {

    @XmlElement(name = "Sts")
    protected Status8Choice sts;
    @XmlElement(name = "Rsn")
    protected List<Reason7Choice> rsn;
    @XmlElement(name = "FinInstrmId")
    protected List<SecurityIdentification14> finInstrmId;

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link Status8Choice }
     *     
     */
    public Status8Choice getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status8Choice }
     *     
     */
    public AdditionalQueryParameters5 setSts(Status8Choice value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reason7Choice }
     * 
     * 
     */
    public List<Reason7Choice> getRsn() {
        if (rsn == null) {
            rsn = new ArrayList<Reason7Choice>();
        }
        return this.rsn;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the finInstrmId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinInstrmId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityIdentification14 }
     * 
     * 
     */
    public List<SecurityIdentification14> getFinInstrmId() {
        if (finInstrmId == null) {
            finInstrmId = new ArrayList<SecurityIdentification14>();
        }
        return this.finInstrmId;
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
     * Adds a new item to the rsn list.
     * @see #getRsn()
     * 
     */
    public AdditionalQueryParameters5 addRsn(Reason7Choice rsn) {
        getRsn().add(rsn);
        return this;
    }

    /**
     * Adds a new item to the finInstrmId list.
     * @see #getFinInstrmId()
     * 
     */
    public AdditionalQueryParameters5 addFinInstrmId(SecurityIdentification14 finInstrmId) {
        getFinInstrmId().add(finInstrmId);
        return this;
    }

}
