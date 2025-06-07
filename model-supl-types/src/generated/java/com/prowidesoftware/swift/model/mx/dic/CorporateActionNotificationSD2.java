
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
 * Provides additional information regarding corporate action notification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionNotificationSD2", propOrder = {
    "plcAndNm",
    "derivWorkflwSts",
    "derivXchg",
    "derivPblctnDt",
    "derivAdjstmntDt",
    "derivClctnMtd",
    "derivFctr",
    "lotSzChngFlg",
    "lotAdjstmntMtd",
    "strkPricChngFlg",
    "strkPricRndgMtd",
    "rsdlCshFlg",
    "refPric",
    "refPricCcy",
    "apprvdFlg"
})
public class CorporateActionNotificationSD2 {

    @XmlElement(name = "PlcAndNm", required = true)
    protected String plcAndNm;
    @XmlElement(name = "DerivWorkflwSts", required = true)
    @XmlSchemaType(name = "string")
    protected DerivativeWorkflowStatus1Code derivWorkflwSts;
    @XmlElement(name = "DerivXchg", required = true)
    protected String derivXchg;
    @XmlElement(name = "DerivPblctnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar derivPblctnDt;
    @XmlElement(name = "DerivAdjstmntDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar derivAdjstmntDt;
    @XmlElement(name = "DerivClctnMtd")
    protected String derivClctnMtd;
    @XmlElement(name = "DerivFctr")
    protected BigDecimal derivFctr;
    @XmlElement(name = "LotSzChngFlg")
    protected Boolean lotSzChngFlg;
    @XmlElement(name = "LotAdjstmntMtd")
    protected String lotAdjstmntMtd;
    @XmlElement(name = "StrkPricChngFlg")
    protected Boolean strkPricChngFlg;
    @XmlElement(name = "StrkPricRndgMtd")
    protected String strkPricRndgMtd;
    @XmlElement(name = "RsdlCshFlg")
    protected Boolean rsdlCshFlg;
    @XmlElement(name = "RefPric")
    protected BigDecimal refPric;
    @XmlElement(name = "RefPricCcy")
    protected String refPricCcy;
    @XmlElement(name = "ApprvdFlg")
    protected Boolean apprvdFlg;

    /**
     * Gets the value of the plcAndNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcAndNm() {
        return plcAndNm;
    }

    /**
     * Sets the value of the plcAndNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionNotificationSD2 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the derivWorkflwSts property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeWorkflowStatus1Code }
     *     
     */
    public DerivativeWorkflowStatus1Code getDerivWorkflwSts() {
        return derivWorkflwSts;
    }

    /**
     * Sets the value of the derivWorkflwSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeWorkflowStatus1Code }
     *     
     */
    public CorporateActionNotificationSD2 setDerivWorkflwSts(DerivativeWorkflowStatus1Code value) {
        this.derivWorkflwSts = value;
        return this;
    }

    /**
     * Gets the value of the derivXchg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDerivXchg() {
        return derivXchg;
    }

    /**
     * Sets the value of the derivXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionNotificationSD2 setDerivXchg(String value) {
        this.derivXchg = value;
        return this;
    }

    /**
     * Gets the value of the derivPblctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getDerivPblctnDt() {
        return derivPblctnDt;
    }

    /**
     * Sets the value of the derivPblctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionNotificationSD2 setDerivPblctnDt(XMLGregorianCalendar value) {
        this.derivPblctnDt = value;
        return this;
    }

    /**
     * Gets the value of the derivAdjstmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getDerivAdjstmntDt() {
        return derivAdjstmntDt;
    }

    /**
     * Sets the value of the derivAdjstmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionNotificationSD2 setDerivAdjstmntDt(XMLGregorianCalendar value) {
        this.derivAdjstmntDt = value;
        return this;
    }

    /**
     * Gets the value of the derivClctnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDerivClctnMtd() {
        return derivClctnMtd;
    }

    /**
     * Sets the value of the derivClctnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionNotificationSD2 setDerivClctnMtd(String value) {
        this.derivClctnMtd = value;
        return this;
    }

    /**
     * Gets the value of the derivFctr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDerivFctr() {
        return derivFctr;
    }

    /**
     * Sets the value of the derivFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CorporateActionNotificationSD2 setDerivFctr(BigDecimal value) {
        this.derivFctr = value;
        return this;
    }

    /**
     * Gets the value of the lotSzChngFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLotSzChngFlg() {
        return lotSzChngFlg;
    }

    /**
     * Sets the value of the lotSzChngFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionNotificationSD2 setLotSzChngFlg(Boolean value) {
        this.lotSzChngFlg = value;
        return this;
    }

    /**
     * Gets the value of the lotAdjstmntMtd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotAdjstmntMtd() {
        return lotAdjstmntMtd;
    }

    /**
     * Sets the value of the lotAdjstmntMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionNotificationSD2 setLotAdjstmntMtd(String value) {
        this.lotAdjstmntMtd = value;
        return this;
    }

    /**
     * Gets the value of the strkPricChngFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStrkPricChngFlg() {
        return strkPricChngFlg;
    }

    /**
     * Sets the value of the strkPricChngFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionNotificationSD2 setStrkPricChngFlg(Boolean value) {
        this.strkPricChngFlg = value;
        return this;
    }

    /**
     * Gets the value of the strkPricRndgMtd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrkPricRndgMtd() {
        return strkPricRndgMtd;
    }

    /**
     * Sets the value of the strkPricRndgMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionNotificationSD2 setStrkPricRndgMtd(String value) {
        this.strkPricRndgMtd = value;
        return this;
    }

    /**
     * Gets the value of the rsdlCshFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRsdlCshFlg() {
        return rsdlCshFlg;
    }

    /**
     * Sets the value of the rsdlCshFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionNotificationSD2 setRsdlCshFlg(Boolean value) {
        this.rsdlCshFlg = value;
        return this;
    }

    /**
     * Gets the value of the refPric property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRefPric() {
        return refPric;
    }

    /**
     * Sets the value of the refPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CorporateActionNotificationSD2 setRefPric(BigDecimal value) {
        this.refPric = value;
        return this;
    }

    /**
     * Gets the value of the refPricCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefPricCcy() {
        return refPricCcy;
    }

    /**
     * Sets the value of the refPricCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionNotificationSD2 setRefPricCcy(String value) {
        this.refPricCcy = value;
        return this;
    }

    /**
     * Gets the value of the apprvdFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApprvdFlg() {
        return apprvdFlg;
    }

    /**
     * Sets the value of the apprvdFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionNotificationSD2 setApprvdFlg(Boolean value) {
        this.apprvdFlg = value;
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
