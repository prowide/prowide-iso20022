
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Nature of the reporting counterparty's company activities.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterpartyTradeNature9Choice", propOrder = {
    "fi",
    "nfi",
    "cntrlCntrPty",
    "othr"
})
public class CounterpartyTradeNature9Choice {

    @XmlElement(name = "FI")
    @XmlSchemaType(name = "string")
    protected List<FinancialPartySectorType1Code> fi;
    @XmlElement(name = "NFI")
    protected NonFinancialInstitutionSector4 nfi;
    @XmlElement(name = "CntrlCntrPty")
    @XmlSchemaType(name = "string")
    protected NoReasonCode cntrlCntrPty;
    @XmlElement(name = "Othr")
    @XmlSchemaType(name = "string")
    protected NoReasonCode othr;

    /**
     * Gets the value of the fi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialPartySectorType1Code }
     * 
     * 
     */
    public List<FinancialPartySectorType1Code> getFI() {
        if (fi == null) {
            fi = new ArrayList<FinancialPartySectorType1Code>();
        }
        return this.fi;
    }

    /**
     * Gets the value of the nfi property.
     * 
     * @return
     *     possible object is
     *     {@link NonFinancialInstitutionSector4 }
     *     
     */
    public NonFinancialInstitutionSector4 getNFI() {
        return nfi;
    }

    /**
     * Sets the value of the nfi property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonFinancialInstitutionSector4 }
     *     
     */
    public CounterpartyTradeNature9Choice setNFI(NonFinancialInstitutionSector4 value) {
        this.nfi = value;
        return this;
    }

    /**
     * Gets the value of the cntrlCntrPty property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getCntrlCntrPty() {
        return cntrlCntrPty;
    }

    /**
     * Sets the value of the cntrlCntrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public CounterpartyTradeNature9Choice setCntrlCntrPty(NoReasonCode value) {
        this.cntrlCntrPty = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public CounterpartyTradeNature9Choice setOthr(NoReasonCode value) {
        this.othr = value;
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
     * Adds a new item to the fI list.
     * @see #getFI()
     * 
     */
    public CounterpartyTradeNature9Choice addFI(FinancialPartySectorType1Code fI) {
        getFI().add(fI);
        return this;
    }

}
