
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
 * Provides the status of settlement of a transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementStatus27Choice", propOrder = {
    "prtlSttlm",
    "sttld",
    "usttld",
    "prtry"
})
public class SettlementStatus27Choice {

    @XmlElement(name = "PrtlSttlm")
    protected List<ProprietaryReason4> prtlSttlm;
    @XmlElement(name = "Sttld")
    protected List<ProprietaryReason4> sttld;
    @XmlElement(name = "Usttld")
    protected List<ProprietaryReason4> usttld;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason6 prtry;

    /**
     * Gets the value of the prtlSttlm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prtlSttlm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtlSttlm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProprietaryReason4 }
     * 
     * 
     */
    public List<ProprietaryReason4> getPrtlSttlm() {
        if (prtlSttlm == null) {
            prtlSttlm = new ArrayList<ProprietaryReason4>();
        }
        return this.prtlSttlm;
    }

    /**
     * Gets the value of the sttld property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sttld property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttld().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProprietaryReason4 }
     * 
     * 
     */
    public List<ProprietaryReason4> getSttld() {
        if (sttld == null) {
            sttld = new ArrayList<ProprietaryReason4>();
        }
        return this.sttld;
    }

    /**
     * Gets the value of the usttld property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usttld property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsttld().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProprietaryReason4 }
     * 
     * 
     */
    public List<ProprietaryReason4> getUsttld() {
        if (usttld == null) {
            usttld = new ArrayList<ProprietaryReason4>();
        }
        return this.usttld;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public ProprietaryStatusAndReason6 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public SettlementStatus27Choice setPrtry(ProprietaryStatusAndReason6 value) {
        this.prtry = value;
        return this;
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
     * Adds a new item to the prtlSttlm list.
     * @see #getPrtlSttlm()
     * 
     */
    public SettlementStatus27Choice addPrtlSttlm(ProprietaryReason4 prtlSttlm) {
        getPrtlSttlm().add(prtlSttlm);
        return this;
    }

    /**
     * Adds a new item to the sttld list.
     * @see #getSttld()
     * 
     */
    public SettlementStatus27Choice addSttld(ProprietaryReason4 sttld) {
        getSttld().add(sttld);
        return this;
    }

    /**
     * Adds a new item to the usttld list.
     * @see #getUsttld()
     * 
     */
    public SettlementStatus27Choice addUsttld(ProprietaryReason4 usttld) {
        getUsttld().add(usttld);
        return this;
    }

}
