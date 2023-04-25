
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.Calendar;
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
 * Provides details about the letter of credit or bank guarantee, or other collateral, posted as collateral.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherCollateral5", propOrder = {
    "collId",
    "lttrOfCdtId",
    "lttrOfCdtAmt",
    "grntAmt",
    "othrTpOfColl",
    "isseDt",
    "xpryDt",
    "ltdCvrgInd",
    "issr",
    "valDt",
    "xchgRate",
    "mktVal",
    "hrcut",
    "collVal",
    "sfkpgPlc",
    "sfkpgAcct"
})
public class OtherCollateral5 {

    @XmlElement(name = "CollId")
    protected String collId;
    @XmlElement(name = "LttrOfCdtId")
    protected String lttrOfCdtId;
    @XmlElement(name = "LttrOfCdtAmt")
    protected ActiveCurrencyAndAmount lttrOfCdtAmt;
    @XmlElement(name = "GrntAmt")
    protected ActiveCurrencyAndAmount grntAmt;
    @XmlElement(name = "OthrTpOfColl")
    protected OtherTypeOfCollateral2 othrTpOfColl;
    @XmlElement(name = "IsseDt")
    protected DateFormat14Choice isseDt;
    @XmlElement(name = "XpryDt")
    protected DateFormat14Choice xpryDt;
    @XmlElement(name = "LtdCvrgInd")
    protected Boolean ltdCvrgInd;
    @XmlElement(name = "Issr")
    protected PartyIdentification100Choice issr;
    @XmlElement(name = "ValDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar valDt;
    @XmlElement(name = "XchgRate")
    protected BigDecimal xchgRate;
    @XmlElement(name = "MktVal")
    protected ActiveCurrencyAndAmount mktVal;
    @XmlElement(name = "Hrcut")
    protected BigDecimal hrcut;
    @XmlElement(name = "CollVal", required = true)
    protected ActiveCurrencyAndAmount collVal;
    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormat10Choice sfkpgPlc;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount19 sfkpgAcct;

    /**
     * Gets the value of the collId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollId() {
        return collId;
    }

    /**
     * Sets the value of the collId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OtherCollateral5 setCollId(String value) {
        this.collId = value;
        return this;
    }

    /**
     * Gets the value of the lttrOfCdtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLttrOfCdtId() {
        return lttrOfCdtId;
    }

    /**
     * Sets the value of the lttrOfCdtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OtherCollateral5 setLttrOfCdtId(String value) {
        this.lttrOfCdtId = value;
        return this;
    }

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
    public OtherCollateral5 setLttrOfCdtAmt(ActiveCurrencyAndAmount value) {
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
    public OtherCollateral5 setGrntAmt(ActiveCurrencyAndAmount value) {
        this.grntAmt = value;
        return this;
    }

    /**
     * Gets the value of the othrTpOfColl property.
     * 
     * @return
     *     possible object is
     *     {@link OtherTypeOfCollateral2 }
     *     
     */
    public OtherTypeOfCollateral2 getOthrTpOfColl() {
        return othrTpOfColl;
    }

    /**
     * Sets the value of the othrTpOfColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherTypeOfCollateral2 }
     *     
     */
    public OtherCollateral5 setOthrTpOfColl(OtherTypeOfCollateral2 value) {
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
    public OtherCollateral5 setIsseDt(DateFormat14Choice value) {
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
    public OtherCollateral5 setXpryDt(DateFormat14Choice value) {
        this.xpryDt = value;
        return this;
    }

    /**
     * Gets the value of the ltdCvrgInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLtdCvrgInd() {
        return ltdCvrgInd;
    }

    /**
     * Sets the value of the ltdCvrgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public OtherCollateral5 setLtdCvrgInd(Boolean value) {
        this.ltdCvrgInd = value;
        return this;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification100Choice }
     *     
     */
    public PartyIdentification100Choice getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification100Choice }
     *     
     */
    public OtherCollateral5 setIssr(PartyIdentification100Choice value) {
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
    public Calendar getValDt() {
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
    public OtherCollateral5 setValDt(Calendar value) {
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
    public OtherCollateral5 setXchgRate(BigDecimal value) {
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
    public OtherCollateral5 setMktVal(ActiveCurrencyAndAmount value) {
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
    public OtherCollateral5 setHrcut(BigDecimal value) {
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
    public OtherCollateral5 setCollVal(ActiveCurrencyAndAmount value) {
        this.collVal = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormat10Choice }
     *     
     */
    public SafekeepingPlaceFormat10Choice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormat10Choice }
     *     
     */
    public OtherCollateral5 setSfkpgPlc(SafekeepingPlaceFormat10Choice value) {
        this.sfkpgPlc = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public OtherCollateral5 setSfkpgAcct(SecuritiesAccount19 value) {
        this.sfkpgAcct = value;
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
