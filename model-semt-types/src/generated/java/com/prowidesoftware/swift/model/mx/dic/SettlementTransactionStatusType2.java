
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
@XmlType(name = "SettlementTransactionStatusType2", propOrder = {
    "prcgSts",
    "ifrrdMtchgSts",
    "mtchgSts",
    "sttlmSts",
    "sttld"
})
public class SettlementTransactionStatusType2 {

    @XmlElement(name = "PrcgSts")
    protected List<ProcessingStatus70Choice> prcgSts;
    @XmlElement(name = "IfrrdMtchgSts")
    protected List<MatchingStatus27Choice> ifrrdMtchgSts;
    @XmlElement(name = "MtchgSts")
    protected List<MatchingStatus27Choice> mtchgSts;
    @XmlElement(name = "SttlmSts")
    protected List<SettlementStatus26Choice> sttlmSts;
    @XmlElement(name = "Sttld")
    protected ProprietaryReason4 sttld;

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
     * {@link ProcessingStatus70Choice }
     * 
     * 
     * @return
     *     The value of the prcgSts property.
     */
    public List<ProcessingStatus70Choice> getPrcgSts() {
        if (prcgSts == null) {
            prcgSts = new ArrayList<>();
        }
        return this.prcgSts;
    }

    /**
     * Gets the value of the ifrrdMtchgSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ifrrdMtchgSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIfrrdMtchgSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatchingStatus27Choice }
     * 
     * 
     * @return
     *     The value of the ifrrdMtchgSts property.
     */
    public List<MatchingStatus27Choice> getIfrrdMtchgSts() {
        if (ifrrdMtchgSts == null) {
            ifrrdMtchgSts = new ArrayList<>();
        }
        return this.ifrrdMtchgSts;
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
     * {@link MatchingStatus27Choice }
     * 
     * 
     * @return
     *     The value of the mtchgSts property.
     */
    public List<MatchingStatus27Choice> getMtchgSts() {
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
     * {@link SettlementStatus26Choice }
     * 
     * 
     * @return
     *     The value of the sttlmSts property.
     */
    public List<SettlementStatus26Choice> getSttlmSts() {
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
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getSttld() {
        return sttld;
    }

    /**
     * Sets the value of the sttld property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public SettlementTransactionStatusType2 setSttld(ProprietaryReason4 value) {
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
    public SettlementTransactionStatusType2 addPrcgSts(ProcessingStatus70Choice prcgSts) {
        getPrcgSts().add(prcgSts);
        return this;
    }

    /**
     * Adds a new item to the ifrrdMtchgSts list.
     * @see #getIfrrdMtchgSts()
     * 
     */
    public SettlementTransactionStatusType2 addIfrrdMtchgSts(MatchingStatus27Choice ifrrdMtchgSts) {
        getIfrrdMtchgSts().add(ifrrdMtchgSts);
        return this;
    }

    /**
     * Adds a new item to the mtchgSts list.
     * @see #getMtchgSts()
     * 
     */
    public SettlementTransactionStatusType2 addMtchgSts(MatchingStatus27Choice mtchgSts) {
        getMtchgSts().add(mtchgSts);
        return this;
    }

    /**
     * Adds a new item to the sttlmSts list.
     * @see #getSttlmSts()
     * 
     */
    public SettlementTransactionStatusType2 addSttlmSts(SettlementStatus26Choice sttlmSts) {
        getSttlmSts().add(sttlmSts);
        return this;
    }

}
