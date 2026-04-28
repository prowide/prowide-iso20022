
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
 * Information about a switch leg that is rejected or repaired.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwitchLegReferences2", propOrder = {
    "legId",
    "legRjctnRsn",
    "rprdFee",
    "invstmtAcctDtls",
    "finInstrmDtls"
})
public class SwitchLegReferences2 {

    @XmlElement(name = "LegId", required = true)
    protected LegIdentification1Choice legId;
    @XmlElement(name = "LegRjctnRsn")
    protected String legRjctnRsn;
    @XmlElement(name = "RprdFee")
    protected List<Fee3> rprdFee;
    @XmlElement(name = "InvstmtAcctDtls")
    protected InvestmentAccount58 invstmtAcctDtls;
    @XmlElement(name = "FinInstrmDtls")
    protected FinancialInstrument57 finInstrmDtls;

    /**
     * Gets the value of the legId property.
     * 
     * @return
     *     possible object is
     *     {@link LegIdentification1Choice }
     *     
     */
    public LegIdentification1Choice getLegId() {
        return legId;
    }

    /**
     * Sets the value of the legId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegIdentification1Choice }
     *     
     */
    public SwitchLegReferences2 setLegId(LegIdentification1Choice value) {
        this.legId = value;
        return this;
    }

    /**
     * Gets the value of the legRjctnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegRjctnRsn() {
        return legRjctnRsn;
    }

    /**
     * Sets the value of the legRjctnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwitchLegReferences2 setLegRjctnRsn(String value) {
        this.legRjctnRsn = value;
        return this;
    }

    /**
     * Gets the value of the rprdFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rprdFee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRprdFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fee3 }
     * 
     * 
     */
    public List<Fee3> getRprdFee() {
        if (rprdFee == null) {
            rprdFee = new ArrayList<Fee3>();
        }
        return this.rprdFee;
    }

    /**
     * Gets the value of the invstmtAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount58 }
     *     
     */
    public InvestmentAccount58 getInvstmtAcctDtls() {
        return invstmtAcctDtls;
    }

    /**
     * Sets the value of the invstmtAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount58 }
     *     
     */
    public SwitchLegReferences2 setInvstmtAcctDtls(InvestmentAccount58 value) {
        this.invstmtAcctDtls = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument57 }
     *     
     */
    public FinancialInstrument57 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument57 }
     *     
     */
    public SwitchLegReferences2 setFinInstrmDtls(FinancialInstrument57 value) {
        this.finInstrmDtls = value;
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
     * Adds a new item to the rprdFee list.
     * @see #getRprdFee()
     * 
     */
    public SwitchLegReferences2 addRprdFee(Fee3 rprdFee) {
        getRprdFee().add(rprdFee);
        return this;
    }

}
