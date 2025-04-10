
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, eg, dividend option or valuation currency.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrument18", propOrder = {
    "id",
    "nm",
    "srsIsseIdDt",
    "srsNm",
    "newIsseInd",
    "splmtryId"
})
public class FinancialInstrument18 {

    @XmlElement(name = "Id", required = true)
    protected SecurityIdentification9 id;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "SrsIsseIdDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar srsIsseIdDt;
    @XmlElement(name = "SrsNm")
    protected String srsNm;
    @XmlElement(name = "NewIsseInd")
    protected Boolean newIsseInd;
    @XmlElement(name = "SplmtryId")
    protected String splmtryId;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification9 }
     *     
     */
    public SecurityIdentification9 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification9 }
     *     
     */
    public FinancialInstrument18 setId(SecurityIdentification9 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrument18 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the srsIsseIdDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getSrsIsseIdDt() {
        return srsIsseIdDt;
    }

    /**
     * Sets the value of the srsIsseIdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrument18 setSrsIsseIdDt(XMLGregorianCalendar value) {
        this.srsIsseIdDt = value;
        return this;
    }

    /**
     * Gets the value of the srsNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrsNm() {
        return srsNm;
    }

    /**
     * Sets the value of the srsNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrument18 setSrsNm(String value) {
        this.srsNm = value;
        return this;
    }

    /**
     * Gets the value of the newIsseInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewIsseInd() {
        return newIsseInd;
    }

    /**
     * Sets the value of the newIsseInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrument18 setNewIsseInd(Boolean value) {
        this.newIsseInd = value;
        return this;
    }

    /**
     * Gets the value of the splmtryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSplmtryId() {
        return splmtryId;
    }

    /**
     * Sets the value of the splmtryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrument18 setSplmtryId(String value) {
        this.splmtryId = value;
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
