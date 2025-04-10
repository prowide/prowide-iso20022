
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "GeneralInformation1", propOrder = {
    "blckInd",
    "rltdTradRef",
    "dealgMtd",
    "brkrId",
    "ctrPtyRef",
    "brkrsComssn",
    "sndrToRcvrInf",
    "dealgBrnchTradgSd",
    "dealgBrnchCtrPtySd",
    "ctctInf"
})
public class GeneralInformation1 {

    @XmlElement(name = "BlckInd")
    protected Boolean blckInd;
    @XmlElement(name = "RltdTradRef")
    protected String rltdTradRef;
    @XmlElement(name = "DealgMtd")
    @XmlSchemaType(name = "string")
    protected Trading1MethodCode dealgMtd;
    @XmlElement(name = "BrkrId")
    protected PartyIdentification8Choice brkrId;
    @XmlElement(name = "CtrPtyRef")
    protected String ctrPtyRef;
    @XmlElement(name = "BrkrsComssn")
    protected ActiveCurrencyAndAmount brkrsComssn;
    @XmlElement(name = "SndrToRcvrInf")
    protected String sndrToRcvrInf;
    @XmlElement(name = "DealgBrnchTradgSd")
    protected PartyIdentification8Choice dealgBrnchTradgSd;
    @XmlElement(name = "DealgBrnchCtrPtySd")
    protected PartyIdentification8Choice dealgBrnchCtrPtySd;
    @XmlElement(name = "CtctInf")
    protected ContactInformation1 ctctInf;

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
    public GeneralInformation1 setBlckInd(Boolean value) {
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
    public GeneralInformation1 setRltdTradRef(String value) {
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
    public GeneralInformation1 setDealgMtd(Trading1MethodCode value) {
        this.dealgMtd = value;
        return this;
    }

    /**
     * Gets the value of the brkrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification8Choice }
     *     
     */
    public PartyIdentification8Choice getBrkrId() {
        return brkrId;
    }

    /**
     * Sets the value of the brkrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification8Choice }
     *     
     */
    public GeneralInformation1 setBrkrId(PartyIdentification8Choice value) {
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
    public GeneralInformation1 setCtrPtyRef(String value) {
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
    public GeneralInformation1 setBrkrsComssn(ActiveCurrencyAndAmount value) {
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
    public GeneralInformation1 setSndrToRcvrInf(String value) {
        this.sndrToRcvrInf = value;
        return this;
    }

    /**
     * Gets the value of the dealgBrnchTradgSd property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification8Choice }
     *     
     */
    public PartyIdentification8Choice getDealgBrnchTradgSd() {
        return dealgBrnchTradgSd;
    }

    /**
     * Sets the value of the dealgBrnchTradgSd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification8Choice }
     *     
     */
    public GeneralInformation1 setDealgBrnchTradgSd(PartyIdentification8Choice value) {
        this.dealgBrnchTradgSd = value;
        return this;
    }

    /**
     * Gets the value of the dealgBrnchCtrPtySd property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification8Choice }
     *     
     */
    public PartyIdentification8Choice getDealgBrnchCtrPtySd() {
        return dealgBrnchCtrPtySd;
    }

    /**
     * Sets the value of the dealgBrnchCtrPtySd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification8Choice }
     *     
     */
    public GeneralInformation1 setDealgBrnchCtrPtySd(PartyIdentification8Choice value) {
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
    public GeneralInformation1 setCtctInf(ContactInformation1 value) {
        this.ctctInf = value;
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
