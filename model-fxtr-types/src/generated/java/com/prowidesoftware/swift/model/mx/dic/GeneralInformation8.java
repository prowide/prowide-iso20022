
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information concerning the negotiation process leading to a treasury trade.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralInformation8", propOrder = {
    "blckInd",
    "rltdTradRef",
    "dealgMtd",
    "brkrId",
    "ctrPtyRef",
    "brkrsComssn",
    "sndrToRcvrInf",
    "dealgBrnchTradgSd",
    "dealgBrnchCtrPtySd",
    "ctctInf",
    "agrmtDtls",
    "defsYr",
    "brkrsRef"
})
public class GeneralInformation8 {

    @XmlElement(name = "BlckInd")
    protected Boolean blckInd;
    @XmlElement(name = "RltdTradRef")
    protected String rltdTradRef;
    @XmlElement(name = "DealgMtd")
    @XmlSchemaType(name = "string")
    protected Trading1MethodCode dealgMtd;
    @XmlElement(name = "BrkrId")
    protected PartyIdentification242Choice brkrId;
    @XmlElement(name = "CtrPtyRef")
    protected String ctrPtyRef;
    @XmlElement(name = "BrkrsComssn")
    protected ActiveCurrencyAndAmount brkrsComssn;
    @XmlElement(name = "SndrToRcvrInf")
    protected String sndrToRcvrInf;
    @XmlElement(name = "DealgBrnchTradgSd")
    protected PartyIdentification242Choice dealgBrnchTradgSd;
    @XmlElement(name = "DealgBrnchCtrPtySd")
    protected PartyIdentification242Choice dealgBrnchCtrPtySd;
    @XmlElement(name = "CtctInf")
    protected ContactInformation1 ctctInf;
    @XmlElement(name = "AgrmtDtls")
    protected AgreementConditions1 agrmtDtls;
    @XmlElement(name = "DefsYr")
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar defsYr;
    @XmlElement(name = "BrkrsRef")
    protected String brkrsRef;

    /**
     * Gets the value of the blckInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlckInd() {
        return blckInd;
    }

    /**
     * Sets the value of the blckInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public GeneralInformation8 setBlckInd(Boolean value) {
        this.blckInd = value;
        return this;
    }

    /**
     * Gets the value of the rltdTradRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRltdTradRef() {
        return rltdTradRef;
    }

    /**
     * Sets the value of the rltdTradRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public GeneralInformation8 setRltdTradRef(String value) {
        this.rltdTradRef = value;
        return this;
    }

    /**
     * Gets the value of the dealgMtd property.
     * 
     * @return
     *     possible object is
     *     {@link Trading1MethodCode }
     *     
     */
    public Trading1MethodCode getDealgMtd() {
        return dealgMtd;
    }

    /**
     * Sets the value of the dealgMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trading1MethodCode }
     *     
     */
    public GeneralInformation8 setDealgMtd(Trading1MethodCode value) {
        this.dealgMtd = value;
        return this;
    }

    /**
     * Gets the value of the brkrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public PartyIdentification242Choice getBrkrId() {
        return brkrId;
    }

    /**
     * Sets the value of the brkrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public GeneralInformation8 setBrkrId(PartyIdentification242Choice value) {
        this.brkrId = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtyRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrPtyRef() {
        return ctrPtyRef;
    }

    /**
     * Sets the value of the ctrPtyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public GeneralInformation8 setCtrPtyRef(String value) {
        this.ctrPtyRef = value;
        return this;
    }

    /**
     * Gets the value of the brkrsComssn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getBrkrsComssn() {
        return brkrsComssn;
    }

    /**
     * Sets the value of the brkrsComssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public GeneralInformation8 setBrkrsComssn(ActiveCurrencyAndAmount value) {
        this.brkrsComssn = value;
        return this;
    }

    /**
     * Gets the value of the sndrToRcvrInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndrToRcvrInf() {
        return sndrToRcvrInf;
    }

    /**
     * Sets the value of the sndrToRcvrInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public GeneralInformation8 setSndrToRcvrInf(String value) {
        this.sndrToRcvrInf = value;
        return this;
    }

    /**
     * Gets the value of the dealgBrnchTradgSd property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public PartyIdentification242Choice getDealgBrnchTradgSd() {
        return dealgBrnchTradgSd;
    }

    /**
     * Sets the value of the dealgBrnchTradgSd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public GeneralInformation8 setDealgBrnchTradgSd(PartyIdentification242Choice value) {
        this.dealgBrnchTradgSd = value;
        return this;
    }

    /**
     * Gets the value of the dealgBrnchCtrPtySd property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public PartyIdentification242Choice getDealgBrnchCtrPtySd() {
        return dealgBrnchCtrPtySd;
    }

    /**
     * Sets the value of the dealgBrnchCtrPtySd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public GeneralInformation8 setDealgBrnchCtrPtySd(PartyIdentification242Choice value) {
        this.dealgBrnchCtrPtySd = value;
        return this;
    }

    /**
     * Gets the value of the ctctInf property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformation1 }
     *     
     */
    public ContactInformation1 getCtctInf() {
        return ctctInf;
    }

    /**
     * Sets the value of the ctctInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformation1 }
     *     
     */
    public GeneralInformation8 setCtctInf(ContactInformation1 value) {
        this.ctctInf = value;
        return this;
    }

    /**
     * Gets the value of the agrmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AgreementConditions1 }
     *     
     */
    public AgreementConditions1 getAgrmtDtls() {
        return agrmtDtls;
    }

    /**
     * Sets the value of the agrmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreementConditions1 }
     *     
     */
    public GeneralInformation8 setAgrmtDtls(AgreementConditions1 value) {
        this.agrmtDtls = value;
        return this;
    }

    /**
     * Gets the value of the defsYr property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDefsYr() {
        return defsYr;
    }

    /**
     * Sets the value of the defsYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public GeneralInformation8 setDefsYr(XMLGregorianCalendar value) {
        this.defsYr = value;
        return this;
    }

    /**
     * Gets the value of the brkrsRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrkrsRef() {
        return brkrsRef;
    }

    /**
     * Sets the value of the brkrsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public GeneralInformation8 setBrkrsRef(String value) {
        this.brkrsRef = value;
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
