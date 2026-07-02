
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Amount of money due to a party as compensation for a service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Commission25", propOrder = {
    "tp",
    "comssn",
    "rcptId",
    "clctnDt",
    "ttlComssn",
    "ttlVATAmt",
    "vatRate"
})
public class Commission25 {

    @XmlElement(name = "Tp", required = true)
    protected CommissionType6Choice tp;
    @XmlElement(name = "Comssn", required = true)
    protected AmountOrRate2Choice comssn;
    @XmlElement(name = "RcptId")
    protected PartyIdentification267 rcptId;
    @XmlElement(name = "ClctnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar clctnDt;
    @XmlElement(name = "TtlComssn")
    protected AmountAndDirection29 ttlComssn;
    @XmlElement(name = "TtlVATAmt")
    protected ActiveCurrencyAndAmount ttlVATAmt;
    @XmlElement(name = "VATRate")
    protected BigDecimal vatRate;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionType6Choice }
     *     
     */
    public CommissionType6Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType6Choice }
     *     
     */
    public Commission25 setTp(CommissionType6Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the comssn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountOrRate2Choice }
     *     
     */
    public AmountOrRate2Choice getComssn() {
        return comssn;
    }

    /**
     * Sets the value of the comssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountOrRate2Choice }
     *     
     */
    public Commission25 setComssn(AmountOrRate2Choice value) {
        this.comssn = value;
        return this;
    }

    /**
     * Gets the value of the rcptId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification267 }
     *     
     */
    public PartyIdentification267 getRcptId() {
        return rcptId;
    }

    /**
     * Sets the value of the rcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification267 }
     *     
     */
    public Commission25 setRcptId(PartyIdentification267 value) {
        this.rcptId = value;
        return this;
    }

    /**
     * Gets the value of the clctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getClctnDt() {
        return clctnDt;
    }

    /**
     * Sets the value of the clctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Commission25 setClctnDt(XMLGregorianCalendar value) {
        this.clctnDt = value;
        return this;
    }

    /**
     * Gets the value of the ttlComssn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getTtlComssn() {
        return ttlComssn;
    }

    /**
     * Sets the value of the ttlComssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public Commission25 setTtlComssn(AmountAndDirection29 value) {
        this.ttlComssn = value;
        return this;
    }

    /**
     * Gets the value of the ttlVATAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlVATAmt() {
        return ttlVATAmt;
    }

    /**
     * Sets the value of the ttlVATAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Commission25 setTtlVATAmt(ActiveCurrencyAndAmount value) {
        this.ttlVATAmt = value;
        return this;
    }

    /**
     * Gets the value of the vatRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVATRate() {
        return vatRate;
    }

    /**
     * Sets the value of the vatRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Commission25 setVATRate(BigDecimal value) {
        this.vatRate = value;
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
