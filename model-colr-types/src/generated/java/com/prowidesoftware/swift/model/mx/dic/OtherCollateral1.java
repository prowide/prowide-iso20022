
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
 * Provides details about the letter of credit or bank guarantee, or other collateral, posted as collateral.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherCollateral1", propOrder = {
    "lttrOfCdtAmt",
    "grntAmt",
    "othrTpOfColl",
    "isseDt",
    "xpryDt",
    "issr",
    "valDt",
    "xchgRate",
    "mktVal",
    "hrcut",
    "collVal"
})
public class OtherCollateral1 {

    @XmlElement(name = "LttrOfCdtAmt")
    protected ActiveCurrencyAndAmount lttrOfCdtAmt;
    @XmlElement(name = "GrntAmt")
    protected ActiveCurrencyAndAmount grntAmt;
    @XmlElement(name = "OthrTpOfColl")
    protected OtherTypeOfCollateral1 othrTpOfColl;
    @XmlElement(name = "IsseDt", required = true)
    protected DateFormat14Choice isseDt;
    @XmlElement(name = "XpryDt")
    protected DateFormat14Choice xpryDt;
    @XmlElement(name = "Issr", required = true)
    protected PartyIdentification33Choice issr;
    @XmlElement(name = "ValDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valDt;
    @XmlElement(name = "XchgRate")
    protected BigDecimal xchgRate;
    @XmlElement(name = "MktVal")
    protected ActiveCurrencyAndAmount mktVal;
    @XmlElement(name = "Hrcut")
    protected BigDecimal hrcut;
    @XmlElement(name = "CollVal", required = true)
    protected ActiveCurrencyAndAmount collVal;

    /**
     * Gets the value of the lttrOfCdtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getLttrOfCdtAmt() {
        return lttrOfCdtAmt;
    }

    /**
     * Sets the value of the lttrOfCdtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public OtherCollateral1 setLttrOfCdtAmt(ActiveCurrencyAndAmount value) {
        this.lttrOfCdtAmt = value;
        return this;
    }

    /**
     * Gets the value of the grntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getGrntAmt() {
        return grntAmt;
    }

    /**
     * Sets the value of the grntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public OtherCollateral1 setGrntAmt(ActiveCurrencyAndAmount value) {
        this.grntAmt = value;
        return this;
    }

    /**
     * Gets the value of the othrTpOfColl property.
     * 
     * @return
     *     possible object is
     *     {@link OtherTypeOfCollateral1 }
     *     
     */
    public OtherTypeOfCollateral1 getOthrTpOfColl() {
        return othrTpOfColl;
    }

    /**
     * Sets the value of the othrTpOfColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherTypeOfCollateral1 }
     *     
     */
    public OtherCollateral1 setOthrTpOfColl(OtherTypeOfCollateral1 value) {
        this.othrTpOfColl = value;
        return this;
    }

    /**
     * Gets the value of the isseDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat14Choice }
     *     
     */
    public DateFormat14Choice getIsseDt() {
        return isseDt;
    }

    /**
     * Sets the value of the isseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat14Choice }
     *     
     */
    public OtherCollateral1 setIsseDt(DateFormat14Choice value) {
        this.isseDt = value;
        return this;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat14Choice }
     *     
     */
    public DateFormat14Choice getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat14Choice }
     *     
     */
    public OtherCollateral1 setXpryDt(DateFormat14Choice value) {
        this.xpryDt = value;
        return this;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification33Choice }
     *     
     */
    public PartyIdentification33Choice getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification33Choice }
     *     
     */
    public OtherCollateral1 setIssr(PartyIdentification33Choice value) {
        this.issr = value;
        return this;
    }

    /**
     * Gets the value of the valDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getValDt() {
        return valDt;
    }

    /**
     * Sets the value of the valDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OtherCollateral1 setValDt(XMLGregorianCalendar value) {
        this.valDt = value;
        return this;
    }

    /**
     * Gets the value of the xchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXchgRate() {
        return xchgRate;
    }

    /**
     * Sets the value of the xchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OtherCollateral1 setXchgRate(BigDecimal value) {
        this.xchgRate = value;
        return this;
    }

    /**
     * Gets the value of the mktVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMktVal() {
        return mktVal;
    }

    /**
     * Sets the value of the mktVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public OtherCollateral1 setMktVal(ActiveCurrencyAndAmount value) {
        this.mktVal = value;
        return this;
    }

    /**
     * Gets the value of the hrcut property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHrcut() {
        return hrcut;
    }

    /**
     * Sets the value of the hrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OtherCollateral1 setHrcut(BigDecimal value) {
        this.hrcut = value;
        return this;
    }

    /**
     * Gets the value of the collVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCollVal() {
        return collVal;
    }

    /**
     * Sets the value of the collVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public OtherCollateral1 setCollVal(ActiveCurrencyAndAmount value) {
        this.collVal = value;
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
