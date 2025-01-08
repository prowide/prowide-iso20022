
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
 * Information to support the Know Your Customer processes.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyProfileInformation2", propOrder = {
    "certfctnInd",
    "vldtngPty",
    "chckngPty",
    "rspnsblPty",
    "certTp",
    "chckngDt",
    "chckngFrqcy",
    "nxtRvsnDt",
    "slryRg",
    "srcOfWlth",
    "cstmrCndctClssfctn",
    "rskLvl"
})
public class PartyProfileInformation2 {

    @XmlElement(name = "CertfctnInd")
    protected boolean certfctnInd;
    @XmlElement(name = "VldtngPty")
    protected String vldtngPty;
    @XmlElement(name = "ChckngPty")
    protected String chckngPty;
    @XmlElement(name = "RspnsblPty")
    protected String rspnsblPty;
    @XmlElement(name = "CertTp", required = true)
    protected CertificationType1Choice certTp;
    @XmlElement(name = "ChckngDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate chckngDt;
    @XmlElement(name = "ChckngFrqcy")
    @XmlSchemaType(name = "string")
    protected EventFrequency1Code chckngFrqcy;
    @XmlElement(name = "NxtRvsnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate nxtRvsnDt;
    @XmlElement(name = "SlryRg")
    protected String slryRg;
    @XmlElement(name = "SrcOfWlth")
    protected String srcOfWlth;
    @XmlElement(name = "CstmrCndctClssfctn")
    protected CustomerConductClassification1Choice cstmrCndctClssfctn;
    @XmlElement(name = "RskLvl")
    protected RiskLevel1Choice rskLvl;

    /**
     * Gets the value of the certfctnInd property.
     * 
     */
    public boolean isCertfctnInd() {
        return certfctnInd;
    }

    /**
     * Sets the value of the certfctnInd property.
     * 
     */
    public PartyProfileInformation2 setCertfctnInd(boolean value) {
        this.certfctnInd = value;
        return this;
    }

    /**
     * Gets the value of the vldtngPty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVldtngPty() {
        return vldtngPty;
    }

    /**
     * Sets the value of the vldtngPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyProfileInformation2 setVldtngPty(String value) {
        this.vldtngPty = value;
        return this;
    }

    /**
     * Gets the value of the chckngPty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChckngPty() {
        return chckngPty;
    }

    /**
     * Sets the value of the chckngPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyProfileInformation2 setChckngPty(String value) {
        this.chckngPty = value;
        return this;
    }

    /**
     * Gets the value of the rspnsblPty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspnsblPty() {
        return rspnsblPty;
    }

    /**
     * Sets the value of the rspnsblPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyProfileInformation2 setRspnsblPty(String value) {
        this.rspnsblPty = value;
        return this;
    }

    /**
     * Gets the value of the certTp property.
     * 
     * @return
     *     possible object is
     *     {@link CertificationType1Choice }
     *     
     */
    public CertificationType1Choice getCertTp() {
        return certTp;
    }

    /**
     * Sets the value of the certTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificationType1Choice }
     *     
     */
    public PartyProfileInformation2 setCertTp(CertificationType1Choice value) {
        this.certTp = value;
        return this;
    }

    /**
     * Gets the value of the chckngDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getChckngDt() {
        return chckngDt;
    }

    /**
     * Sets the value of the chckngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyProfileInformation2 setChckngDt(LocalDate value) {
        this.chckngDt = value;
        return this;
    }

    /**
     * Gets the value of the chckngFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link EventFrequency1Code }
     *     
     */
    public EventFrequency1Code getChckngFrqcy() {
        return chckngFrqcy;
    }

    /**
     * Sets the value of the chckngFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventFrequency1Code }
     *     
     */
    public PartyProfileInformation2 setChckngFrqcy(EventFrequency1Code value) {
        this.chckngFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the nxtRvsnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getNxtRvsnDt() {
        return nxtRvsnDt;
    }

    /**
     * Sets the value of the nxtRvsnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyProfileInformation2 setNxtRvsnDt(LocalDate value) {
        this.nxtRvsnDt = value;
        return this;
    }

    /**
     * Gets the value of the slryRg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlryRg() {
        return slryRg;
    }

    /**
     * Sets the value of the slryRg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyProfileInformation2 setSlryRg(String value) {
        this.slryRg = value;
        return this;
    }

    /**
     * Gets the value of the srcOfWlth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcOfWlth() {
        return srcOfWlth;
    }

    /**
     * Sets the value of the srcOfWlth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyProfileInformation2 setSrcOfWlth(String value) {
        this.srcOfWlth = value;
        return this;
    }

    /**
     * Gets the value of the cstmrCndctClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerConductClassification1Choice }
     *     
     */
    public CustomerConductClassification1Choice getCstmrCndctClssfctn() {
        return cstmrCndctClssfctn;
    }

    /**
     * Sets the value of the cstmrCndctClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerConductClassification1Choice }
     *     
     */
    public PartyProfileInformation2 setCstmrCndctClssfctn(CustomerConductClassification1Choice value) {
        this.cstmrCndctClssfctn = value;
        return this;
    }

    /**
     * Gets the value of the rskLvl property.
     * 
     * @return
     *     possible object is
     *     {@link RiskLevel1Choice }
     *     
     */
    public RiskLevel1Choice getRskLvl() {
        return rskLvl;
    }

    /**
     * Sets the value of the rskLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskLevel1Choice }
     *     
     */
    public PartyProfileInformation2 setRskLvl(RiskLevel1Choice value) {
        this.rskLvl = value;
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
