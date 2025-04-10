
package com.prowidesoftware.swift.model.mx.dic;

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
 * Elements characterising a financial instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentAttributes89", propOrder = {
    "ctrctSz",
    "dlvryTp",
    "undrlygId",
    "pricCcy"
})
public class FinancialInstrumentAttributes89 {

    @XmlElement(name = "CtrctSz", required = true)
    protected ContractSize1 ctrctSz;
    @XmlElement(name = "DlvryTp", required = true)
    @XmlSchemaType(name = "string")
    protected PhysicalTransferType4Code dlvryTp;
    @XmlElement(name = "UndrlygId", required = true)
    protected GenericIdentification165 undrlygId;
    @XmlElement(name = "PricCcy", required = true)
    protected String pricCcy;

    /**
     * Gets the value of the ctrctSz property.
     * 
     * @return
     *     possible object is
     *     {@link ContractSize1 }
     *     
     */
    public ContractSize1 getCtrctSz() {
        return ctrctSz;
    }

    /**
     * Sets the value of the ctrctSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractSize1 }
     *     
     */
    public FinancialInstrumentAttributes89 setCtrctSz(ContractSize1 value) {
        this.ctrctSz = value;
        return this;
    }

    /**
     * Gets the value of the dlvryTp property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalTransferType4Code }
     *     
     */
    public PhysicalTransferType4Code getDlvryTp() {
        return dlvryTp;
    }

    /**
     * Sets the value of the dlvryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalTransferType4Code }
     *     
     */
    public FinancialInstrumentAttributes89 setDlvryTp(PhysicalTransferType4Code value) {
        this.dlvryTp = value;
        return this;
    }

    /**
     * Gets the value of the undrlygId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification165 }
     *     
     */
    public GenericIdentification165 getUndrlygId() {
        return undrlygId;
    }

    /**
     * Sets the value of the undrlygId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification165 }
     *     
     */
    public FinancialInstrumentAttributes89 setUndrlygId(GenericIdentification165 value) {
        this.undrlygId = value;
        return this;
    }

    /**
     * Gets the value of the pricCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricCcy() {
        return pricCcy;
    }

    /**
     * Sets the value of the pricCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributes89 setPricCcy(String value) {
        this.pricCcy = value;
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

}
