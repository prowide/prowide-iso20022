
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
 * Choice of the securities settlement instruction status type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementTransactionStatusType2__1", propOrder = {
    "prcgSts",
    "mtchgSts",
    "sttlmSts",
    "sttld"
})
public class SettlementTransactionStatusType21 {

    @XmlElement(name = "PrcgSts")
    protected List<ProcessingStatus70Choice1> prcgSts;
    @XmlElement(name = "MtchgSts")
    protected List<MatchingStatus27Choice1> mtchgSts;
    @XmlElement(name = "SttlmSts")
    protected List<SettlementStatus26Choice1> sttlmSts;
    @XmlElement(name = "Sttld")
    protected ProprietaryReason41 sttld;

    /**
     * Gets the value of the prcgSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prcgSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrcgSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessingStatus70Choice1 }
     * 
     * 
     * @return
     *     The value of the prcgSts property.
     */
    public List<ProcessingStatus70Choice1> getPrcgSts() {
        if (prcgSts == null) {
            prcgSts = new ArrayList<>();
        }
        return this.prcgSts;
    }

    /**
     * Gets the value of the mtchgSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mtchgSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMtchgSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatchingStatus27Choice1 }
     * 
     * 
     * @return
     *     The value of the mtchgSts property.
     */
    public List<MatchingStatus27Choice1> getMtchgSts() {
        if (mtchgSts == null) {
            mtchgSts = new ArrayList<>();
        }
        return this.mtchgSts;
    }

    /**
     * Gets the value of the sttlmSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sttlmSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttlmSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementStatus26Choice1 }
     * 
     * 
     * @return
     *     The value of the sttlmSts property.
     */
    public List<SettlementStatus26Choice1> getSttlmSts() {
        if (sttlmSts == null) {
            sttlmSts = new ArrayList<>();
        }
        return this.sttlmSts;
    }

    /**
     * Gets the value of the sttld property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason41 }
     *     
     */
    public ProprietaryReason41 getSttld() {
        return sttld;
    }

    /**
     * Sets the value of the sttld property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason41 }
     *     
     */
    public SettlementTransactionStatusType21 setSttld(ProprietaryReason41 value) {
        this.sttld = value;
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
     * Adds a new item to the prcgSts list.
     * @see #getPrcgSts()
     * 
     */
    public SettlementTransactionStatusType21 addPrcgSts(ProcessingStatus70Choice1 prcgSts) {
        getPrcgSts().add(prcgSts);
        return this;
    }

    /**
     * Adds a new item to the mtchgSts list.
     * @see #getMtchgSts()
     * 
     */
    public SettlementTransactionStatusType21 addMtchgSts(MatchingStatus27Choice1 mtchgSts) {
        getMtchgSts().add(mtchgSts);
        return this;
    }

    /**
     * Adds a new item to the sttlmSts list.
     * @see #getSttlmSts()
     * 
     */
    public SettlementTransactionStatusType21 addSttlmSts(SettlementStatus26Choice1 sttlmSts) {
        getSttlmSts().add(sttlmSts);
        return this;
    }

}
