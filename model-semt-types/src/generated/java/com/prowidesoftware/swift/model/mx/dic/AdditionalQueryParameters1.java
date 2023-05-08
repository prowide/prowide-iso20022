
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "AdditionalQueryParameters1", propOrder = {
    "sts",
    "rsn",
    "finInstrmId"
})
public class AdditionalQueryParameters1 {

    @XmlElement(name = "Sts")
    protected Status1Choice sts;
    @XmlElement(name = "Rsn")
    protected List<Reason1Choice> rsn;
    @XmlElement(name = "FinInstrmId")
    protected List<SecurityIdentification11> finInstrmId;

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link Status1Choice }
     *     
     */
    public Status1Choice getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status1Choice }
     *     
     */
    public AdditionalQueryParameters1 setSts(Status1Choice value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rsn property.
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
     * {@link Reason1Choice }
     * 
     * 
     * @return
     *     The value of the rsn property.
     */
    public List<Reason1Choice> getRsn() {
        if (rsn == null) {
            rsn = new ArrayList<>();
        }
        return this.rsn;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the finInstrmId property.
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
     * {@link SecurityIdentification11 }
     * 
     * 
     * @return
     *     The value of the finInstrmId property.
     */
    public List<SecurityIdentification11> getFinInstrmId() {
        if (finInstrmId == null) {
            finInstrmId = new ArrayList<>();
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
    public AdditionalQueryParameters1 addRsn(Reason1Choice rsn) {
        getRsn().add(rsn);
        return this;
    }

    /**
     * Adds a new item to the finInstrmId list.
     * @see #getFinInstrmId()
     * 
     */
    public AdditionalQueryParameters1 addFinInstrmId(SecurityIdentification11 finInstrmId) {
        getFinInstrmId().add(finInstrmId);
        return this;
    }

}
