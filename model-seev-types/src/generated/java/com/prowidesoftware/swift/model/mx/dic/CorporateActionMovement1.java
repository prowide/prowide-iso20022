
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
 * Provides information about the movement instruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionMovement1", propOrder = {
    "ordrTp",
    "hghPrtyInd",
    "optnNb",
    "optnTp",
    "reqdExctnDt",
    "acctOwnrId",
    "acctId",
    "confdBalSctiesQty"
})
public class CorporateActionMovement1 {

    @XmlElement(name = "OrdrTp", required = true)
    @XmlSchemaType(name = "string")
    protected DistributionInstructionType1Code ordrTp;
    @XmlElement(name = "HghPrtyInd")
    protected boolean hghPrtyInd;
    @XmlElement(name = "OptnNb")
    protected String optnNb;
    @XmlElement(name = "OptnTp")
    protected CorporateActionOption1FormatChoice optnTp;
    @XmlElement(name = "ReqdExctnDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate reqdExctnDt;
    @XmlElement(name = "AcctOwnrId")
    protected PartyIdentification2Choice acctOwnrId;
    @XmlElement(name = "AcctId")
    protected String acctId;
    @XmlElement(name = "ConfdBalSctiesQty")
    protected UnitOrFaceAmount1Choice confdBalSctiesQty;

    /**
     * Gets the value of the ordrTp property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionInstructionType1Code }
     *     
     */
    public DistributionInstructionType1Code getOrdrTp() {
        return ordrTp;
    }

    /**
     * Sets the value of the ordrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionInstructionType1Code }
     *     
     */
    public CorporateActionMovement1 setOrdrTp(DistributionInstructionType1Code value) {
        this.ordrTp = value;
        return this;
    }

    /**
     * Gets the value of the hghPrtyInd property.
     * 
     */
    public boolean isHghPrtyInd() {
        return hghPrtyInd;
    }

    /**
     * Sets the value of the hghPrtyInd property.
     * 
     */
    public CorporateActionMovement1 setHghPrtyInd(boolean value) {
        this.hghPrtyInd = value;
        return this;
    }

    /**
     * Gets the value of the optnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptnNb() {
        return optnNb;
    }

    /**
     * Sets the value of the optnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionMovement1 setOptnNb(String value) {
        this.optnNb = value;
        return this;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption1FormatChoice }
     *     
     */
    public CorporateActionOption1FormatChoice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption1FormatChoice }
     *     
     */
    public CorporateActionMovement1 setOptnTp(CorporateActionOption1FormatChoice value) {
        this.optnTp = value;
        return this;
    }

    /**
     * Gets the value of the reqdExctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getReqdExctnDt() {
        return reqdExctnDt;
    }

    /**
     * Sets the value of the reqdExctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionMovement1 setReqdExctnDt(LocalDate value) {
        this.reqdExctnDt = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getAcctOwnrId() {
        return acctOwnrId;
    }

    /**
     * Sets the value of the acctOwnrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public CorporateActionMovement1 setAcctOwnrId(PartyIdentification2Choice value) {
        this.acctOwnrId = value;
        return this;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionMovement1 setAcctId(String value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the confdBalSctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getConfdBalSctiesQty() {
        return confdBalSctiesQty;
    }

    /**
     * Sets the value of the confdBalSctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public CorporateActionMovement1 setConfdBalSctiesQty(UnitOrFaceAmount1Choice value) {
        this.confdBalSctiesQty = value;
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
