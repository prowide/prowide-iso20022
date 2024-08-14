
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides details on transaction and conducting counterparty.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeTransactionIdentification24", propOrder = {
    "techRcrdId",
    "actnTp",
    "rptgTmStmp",
    "derivEvtTp",
    "derivEvtTmStmp",
    "othrCtrPty",
    "unqIdr",
    "mstrAgrmt",
    "collPrtflCd"
})
public class TradeTransactionIdentification24 {

    @XmlElement(name = "TechRcrdId")
    protected String techRcrdId;
    @XmlElement(name = "ActnTp")
    @XmlSchemaType(name = "string")
    protected TransactionOperationType10Code actnTp;
    @XmlElement(name = "RptgTmStmp", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rptgTmStmp;
    @XmlElement(name = "DerivEvtTp")
    @XmlSchemaType(name = "string")
    protected DerivativeEventType3Code derivEvtTp;
    @XmlElement(name = "DerivEvtTmStmp")
    protected DateAndDateTime2Choice derivEvtTmStmp;
    @XmlElement(name = "OthrCtrPty")
    protected PartyIdentification248Choice othrCtrPty;
    @XmlElement(name = "UnqIdr")
    protected UniqueTransactionIdentifier2Choice unqIdr;
    @XmlElement(name = "MstrAgrmt")
    protected MasterAgreement8 mstrAgrmt;
    @XmlElement(name = "CollPrtflCd")
    protected CollateralPortfolioCode5Choice collPrtflCd;

    /**
     * Gets the value of the techRcrdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechRcrdId() {
        return techRcrdId;
    }

    /**
     * Sets the value of the techRcrdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeTransactionIdentification24 setTechRcrdId(String value) {
        this.techRcrdId = value;
        return this;
    }

    /**
     * Gets the value of the actnTp property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionOperationType10Code }
     *     
     */
    public TransactionOperationType10Code getActnTp() {
        return actnTp;
    }

    /**
     * Sets the value of the actnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionOperationType10Code }
     *     
     */
    public TradeTransactionIdentification24 setActnTp(TransactionOperationType10Code value) {
        this.actnTp = value;
        return this;
    }

    /**
     * Gets the value of the rptgTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getRptgTmStmp() {
        return rptgTmStmp;
    }

    /**
     * Sets the value of the rptgTmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeTransactionIdentification24 setRptgTmStmp(XMLGregorianCalendar value) {
        this.rptgTmStmp = value;
        return this;
    }

    /**
     * Gets the value of the derivEvtTp property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeEventType3Code }
     *     
     */
    public DerivativeEventType3Code getDerivEvtTp() {
        return derivEvtTp;
    }

    /**
     * Sets the value of the derivEvtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeEventType3Code }
     *     
     */
    public TradeTransactionIdentification24 setDerivEvtTp(DerivativeEventType3Code value) {
        this.derivEvtTp = value;
        return this;
    }

    /**
     * Gets the value of the derivEvtTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getDerivEvtTmStmp() {
        return derivEvtTmStmp;
    }

    /**
     * Sets the value of the derivEvtTmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public TradeTransactionIdentification24 setDerivEvtTmStmp(DateAndDateTime2Choice value) {
        this.derivEvtTmStmp = value;
        return this;
    }

    /**
     * Gets the value of the othrCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification248Choice }
     *     
     */
    public PartyIdentification248Choice getOthrCtrPty() {
        return othrCtrPty;
    }

    /**
     * Sets the value of the othrCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification248Choice }
     *     
     */
    public TradeTransactionIdentification24 setOthrCtrPty(PartyIdentification248Choice value) {
        this.othrCtrPty = value;
        return this;
    }

    /**
     * Gets the value of the unqIdr property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueTransactionIdentifier2Choice }
     *     
     */
    public UniqueTransactionIdentifier2Choice getUnqIdr() {
        return unqIdr;
    }

    /**
     * Sets the value of the unqIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueTransactionIdentifier2Choice }
     *     
     */
    public TradeTransactionIdentification24 setUnqIdr(UniqueTransactionIdentifier2Choice value) {
        this.unqIdr = value;
        return this;
    }

    /**
     * Gets the value of the mstrAgrmt property.
     * 
     * @return
     *     possible object is
     *     {@link MasterAgreement8 }
     *     
     */
    public MasterAgreement8 getMstrAgrmt() {
        return mstrAgrmt;
    }

    /**
     * Sets the value of the mstrAgrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterAgreement8 }
     *     
     */
    public TradeTransactionIdentification24 setMstrAgrmt(MasterAgreement8 value) {
        this.mstrAgrmt = value;
        return this;
    }

    /**
     * Gets the value of the collPrtflCd property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralPortfolioCode5Choice }
     *     
     */
    public CollateralPortfolioCode5Choice getCollPrtflCd() {
        return collPrtflCd;
    }

    /**
     * Sets the value of the collPrtflCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralPortfolioCode5Choice }
     *     
     */
    public TradeTransactionIdentification24 setCollPrtflCd(CollateralPortfolioCode5Choice value) {
        this.collPrtflCd = value;
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
