
package com.prowidesoftware.swift.model.mx.dic;

import java.util.Calendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
 * Set of information related to the cancellation request, such as actors involved and identification of the original multiple invoice financing request to which the cancellation request is referring.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancellationRequestInformation1", propOrder = {
    "orgnlGrpId",
    "orgnlCreDtTm",
    "nbOfInvcReqs",
    "ttlBlkInvcAmt",
    "cxlRsn",
    "fincgRqstr",
    "intrmyAgt",
    "frstAgt"
})
public class CancellationRequestInformation1 {

    @XmlElement(name = "OrgnlGrpId", required = true)
    protected String orgnlGrpId;
    @XmlElement(name = "OrgnlCreDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar orgnlCreDtTm;
    @XmlElement(name = "NbOfInvcReqs")
    protected String nbOfInvcReqs;
    @XmlElement(name = "TtlBlkInvcAmt")
    protected ActiveCurrencyAndAmount ttlBlkInvcAmt;
    @XmlElement(name = "CxlRsn", required = true)
    protected String cxlRsn;
    @XmlElement(name = "FincgRqstr")
    protected PartyIdentificationAndAccount6 fincgRqstr;
    @XmlElement(name = "IntrmyAgt")
    protected FinancialInstitutionIdentification6 intrmyAgt;
    @XmlElement(name = "FrstAgt")
    protected FinancialInstitutionIdentification6 frstAgt;

    /**
     * Gets the value of the orgnlGrpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlGrpId() {
        return orgnlGrpId;
    }

    /**
     * Sets the value of the orgnlGrpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CancellationRequestInformation1 setOrgnlGrpId(String value) {
        this.orgnlGrpId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlCreDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getOrgnlCreDtTm() {
        return orgnlCreDtTm;
    }

    /**
     * Sets the value of the orgnlCreDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CancellationRequestInformation1 setOrgnlCreDtTm(Calendar value) {
        this.orgnlCreDtTm = value;
        return this;
    }

    /**
     * Gets the value of the nbOfInvcReqs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfInvcReqs() {
        return nbOfInvcReqs;
    }

    /**
     * Sets the value of the nbOfInvcReqs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CancellationRequestInformation1 setNbOfInvcReqs(String value) {
        this.nbOfInvcReqs = value;
        return this;
    }

    /**
     * Gets the value of the ttlBlkInvcAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlBlkInvcAmt() {
        return ttlBlkInvcAmt;
    }

    /**
     * Sets the value of the ttlBlkInvcAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CancellationRequestInformation1 setTtlBlkInvcAmt(ActiveCurrencyAndAmount value) {
        this.ttlBlkInvcAmt = value;
        return this;
    }

    /**
     * Gets the value of the cxlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCxlRsn() {
        return cxlRsn;
    }

    /**
     * Sets the value of the cxlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CancellationRequestInformation1 setCxlRsn(String value) {
        this.cxlRsn = value;
        return this;
    }

    /**
     * Gets the value of the fincgRqstr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount6 }
     *     
     */
    public PartyIdentificationAndAccount6 getFincgRqstr() {
        return fincgRqstr;
    }

    /**
     * Sets the value of the fincgRqstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount6 }
     *     
     */
    public CancellationRequestInformation1 setFincgRqstr(PartyIdentificationAndAccount6 value) {
        this.fincgRqstr = value;
        return this;
    }

    /**
     * Gets the value of the intrmyAgt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification6 }
     *     
     */
    public FinancialInstitutionIdentification6 getIntrmyAgt() {
        return intrmyAgt;
    }

    /**
     * Sets the value of the intrmyAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification6 }
     *     
     */
    public CancellationRequestInformation1 setIntrmyAgt(FinancialInstitutionIdentification6 value) {
        this.intrmyAgt = value;
        return this;
    }

    /**
     * Gets the value of the frstAgt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification6 }
     *     
     */
    public FinancialInstitutionIdentification6 getFrstAgt() {
        return frstAgt;
    }

    /**
     * Sets the value of the frstAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification6 }
     *     
     */
    public CancellationRequestInformation1 setFrstAgt(FinancialInstitutionIdentification6 value) {
        this.frstAgt = value;
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
