
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
 * Provides details on the settlement obligation report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Report2", propOrder = {
    "nonClrMmb",
    "sttlmOblgtnDtls"
})
public class Report2 {

    @XmlElement(name = "NonClrMmb")
    protected List<PartyIdentificationAndAccount31> nonClrMmb;
    @XmlElement(name = "SttlmOblgtnDtls", required = true)
    protected List<SettlementObligation4> sttlmOblgtnDtls;

    /**
     * Gets the value of the nonClrMmb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonClrMmb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonClrMmb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentificationAndAccount31 }
     * 
     * 
     */
    public List<PartyIdentificationAndAccount31> getNonClrMmb() {
        if (nonClrMmb == null) {
            nonClrMmb = new ArrayList<PartyIdentificationAndAccount31>();
        }
        return this.nonClrMmb;
    }

    /**
     * Gets the value of the sttlmOblgtnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sttlmOblgtnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttlmOblgtnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementObligation4 }
     * 
     * 
     */
    public List<SettlementObligation4> getSttlmOblgtnDtls() {
        if (sttlmOblgtnDtls == null) {
            sttlmOblgtnDtls = new ArrayList<SettlementObligation4>();
        }
        return this.sttlmOblgtnDtls;
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
     * Adds a new item to the nonClrMmb list.
     * @see #getNonClrMmb()
     * 
     */
    public Report2 addNonClrMmb(PartyIdentificationAndAccount31 nonClrMmb) {
        getNonClrMmb().add(nonClrMmb);
        return this;
    }

    /**
     * Adds a new item to the sttlmOblgtnDtls list.
     * @see #getSttlmOblgtnDtls()
     * 
     */
    public Report2 addSttlmOblgtnDtls(SettlementObligation4 sttlmOblgtnDtls) {
        getSttlmOblgtnDtls().add(sttlmOblgtnDtls);
        return this;
    }

}
