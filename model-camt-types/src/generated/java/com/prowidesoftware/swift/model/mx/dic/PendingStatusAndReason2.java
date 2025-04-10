
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
 * Choice of the intra-balance movement status type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PendingStatusAndReason2", propOrder = {
    "prcgSts",
    "sttlmSts"
})
public class PendingStatusAndReason2 {

    @XmlElement(name = "PrcgSts")
    protected List<ProcessingStatus66Choice> prcgSts;
    @XmlElement(name = "SttlmSts")
    protected List<SettlementStatus16Choice> sttlmSts;

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
     * {@link ProcessingStatus66Choice }
     * 
     * 
     * @return
     *     The value of the prcgSts property.
     */
    public List<ProcessingStatus66Choice> getPrcgSts() {
        if (prcgSts == null) {
            prcgSts = new ArrayList<>();
        }
        return this.prcgSts;
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
     * {@link SettlementStatus16Choice }
     * 
     * 
     * @return
     *     The value of the sttlmSts property.
     */
    public List<SettlementStatus16Choice> getSttlmSts() {
        if (sttlmSts == null) {
            sttlmSts = new ArrayList<>();
        }
        return this.sttlmSts;
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
    public PendingStatusAndReason2 addPrcgSts(ProcessingStatus66Choice prcgSts) {
        getPrcgSts().add(prcgSts);
        return this;
    }

    /**
     * Adds a new item to the sttlmSts list.
     * @see #getSttlmSts()
     * 
     */
    public PendingStatusAndReason2 addSttlmSts(SettlementStatus16Choice sttlmSts) {
        getSttlmSts().add(sttlmSts);
        return this;
    }

}
