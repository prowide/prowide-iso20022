
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Set of data specified for the fixing of a non deliverable trade.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClosingData2", propOrder = {
    "tradDt",
    "ntfctnId",
    "cmonRef",
    "rltdRef",
    "amdOrCclRsn",
    "tradAmts",
    "valtnRate",
    "valtnInf"
})
public class ClosingData2 {

    @XmlElement(name = "TradDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate tradDt;
    @XmlElement(name = "NtfctnId", required = true)
    protected String ntfctnId;
    @XmlElement(name = "CmonRef")
    protected String cmonRef;
    @XmlElement(name = "RltdRef")
    protected String rltdRef;
    @XmlElement(name = "AmdOrCclRsn")
    protected String amdOrCclRsn;
    @XmlElement(name = "TradAmts", required = true)
    protected AmountsAndValueDate1 tradAmts;
    @XmlElement(name = "ValtnRate", required = true)
    protected AgreedRate1 valtnRate;
    @XmlElement(name = "ValtnInf", required = true)
    protected ValuationData2 valtnInf;

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClosingData2 setTradDt(LocalDate value) {
        this.tradDt = value;
        return this;
    }

    /**
     * Gets the value of the ntfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtfctnId() {
        return ntfctnId;
    }

    /**
     * Sets the value of the ntfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClosingData2 setNtfctnId(String value) {
        this.ntfctnId = value;
        return this;
    }

    /**
     * Gets the value of the cmonRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmonRef() {
        return cmonRef;
    }

    /**
     * Sets the value of the cmonRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClosingData2 setCmonRef(String value) {
        this.cmonRef = value;
        return this;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClosingData2 setRltdRef(String value) {
        this.rltdRef = value;
        return this;
    }

    /**
     * Gets the value of the amdOrCclRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmdOrCclRsn() {
        return amdOrCclRsn;
    }

    /**
     * Sets the value of the amdOrCclRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClosingData2 setAmdOrCclRsn(String value) {
        this.amdOrCclRsn = value;
        return this;
    }

    /**
     * Gets the value of the tradAmts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountsAndValueDate1 }
     *     
     */
    public AmountsAndValueDate1 getTradAmts() {
        return tradAmts;
    }

    /**
     * Sets the value of the tradAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountsAndValueDate1 }
     *     
     */
    public ClosingData2 setTradAmts(AmountsAndValueDate1 value) {
        this.tradAmts = value;
        return this;
    }

    /**
     * Gets the value of the valtnRate property.
     * 
     * @return
     *     possible object is
     *     {@link AgreedRate1 }
     *     
     */
    public AgreedRate1 getValtnRate() {
        return valtnRate;
    }

    /**
     * Sets the value of the valtnRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreedRate1 }
     *     
     */
    public ClosingData2 setValtnRate(AgreedRate1 value) {
        this.valtnRate = value;
        return this;
    }

    /**
     * Gets the value of the valtnInf property.
     * 
     * @return
     *     possible object is
     *     {@link ValuationData2 }
     *     
     */
    public ValuationData2 getValtnInf() {
        return valtnInf;
    }

    /**
     * Sets the value of the valtnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuationData2 }
     *     
     */
    public ClosingData2 setValtnInf(ValuationData2 value) {
        this.valtnInf = value;
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
