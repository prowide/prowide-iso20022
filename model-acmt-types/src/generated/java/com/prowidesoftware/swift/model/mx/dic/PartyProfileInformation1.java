
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
@XmlType(name = "PartyProfileInformation1", propOrder = {
    "certfctnInd",
    "vldtngPty",
    "chckngPty",
    "rspnsblPty",
    "certTp",
    "xtndedCertTp",
    "chckngDt",
    "chckngFrqcy",
    "nxtRvsnDt",
    "slryRg",
    "srcOfWlth"
})
public class PartyProfileInformation1 {

    @XmlElement(name = "CertfctnInd")
    protected boolean certfctnInd;
    @XmlElement(name = "VldtngPty")
    protected String vldtngPty;
    @XmlElement(name = "ChckngPty")
    protected String chckngPty;
    @XmlElement(name = "RspnsblPty")
    protected String rspnsblPty;
    @XmlElement(name = "CertTp")
    @XmlSchemaType(name = "string")
    protected CertificateType1Code certTp;
    @XmlElement(name = "XtndedCertTp")
    protected String xtndedCertTp;
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
    public PartyProfileInformation1 setCertfctnInd(boolean value) {
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
    public PartyProfileInformation1 setVldtngPty(String value) {
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
    public PartyProfileInformation1 setChckngPty(String value) {
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
    public PartyProfileInformation1 setRspnsblPty(String value) {
        this.rspnsblPty = value;
        return this;
    }

    /**
     * Gets the value of the certTp property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateType1Code }
     *     
     */
    public CertificateType1Code getCertTp() {
        return certTp;
    }

    /**
     * Sets the value of the certTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateType1Code }
     *     
     */
    public PartyProfileInformation1 setCertTp(CertificateType1Code value) {
        this.certTp = value;
        return this;
    }

    /**
     * Gets the value of the xtndedCertTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedCertTp() {
        return xtndedCertTp;
    }

    /**
     * Sets the value of the xtndedCertTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyProfileInformation1 setXtndedCertTp(String value) {
        this.xtndedCertTp = value;
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
    public PartyProfileInformation1 setChckngDt(LocalDate value) {
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
    public PartyProfileInformation1 setChckngFrqcy(EventFrequency1Code value) {
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
    public PartyProfileInformation1 setNxtRvsnDt(LocalDate value) {
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
    public PartyProfileInformation1 setSlryRg(String value) {
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
    public PartyProfileInformation1 setSrcOfWlth(String value) {
        this.srcOfWlth = value;
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
